package EjemplosExcepciones.Excepciones1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploExcepciones08Manzanas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = 0;
        int p = 0;

        try {
            System.out.print("Número de manzanas: ");
            m = Integer.parseInt(s.nextLine());

            System.out.print("Número de personas: ");
            p = Integer.parseInt(s.nextLine());

            if (p == 0) {
                throw new ArithmeticException("División por cero no permitida.");
            }

            double resultado = reparteManzanas(m, p);
            System.out.println("A cada persona le corresponden " + resultado + " manzanas.");
        } catch (NumberFormatException nfe) {
            System.out.println("Error: Por favor, ingrese números enteros válidos.");
        } catch (ArithmeticException ae) {
            System.out.println("Error: " + ae.getMessage());
        }
    }

    public static double reparteManzanas(int manzanas, int personas) {
        return (double) manzanas / personas;
    }
}
