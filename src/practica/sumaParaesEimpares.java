package practica;

import java.util.Scanner;

public class sumaParaesEimpares {
    public static void main(String[] args) {
    //Suma los números pares y los impares hasta un número pedido por teclado
        int num;
        int contadorPar;
        int contadorImpar;
        contadorPar = 0;
        contadorImpar = 0;

        System.out.println("Ingrese el rango de números para la suma de impares y pares");
        Scanner teclado = new Scanner(System.in);
    
        num = teclado.nextInt();

        for (int i = 1; i <= num; i++) {
            if(i % 2 == 0){
                contadorPar += 1;
            }else {
                contadorImpar += 1;
            }
        }

        System.out.println("Cantidad de pares " + contadorPar);
        System.out.println("Cantidad de impares " + contadorImpar);
    }
}
