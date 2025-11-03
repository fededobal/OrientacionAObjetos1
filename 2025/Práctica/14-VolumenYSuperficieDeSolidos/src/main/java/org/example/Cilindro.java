package org.example;

public class Cilindro extends Pieza {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    double getVolumen() {
        return Math.PI * Math.pow(radio,2) * altura;
    }

    @Override
    double getSuperficie() {
        return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio,2);
    }
}
