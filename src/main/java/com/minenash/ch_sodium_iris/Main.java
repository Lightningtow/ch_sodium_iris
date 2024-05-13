package com.minenash.ch_sodium_iris;

import net.fabricmc.api.ClientModInitializer;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class Main implements ClientModInitializer
{
	public static final String MOD_ID = "ch_sodium_iris";

	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);



	@Override
	public void onInitializeClient()
	{

		try {
			BuiltInModCompat.register();
		}
		catch (Exception e) {
			LOGGER.error("Error initializing sodium/iris compatibility: " + Arrays.toString(e.getStackTrace()));
		}
	}

}
