package Practica2Relaciones.Ejercicios.Ejercicio3;

public class Motor {
    private String tipo;
    private double cilindrada;

    public Motor() {
    }

    public Motor(String tipo, double cilindrada){
        this.tipo = tipo;
        this.cilindrada = cilindrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}
