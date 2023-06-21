package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
//        La rotisería del pueblo necesita saber si posee el stock mínimo para vender pizzas el próximo fin de semana. Sabiendo que el número mínimo de stock es 50 pizzas. Codifique un programa que, ingresando el número de stock disponible, notifique si se podrá vender pizzas el fin de semana, caso contrario indique el stock faltante.

        int stock;

        stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número actual de stock"));

        if (stock >= 50) {
            System.out.println("Hay stock disponible para operar normalmente este fin de semana");
        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos, faltan " + 50 + "-" + stock + " pizzas para completar el faltante de stock");
        }
    }
}
