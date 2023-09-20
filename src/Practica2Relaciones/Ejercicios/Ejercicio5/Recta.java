package Practica2Relaciones.Ejercicios.Ejercicio5;

import Practica2Relaciones.Ejercicios.Ejercicio4.Punto;

public class Recta {
    private Punto a;
    private Punto b;

    public Recta() {
    }

    public Recta(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }

    public Punto getA() {
        return a;
    }

    public void setA(Punto a) {
        this.a = a;
    }

    public Punto getB() {
        return b;
    }

    public void setB(Punto b) {
        this.b = b;
    }

    public double calcularPendienteRecta() {
        return (double) ((a.getY() - b.getY()) / (a.getX() - b.getX()));
    }

    //Distancia entre 2 puntos
    public double calcularLongitudEntre2Puntos() {
        int dx = ((b.getX()) - (a.getX()));
        int dy = ((b.getY()) - (a.getY()));
        double result = Math.pow(dx, 2) + Math.pow(dy, 2);
        return Math.sqrt(result);
    }
}
