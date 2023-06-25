package ciclosRepetitivos;

public class ejercicio2 {
    public static void main(String[] args) {
//        2) Realizar un programa el cual muestre los números del 60 hasta el 100 de 5 en 5, estos nümeros deben ser sumados y su resultado debe ser mostrado por consola.

        int resultado = 0;

        for (int i = 60; i <= 100; i += 5) {
            System.out.println("El número es: " + i);
            resultado += i;
            System.out.println(resultado);
        }
        System.out.println("La suma total de los números es: " + resultado);
    }
}
