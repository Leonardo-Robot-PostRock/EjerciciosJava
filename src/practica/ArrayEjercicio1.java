package practica;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEjercicio1 {
    public static void main(String[] args) {
//        1) Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y otro para mostrar.
        ArrayList<Double> arrayNumeros = new ArrayList<Double>();

        cargarArreglo(arrayNumeros);
        mostrarArreglo(arrayNumeros);
    }

    public static void cargarArreglo(ArrayList arrayNumeros) {
        int rangoDeNumeros;
        double num;
        System.out.println("Ingrese el tamaño del arreglo");
        Scanner teclado = new Scanner(System.in);
        rangoDeNumeros = teclado.nextInt();
        for (int i = 0; i <= rangoDeNumeros - 1; i++) {
            System.out.println("Ingrese un número para la posición " + (i + 1));
            num = teclado.nextDouble();
            arrayNumeros.add((int) num);
        }
    }

    ;

    public static void mostrarArreglo(ArrayList arrayNumeros) {
        for (int i = 0; i < arrayNumeros.size(); i++) {
            System.out.print("Posición " + i + ": " + arrayNumeros.get(i) + " | ");
        }
    }

    ;
}
