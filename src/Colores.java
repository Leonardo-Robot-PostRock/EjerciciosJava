import javax.swing.*;

public class Colores {
    public static void main(String[] args) {
        String entrada;

        do {
            entrada = JOptionPane.showInputDialog("Ingrese un color primario");
        } while (!entrada.equals("amarillo") && !entrada.equals("rojo") && !entrada.equals("azul"));
    }
}
