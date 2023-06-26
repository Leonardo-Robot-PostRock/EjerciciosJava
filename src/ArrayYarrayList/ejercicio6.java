package ArrayYarrayList;

import javax.swing.*;

public class ejercicio6 {
    public static void main(String[] args) {
//        Ejercicio 6:
//        -Cree un Arreglo de Dimensión 5 y que el Usuario tenga que llenarlo con nombres.
//                -A continuación haga que el usuario llene un segundo arreglo con edades.
//                -Al final haga que se muestre una leyenda similar a esta: Pedrito tiene 20 años. (donde Pedrito sería el nombre que se guardo en el primer arreglo y 20 sería el primer número guardado en el segundo arreglo.

        int[] edades;
        String[] nombres;

        edades = new int[5];
        nombres = new String[5];

        for (int i = 0; i <= 4; i++) {
            nombres[i] = JOptionPane.showInputDialog(null, "Ingrese los nombres");
        }

        for (int j = 0; j <= 4; j++) {
            edades[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las edades"));
        }

        for (int h = 0; h <= 4; h++) {
            System.out.println(nombres[h] + " " + edades[h]);
        }
    }
}
