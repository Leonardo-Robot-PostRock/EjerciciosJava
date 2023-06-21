package secuencialYcondicionales;

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String []args){
        String enTexto;
        int enEntero;

        enTexto = JOptionPane.showInputDialog("Ingrese el número en forma de texto");
        enEntero = Integer.parseInt(enTexto);

        System.out.println(enEntero + " como entero");
    }
}
