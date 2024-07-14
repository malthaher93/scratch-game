package com.cyperspeed.service.wincombinations;

import com.cyperspeed.dto.InputData;
import com.cyperspeed.dto.OutputData;
import com.cyperspeed.dto.configuration.GameConfiguration;
import com.cyperspeed.dto.configuration.wincombinations.type.AbstractWinCombinationsType;

public class StandardWinCombinationsFinder {

	
	/**
	 * find win combination for standard symbol per group of win combination
	 * @param config
	 * @param output
	 * @param input
	 */
	
	public void find(GameConfiguration config, OutputData output, InputData input) {

		config.getWinCombinations().getWinCombinations().stream().forEach( winCombination -> {

			AbstractSymbolWinCombinationsFinder abstractSymbolStandardWinCombinationsFinder = checkWinCombinationGroup(winCombination);
			if (abstractSymbolStandardWinCombinationsFinder != null)
				abstractSymbolStandardWinCombinationsFinder.find(config, output, input, winCombination);

		});
	}

	/**
	 * check Win Combination Group
	 * @param winCombination
	 * @return
	 */
	private AbstractSymbolWinCombinationsFinder checkWinCombinationGroup(AbstractWinCombinationsType winCombination) {
		switch(winCombination.getGroup()) {

		case "same_symbols":
			return new SameSymbolStandardWinCombinationsFinder();

		case "horizontally_linear_symbols":
		case "vertically_linear_symbols":
		case "ltr_diagonally_linear_symbols":
		case "rtl_diagonally_linear_symbols":
			return new LinerSymbolStandardWinCombinationsFinder();

		default :
			return null;
			
		}
	}
}
