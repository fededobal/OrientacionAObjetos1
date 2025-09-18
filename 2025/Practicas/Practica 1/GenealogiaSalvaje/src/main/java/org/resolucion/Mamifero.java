package org.resolucion;

import java.util.Date;

public class Mamifero {
    private Mamifero padre;
    private Mamifero madre;
    private String id;
    private String especie;
    private Date fechaNacimiento;

    public Mamifero() {}

    public Mamifero(String id) {
        this.id = id;
    }

    public Mamifero getPadre() {
        return padre;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public Mamifero getMadre() {
        return madre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    public String getIdentificador() {
        return id;
    }

    public void setIdentificador(String id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Mamifero getAbueloMaterno() {
        return this.getMadre() != null ? this.getMadre().getPadre() : null;
    }

    public Mamifero getAbueloPaterno() {
        return this.getPadre() != null ? this.getPadre().getPadre() : null;
    }

    public Mamifero getAbuelaMaterna() {
        return this.getMadre() != null ? this.getMadre().getMadre() : null;
    }

    public Mamifero getAbuelaPaterna() {
        return this.getPadre() != null ? this.getPadre().getMadre() : null;
    }

    public boolean tieneComoAncestroA(Mamifero unMamifero) {
        boolean aux = false;
        if(this.getMadre() == unMamifero || this.getPadre() == unMamifero)
            aux = true;
        else {
            if(this.getMadre() != null)
                aux = this.getMadre().tieneComoAncestroA(unMamifero);
            if(!aux && this.getPadre() != null)
                aux = this.getPadre().tieneComoAncestroA(unMamifero);
        }
        return aux;
    }
}
