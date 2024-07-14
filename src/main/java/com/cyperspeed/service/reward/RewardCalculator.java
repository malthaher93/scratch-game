package com.cyperspeed.service.reward;

public class RewardCalculator {

	/**
	 * calculate reward multiplier impact type
	 * @param reward
	 * @param betAmt
	 * @param winCombinationRewardMultiplier
	 * @param symbolRewardMultiplier
	 * @return
	 */
	public Integer calculateRewardMultiplier(Integer reward, Integer betAmt,
			Integer winCombinationRewardMultiplier, Integer symbolRewardMultiplier) {

		Integer totalReward = null;
		if (symbolRewardMultiplier != null && winCombinationRewardMultiplier != null) {
			totalReward = (betAmt * symbolRewardMultiplier * winCombinationRewardMultiplier) + reward;
		}else if (symbolRewardMultiplier == null && winCombinationRewardMultiplier != null) {
			totalReward = (betAmt  * winCombinationRewardMultiplier) + reward;
		}else if (symbolRewardMultiplier != null && winCombinationRewardMultiplier == null) {
			totalReward = (betAmt * symbolRewardMultiplier) + reward ;
		}else {
			totalReward = reward;
		}
		return totalReward;

	}

	/**
	 * calculate reward extra impact type
	 * @param reward
	 * @param betAmt
	 * @param symbolExtra
	 * @return
	 */
	public Integer calculateRewardExtra(Integer reward, Integer symbolExtra) {

		Integer totalReward = null;
		if (symbolExtra != null) {
			totalReward = reward + symbolExtra;
		}else {
			totalReward = reward;
		}
		return totalReward;

	}
}
