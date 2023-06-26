package ArrayYarrayList;

import javax.swing.*;

public class ejercicio3 {
    public static void main(String[] args) {
//        3.- Diseñe un arreglo en el que se ingrese la cantidad de productos y sus respectivos precios para la preparación de un plato. También se debe mostrar el costo total del plato al final.

        String plato;
        String[] productos;
        double gasto;
        double[] precios;
        int p;

        plato = JOptionPane.showInputDialog(null, "Ingrese el nombre del plato");

        p = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de ingredientes que lleva el plato"));

        productos = new String[p];
        precios = new double[p];

        gasto = 0;

        for (int j = 0; j <= p - 1; j++) {
            productos[j] = JOptionPane.showInputDialog(null, "Ingrese el nombre del ingrediente " + (j + 1));
            precios[j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del ingrediente " + (j + 1)));
            gasto += precios[j];
        }
        System.out.println("El costo del plato " + plato + " es: " + gasto);
    }
}
