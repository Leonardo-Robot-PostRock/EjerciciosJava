package secuencialYcondicionales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
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
