package practica1Objetos.Ejercicios.Ejercicio1;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta() {
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double ingresar(double cantidad) {
        if (cantidad >= 0) {
            this.cantidad += cantidad;
        }
        return this.cantidad;
    }

    public double retirar(double aRetirar) {
        if ((this.cantidad - aRetirar)  >= 0) {
            this.cantidad -= aRetirar;
            return this.cantidad;
        } else {
            return this.cantidad = 0;
        }
    }
}
