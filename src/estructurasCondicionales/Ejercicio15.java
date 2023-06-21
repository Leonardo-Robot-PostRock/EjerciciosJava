package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio15 {
    public static void main(String[] args) {
//        Escribir un programa que lea desde teclado el importe neto de una factura y determine el importe final según los siguientes criterios.
//        Importe neto menor de 10.000 -> sin descuento
//        Importe neto mayor o igual de 10.000 -> 15% de descuento

        double importeNeto;
        double descuento;

        importeNeto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el importe neto de la factura: "));

        if (importeNeto >= 10000) {
            descuento = importeNeto * 0.15;
            importeNeto = importeNeto - descuento;

            JOptionPane.showMessageDialog(null, "El importe final con un 15% de descuento es: " + importeNeto);
        }else {
            JOptionPane.showMessageDialog(null, "El importe final (sin descuento) es: " + importeNeto);
        }
    }
}
