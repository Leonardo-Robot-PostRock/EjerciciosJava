package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio16 {
    public static void main(String[] args) {
//        Escribir un programa que lea un carácter e indique si es o no una vocal.

        String letra, letraToUpperCase;

        letra = JOptionPane.showInputDialog("Ingrese una letra para saber si es una vocal o no");

        letraToUpperCase = letra.toUpperCase();

        switch (letraToUpperCase) {
            case "A":
                System.out.println("Es una vocal!");
                break;
            case "E":
                System.out.println("Es una vocal!");
                break;
            case "I":
                System.out.println("Es una vocal!");
                break;
            case "O":
                System.out.println("Es una vocal!");
                break;
            case "U":
                System.out.println("Es una vocal!");
                break;
            default:
                System.out.println("No es una vocal!");
        }
    }
}
