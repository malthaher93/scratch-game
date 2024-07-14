package com.cyperspeed.service.wincombinations;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.cyperspeed.dto.InputData;
import com.cyperspeed.dto.OutputData;
import com.cyperspeed.dto.configuration.GameConfiguration;
import com.cyperspeed.dto.configuration.wincombinations.type.AbstractWinCombinationsType;

public class LinerSymbolStandardWinCombinationsFinder extends AbstractSymbolWinCombinationsFinder {

	/**
	 * find same symbol and calculate reward when linear symbols based on covered area
	 */
	@Override
	public void find(GameConfiguration config, OutputData output, InputData input, AbstractWinCombinationsType winCombination) {

		if (winCombination.getCoveredAreas() != null) {
			winCombination.getCoveredAreas().stream().forEach( coveredAreas -> {

				String sameSymbolKey  = findSameSymbol(output, coveredAreas); 
				if (sameSymbolKey != null) {

					calculateReward(config, output, input, winCombination, sameSymbolKey);
				}
			});
		}
	}

	/**
	 * find symbol type when linear symbols case based on provided covered area
	 * @param output
	 * @param coveredAreas
	 * @return
	 */
	private String findSameSymbol(OutputData output,
			List<String> coveredAreas) {

		Set<String> uniqueSymbolSet = new HashSet<>();

		coveredAreas.stream().forEach(area -> {
			String [] areaArr = area.split(":");
			int x = Integer.parseInt(areaArr[0]);
			int y = Integer.parseInt(areaArr[1]);
			String val = output.getMatrix()[x][y] ;
			uniqueSymbolSet.add(val);

		});

		if (uniqueSymbolSet.size() == 1) {
			return uniqueSymbolSet.stream().findFirst().get();
		}else {
			return null;
		}
	}

}
