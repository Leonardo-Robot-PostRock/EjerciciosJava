import javax.swing.*;
import java.util.ArrayList;

public class arregloDinamico {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();

        cargarArreglo(nombres);
        imprimirNombres(nombres);
    }

    public static void cargarArreglo(ArrayList arreglo) {
        String nombre;

        do {
            nombre = JOptionPane.showInputDialog("Ingrese nombre o 1 para salir");
            if (!nombre.equals("1")) {
                arreglo.add(nombre);
            }
        } while (!nombre.equals("1"));
    }


    public static void imprimirNombres(ArrayList arreglo) {
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println("Elemento " + i + " " + arreglo.get(i));
        }
    }
}
