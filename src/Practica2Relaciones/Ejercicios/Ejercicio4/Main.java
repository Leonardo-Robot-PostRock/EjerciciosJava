package Practica2Relaciones.Ejercicios.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(2,3);
        Circulo circulo1 = new Circulo(5, punto1);

        circulo1.imprimir();
    }
}
