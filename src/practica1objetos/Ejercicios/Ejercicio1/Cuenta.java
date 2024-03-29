package practica1objetos.Ejercicios.Ejercicio1;

import practica1objetos.Ejercicios.Ejercicio2.Persona;

public class Cuenta {
    private Persona persona;
    private String titular;
    private double cantidad;

    public Cuenta() {
    }

    public Cuenta(double cantidad) {
        this.cantidad = cantidad;
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

    //Creación de relación bidireccional para ejercicio 6 TP 2
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    //Métodos para extraer dinero o ingresar

    public double ingresar(double cantidad) {
        if (cantidad >= 0) {
            this.cantidad += cantidad;
        }
        return this.cantidad;
    }

    public double retirar(double aRetirar) {
        if ((this.cantidad - aRetirar) >= 0) {
            this.cantidad -= aRetirar;
            return this.cantidad;
        } else {
            return this.cantidad = 0;
        }
    }
}
