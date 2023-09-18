package Practica2Relaciones.Ejercicios.Ejercicio2;

import practica1objetos.Ejercicios.Metodos.Imprimible;

public class Computadora implements Imprimible {
    private CPU cpu;
    private Memoria memoria;
    private Perifericos perifericos;

    public Computadora() {
    }

    public Computadora(CPU cpu, Memoria memoria, Perifericos perifericos) {
        this.cpu = cpu;
        this.memoria = memoria;
        this.perifericos = perifericos;
    }

    public void agregarDispositivosComponentes(CPU cpu, Memoria memoria, Perifericos perifericos ) {
        this.cpu = cpu;
        this.memoria = memoria;
        this.perifericos = perifericos;

    }

    @Override
    public void imprimir() {
        System.out.println("Computadora:");
        System.out.println("CPU: " + cpu.getModelo() + " (" + cpu.getVelocidad() + " GHz)");
        System.out.println("Memoria: " + memoria.getCapacidadGB() + "GB " + memoria.getTipo());
        System.out.println("Periféricos: " + perifericos.getNombre() + " (" + perifericos.getTipo() + ")");
    }

}
