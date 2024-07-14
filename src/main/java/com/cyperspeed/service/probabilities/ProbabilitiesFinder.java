package com.cyperspeed.service.probabilities;

import java.util.Comparator;

import com.cyperspeed.dto.configuration.probabilities.type.SymbolProbabilitiesType;
import com.cyperspeed.dto.configuration.probabilities.type.SymbolType;

public class ProbabilitiesFinder {

	private ProbabilitiesCalculator probabilitiesCalculator = new ProbabilitiesCalculator();

	/**
	 * calculate and find max probability symbol percentage
	 * @param symbol
	 * @return
	 */
	
	public String find(SymbolProbabilitiesType symbol) {

		probabilitiesCalculator.calculate(symbol);
		
		final SymbolType maxPercantageSymbolType = findMaxProbabilitySymbol(symbol);

		return maxPercantageSymbolType.getSymbolName();

	}

	/**
	 * find max probability symbol percentage
	 * @param symbol
	 * @return
	 */
	private SymbolType findMaxProbabilitySymbol(SymbolProbabilitiesType symbol) {
		return symbol.getSymbols()
				.stream()
				.max(Comparator.comparing(SymbolType::getProbabilityPercantage))
				.get();
	}
}
