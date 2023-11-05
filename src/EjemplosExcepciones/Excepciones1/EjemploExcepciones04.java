package EjemplosExcepciones.Excepciones1;

import java.util.Scanner;

public class EjemploExcepciones04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int asteriscos = 0;
        int lineas = 0;

        System.out.println("Este programa pinta varias líneas de asteriscos");
        try {

            System.out.print("Introduzca el número total de asteriscos: ");
            asteriscos = Integer.parseInt(s.nextLine());

            System.out.print("Introduzca el número de líneas que quiere pintar: ");
            lineas = Integer.parseInt(s.nextLine());
        } catch (NumberFormatException ime) {
            System.out.println("Error: Por favor, ingresa números enteros válidos");
            return;
        }

        int longitud = 0;

        try {
            longitud = (asteriscos % lineas) == 0 ? asteriscos / lineas : (int) Math.ceil((double) asteriscos / lineas);
        } catch (ArithmeticException ae) {
            System.out.println("No se puede dividir por cero");
        }

        int cuentaAsteriscos = 0;

        for (int i = 1; i <= lineas; i++) {
            System.out.print("Línea " + i + ": ");
            for (int j = 0; (j < longitud) && (cuentaAsteriscos++ < asteriscos); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
