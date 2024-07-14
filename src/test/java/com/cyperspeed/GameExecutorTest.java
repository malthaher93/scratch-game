package com.cyperspeed;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

import com.cyperspeed.dto.OutputData;
import com.cyperspeed.service.GameExecutor;

public class GameExecutorTest{

	
	@Test
	public void testLostCase1() throws Exception {

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("config-lost-case-1.json").getFile());
		
		// given
		String[] args = new String[]{"--betting-amount", "100", "--config" , file.getAbsolutePath()};

		// when
		GameExecutor exeutor = new GameExecutor();
		OutputData output= exeutor.execute(args);
		
		// then
		assertNotNull(output);
		assertTrue(output.getReward() == 0);

	} 
	
	@Test
	public void testLostCase2() throws Exception {

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("config-lost-case-2.json").getFile());
		
		// given
		String[] args = new String[]{"--betting-amount", "100", "--config" , file.getAbsolutePath()};

		// when
		GameExecutor exeutor = new GameExecutor();
		OutputData output= exeutor.execute(args);
		
		// then
		assertNotNull(output);
		assertTrue(output.getReward() == 0);

	} 
	
	@Test
	public void testWinCase1() throws Exception {

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("config-win-case-1.json").getFile());
		
		// given
		String[] args = new String[]{"--betting-amount", "100", "--config" , file.getAbsolutePath()};

		// when
		GameExecutor exeutor = new GameExecutor();
		OutputData output= exeutor.execute(args);
		
		// then
		assertNotNull(output);
		assertTrue(output.getReward() != 0);

	} 
	
	@Test
	public void testWinCase2() throws Exception {

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("config-win-case-2.json").getFile());
		
		// given
		String[] args = new String[]{"--betting-amount", "100", "--config" , file.getAbsolutePath()};

		// when
		GameExecutor exeutor = new GameExecutor();
		OutputData output= exeutor.execute(args);
		
		// then
		assertNotNull(output);
		assertTrue(output.getReward() != 0);

	} 
}