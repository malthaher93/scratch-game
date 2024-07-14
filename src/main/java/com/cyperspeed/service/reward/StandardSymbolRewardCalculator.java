package com.cyperspeed.service.reward;

import com.cyperspeed.dto.InputData;
import com.cyperspeed.dto.OutputData;
import com.cyperspeed.dto.configuration.symbol.type.AbstractSymbolType;
import com.cyperspeed.dto.configuration.wincombinations.type.AbstractWinCombinationsType;

public class StandardSymbolRewardCalculator {

	private RewardCalculator rewardCalculator = new RewardCalculator();
	
	/**
	 * calculate reward of standard symbol
	 * @param output
	 * @param input
	 * @param winCombination
	 * @param symbol
	 * @return
	 */
	public Integer calculate (OutputData output, InputData input,
			AbstractWinCombinationsType winCombination, 
			AbstractSymbolType symbol) {
		
		return rewardCalculator.calculateRewardMultiplier(output.getReward(), 
				input.getBetAmount(), winCombination.getRewardMultiplier(), 
				symbol.getRewardMultiplier());
	}
	
	
}
