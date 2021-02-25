package com.SCG.SCGMCAPI.setup;

import com.SCG.SCGMCAPI.SCGMCAPI;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent.LoggedInEvent;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent.LoggedOutEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.*;

@Mod.EventBusSubscriber(value = Dist.DEDICATED_SERVER, modid = SCGMCAPI.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandlers {

    //SERVER LIFECYCLE EVENTS

    @SubscribeEvent
    public static void serverInit(FMLServerStartingEvent event){
        SCGMCAPI.getLogger().debug("Server Init");
        System.out.println("Server Init");
    }

    @SubscribeEvent
    public static void serverPostInit(FMLServerAboutToStartEvent event){
        SCGMCAPI.getLogger().debug("Server PostInit");
        System.out.println("Server PostInit");
    }

    @SubscribeEvent
    public static void serverBeginPlay(FMLServerStartedEvent event){
        SCGMCAPI.getLogger().debug("Server BeginPlay");
        System.out.println("Server BeginPlay");
    }

    @SubscribeEvent
    public static void serverPreShutdown(FMLServerStoppingEvent event){
        SCGMCAPI.getLogger().debug("Server PreShutdown");
        System.out.println("Server PreShutdown");
    }

    @SubscribeEvent
    public static void serverShutdown(FMLServerStoppedEvent event){
        SCGMCAPI.getLogger().debug("Server Shutdown");
        System.out.println("Server Shutdown");
    }

    //CLIENT CONNECTION EVENTS

    @SubscribeEvent
    public static void onClientConnected(LoggedInEvent event){
        SCGMCAPI.getLogger().debug("Client Connected");
        System.out.println("Client Connected");
    }

    @SubscribeEvent
    public static void onClientDisconnected(LoggedOutEvent event){
        SCGMCAPI.getLogger().debug("Client Disconnected");
        System.out.println("Client Disconnected");
    }
}
