package practica1Objetos.EjercicioModelo;

import practica1objetos.Ejercicios.Metodos.Imprimible;

public class Auto implements Imprimible {
    private String marca;
    private String modelo;
    private double motor;
    private int puertas;
    private int asientos;
    private int velocidadMaxima;
    private int velocidadActual = 0;


    public Auto() {
    }

    public Auto(String marca, String modelo, double motor, int puertas, int asientos, int velocidadMaxima, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.puertas = puertas;
        this.asientos = asientos;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad < velocidadMaxima) {
            velocidadActual += incrementoVelocidad;
        } else {
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil");
        }
    }

    public void desacelerar(int decrementoVelocidad) {
        if (velocidadActual + decrementoVelocidad > 0) {
            velocidadActual -= decrementoVelocidad;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa");
        }
    }

    public void frenar() {
        this.velocidadActual = 0;
    }

    public double calcularTiempoLlegada(double distancia) {
        double tiempo;
        tiempo = distancia / this.velocidadActual;
        return tiempo;
    }


    @Override
    public void imprimir() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Motor: " + this.motor);
        System.out.println("Puertas: " + this.puertas);
        System.out.println("Asientos: " + this.asientos);
        System.out.println("Velocidad máxima: " + this.velocidadMaxima);
        System.out.println("Velocidad actual: " + this.velocidadActual);
    }
}
