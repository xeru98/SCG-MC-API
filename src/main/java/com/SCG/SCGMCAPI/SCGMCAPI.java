package com.SCG.SCGMCAPI;

import com.SCG.SCGMCAPI.setup.Config;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SCGMCAPI.MODID)
public class SCGMCAPI {

    public static final String MODID="SCGMCAPI";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public SCGMCAPI() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static Logger getLogger(){
        return LOGGER;
    }
}
