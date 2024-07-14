package com.cyperspeed.dto.configuration.wincombinations.type;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public abstract class AbstractWinCombinationsType {

	@JsonProperty("reward_multiplier")
	protected Integer rewardMultiplier;
	@JsonProperty("when")
	protected String when;
	@JsonProperty("count")
	protected Integer count;
	@JsonProperty("group")
	protected String group;
	@JsonProperty("covered_areas")
	protected List<List<String>> coveredAreas;
	
	protected String name;
	
}
