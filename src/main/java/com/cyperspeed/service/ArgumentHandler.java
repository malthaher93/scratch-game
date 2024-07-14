package com.cyperspeed.service;

import com.cyperspeed.dto.InputData;

public class ArgumentHandler {


	public InputData handle (String[] args) {

		if (args.length == 0 ) {
			System.out.println("please provide application arguments, example :"
					+ " --config <json config file> --betting-amount <bet amount>");
			return null;
		}
		InputData input = load(args);

		boolean status = validate(input);
		if (status) 
			return input;
		else
			return null;

	}

	private boolean validate(InputData input) {
		if (input.getConfigFilePath() == null || input.getConfigFilePath().trim().isEmpty()) {
			System.out.println("--config is missing, please provide it, example :"
					+ " --config <json config file>");
			return false;
		}

		if (input.getBetAmount() == null ) {
			System.out.println("--betting-amount is missing, please provide it, example :"
					+ " --betting-amount <bet amount>");
			return false;
		}

		return true;

	}



	private InputData load(String[] args) {
		InputData input = new InputData();

		for (int idx = 0 ; idx < args.length; idx++) {
			String arg = args[idx];

			if (arg.equalsIgnoreCase("--config")) {
				input.setConfigFilePath(args[++idx]);
			}

			if (arg.equalsIgnoreCase("--betting-amount")) {
				input.setBetAmount(Integer.parseInt(args[++idx]));
			}
		}
		return input;
	}
}
