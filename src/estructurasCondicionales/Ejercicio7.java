package estructurasCondicionales;

import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {
//        Pedir al usuario por pantalla dos números y analizar lo siguiente: Si ambos son números pares mostrar por pantalla "PARES", de lo contrario, si alguno de los dos números es impar, mostrar por pantalla "Uno de los dos números es impar".
//                Tip de ayuda: usar operador Mod para saber si un número es par o impar…

        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 2"));

        if((numero1 % 2 == 0) && (numero2 % 2 == 0)){
            System.out.println("PARES");
        }else{
            System.out.println("Uno de los 2 números es impar");
        }
    }
}
