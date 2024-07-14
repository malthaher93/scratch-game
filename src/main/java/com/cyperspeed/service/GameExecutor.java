package com.cyperspeed.service;

import com.cyperspeed.dto.InputData;
import com.cyperspeed.dto.OutputData;
import com.cyperspeed.dto.configuration.GameConfiguration;
import com.cyperspeed.service.wincombinations.WinCombinationsFinder;
import com.cyperspeed.util.JsonUtil;

public class GameExecutor {
	
	public OutputData execute(String [] args) {

		ArgumentHandler argumentHandler = new ArgumentHandler();
		InputData input = argumentHandler.handle(args);
		
		if (input != null) {
			ConfigurationLoader configurationService = new ConfigurationLoader();
			GameConfiguration configuration = configurationService.loadConfigurationFile(input);
			
			if (configuration != null) {
				MatrixGenerator matrixGenerator = new MatrixGenerator();
				String[][] generatedMatrix = matrixGenerator.generate(configuration);
				
				if (generatedMatrix != null) {
					WinCombinationsFinder winCombinationsFinder = new WinCombinationsFinder();
					OutputData output = winCombinationsFinder.find(generatedMatrix, configuration, input);
					
					JsonUtil jsonUtil = new JsonUtil();
					String jsonStr = jsonUtil.objectToJsonString(output);
					System.out.println(jsonStr);
					return output;
					
				}else {
					System.out.println("An error occured, please check the stack trace log");
				}
			}else {
				System.out.println("An error occured, please check the stack trace log");
			}
		}	
		return null;
	}

}
