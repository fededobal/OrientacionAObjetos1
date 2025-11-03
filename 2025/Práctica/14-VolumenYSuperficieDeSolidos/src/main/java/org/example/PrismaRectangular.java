package org.example;

public class PrismaRectangular extends Pieza {
    private double ladoMayor;
    private double ladoMenor;
    private double altura;

    public PrismaRectangular(double ladoMayor, double ladoMenor, double altura) {
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
        this.altura = altura;
    }

    @Override
    double getVolumen() {
        return ladoMayor * ladoMenor * altura;
    }

    @Override
    double getSuperficie() {
        return 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
    }
}
