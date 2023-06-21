package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio13 {
    public static void main(String[] args) {
//        Desarrolle un algoritmo que a partir de dos números ingresados se realicen los siguiente cálculos según las siguientes condiciones.
//                Si el primer número es un número positivo deberá mostrarse por pantalla la suma de los cuadrados de ambos números.
//                Si el primer número es un número negativo deberá mostrarse por pantalla el primero elevado por el segundo. Todos los números deben ser enteros. Operador potencia -> ^ (alt + 94)

        int numero1, numero2;
        int resultadoCuadrado, resultadoPotencia;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));

        if (numero1 > 0) {
            resultadoCuadrado = (int) (Math.pow(numero1, 2) + Math.pow(numero2, 2));
            JOptionPane.showMessageDialog(null, "La suma de los cuadrados es " + resultadoCuadrado);
        } else {
            resultadoPotencia = (int) Math.pow(numero1, numero2);
            JOptionPane.showMessageDialog(null, "El resultado de la potencia es " + resultadoPotencia);
        }
    }
}
