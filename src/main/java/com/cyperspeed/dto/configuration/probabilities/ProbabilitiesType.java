package com.cyperspeed.dto.configuration.probabilities;

import java.util.ArrayList;

import com.cyperspeed.dto.configuration.probabilities.type.BonusSymbolsProbabilitiesType;
import com.cyperspeed.dto.configuration.probabilities.type.StandardSymbolProbabilitiesType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ProbabilitiesType {
	@JsonProperty("standard_symbols")
	private ArrayList<StandardSymbolProbabilitiesType> standardSymbols;
	@JsonProperty("bonus_symbols")
	private BonusSymbolsProbabilitiesType bonusSymbol;
	
}
