package cicloWhile;

import javax.swing.*;

public class ejercicio4 {
    public static void main(String[] args) {
//        3) ¿Qué falencia puede encontrar en el siguiente algoritmo? ¿Cómo lo solucionaría?

        int dato;
        String salir = "0";

        while (!salir.equals("1")) {
            dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número para conocer su anterior y su siguiente"));
            JOptionPane.showMessageDialog(null, "NUMERO: " + dato + " ANTERIOR: " + (dato - 1) + " SIGUIENTE: " + (dato + 1));

            System.out.println("Para salir pulse la tecla 1.");
            salir = JOptionPane.showInputDialog(null, "Si desea repetir la operación, pulse cualquier otra tecla");
        }
        System.out.println("Saliendo...");
    }
}
