package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {
//        Hacer un algoritmo que a partir de dos números ingresados se imprima un resultado según las siguientes condiciones.
//        Si el primero es mayor que el segundo, se mostrará la división entre primero / segundo.
//                Si el segundo es mayor que el primero, se solicitará ingresar un tercer número, mostrando por consola la suma de los 3.
//        Recordemos que no se puede dividir por 0. Te invito a realizar la validación correspondiente para evitar que nuestro programa lance un error si el segundo número es igual a 0

        double numero1, numero2, numero3;
        double resultadoDivision, resultadoSuma;

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));

        if (numero1 > numero2) {
            if (numero2 == 0) {
                System.out.println("El segundo número es 0, no se puede realizar la división");
            } else {
                resultadoDivision = numero1 / numero2;
                System.out.println("La división entre ambos es: " + resultadoDivision);
            }
        } else {
            numero3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer número"));
            resultadoSuma = numero1 + numero2 + numero3;
            JOptionPane.showMessageDialog(null, "El resultado de la suma es " + resultadoSuma);
        }
    }
}
