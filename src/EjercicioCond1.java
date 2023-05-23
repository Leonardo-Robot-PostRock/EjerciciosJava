import javax.swing.*;

public class EjercicioCond1 {
    public static void main(String[]args) {
        int numero1, numero2,resultado;
        String strNumero1, strNumero2;

        //Zona de lectura

        strNumero1 = JOptionPane.showInputDialog("Ingrese primer número");
        strNumero2 = JOptionPane.showInputDialog("Ingrese segundo número");

        numero1 = Integer.parseInt(strNumero1);
        numero2 = Integer.parseInt(strNumero2);

        if (numero1 > numero2){
            resultado = numero1 - numero2;
            JOptionPane.showMessageDialog(null,"El resultado de restar " + numero1 +"con "+ numero2 +" es " + resultado);
        }else {
            resultado = numero2 - numero1;
            JOptionPane.showMessageDialog(null,"El resultado de restar " + numero2 +"con "+ numero1 +" es " + resultado);
        }
    }
}
