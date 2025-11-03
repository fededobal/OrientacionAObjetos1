package org.example;

public abstract class Pieza {
    private String material;
    private String color;

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    abstract double getVolumen();
    abstract double getSuperficie();
}
