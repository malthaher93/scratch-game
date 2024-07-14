package com.cyperspeed.service;

import java.util.Random;

import com.cyperspeed.dto.configuration.GameConfiguration;
import com.cyperspeed.service.probabilities.ProbabilitiesFinder;

public class MatrixGenerator {

	private ProbabilitiesFinder probabilitiesFinder = new ProbabilitiesFinder();

	public String[][] generate (GameConfiguration config){

		try {
			String[][] generatedMatrix = createMatrix(config);

			generateSymbolData(config, generatedMatrix);

			return generatedMatrix;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/***
	 * create 2dim array based on config json file
	 * @param config
	 * @return
	 */
	private String[][] createMatrix(GameConfiguration config) {
		return new String[config.getRows()][config.getColumns()];
	}
	
	/***
	 * generate matrix data based on probabilities
	 * @param config
	 * @param generatedMatrix
	 */
	private void generateSymbolData(GameConfiguration config, String[][] generatedMatrix) {
		
		generateStandardSymbolData(config, generatedMatrix);
		generateBonusSymbolData(config, generatedMatrix);

	}


	/***
	 * generate bonus symbol data based on probabilities in random location
	 * @param config
	 * @param generatedMatrix
	 */
	private void generateBonusSymbolData(GameConfiguration config, String[][] generatedMatrix) {
		String bonusSymbol = probabilitiesFinder.find(config.getProbabilities().getBonusSymbol().getSymbols());
		int randomRowIndex = generateRandomNumber(config.getRows()-1);
		int randomColumnIndex = generateRandomNumber(config.getColumns()-1);
		generatedMatrix[randomRowIndex][randomColumnIndex] = bonusSymbol;
	}

	/***
	 * generate standard symbol data based on probabilities
	 * @param config
	 * @param generatedMatrix
	 */
	private void generateStandardSymbolData(GameConfiguration config, String[][] generatedMatrix) {
		
		config.getProbabilities().getStandardSymbols().stream()
		.forEach( probability -> {
			
			String standardSymbol = probabilitiesFinder.find(probability.getSymbols());
			int rowIndex = probability.getRow();
			int columnIndex = probability.getColumn();
			generatedMatrix[rowIndex][columnIndex] =  standardSymbol;
		});
	}

	/***
	 * generate random number
	 * @param max
	 * @return
	 */
	private int generateRandomNumber(int max) {
		int min=0; 
		return new Random().nextInt(max-min+1)+min;
	}
}
