package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
//        Realizar un programa que pida dos números por pantalla, si el primer número es mayor (>) al segundo, restar el segundo número al primero y mostrar el resultado por pantalla. Caso contrario, restar el primer número al segundo y mostrar resultado por pantalla.

        int numero1;
        int numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del primer número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del segundo número"));

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "El resultado de restar " + numero1 + " con " + numero2 + " es igual a " + (numero1 - numero2));
        } else {
            JOptionPane.showMessageDialog(null, "El resultado de restar " + numero2 + " con " + numero1 + " es igual a " + (numero2 - numero1));
        }
    }
}
