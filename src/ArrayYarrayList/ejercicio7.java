package ArrayYarrayList;

import javax.swing.*;

public class ejercicio7 {
    public static void main(String[] args) {
//        Cree tres arreglos de dimensión 5, guarde en uno los nombres de 5 personas, en el segundo sus números de DNI y en el tercero sus direcciones. Luego pida al usuario ingresar un número del 1 al 5 y muestre todos los datos de la persona que corresponda. Luego consulte al usuario si quiere buscar a otra persona, si introduce la letra “S” se volverá a pedir al usuario que ingrese un número. Si ingresa cualquier otra letra, salir del ciclo y finalizar la ejecución.

        String[] nombres, direcciones;
        String respuesta;
        int[] dni;
        int num;

        nombres = new String[5];
        direcciones = new String[5];
        dni = new int[5];

        for (int i = 0; i <= 4; i++) {
            nombres[i] = JOptionPane.showInputDialog(null, "Ingrese los nombres");
        }

        for (int j = 0; j <= 4; j++) {
            direcciones[j] = JOptionPane.showInputDialog(null, "Ingrese las direcciones");
        }

        for (int k = 0; k <= 4; k++) {
            dni[k] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dni"));
        }

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número del 1 al 5"));

            System.out.println("Nombre: " + nombres[num - 1] + ", DNI: " + dni[num - 1] + ", dirección " + direcciones[num - 1]);

            respuesta = JOptionPane.showInputDialog(null, "¿Desea seguir consultando? S/N");
        } while (!respuesta.toLowerCase().equals("s"));

    }
}
