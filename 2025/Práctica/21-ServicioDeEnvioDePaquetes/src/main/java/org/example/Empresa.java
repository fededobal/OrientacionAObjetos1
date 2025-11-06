package org.example;

public class Empresa extends Cliente {
    private String CUIT;

    public Empresa(String nombre, String direccion, String CUIT) {
        super(nombre, direccion);
        this.CUIT = CUIT;
    }
}
