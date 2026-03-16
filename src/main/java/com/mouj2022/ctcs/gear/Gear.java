package com.mouj2022.ctcs.gear;

public enum Gear {

    EB(-2.0),

    B5(-1.0),
    B4(-0.8),
    B3(-0.6),
    B2(-0.4),
    B1(-0.2),

    H(-0.05),

    N(0),

    P1(0.2,25),
    P2(0.4,50),
    P3(0.6),
    P4(0.8),
    P5(1.0);

    public final double ratio;
    public final double specialVm;

    Gear(double ratio) {
        this(ratio,-1);
    }

    Gear(double ratio,double vm) {
        this.ratio = ratio;
        this.specialVm = vm;
    }

}