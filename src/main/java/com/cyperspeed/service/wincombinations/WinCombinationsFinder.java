package com.cyperspeed.service.wincombinations;

import com.cyperspeed.dto.InputData;
import com.cyperspeed.dto.OutputData;
import com.cyperspeed.dto.configuration.GameConfiguration;

public class WinCombinationsFinder {

	/**
	 * find win combination 
	 * @param matrix
	 * @param config
	 * @param input
	 * @return
	 */
	public OutputData find(String [][] matrix, GameConfiguration config, InputData input) {
		
		
		OutputData output = new OutputData();
		output.setMatrix(matrix);
		
		StandardWinCombinationsFinder standardWinCombinationsFinder = new StandardWinCombinationsFinder();
		standardWinCombinationsFinder.find(config, output, input);
		
		if (output.getReward() != 0) {
			BonusWinCombinationsFinder bonusWinCombinationsFinder = new BonusWinCombinationsFinder();
			bonusWinCombinationsFinder.find(config, output, input, null);
		}
		
		return output;
	}
	
}
