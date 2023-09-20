package Practica2Relaciones.Ejercicios.Ejercicio5;

import Practica2Relaciones.Ejercicios.Ejercicio4.Punto;

import java.util.ArrayList;

public class Poligono {
    private String nombre;
    ArrayList<Punto> puntos = new ArrayList<>();

    public Poligono(String nombre, ArrayList<Punto> puntos) {
        if (puntos.size() < 3) {
            throw new IllegalArgumentException("Un polígono debe tener al menos 3 puntos");
        }
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Punto> getPuntos() {
        return puntos;
    }

    public void setPuntos(ArrayList<Punto> puntos) {
        this.puntos = puntos;
    }

    public void mostrarPuntos() {
        System.out.println("Puntos del polígono:");
        for (Punto punto : puntos) {
            System.out.println("Punto (" + punto.getX() + ", " + punto.getY() + ")");
        }
    }
}
