package com.cyperspeed.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class InputData {
	
	@JsonProperty("bet_amount")
	private Integer betAmount;
	@JsonProperty("config")
	private String configFilePath;
		
}
