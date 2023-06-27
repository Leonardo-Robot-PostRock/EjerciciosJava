package practica;

import java.math.BigDecimal;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        double num;
        double fact;
        fact = 1;

        System.out.println("Ingrese número a sacar factorial");
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();

        System.out.print((int) num + "!" + " = ");
        for (double i = num; i >= 1; i--) {
            fact *= i;
            if (i != 1) {
                System.out.print((int) i + "*");
            } else {
                System.out.print((int) i);
            }
        }
        System.out.println(" = " + (int) fact);
    }
}
