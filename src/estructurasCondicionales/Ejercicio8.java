package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args) {

        //    Pedir 3 números por pantalla al usuario. Devolver un mensaje que incluya la suma de los 3 números y también un mensaje que diga si dicho resultado contiene 3 o más cifras, caso contrario, mostrar el resultado y "contiene menos de 3 cifras".
//    Ejemplo: Resultado de la suma: 102, contiene 3 o más cifras. Ejemplo 2: Resultado de la suma: 45, contiene menos de 3 cifras.
//    Hacer lo mismo para la multiplicación de los 3 números, pero en vez de devolver si la cantidad de cifras es mayor a 3 o no, devolver si el resultado es múltiplo de 2.
//    Ejemplo: Resultado de la multiplicación: 1892, es múltiplo de 2. Ejemplo 2: Resultado de la multiplicación: 103, no es múltiplo de 2.

        int numero1, numero2, numero3;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 2"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 3"));

        int resultado;

        resultado = numero1 + numero2 + numero3;

        //Para suma
        if (resultado > 99) {
            JOptionPane.showMessageDialog(null, "Resultado de la suma: " + resultado + ". Contiene 3 o más cifras");
        } else {
            JOptionPane.showMessageDialog(null, "Resultado de la suma: " + resultado + ". Contiene menos de 3 cifras");
        }

        //Para la multiplicación
        int resultado2;

        resultado2 = numero1 * numero2 * numero3;

        if (resultado2 % 2 == 0) {

            JOptionPane.showMessageDialog(null, "Resultado de la multiplicación: " + resultado2 + ". Es múltiplo de 2");
        } else {
            JOptionPane.showMessageDialog(null, "Resultado de la multiplicación: " + resultado2 + ". No es múltiplo de 2");
        }
    }
}
