package cicloWhile;

import javax.swing.*;

public class ejercicio2 {
    public static void main(String[] args) {
//        2) Indique qué realiza el siguiente algoritmo:

        int fondos, sustraccion;
        String salir;
        fondos = 5000;
        salir = "0";

        while (!salir.equals("1")) {
            sustraccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto a retirar"));
            if ((fondos - sustraccion) > 0) {
                fondos += -sustraccion;
            } else {
                System.out.println("Error, fondos insuficientes");
            }
            System.out.println("Para salir pulse 1");
            salir = JOptionPane.showInputDialog(null, "Si desea repetir la operación, pulse cualquier otra tecla");
        }
    }
}
