package Practica2Relaciones.Ejercicios.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel i7", 3.2);
        Memoria memoria = new Memoria(16, "DDR4");
        Perifericos perifericos = new Perifericos("Teclado Logitech", "USB");

        Computadora miComputadora = new Computadora();
        miComputadora.agregarDispositivosComponentes(cpu, memoria, perifericos);
        miComputadora.imprimir();
    }
}
