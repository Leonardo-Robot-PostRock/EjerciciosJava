package estructuraSecuencial;

import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args) {
//        Escriba un programa en PSeInt que pida al usuario dos números y muestra la “distancia” entre ellos (el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo)

        int num1, num2, distancia;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));

        distancia = Math.abs(num1 - num2);

        System.out.println("La distancia es " + distancia);

    }
}
