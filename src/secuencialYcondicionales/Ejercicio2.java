package secuencialYcondicionales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
//        Escriba un programa PSeInt que acepte el número de identificación de un empleado, el salario por hora del empleado y el total de horas trabajadas en un mes. Imprima la identificación y el salario del empleado de un mes en particular.

        int identificacion;
        double salarioXhora;
        double horas;
        double total;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la identificación del empleado");
        identificacion = scanner.nextInt();

        System.out.println("Ingrese el salarioXhora por hora del empleado");
        salarioXhora = scanner.nextDouble();

        System.out.println("Ingrese la cantidad de horas que trabajó");
        horas = scanner.nextDouble();
        scanner.close();

        total = salarioXhora * horas;

        System.out.println(identificacion);
        System.out.println("El empleado gana " + total + "$ este mes");
    }
}
