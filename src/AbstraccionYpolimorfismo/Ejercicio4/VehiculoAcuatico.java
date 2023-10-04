package AbstraccionYpolimorfismo.Ejercicio4;

public class VehiculoAcuatico extends Vehiculo implements Vela {
    private String tipo;
    private int capacidadPasajeros;

    public VehiculoAcuatico(double velocidadActual, double velocidadMaxima, String tipo, int capacidadPasajeros) {
        super(velocidadActual, velocidadMaxima);
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void acelerar(double velocidad) {
        if (this.velocidadActual + velocidad <= velocidadMaxima) {
            this.velocidadActual += velocidad;
        } else {
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil");
        }
    }

    @Override
    public void frenar(double velocidad) {
        if (velocidadActual - velocidad > 0) {
            velocidadActual -= velocidad;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa");
        }
    }

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            System.out.println("No es recomendable navegar con un viento de " + velocidadViento + "km/h");
            frenar(velocidadActual);
        } else if (velocidadViento < 10) {
            System.out.println("No se recomienda navega con un viento de " + velocidadViento + "km/h");
            frenar(velocidadViento);
        }
    }
}
