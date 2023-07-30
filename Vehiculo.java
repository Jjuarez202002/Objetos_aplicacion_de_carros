package com.mycompany.objetos_aplicacion_de_carros;

class Vehiculo {
    private String nombre;
    private int numVueltas;
    private double tiempoTotal;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
        numVueltas = 0;
        tiempoTotal = 0.0;
    }

    public void agregarTiempoVuelta(double tiempoVuelta) {
        tiempoTotal += tiempoVuelta;
        numVueltas++;
    }

    public double calcularVelocidadPromedio() {
        if (numVueltas == 0) {
            return 0.0;
        }
        return numVueltas / tiempoTotal;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getNumVueltas() {
        return numVueltas;
    }

    public double getTiempoTotal() {
        return tiempoTotal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumVueltas(int numVueltas) {
        this.numVueltas = numVueltas;
    }

    public void setTiempoTotal(double tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }
}
