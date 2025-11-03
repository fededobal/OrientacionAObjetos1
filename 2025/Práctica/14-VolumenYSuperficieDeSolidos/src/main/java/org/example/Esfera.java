package org.example;

public class Esfera extends Pieza {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    double getVolumen() {
        return ((double) 4 /3) * Math.PI * Math.pow(radio,3);
    }

    @Override
    double getSuperficie() {
        return 4 * Math.PI * Math.pow(radio,2);
    }
}
