package ciclosRepetitivos;

public class ejercicio6 {
    public static void main(String[] args) {
//        6) Mostrar los números del 50 al 0 junto con un mensaje de éxito al finalizar la ejecución.

        for (int iterador = 50; iterador < 0; iterador--) {
            System.out.println(iterador);
        }
        System.out.println("La ejecución finalizó correctamente");
    }
}
