package cicloFor;

import javax.swing.*;

public class ejercicio7 {
    public static void main(String[] args) {
//        7) Realice un algoritmo que, al Introducir 5 números enteros positivos, devuelva el mayor .

        int num, numMayor;
        numMayor = 0;

        for (int i = 1; i < 5; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número: " + i));
            if (num > numMayor) {
                numMayor = num;
            }
        }
        System.out.println("El número mayor es: " + numMayor);
    }
}
