package secuencialYcondicionales;

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        double longitud, radio;

        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de la circunferencia"));

        longitud = 2 * (3.1416) * radio;
        System.out.println("La longitud de la circuferencia es: " + longitud);
    }
}
