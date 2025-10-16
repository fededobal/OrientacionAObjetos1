package org.consigna;

public class Circulo {
    private double diametro;
    private double radio;
    private double perimetro;
    private double area;

    public Circulo(double radio) {
        this.radio = radio;
        this.diametro = radio * 2;
        this.perimetro = Math.PI * this.diametro;
        this.area = Math.PI * Math.pow(this.radio, 2);
    }

    public Circulo() {}

    public double getDiametro() {
        return diametro;
    }

    private void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
        this.diametro = radio * 2;
        this.perimetro = Math.PI * this.diametro;
        this.area = Math.PI * Math.pow(this.radio, 2);
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }
}
