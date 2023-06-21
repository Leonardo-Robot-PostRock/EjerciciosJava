package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
//        Realizar un programa que:
//        a. Pida 3 números que representaran notas de alumnos
//        b. Calcule el promedio de los números
//        c. Si el promedio es mayor o igual a 7, muestre por pantalla el mensaje 'APROBADO', caso contrario, mostrar el mensaje 'DESAPROBADO'.

        double nota1, nota2, nota3;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota: "));

        double promedio;

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {
            JOptionPane.showMessageDialog(null, "APROBADO con: " + promedio);
        } else {
            JOptionPane.showMessageDialog(null, "DESAPROBADO con: " + promedio);
        }
    }
}
