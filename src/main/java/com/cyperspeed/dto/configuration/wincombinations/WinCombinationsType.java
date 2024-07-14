package com.cyperspeed.dto.configuration.wincombinations;

import java.util.ArrayList;
import java.util.List;

import com.cyperspeed.dto.configuration.wincombinations.type.AbstractWinCombinationsType;
import com.cyperspeed.dto.configuration.wincombinations.type.SameSymbol3TimesWinCombinationsType;
import com.cyperspeed.dto.configuration.wincombinations.type.SameSymbol4TimesWinCombinationsType;
import com.cyperspeed.dto.configuration.wincombinations.type.SameSymbol5TimesWinCombinationsType;
import com.cyperspeed.dto.configuration.wincombinations.type.SameSymbol6TimesWinCombinationsType;
import com.cyperspeed.dto.configuration.wincombinations.type.SameSymbol7TimesWinCombinationsType;
import com.cyperspeed.dto.configuration.wincombinations.type.SameSymbol8TimesWinCombinationsType;
import com.cyperspeed.dto.configuration.wincombinations.type.SameSymbol9TimesWinCombinationsType;
import com.cyperspeed.dto.configuration.wincombinations.type.SameSymbolDiagonallyLeftToRightWinCombinationsType;
import com.cyperspeed.dto.configuration.wincombinations.type.SameSymbolDiagonallyRightToLeftWinCombinationsType;
import com.cyperspeed.dto.configuration.wincombinations.type.SameSymbolHorizontallyWinCombinationsType;
import com.cyperspeed.dto.configuration.wincombinations.type.SameSymbolVerticallyWinCombinationsType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class WinCombinationsType {

	private List<AbstractWinCombinationsType> winCombinations = new ArrayList<>();
	
	@JsonProperty("same_symbol_3_times")
	public void setSameSymbol3Times(SameSymbol3TimesWinCombinationsType winCombination) {
		winCombination.setName("same_symbol_3_times");
		winCombinations.add(winCombination);
	}
	
	@JsonProperty("same_symbol_4_times")
	public void setSameSymbol4Times(SameSymbol4TimesWinCombinationsType winCombination) {
		winCombination.setName("same_symbol_4_times");
		winCombinations.add(winCombination);
	}
	
	@JsonProperty("same_symbol_5_times")
	public void setSameSymbol5Times(SameSymbol5TimesWinCombinationsType winCombination) {
		winCombination.setName("same_symbol_5_times");
		winCombinations.add(winCombination);
	}
	
	@JsonProperty("same_symbol_6_times")
	public void setSameSymbol6Times(SameSymbol6TimesWinCombinationsType winCombination) {
		winCombination.setName("same_symbol_6_times");
		winCombinations.add(winCombination);
	}
	
	@JsonProperty("same_symbol_7_times")
	public void setSameSymbol7Times(SameSymbol7TimesWinCombinationsType winCombination) {
		winCombination.setName("same_symbol_7_times");
		winCombinations.add(winCombination);
	}
	
	@JsonProperty("same_symbol_8_times")
	public void setSameSymbol8Times(SameSymbol8TimesWinCombinationsType winCombination) {
		winCombination.setName("same_symbol_8_times");
		winCombinations.add(winCombination);
	}
	
	@JsonProperty("same_symbol_9_times")
	public void setSameSymbol9Times(SameSymbol9TimesWinCombinationsType winCombination) {
		winCombination.setName("same_symbol_9_times");
		winCombinations.add(winCombination);
	}
	
	@JsonProperty("same_symbols_horizontally")
	public void setSameSymbolHorizontally(SameSymbolHorizontallyWinCombinationsType winCombination) {
		winCombination.setName("same_symbols_horizontally");
		winCombinations.add(winCombination);
	}
	
	@JsonProperty("same_symbols_vertically")
	public void setSameSymbolVertically(SameSymbolVerticallyWinCombinationsType winCombination) {
		winCombination.setName("same_symbols_vertically");
		winCombinations.add(winCombination);
	}
	
	@JsonProperty("same_symbols_diagonally_left_to_right")
	public void setSameSymbolDiagonallyLeftToRight(SameSymbolDiagonallyLeftToRightWinCombinationsType winCombination) {
		winCombination.setName("same_symbols_diagonally_left_to_right");
		winCombinations.add(winCombination);
	}
	
	@JsonProperty("same_symbols_diagonally_right_to_left")
	public void setSameSymbolDiagonallyRightToLeft(SameSymbolDiagonallyRightToLeftWinCombinationsType winCombination) {
		winCombination.setName("same_symbols_diagonally_right_to_left");
		winCombinations.add(winCombination);
	}
}

