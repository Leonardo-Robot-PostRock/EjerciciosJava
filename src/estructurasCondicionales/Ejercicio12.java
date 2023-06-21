package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio12 {
    public static void main(String[] args) {
//        Una profesora de matemáticas le pide a su alumno con conocimientos de programación que elabore un algoritmo que, ingresando un número, detecte si este es negativo, positivo, o igual a 0. Utilice las condiciones necesarias para desarrollar el algoritmo correctamente.
        double numeroEjemplo;

        numeroEjemplo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número"));

        if (numeroEjemplo < 0) {
            JOptionPane.showMessageDialog(null,"El número " + numeroEjemplo + " es negativo");
        } else if (numeroEjemplo == 0) {
            JOptionPane.showMessageDialog(null,"El número " + numeroEjemplo + " es 0");
        } else if (numeroEjemplo > 0) {
            JOptionPane.showMessageDialog(null,"El número " + numeroEjemplo + " es positivo");
        }

    }
}
