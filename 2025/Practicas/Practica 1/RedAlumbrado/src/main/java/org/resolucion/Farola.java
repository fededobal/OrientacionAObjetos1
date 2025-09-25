package org.resolucion;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Farola {
    private boolean state;
    private List<Farola> neighborhood;

    /*
     * Crear una farola. Debe inicializarla como apagada
     */
    public Farola () {
        neighborhood = new LinkedList<>();
    }

    /*
     * Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
     */
    public void pairWithNeighbor(Farola otraFarola) {
        if(otraFarola != null && !this.neighborhood.contains(otraFarola)) {
            this.neighborhood.add(otraFarola);
            otraFarola.getNeighbors().add(this);
        }
    }

    /*
     * Retorna sus farolas vecinas
     */
    public List<Farola> getNeighbors () {
        return this.neighborhood;
    }

    /*
     * Si la farola no está encendida, la enciende y propaga la acción.
     */
    public void turnOn() {
        if(!this.state) {
            this.state = true;
            for (Farola f : this.neighborhood)
                f.turnOn();
        }
    }

    /*
     * Si la farola no está apagada, la apaga y propaga la acción.
     */
    public void turnOff() {
        if(this.state) {
            this.state = false;
            for (Farola f : this.neighborhood)
                f.turnOff();
        }
    }

    /*
     * Retorna true si la farola está encendida.
     */
    public boolean isOn() {
        return this.state;
    }

    /*
     * Retorna true si la farola está apagada.
     */
    public boolean isOff() {
        return !this.state;
    }
}
