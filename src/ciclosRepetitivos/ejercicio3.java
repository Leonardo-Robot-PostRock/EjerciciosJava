package ciclosRepetitivos;

import javax.swing.*;

public class ejercicio3 {
    public static void main(String[] args) {
//        3) Diseña un algoritmo que realice el promedio de 4 números. Los números podrán ser decimales y serán ingresados por pantalla por el usuario,
        double acumulador, promedio, num;

        acumulador = 0;
        promedio = 0;
        num = 0;

        for (int i = 0; i < 4; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número: ", i));
            acumulador += num;
        }
        promedio = acumulador / 4;
        System.out.println("Su promedio es de: " + promedio);
    }
}
