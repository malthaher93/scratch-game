package com.cyperspeed.dto.configuration.probabilities.type;

import lombok.Data;

@Data
public class SymbolType {

	private String symbolName;
	private Integer probabilityNumber;
	private Double probabilityPercantage;
	
	public SymbolType(String symbolName, Integer probabilityNumber) {
		super();
		this.symbolName = symbolName;
		this.probabilityNumber = probabilityNumber;
	}
	
	
	
}
