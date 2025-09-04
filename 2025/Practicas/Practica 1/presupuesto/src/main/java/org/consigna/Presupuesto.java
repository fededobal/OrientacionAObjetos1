package org.consigna;

import java.time.LocalDate;
import java.util.LinkedList;

public class Presupuesto {
    private LocalDate fecha;
    private String cliente;
    private LinkedList<Item> items;

    public Presupuesto(String cliente) {
        this.fecha = LocalDate.now();
        this.cliente = cliente;
        this.items = new LinkedList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void agregarItem(Item item) {
        this.items.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for(Item i : this.items) {
            total += i.costo();
        }
        return total;
    }
}
