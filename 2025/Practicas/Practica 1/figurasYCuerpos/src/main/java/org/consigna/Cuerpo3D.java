package org.consigna;

public class Cuerpo3D {
    private double altura;
    private CaraBasal caraBasal;

    public Cuerpo3D() {
        this.caraBasal = new CaraBasal();
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    // Prescindiendo de la herencia por ahora
    public void setCaraBasal(Cuadrado cuadrado) {
        this.caraBasal.setArea(cuadrado.getArea());
        this.caraBasal.setPerimetro(cuadrado.getPerimetro());
    }

    public void setCaraBasal(Circulo circulo) {
        this.caraBasal.setArea(circulo.getArea());
        this.caraBasal.setPerimetro(circulo.getPerimetro());
    }

    public double getVolumen() {
        return this.caraBasal.getArea() * this.altura;
    }

    public double getSuperficieExterior() {
        return (2 * this.caraBasal.getArea()) + (this.caraBasal.getPerimetro() * this.altura);
    }
}
