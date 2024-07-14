package com.cyperspeed.dto.configuration.symbol.type.bonus;

import com.cyperspeed.dto.configuration.symbol.type.AbstractSymbolType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public abstract class AbstractBonusSymbolType extends AbstractSymbolType{
	
	@JsonProperty("extra")
	protected int extra;
	
	@JsonProperty("impact")
	protected String impact;
	
}
