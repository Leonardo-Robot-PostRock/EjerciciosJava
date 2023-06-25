package cicloWhile;

public class ejercicio1 {
    public static void main(String[] args) {
//        1) Crear un Algoritmo que:
//        Permita vaciar un contenedor con capacidad total de 500 kg. realizando sustracciones de 50kg.
//        Muestre el valor del contenido cada vez que se extraigan 50kg.
//        Indique cuándo termina su ejecución.

        int contenedor = 500;

        while (contenedor > 0) {
            contenedor += -50;
            System.out.println(contenedor);
        }
        System.out.println("Saliendo...");
    }
}
