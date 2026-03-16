package com.mouj2022.ctcs.gear;

public class GearTable {

    private static final Gear[] GEARS = Gear.values();

    public static Gear next(Gear gear) {

        int i = gear.ordinal();

        if(i >= GEARS.length - 1)
            return gear;

        return GEARS[i+1];
    }

    public static Gear prev(Gear gear) {

        int i = gear.ordinal();

        if(i <= 0)
            return gear;

        return GEARS[i-1];
    }

}