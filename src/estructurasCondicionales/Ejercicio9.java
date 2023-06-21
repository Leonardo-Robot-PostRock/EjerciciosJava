package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {
//        Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un según para ello.

        String dia;

        dia = JOptionPane.showInputDialog("Ingrese un día de la semana");

        String diaLowerCase = dia.toLowerCase();

        switch (diaLowerCase) {
            case "lunes":
                System.out.println("Laboral");
                break;
            case "martes":
                System.out.println("Laboral");
                break;
            case "miércoles":
                System.out.println("Laboral");
                break;
            case "miercoles":
                System.out.println("Laboral");
                break;
            case "jueves":
                System.out.println("Laboral");
                break;
            case "viernes":
                System.out.println("Laboral");
                break;
            default:
                System.out.println("No es laboral");
                break;
        }
    }
}
