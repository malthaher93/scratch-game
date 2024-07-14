package com.cyperspeed.service.wincombinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cyperspeed.dto.InputData;
import com.cyperspeed.dto.OutputData;
import com.cyperspeed.dto.configuration.GameConfiguration;
import com.cyperspeed.dto.configuration.symbol.type.AbstractSymbolType;
import com.cyperspeed.dto.configuration.symbol.type.standard.AbstractStandardSymbolType;
import com.cyperspeed.dto.configuration.wincombinations.type.AbstractWinCombinationsType;
import com.cyperspeed.service.reward.StandardSymbolRewardCalculator;

public abstract class AbstractSymbolWinCombinationsFinder {

	protected static final String BONUS_SYMBOL_TYPE = "bonus";
	protected static final String STANDARD_SYMBOL_TYPE = "standard";
	private StandardSymbolRewardCalculator standardSymbolRewardCalculator = new StandardSymbolRewardCalculator();
	
	public abstract void find(GameConfiguration config, OutputData output, InputData input, AbstractWinCombinationsType winCombination);
	
	/**
	 * Mapping of Symbol and List of applied winning combinations
	 * @param output
	 * @param winCombination
	 * @param key
	 */
	protected void addWinningCombinationsList(OutputData output, AbstractWinCombinationsType winCombination, String key) {
		
		if (output.getAppliedWinningCombinations().containsKey(key)) {
			output.getAppliedWinningCombinations().get(key).add(winCombination.getName());
		}else {
			List<String> winningCombinationsNameList = new ArrayList<>();
			winningCombinationsNameList.add(winCombination.getName());
			output.getAppliedWinningCombinations().put(key, winningCombinationsNameList);
		}
	}
	
	/**
	 * find symbol by name
	 * @param symbolType
	 * @param key
	 * @return
	 */
	protected AbstractSymbolType findSymbolByName(List<AbstractSymbolType> symbol, String key, String symbolType) {

		return symbol
		.stream()
		.filter(s -> s.getName().equalsIgnoreCase(key)&& s.getType().equalsIgnoreCase(symbolType))
		.findFirst()
		.orElse(null);
	}
		
	/**
	 * calculate reward of standard symbol type
	 * @param config
	 * @param output
	 * @param input
	 * @param winCombination
	 * @param key
	 */
	protected void calculateReward(GameConfiguration config, OutputData output, InputData input,
			AbstractWinCombinationsType winCombination, String key) {
		
		AbstractStandardSymbolType symbolType = (AbstractStandardSymbolType) findSymbolByName(config
				.getSymbols().getSymbolType(), key, STANDARD_SYMBOL_TYPE);

		if (symbolType != null) {
			Integer totalReward  = standardSymbolRewardCalculator.calculate(output, input, winCombination, symbolType);
			output.setReward(totalReward);

			addWinningCombinationsList(output, winCombination, key);
		}
	}
	
	/**
	 * find map of symbol type with occurrences count in the matrix
	 * @param output
	 * @return
	 */
	protected Map<String, Long> findSymbolOccurrencesPerSymbol(OutputData output) {

		return Stream.of(output.getMatrix())
				.flatMap(Arrays::stream) 
				.collect(Collectors.groupingBy(String::toString, Collectors.counting()));
	}



	

}
