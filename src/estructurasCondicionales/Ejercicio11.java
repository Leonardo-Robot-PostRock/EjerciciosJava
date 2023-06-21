package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio11 {
    public static void main(String[] args) {
//        Una reconocida empresa de la ciudad necesita de sus servicios como programador, necesitan un sistema que calcule el sueldo de los empleados, el cual es 20000 para aquellos empleados que llevan hasta 3 meses(inclusive), y luego de los 3 meses, el doble. El sistema requiere ingresar nombre y apellido del empleado y tiempo de antigüedad en meses, muestre su sueldo según corresponda.

        String nombre_empleado;
        String apellido_empleado;
        int meses_antiguedad;
        double sueldo;

        sueldo = 20000;


        nombre_empleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        apellido_empleado = JOptionPane.showInputDialog("Ingrese el apellido del empleado");
        meses_antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese antiguedad en meses de, " + nombre_empleado + " " + apellido_empleado));

        if (meses_antiguedad <= 3) {
            JOptionPane.showMessageDialog(null, "El sueldo de " + nombre_empleado + " " + apellido_empleado + " es de " + sueldo);
        }else {
            if(meses_antiguedad > 3 ){
            JOptionPane.showMessageDialog(null, "El sueldo de " + nombre_empleado + " " + apellido_empleado + " es de " + (sueldo * 2));
            }
        }


    }
}
