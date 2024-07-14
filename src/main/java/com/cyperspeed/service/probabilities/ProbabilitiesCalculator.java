package com.cyperspeed.service.probabilities;

import java.math.BigDecimal;

import com.cyperspeed.dto.configuration.probabilities.type.SymbolProbabilitiesType;
import com.cyperspeed.dto.configuration.probabilities.type.SymbolType;

public class ProbabilitiesCalculator {

	/**
	 * calculate Probabilities percentage for provided symbol
	 * @param symbol
	 */
	public void calculate(SymbolProbabilitiesType symbol) {

		Integer totalProbability = findTotalProbabilit(symbol);

		symbol.getSymbols().stream().forEach(entry -> {
			Integer symbolProbability = entry.getProbabilityNumber();
			Double calculated = (double) symbolProbability / (double) totalProbability;
			entry.setProbabilityPercantage(calculated);
		});
	}

	/**
	 * find sum of all probability number for provided symbol
	 * @param symbol
	 * @return
	 */
	private Integer findTotalProbabilit(SymbolProbabilitiesType symbol) {
		return symbol.getSymbols().stream()
				.mapToInt(SymbolType::getProbabilityNumber)
				.sum();
	}
}
