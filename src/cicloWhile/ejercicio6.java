package cicloWhile;

import javax.swing.*;

public class ejercicio6 {
    public static void main(String[] args) {
//        5) Desarrolle un algoritmo que solicite al usuario ingresar dos números enteros. Una vez ingresados, calcular la suma, resta, multiplicación y división. Mostrar por pantalla el resultado de cada cálculo. Luego deberá consultar al usuario si desea salir o realizar otro cálculo.

        int num1, num2;
        String candena, salida;
        salida = "1";

        while (!salida.equals("0")) {
            num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer número"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo número"));

            System.out.println("La operación: " + num1 + " + " + num2 + " es: " + (num1 + num2));
            System.out.println("La operación: " + num1 + " - " + num2 + " es: " + (num1 - num2));
            System.out.println("La operación: " + num1 + " * " + num2 + " es: " + (num1 * num2));

            if (num2 != 0) {
                System.out.println("La operación: " + num1 + " / " + num2 + " es: " + num1 / num2);
            } else {
                System.out.println("No se puede dividir por 0!");
            }
            salida = JOptionPane.showInputDialog(null, "Para salir ingrese 0, para calcular nuevamente, cualquier otra tecla");
        }
        System.out.println("Fin de la ejecución");
    }
}
