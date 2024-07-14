package com.cyperspeed.dto.configuration.probabilities.type;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class StandardSymbolProbabilitiesType extends AbstractProbabilitiesType {
	@JsonProperty("column")
	private int column;
	@JsonProperty("row")
	private int row;
	
}
