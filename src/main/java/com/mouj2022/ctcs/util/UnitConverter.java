package com.ctcs.util;

public class UnitConverter {

    public static double kmhToMc(double v) {

        return v / 72.0;

    }

    public static double mcToKmh(double v) {

        return v * 72.0;

    }

    public static double accelToMc(double a) {

        return a / 400.0;

    }

}