package Practica2Relaciones.Ejercicios.Ejercicio5;

import Practica2Relaciones.Ejercicios.Ejercicio4.Punto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Crear una recta
        Punto punto1 = new Punto(3, 4);
        Punto punto2 = new Punto(1, 2);
        Recta recta = new Recta(punto1, punto2);

        System.out.println("\nRecta");
        System.out.println("Pendiente: " + recta.calcularPendienteRecta());
        System.out.println("Longitud: " + recta.calcularLongitudEntre2Puntos());

        //Crear un polígono con tres puntos
        ArrayList<Punto> puntosDelPoligono = new ArrayList<>();
        puntosDelPoligono.add(new Punto(1,1));
        puntosDelPoligono.add(new Punto(2,3));
        puntosDelPoligono.add(new Punto(4,2));

        Poligono poligono = new Poligono("Triángulo", puntosDelPoligono);

        System.out.println("Polígono");
        System.out.println("Nombre "+ poligono.getNombre());
        poligono.mostrarPuntos();
    }
}
