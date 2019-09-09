package com.tomtom.solid;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoadElementProvider {
    private boolean initialized;

    public RoadElementProvider() {
        this.initialized = false;
    }

    public void initialize() {
        this.initialized = true;
    }

    public List<RoadElement> getRoadElements(int quantity) {
        if (!this.initialized) {
            throw new RuntimeException("Provider not initialized!");
        }
        List<RoadElement> result = new ArrayList<>();
        Random r = new Random(System.currentTimeMillis());

        for (int i=0; i<quantity; i++) {
            result.add(new RoadElement(Math.abs(r.nextInt()), Math.abs(r.nextInt() % 10), Math.abs(r.nextInt() % 5), Math.abs(r.nextDouble()*1000)));
        }

        return result;
    }
}
