package com.cyperspeed.service;

import com.cyperspeed.dto.InputData;
import com.cyperspeed.dto.configuration.GameConfiguration;
import com.cyperspeed.util.JsonUtil;

public class ConfigurationLoader {
	
	private JsonUtil jsonUtil = new JsonUtil();
	public GameConfiguration loadConfigurationFile (InputData input) {
		return (GameConfiguration) jsonUtil.jsonFileToObject(input.getConfigFilePath(), GameConfiguration.class);
	}

}
