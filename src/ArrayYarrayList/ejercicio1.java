package ArrayYarrayList;

import javax.swing.*;

public class ejercicio1 {
    public static void main(String[] args) {
        int cantidad;
        cantidad = 5;
        int[] num = new int[5];

        for (int i = 0; i < cantidad - 1; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número para la posición " + i + " del arreglo"));
        }

        System.out.println("Los números ingresados son: ");
        for (int i = 0; i < cantidad - 1; i++) {
            System.out.println(num[i]);
        }
    }
}
