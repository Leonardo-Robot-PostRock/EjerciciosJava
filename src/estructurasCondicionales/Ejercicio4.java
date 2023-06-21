package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
//        Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables numero1, numero2, numero3 respectivamente. El algoritmo debe imprimir cuál es el mayor.
        int numero1, numero2, numero3;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer valor"));

        if (numero1 > numero2 && numero1 > numero3) {
            JOptionPane.showMessageDialog(null, "El número mayor es: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            JOptionPane.showMessageDialog(null, "El número mayor es: " + numero2);
        } else {
            JOptionPane.showMessageDialog(null, "El número mayor es: " + numero3);
        }

    }
}
