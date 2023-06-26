package ArrayYarrayList;

import javax.swing.*;

public class ejercicio2 {
    public static void main(String[] args) {
//        2.- Crear un arreglo con n números, ingresados por teclado y llenar un nuevo arreglo con sus valores elevados al cuadrado. Luego mostrar por pantalla ambos arreglos.
        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la dimensión del arreglo"));
        int[] valores = new int[n];
        int[] cuadrados = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número " + (i + 1)));
            cuadrados[i] = valores[i] * valores[i];
        }

        System.out.println("Numeros ingresados: ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(valores[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Sus cuadrados son: ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(cuadrados[i] + " ");
        }
    }
}
