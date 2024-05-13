package com.minenash.ch_sodium_iris;


import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class BuiltInModCompat {
    public static final Logger LOGGER = LogManager.getLogger(Main.MOD_ID);


    public static void register()
    {

        try {
            if (has("sodium")) SodiumCompat.registerCompat(); }
        catch (Exception e) {
            LOGGER.error("Error initializing sodium compatibility: " + Arrays.toString(e.getStackTrace())); }


        try {
            if (has("iris")) IrisCompat.registerCompat(); }
        catch (Exception e) {
            LOGGER.error("Error initializing iris compatibility: " + Arrays.toString(e.getStackTrace())); }


    }
    private static boolean has(String modid) {
        return FabricLoader.getInstance().isModLoaded(modid);
    }

}
