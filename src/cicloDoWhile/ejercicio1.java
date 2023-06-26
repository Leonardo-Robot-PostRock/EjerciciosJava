package cicloDoWhile;

import javax.swing.*;

public class ejercicio1 {
    public static void main(String[] args) {
//        1) Haciendo uso de un ciclo repetir, crear un algoritmo que:
//⚫ Pida al usuario ingresar una serie de números positivos y acumularlos en una variable llamada “dividendo” hasta que se ingrese el número 0.
//⚫ Cuando el usuario ingrese el número 0, mostrar el promedio de los números ingresados. Para esto deberá crear una variable donde guardar la cantidad de números ingresados.
//⚫ Si al momento de calcular el promedio, el usuario no ha ingresado números positivos, mostrar por pantalla “No hay números a promediar.”

        int dividendo;
        int divisor;
        divisor = 0;
        dividendo = 0;
        int entrada;
        do {
            entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número positivo. Si desea saber el promedio de los números ingresados, ingrese 0"));

            if (entrada > 0) {
                dividendo += entrada;
                divisor += 1;
            }
        } while (entrada > 0);

        if (divisor != 0) {
            int promedio = dividendo / divisor;
            System.out.println("Promedio de números: " + promedio);
        } else {
            System.out.println("No hay notas a promediar");
        }
    }
}
