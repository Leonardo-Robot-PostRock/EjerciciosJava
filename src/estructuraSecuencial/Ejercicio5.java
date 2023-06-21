package estructuraSecuencial;

import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
//        Escriba un programa en PSeInt, sabiendo que una milla equivale a 1,609 kilómetros, lea una cantidad en millas y la convierte a Kilómetros.
        int millas;
        int kilometros;

        millas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de millas"));

        kilometros = millas * 1609;

        System.out.println("La conversión es: "+ kilometros+"km");
    }
}
