package com.cyperspeed.service.reward;

import com.cyperspeed.dto.InputData;
import com.cyperspeed.dto.OutputData;
import com.cyperspeed.dto.configuration.symbol.type.bonus.AbstractBonusSymbolType;

public class BonusSymbolRewardCalculator {

	private RewardCalculator rewardCalculator = new RewardCalculator();

	/**
	 * calculate reward of bonus symbol based on impact type
	 * @param output
	 * @param input
	 * @param symbol
	 * @return
	 */
	public Integer calculate (OutputData output, InputData input,
			AbstractBonusSymbolType symbol) {

		Integer totalReward = null;
		
		switch (symbol.getImpact()) {
		
		case "multiply_reward":
			totalReward = rewardCalculator.calculateRewardMultiplier(output.getReward(), 
					input.getBetAmount(), null, 
					symbol.getRewardMultiplier());
			break;

		case "extra_bonus":
			totalReward = rewardCalculator.calculateRewardExtra(output.getReward(), 
					symbol.getExtra());
			break;

		default:
			totalReward = output.getReward();
			break;
		}
		
		return totalReward;
	}


}
