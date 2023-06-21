import javax.swing.*;

public class Ejemplo1 {
    public static void main(String[] args) {
        String[] helados = {};

        int[] edad = new int[3];

        edad[0] = 28;
        edad[1] = 15;
        edad[2] = 20;

        for(int i =0; i < helados.length; i++){
            helados[i] = JOptionPane.showInputDialog("Ingrese helados");
        }
    }
}
