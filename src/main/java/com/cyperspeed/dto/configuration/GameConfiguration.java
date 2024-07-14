package com.cyperspeed.dto.configuration;

import com.cyperspeed.dto.configuration.probabilities.ProbabilitiesType;
import com.cyperspeed.dto.configuration.symbol.SymbolType;
import com.cyperspeed.dto.configuration.wincombinations.WinCombinationsType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class GameConfiguration {

	@JsonProperty("columns")
	private int columns;
	@JsonProperty("rows")
	private int rows;
	@JsonProperty("symbols")
	private SymbolType symbols;
	@JsonProperty("probabilities")
	private ProbabilitiesType probabilities;
	@JsonProperty("win_combinations")
	private WinCombinationsType winCombinations;
}
