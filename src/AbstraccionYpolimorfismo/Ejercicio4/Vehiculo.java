package AbstraccionYpolimorfismo.Ejercicio4;

public abstract class Vehiculo {
    protected double velocidadActual = 0;
    protected double velocidadMaxima;

    public Vehiculo(double velocidadActual, double velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void acelerar(double velocidad);

    public abstract void frenar(double velocidad);

    public void imprimir() {
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }

}
