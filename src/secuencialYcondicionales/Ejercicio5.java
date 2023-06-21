package secuencialYcondicionales;

import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int millas;
        int kilometros;

        millas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de millas"));

        kilometros = millas * 1609;

        System.out.println("La conversión es: "+ kilometros+"km");
    }
}
