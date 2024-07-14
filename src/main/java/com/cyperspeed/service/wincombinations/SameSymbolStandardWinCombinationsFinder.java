package com.cyperspeed.service.wincombinations;

import java.util.Map;

import com.cyperspeed.dto.InputData;
import com.cyperspeed.dto.OutputData;
import com.cyperspeed.dto.configuration.GameConfiguration;
import com.cyperspeed.dto.configuration.wincombinations.type.AbstractWinCombinationsType;

public class SameSymbolStandardWinCombinationsFinder extends AbstractSymbolWinCombinationsFinder {

	/**
	 * find same symbol and calculate reward based on count of win combination
	 */
	@Override
	public void find(GameConfiguration config, OutputData output, InputData input, AbstractWinCombinationsType winCombination) {

		Map<String,Long> symbolOccurrencesMap = findSymbolOccurrencesPerSymbol(output); 

		symbolOccurrencesMap.entrySet().stream()
		.forEach( entry -> {

			String key = entry.getKey();
			Long count = entry.getValue();

			if (winCombination.getCount() != null && count >= winCombination.getCount().intValue()) {				
				calculateReward(config, output, input, winCombination, key);
			}
		});
	}

}
