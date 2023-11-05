package EjemplosExcepciones.Excepciones1;

import java.util.Scanner;

public class EjemploExcepciones09ManzanasConThrow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = 0;
        int p = 0;

        try {
            System.out.print("Número de manzanas: ");
            m = obtenerEnteroPositivo(s);
            System.out.print("Número de personas: ");
            p = obtenerEnteroPositivo(s);

            int resultado = reparteManzanas(m, p);
            System.out.println("A cada persona le corresponden " + resultado + " manzanas.");
        } catch (EntradaInvalidaException eie) {
            System.out.println("Error: " + eie.getMessage());
        } catch (DivisionPorCeroException dce) {
            System.out.println("Error: " + dce.getMessage());
        }
    }

    public static int reparteManzanas(int manzanas, int personas) {
        if (personas == 0) {
            throw new DivisionPorCeroException("El número de personas no puede ser 0.");
        }

        return manzanas / personas;
    }

    public static int obtenerEnteroPositivo(Scanner scanner) {
        int valor = 0;
        while (true) {
            try {
                valor = Integer.parseInt(scanner.nextLine());
                if (valor >= 0) {
                    return valor;
                } else {
                    throw new EntradaInvalidaException("El número debe ser positivo.");
                }
            } catch (NumberFormatException nfe) {
                throw new EntradaInvalidaException("La entrada no es un número válido.");
            }
        }
    }
}

