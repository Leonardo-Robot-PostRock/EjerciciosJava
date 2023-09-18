package Practica2Relaciones.Ejercicios.Ejercicio2;

public class CPU {
    private String modelo;
    private double velocidad;

    public CPU() {
    }

    public CPU(String modelo, double velocidad) {
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}
