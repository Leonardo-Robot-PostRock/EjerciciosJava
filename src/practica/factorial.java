package practica;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int num;
        int fact;
        fact = 1;

        System.out.println("Ingrese número a sacar factorial");
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();

        System.out.print(num + "!" + " = ");
        for (int i = num; i >= 1; i--) {
            fact *= i;
            if (i != 1) {
                System.out.print(i + "*");
            } else {
                System.out.print(i);
            }
        }
        System.out.println(" = " + fact);
    }
}
