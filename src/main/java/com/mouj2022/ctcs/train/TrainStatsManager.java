package com.mouj2022.ctcs.train;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TrainStatsManager {

    private static final Map<UUID,TrainStats> DATA = new HashMap<>();

    public static TrainStats get(UUID trainId) {

        return DATA.computeIfAbsent(trainId,id->new TrainStats());

    }

}