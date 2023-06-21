package secuencialYcondicionales;

import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {
//        Escriba un programa en PSeInt que nos diga el dinero que tenemos después de pedirnos cuantos billetes tenemos (de $500, $100, $50, $10 pesos).
        int billetes500, billetes100, billetes50, billetes10, total;

        billetes500 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de billetes de 500"));
        billetes100 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de billetes de 100"));
        billetes50 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de billetes de 50"));
        billetes10 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de billetes de 10"));

        total = (500 * billetes500) + (100 * billetes100) + (50 * billetes50) + (10 * billetes10);

        System.out.println("Tienes "+ total + " pesos");
    }
}
