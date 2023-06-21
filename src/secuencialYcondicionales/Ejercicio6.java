package secuencialYcondicionales;

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
//        Escriba un programa en PSeInt que calcule la longitud de una circunferencia de radio conocido.
        double longitud, radio;

        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de la circunferencia"));

        longitud = 2 * (3.1416) * radio;
        System.out.println("La longitud de la circuferencia es: " + longitud);
    }
}
