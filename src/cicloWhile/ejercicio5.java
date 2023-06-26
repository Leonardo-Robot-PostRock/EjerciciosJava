package cicloWhile;

import javax.swing.*;

public class ejercicio5 {
    public static void main(String[] args) {
//        4) Desarrolle un algoritmo que permita al usuario ingresar cuantas palabras desee. Cuando ya no quiera ingresar más palabras, deberá mostrar cuántas de las palabras ingresadas poseen más de 6 (seis) caracteres.

        String palabra;
        int contador;
        String cadena;
        String salida;

        salida = "1";
        contador = 0;

        while(!salida.equals("0")) {
            palabra = JOptionPane.showInputDialog(null, "Ingrese una palabra");

            if(palabra.length() > 6) {
                contador += 1;
            }
            salida = JOptionPane.showInputDialog(null, "Para salir pulse 0, caso contrario, cualquier otra tecla");
        }
        System.out.println("Se ingresaron " + contador + " palabras con más de 6 letras");
        System.out.println("Fin de la ejecución");
    }
}
