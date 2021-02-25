package com.SCG.SCGMCAPI.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.logging.log4j.core.jmx.Server;

public class Config {

    public static final String CATEGORY_AUTH = "auth";

    public static ForgeConfigSpec SERVER_CONFIG;

    public static ForgeConfigSpec.ConfigValue<String> ENDPOINT;
    public static ForgeConfigSpec.ConfigValue<String> CLIENT_ID;
    public static ForgeConfigSpec.ConfigValue<String> CLIENT_SECRET;

    static {
        ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();

        defineAuthSettings(SERVER_BUILDER);

        SERVER_CONFIG = SERVER_BUILDER.build();
    }

    private static void defineAuthSettings(ForgeConfigSpec.Builder ServerBuilder){
        ServerBuilder.comment("API Auth Settings").push(CATEGORY_AUTH);
        ENDPOINT = ServerBuilder.comment("API Post Endpoint").define("endpoint", "localhost:80");
        CLIENT_ID = ServerBuilder.comment("ID of this server passed to the endpoint (must be verified by endpoint with secret)").define("client_id", "");
        CLIENT_SECRET = ServerBuilder.comment("Secret of this server passed to the endpoint (must be verified by endpoint with id)").define("client_secret", "");
        ServerBuilder.pop();
    }
}
