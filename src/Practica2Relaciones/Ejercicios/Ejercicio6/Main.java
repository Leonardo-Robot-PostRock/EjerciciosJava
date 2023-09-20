package Practica2Relaciones.Ejercicios.Ejercicio6;

import practica1objetos.Ejercicios.Ejercicio1.Cuenta;
import practica1objetos.Ejercicios.Ejercicio2.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Pablo", 45, 78, 1.76);
        Cuenta cuenta1 = new Cuenta(400000);

        persona1.setCuenta(cuenta1);
        cuenta1.setPersona(persona1);

        System.out.println("Cantidad de dinero: " + persona1.getCuenta().getCantidad());

        System.out.println("-------------------------------------------");
        System.out.println("Cuenta pertenece a " + cuenta1.getPersona().getNombre()
        );

    }
}
