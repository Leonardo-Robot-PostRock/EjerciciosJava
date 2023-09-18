package Practica2Relaciones.Ejercicios.Ejercicio3;
import practica1objetos.EjercicioModelo.AutoComposicion;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Gasolina", 2000);
        CajaDeCambios cajaDeCambios = new CajaDeCambios(6, "Automática");
        Llantas llantas = new Llantas("Michelin", 18);

        AutoComposicion miAuto = new AutoComposicion(cajaDeCambios, llantas, motor);
        miAuto.imprimir();
    }
}
