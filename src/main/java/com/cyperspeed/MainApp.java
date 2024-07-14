package com.cyperspeed;

import com.cyperspeed.service.GameExecutor;

public class MainApp {

	public static void main(String[] args) {
		GameExecutor gameExecutor = new GameExecutor();
		gameExecutor.execute(args);
	}
	
}
