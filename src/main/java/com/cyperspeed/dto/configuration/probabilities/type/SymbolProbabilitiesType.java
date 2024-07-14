package com.cyperspeed.dto.configuration.probabilities.type;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SymbolProbabilitiesType {

	private List<SymbolType> symbols = new ArrayList<>();
    
    @JsonProperty("A")
    public void setA(int probabilityNumber) {
    	symbols.add(new SymbolType("A", probabilityNumber));
    }
    
    @JsonProperty("B")
    public void setB(int probabilityNumber) {
    	symbols.add(new SymbolType("B", probabilityNumber));
    }
    
    @JsonProperty("C")
    public void setC(int probabilityNumber) {
    	symbols.add(new SymbolType("C", probabilityNumber));
    }
    
    @JsonProperty("D")
    public void setD(int probabilityNumber) {
    	symbols.add(new SymbolType("D", probabilityNumber));
    }
    
    @JsonProperty("E")
    public void setE(int probabilityNumber) {
    	symbols.add(new SymbolType("E", probabilityNumber));
    }
    
    @JsonProperty("F")
    public void setF(int probabilityNumber) {
    	symbols.add(new SymbolType("F", probabilityNumber));
    }
    
    @JsonProperty("10x")
    public void set10x(int probabilityNumber) {
    	symbols.add(new SymbolType("10x", probabilityNumber));
    }
    
    @JsonProperty("5x")
    public void set5x(int probabilityNumber) {
    	symbols.add(new SymbolType("5x", probabilityNumber));
    }
    
    @JsonProperty("+1000")
    public void setPlus1000(int probabilityNumber) {
    	symbols.add(new SymbolType("+1000", probabilityNumber));
    }
    
    @JsonProperty("+500")
    public void setPlus500(int probabilityNumber) {
    	symbols.add(new SymbolType("+500", probabilityNumber));
    }
    
    @JsonProperty("MISS")
    public void setMiss(int probabilityNumber) {
    	symbols.add(new SymbolType("MISS", probabilityNumber));
    }
}
