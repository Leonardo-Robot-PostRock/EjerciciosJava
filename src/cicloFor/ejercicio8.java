package cicloFor;

import javax.swing.*;

public class ejercicio8 {
    public static void main(String[] args) {
//        8) Introducir 6 números enteros, sumarlos y sí su resultado es mayor a 50, mostrar un mensaje que diga “La suma de los 6 números es mayor a 50” de lo contrario, “La suma de los 6 números es menor a 50” y por último si la suma de los números es negativa debe enviar un mensaje por pantalla que diga “La suma no puede ser negativa”.

        int num, resultado;
        resultado = 0;

        for (int i = 1; i < 6; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número: " + i));
            resultado += num;
        }
        if (resultado > 50) {
            System.out.println("La suma de los 6 números es mayor a 50: " + resultado);
        } else {
            if (resultado < 0) {
                System.out.println("La suma no puede ser negativa");
            } else {
                System.out.println("La suma de los 6 números es menor 50" + resultado);
            }
        }
    }
}
