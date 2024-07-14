package com.cyperspeed.dto.configuration.symbol.type;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public abstract class AbstractSymbolType {
	
	@JsonProperty("reward_multiplier")
	protected Integer rewardMultiplier;
	@JsonProperty("type")
	protected String type;
	
	protected String name;
	

}
