package com.mouj2022.ctcs.debug;

import com.mouj2022.ctcs.output.OutputController;
import net.minecraftforge.client.event.CustomizeGuiOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DebugOverlay {

    @SubscribeEvent
    public static void onDebug(CustomizeGuiOverlayEvent.DebugText event){

        event.getLeft().add("CTCS Speed: "+OutputController.speed);

        event.getLeft().add("CTCS Gear: "+ OutputController.gear);

        event.getLeft().add("CTCS Accel: "+OutputController.accel);

    }

}