package Practica2Relaciones.Ejercicios.Ejercicio4;

public class Circulo {
    private int radio;
    private final Punto centro;

    public Circulo(int radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void imprimir() {
        System.out.println("El centro del círculo es la coordenada (" + centro.getX() + "," + centro.getY() + ")" + " y tiene un radio = " + radio);
    }

}
