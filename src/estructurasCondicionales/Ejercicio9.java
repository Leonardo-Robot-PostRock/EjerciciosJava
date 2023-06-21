package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {
//        Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un según para ello.

        String dia;

        dia = JOptionPane.showInputDialog("Ingrese un día de la semana");

        String diaLowerCase = dia.toLowerCase();

        System.out.println(diaLowerCase);

        switch (diaLowerCase){
            case "lunes":
                System.out.println("Laboral");
            case "martes":
                System.out.println("Laboral");
            case "miércoles":
                System.out.println("Laboral");
            case "jueves":
                System.out.println("Laboral");
            case "viernes":
                System.out.println("Laboral");
            case "sábado":
                System.out.println("Laboral");
            case "domingo":
                System.out.println("Laboral");
        }
    }
}
