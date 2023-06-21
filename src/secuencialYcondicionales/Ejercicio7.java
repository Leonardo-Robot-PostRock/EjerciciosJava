package secuencialYcondicionales;

import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {
//        Escriba un programa en PSeInt, que convierta un valor dado en grados Fahrenheit a grados Celsius. Recordar que la fórmula para la conversión es: C = (F-32)*5/9.

        double c, f;

        f = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en grados Fahrenheit"));

        c = (f - 32) * 5 / 9;

        System.out.println("Es " + c + " en grados Celsius");

    }
}
