package org.consigna;

public class Cuadrado {
    private double lado;
    private double perimetro;
    private double area;

    public Cuadrado(double lado) {
        this.lado = lado;
        this.perimetro = 4 * lado;
        this.area = Math.pow(lado, 2);
    }

    public Cuadrado() {}

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
        this.perimetro = 4 * lado;
        this.area = Math.pow(lado, 2);
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }
}
