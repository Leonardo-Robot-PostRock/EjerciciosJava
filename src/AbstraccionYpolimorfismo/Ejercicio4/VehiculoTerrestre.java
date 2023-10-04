package AbstraccionYpolimorfismo.Ejercicio4;

public class VehiculoTerrestre extends Vehiculo implements Motor {
    private int cantidadLlantas;
    private String usoDelVehiculo;

    public VehiculoTerrestre(double velocidadActual, double velocidadMaxima, int cantidadLlantas, String usoDelVehiculo) {
        super(velocidadActual, velocidadMaxima);
        this.cantidadLlantas = cantidadLlantas;
        this.usoDelVehiculo = usoDelVehiculo;
    }

    public int getCantidadLlantas() {
        return cantidadLlantas;
    }

    public void setCantidadLlantas(int cantidadLlantas) {
        this.cantidadLlantas = cantidadLlantas;
    }

    public String getUsoDelVehiculo() {
        return usoDelVehiculo;
    }

    public void setUsoDelVehiculo(String usoDelVehiculo) {
        this.usoDelVehiculo = usoDelVehiculo;
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
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
}
