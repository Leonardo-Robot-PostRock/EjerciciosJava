import javax.swing.*;

public class BucleCondicionCola {
    public static void main(String[]args){
        int dia = 2;

        while(dia < 20) {
            dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese fecha"));
        }

        do {
            dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese fecha"));
        }while (dia < 20);
    }
}
