package estructuraSecuencial;

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
//        Escriba un programa en PSeInt para convertir una cadena a un número entero.
        String enTexto;
        int enEntero;

        enTexto = JOptionPane.showInputDialog("Ingrese el número en forma de texto");
        enEntero = Integer.parseInt(enTexto);

        System.out.println(enEntero + " como entero");
    }
}
