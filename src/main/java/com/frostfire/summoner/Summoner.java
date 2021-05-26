package com.frostfire.summoner;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

import com.frostfire.summoner.setup.Registration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Summoner.MOD_ID)
public class Summoner {
    public static final String MOD_ID = "summoner";

    private static final Logger LOGGER = LogManager.getLogger();

    public Summoner() {
        Registration.register();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
