package ciclosRepetitivos;

import javax.swing.*;

public class ejercicio9 {
    public static void main(String[] args) {
//        9) Introducir 10 números y mostrar por consola cuántos números son positivos, cuántos números son negativos y cuántas veces se introdujo solo el número 0(es decir un número que no es positivo ni negativo);

        int num, contadorPositivos, contadorNegativos, contadorCero;
        contadorPositivos = 0;
        contadorNegativos = 0;
        contadorCero = 0;

        for (int i = 0; i < 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número: " + i));
            if (num > 0) {
                contadorPositivos += 1;
            } else if (num < 0) {
                contadorNegativos += 1;
            } else {
                contadorCero += 1;
            }
        }

        System.out.println("Cantidad de números positivos: " + contadorPositivos);
        System.out.println("Cantidad de números negativos: " + contadorNegativos);
        System.out.println("Cantidad de números 0 (número que no es positivo ni negativo): " + contadorCero);
    }
}
