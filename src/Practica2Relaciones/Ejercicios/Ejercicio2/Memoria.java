package Practica2Relaciones.Ejercicios.Ejercicio2;

public class Memoria {
    private int capacidadGB;
    private String tipo;

    public Memoria() {
    }

    public Memoria(int capacidadGB, String tipo) {
        this.capacidadGB = capacidadGB;
        this.tipo = tipo;
    }

    public int getCapacidadGB() {
        return capacidadGB;
    }

    public void setCapacidadGB(int capacidadGB) {
        this.capacidadGB = capacidadGB;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
