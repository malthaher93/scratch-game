package com.cyperspeed.service.wincombinations;

import java.util.Map;

import com.cyperspeed.dto.InputData;
import com.cyperspeed.dto.OutputData;
import com.cyperspeed.dto.configuration.GameConfiguration;
import com.cyperspeed.dto.configuration.symbol.type.bonus.AbstractBonusSymbolType;
import com.cyperspeed.dto.configuration.wincombinations.type.AbstractWinCombinationsType;
import com.cyperspeed.service.reward.BonusSymbolRewardCalculator;

public class BonusWinCombinationsFinder extends AbstractSymbolWinCombinationsFinder {

	private BonusSymbolRewardCalculator bonusSymbolRewardCalculator = new BonusSymbolRewardCalculator();
	
	/**
	 * find symbol and calculate reward for bonus win combination
	 */
	public void find(GameConfiguration config, OutputData output, InputData input, AbstractWinCombinationsType winCombination) {

		Map<String,Long> symbolOccurrencesMap = findSymbolOccurrencesPerSymbol(output); 
		symbolOccurrencesMap.entrySet().stream().forEach(entry -> {

			String key = entry.getKey();
			Long count = entry.getValue();

			if (count == 1) {
								
				AbstractBonusSymbolType symbolType = (AbstractBonusSymbolType) findSymbolByName(config
						.getSymbols().getSymbolType(), key, BONUS_SYMBOL_TYPE);

				if (symbolType != null) {
					int totalReward  = bonusSymbolRewardCalculator.calculate(output, input, symbolType);
					output.setReward(totalReward);

					output.setAppliedBonusSymbol(key);
				}
			}
		});

	}

}
