package com.mouj2022.ctcs.physics;


import com.mouj2022.ctcs.gear.Gear;
import com.mouj2022.ctcs.train.TrainStats;

public class TrainPhysics {

    public static double calcAcceleration(
            double speed,
            Gear gear,
            TrainStats stats
    ){

        if(gear.ratio > 0)
            return accel(speed,gear,stats);

        if(gear.ratio < 0)
            return brake(gear,stats);

        return 0;

    }

    private static double accel(
            double speed,
            Gear gear,
            TrainStats stats
    ){

        double P = gear.ratio;

        double Vm = gear.specialVm > 0
                ? gear.specialVm
                : stats.maxSpeed;

        double Am = stats.maxAccel;

        return (-Vm/(P*Am))*speed + Vm;

    }

    private static double brake(
            Gear gear,
            TrainStats stats
    ){

        double E = Math.abs(gear.ratio);

        double Ae = stats.maxBrake;

        return -Ae * E;

    }

}