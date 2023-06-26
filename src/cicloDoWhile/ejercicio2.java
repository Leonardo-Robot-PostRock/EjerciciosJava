package cicloDoWhile;

import javax.swing.*;

public class ejercicio2 {
    public static void main(String[] args) {
//        2) Haciendo uso de un ciclo repetir, crear un algoritmo que:
//⚫ Pida al usuario ingresar el nombre de un color.
//⚫ Si el usuario ingresa la cadena “rojo”, “azul” o “amarillo”, mostrar por pantalla: “Ese es un color primario” y terminar la ejecución del programa. Caso contrario, volver a pedir que ingrese un color primario.
        String entrada;

        do {
            entrada = JOptionPane.showInputDialog(null, "Ingresar un color primario");
        } while (!entrada.toLowerCase().equals("amarillo") && !entrada.toLowerCase().equals("azull") && !entrada.toLowerCase().equals("rojo"));

        System.out.println("Ese es un color primario");
    }
}
