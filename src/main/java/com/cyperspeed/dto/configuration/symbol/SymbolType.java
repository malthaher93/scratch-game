package com.cyperspeed.dto.configuration.symbol;

import java.util.ArrayList;
import java.util.List;

import com.cyperspeed.dto.configuration.symbol.type.AbstractSymbolType;
import com.cyperspeed.dto.configuration.symbol.type.bonus.Symbol1000PlusType;
import com.cyperspeed.dto.configuration.symbol.type.bonus.Symbol10xType;
import com.cyperspeed.dto.configuration.symbol.type.bonus.Symbol500PlusType;
import com.cyperspeed.dto.configuration.symbol.type.bonus.Symbol5xType;
import com.cyperspeed.dto.configuration.symbol.type.bonus.SymbolMissType;
import com.cyperspeed.dto.configuration.symbol.type.standard.SymbolAType;
import com.cyperspeed.dto.configuration.symbol.type.standard.SymbolBType;
import com.cyperspeed.dto.configuration.symbol.type.standard.SymbolCType;
import com.cyperspeed.dto.configuration.symbol.type.standard.SymbolDType;
import com.cyperspeed.dto.configuration.symbol.type.standard.SymbolEType;
import com.cyperspeed.dto.configuration.symbol.type.standard.SymbolFType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SymbolType {

	private List<AbstractSymbolType> symbolType = new ArrayList<AbstractSymbolType>();


	@JsonProperty("A")
	public void setA(SymbolAType symbol) {
		symbol.setName("A");
		symbolType.add(symbol);
	}

	@JsonProperty("B")
	public void setB(SymbolBType symbol) {
		symbol.setName("B");
		symbolType.add(symbol);
	}

	@JsonProperty("C")
	public void setC(SymbolCType symbol) {
		symbol.setName("C");
		symbolType.add(symbol);
	}

	@JsonProperty("D")
	public void setD(SymbolDType symbol) {
		symbol.setName("D");
		symbolType.add(symbol);
	}


	@JsonProperty("E")
	public void setE(SymbolEType symbol) {
		symbol.setName("E");
		symbolType.add(symbol);
	}

	@JsonProperty("F")
	public void setF(SymbolFType symbol) {
		symbol.setName("F");
		symbolType.add(symbol);
	}

	@JsonProperty("10x")
	public void set10x(Symbol10xType symbol) {
		symbol.setName("10x");
		symbolType.add(symbol);
	}

	@JsonProperty("5x")
	public void set5x(Symbol5xType symbol) {
		symbol.setName("5x");
		symbolType.add(symbol);
	}

	@JsonProperty("+1000")
	public void setPlus1000(Symbol1000PlusType symbol) {
		symbol.setName("+1000");
		symbolType.add(symbol);
	}

	@JsonProperty("+500")
	public void setPlus500(Symbol500PlusType symbol) {
		symbol.setName("+500");
		symbolType.add(symbol);
	}

	@JsonProperty("MISS")
	public void setMiss(SymbolMissType symbol) {
		symbol.setName("MISS");
		symbolType.add(symbol);
	}

}
