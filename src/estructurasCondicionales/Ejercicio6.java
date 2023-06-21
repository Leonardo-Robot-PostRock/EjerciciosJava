package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
//        Elaborar un programa que simule el inicio de sesión a un sistema. Si el usuario es: ”ADMIN” y la clave “1234” escribir el siguiente mensaje en pantalla “ACCESO PERMITIDO” caso contrario mostrar el mensaje “ACCESO DENEGADO”.

        String usuario, contrasenia;

        usuario = JOptionPane.showInputDialog("Ingrese usuario");
        contrasenia = JOptionPane.showInputDialog("Ingrese contraseña");

        if (usuario.equals("ADMIN") && contrasenia.equals("1234")){
            System.out.println("Acceso Permitido");
        }else {
            System.out.println("Acceso Denegado");
        }
    }
}
