package Practica2Relaciones.Ejercicios.Ejercicio1;

import practica1Objetos.Ejercicios.Ejercicio2.Persona;
import practica1Objetos.EjercicioModelo.Auto;

public class Main {
    public static void main(String[] args) {

        Persona per1 = new Persona("Emilio Rodriguez", 39);
        Persona per2 = new Persona("Angela Fernandez", 27);

        //Auto 1
        Auto auto1 = new Auto("Chevrolet", "1.4 Lt", 1398, 4, 5, 165, 20);
        //Auto 2
        Auto auto2 = new Auto("Ford", "Mustang", 5.0, 2, 2, 250, 0);

        //relaciones
        per1.setAuto(auto1);
        per2.setAuto(auto2);

        //Conduciendo en la ruta persona 1
        //Frenar
        per1.getAuto().frenar();
        //Acelerar auto
        per1.getAuto().acelerar(30);
        //desacelerar auto
        per1.getAuto().desacelerar(10);

        per1.imprimir();

        System.out.println("-------------------------------");

        //Conduciendo en la ruta persona 2
        per2.getAuto().acelerar(100);
        per2.imprimir();

    }
}
