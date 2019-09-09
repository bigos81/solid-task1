package com.tomtom.solid;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(final String[] args) {

        RoadElementProvider roadElementProvider = new RoadElementProvider();
        roadElementProvider.initialize();
        List<RoadElement> roadElements = roadElementProvider.getRoadElements(100);

        for (RoadElement roadElement : roadElements) {
            System.out.println(roadElement);
        }

        int frc = 5; // single carriage road
        int fow = 0; // highway

        List<RoadElement> filteredResult = getElementsWithFOW(getElementsWithFRC(roadElements, frc), fow);

        double sumLength = 0.0;
        for (RoadElement filteredRoadElement : filteredResult) {
            sumLength += filteredRoadElement.getLength();
        }

        System.out.println("Combined length: " + sumLength);
    }

    private static List<RoadElement> getElementsWithFRC(List<RoadElement> input, int frc) {
        List<RoadElement> result = new ArrayList<>();
        for (RoadElement roadElement : input) {
            if (roadElement.getFrc() == frc) {
                result.add(roadElement);
            }
        }
        return result;
    }

    private static List<RoadElement> getElementsWithFOW(List<RoadElement> input, int fow) {
        List<RoadElement> result = new ArrayList<>();
        for (RoadElement roadElement : input) {
            if (roadElement.getFow() == fow) {
                result.add(roadElement);
            }
        }
        return result;
    }



}
