package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio14 {
    public static void main(String[] args) {
//        Escribir un programa que lea dos números enteros desde el teclado y si el primero es mayor que el segundo intercambie sus valores. Nota: Si alguno de los dos valores ingresados por el usuario fue negativo, primero transformar en positivo antes de intercambiarlo.

        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));

        if (num1 > num2) {
            if (num1 < 0) {
                num1 = num1 * (-1);
            }
            if (num2 < 0) {
                num2 = num2 * (-1);
            }
            int auxiliar;

            auxiliar = num1;
            num1 = num2;
            num2 = auxiliar;

            JOptionPane.showMessageDialog(null, "Los números devueltos son: " + num1 + " y " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "Los números devueltos son: " + num1 + " y " + num2);
        }
    }
}
