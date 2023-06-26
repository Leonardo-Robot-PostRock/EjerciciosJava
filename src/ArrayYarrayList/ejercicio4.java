package ArrayYarrayList;

import javax.swing.*;

public class ejercicio4 {
    public static void main(String[] args) {
//        4- Crear 2 arreglos de dimensiones idénticas a su elección. Crear un 3er arreglo con la suma de los elementos de los 2 arreglos anteriores.
//        Ej:
//        Array A= [2,4,1,6]
//        Array B= [3,8,12,0]
//        Entonces el 3er Array debería contener las sumas de los elementos 0+0, 1+1,2+2,3+3 y el resultado quedaria: Array C= [5,12,13,6]

        int[] a, b, sumatoria;
        a = new int[4];
        b = new int[4];
        sumatoria = new int[4];

        System.out.println("Llenar el arreglo A");
        for (int i = 0; i <= 3; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número del Array A para la posición " + (i + 1)));
        }

        System.out.println("Llenar el arreglo B");
        for (int j = 0; j <= 3; j++) {
            b[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número del Array B para la posición " + (j + 1)));
        }

        for (int i = 0; i <= 3; i++) {
            sumatoria[i] = a[i] + b[i];
            System.out.println("La suma de la posición " + i + " es: " + sumatoria[i]);
        }

    }
}
