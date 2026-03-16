package com.mouj2022.ctcs.output;


import com.mouj2022.ctcs.gear.Gear;

public class OutputController {

    public static double speed;

    public static double accel;

    public static Gear gear;

    public static void update(
            double s,
            double a,
            Gear g
    ){

        speed = s;
        accel = a;
        gear = g;

    }

}