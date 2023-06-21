import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ejemplo2 {
    public static void main(String[] args) {

        int[] numeros = new int[5];

        cargarArreglo(numeros);
        imprimirArreglo(numeros);
        System.out.println(promedio(numeros));

    }

    public static void cargarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor " + i));
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento " + i + " " + arreglo[i]);
        }
    }

    public static int promedio(int[] arreglo) {
        int suma, promedio;

        suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        promedio = suma / arreglo.length;
        JOptionPane.showMessageDialog(null, Arrays.toString(arreglo));

        return promedio;
    }
}
