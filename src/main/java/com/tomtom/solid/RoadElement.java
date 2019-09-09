package com.tomtom.solid;

public class RoadElement {
    private int id;
    private int fow;
    private int frc;
    private double length;

    public int getId() {
        return id;
    }

    public int getFow() {
        return fow;
    }

    public int getFrc() {
        return frc;
    }

    public double getLength() {
        return length;
    }

    public RoadElement(int id, int frc, int fow, double length) {
        this.id = id;
        this.fow = fow;
        this.frc = frc;
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("[%d, %d, %d, %f]", id, fow, frc, length);
    }
}
