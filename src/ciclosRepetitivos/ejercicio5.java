package ciclosRepetitivos;

public class ejercicio5 {
    public static void main(String[] args) {
//        5) Mostrar por pantalla los números de la tabla del 1 al 4 e indicar en cada resultado, si es par o impar.

        int resultado;
        for (int num = 1; num <= 4; num++) {
            System.out.println("Tabla número: " + num);
            for (int num2 = 0; num2 <= 10; num2++) {
                resultado = num * num2;
                if (resultado % 2 == 0) {
                    System.out.println("El resultado es PAR " + num + " x " + num2 + " = " + resultado);
                } else {
                    System.out.println("El resultado es IMPAR " + num + " x " + num2 + " = " + resultado);
                }
            }
        }
    }
}
