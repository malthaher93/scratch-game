package com.cyperspeed.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OutputData {

	@JsonProperty("matrix")
	private String[][] matrix;
	@JsonProperty("reward")
	private Integer reward = 0;
	@JsonProperty("applied_winning_combinations")
	private Map<String, List<String>> appliedWinningCombinations = new HashMap<>();
	@JsonProperty("applied_bonus_symbol")
	private String appliedBonusSymbol;	
	
}
