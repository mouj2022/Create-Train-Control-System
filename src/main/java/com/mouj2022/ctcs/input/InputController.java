package com.mouj2022.ctcs.input;

import com.mouj2022.ctcs.gear.Gear;
import com.mouj2022.ctcs.gear.GearTable;

public class InputController {

    public static Gear gear = Gear.EB;

    public static boolean driving = false;

    public static void shiftUp() {

        gear = GearTable.next(gear);

    }

    public static void shiftDown() {

        gear = GearTable.prev(gear);

    }

    public static void emergencyBrake() {

        gear = Gear.EB;

    }

}