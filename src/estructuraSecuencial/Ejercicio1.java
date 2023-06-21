package estructuraSecuencial;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
//        Escriba un programa en PSeInt para convertir segundos a minutos, minutos a horas y horas a días.

        int seg = 0;
        int minutos = 0;
        int horas = 0;
        int dias = 0;

        System.out.println("Ingrese la cantidad de segundos");
        Scanner scanner = new Scanner(System.in); //Create a Scanner
        seg = scanner.nextInt();
        System.out.println(seg);

        minutos = seg / 60;

        System.out.println("Son/Es " + minutos + " minuto/s");

        horas = minutos / 60;

        System.out.println("Son/Es " + horas + " hora/s");

        dias = horas / 24;

        System.out.println("Son/Es "+ dias + " dia/s");
    }
}
