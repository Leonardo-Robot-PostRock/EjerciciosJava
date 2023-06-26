package ArrayYarrayList;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class ejercicio5 {
    public static void main(String[] args) {
//        5- Crear un Array de N dimensión. Llenarlo con números y copiar los números a otro Array desde el último hasta el primero. Por ejemplo:

        int[] arregloA, arregloB;
        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad del arreglo"));
        arregloA = new int[n];
        arregloB = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            arregloA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número" + (i + 1)));
        }

        for (int j = n - 1; j >= 0; j--) {
            arregloB[j] = arregloA[j];
            System.out.println(arregloB[j]);
        }
    }
}
