package estructuraSecuencial;

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
//        Escriba un programa en PSeInt que calcule las raíces de una ecuación, usando la ecuación de segundo grado.

        double a, b, c;
        double discriminante;
        double raiz1;
        double raiz2;
        double x1;
        double x2;

        System.out.println("ECUACIÓN DE SEGUNDO GRADO TIPO -> ax^2+bx+c");

        do {
            a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a"));
            if (a == 0) {
                System.out.println("a no puede ser 0, ingrese nuevamente");
            }
        } while (a == 0);

        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese b"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese c"));

        discriminante = Math.pow(b, 2) - ((4) * (a) * (c));
//        System.out.println(discriminante);
        System.out.println("********************");
        System.out.println("Discriminante: " + discriminante);

        if (discriminante == 0) {
            System.out.println("-- LA SOLUCIÓN DE LA ECUACIÓN ES: --");
            System.out.println("Respuesta: x= " + discriminante);
            System.out.println("--------------------------------------");
        } else if (discriminante > 0) {
            raiz1 = Math.sqrt((discriminante));
            raiz2 = (-Math.sqrt((discriminante)));
            System.out.println("raíz positiva: " + raiz1 + "Raiz negativa " + raiz2);
            x1 = ((-b) + (raiz1)) / (2 * a);
            x2 = ((-b) + (raiz2)) / (2 * a);
            System.out.println("--- LA SOLUCIÓN DE LAS ECUACIONES SON ---");
            System.out.println("Respuesta: x1= " + x1 + " y x2= " + x2);
        } else {
            System.out.println("La ecuación no tiene soluciones reales (tiene 2 soluciones complejas)");
            System.out.println("--- LA SOLUCIÓN DE LA ECUACIONES SON ---");
            System.out.println("-----------------------------------");
        }
        System.out.println("Fin del programa");

    }
}
