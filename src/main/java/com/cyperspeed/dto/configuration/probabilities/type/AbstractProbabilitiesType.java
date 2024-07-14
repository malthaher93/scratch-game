package com.cyperspeed.dto.configuration.probabilities.type;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public abstract class AbstractProbabilitiesType {

	@JsonProperty("symbols")
	protected SymbolProbabilitiesType symbols;

}
