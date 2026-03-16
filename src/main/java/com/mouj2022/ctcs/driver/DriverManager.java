package com.mouj2022.ctcs.driver;

import net.minecraft.world.entity.player.Player;

public class DriverManager {

    public static boolean driving = false;

    public static Player player;

    public static void startDriving(Player p){

        driving = true;

        player = p;

    }

    public static void stopDriving(){

        driving = false;

        player = null;

    }

}