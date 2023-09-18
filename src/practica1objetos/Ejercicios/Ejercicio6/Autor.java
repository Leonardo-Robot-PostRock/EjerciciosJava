package practica1Objetos.Ejercicios.Ejercicio6;

public class Autor {
    private String nombre;
    private String apellido;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String toString() {
        return nombre + " " + apellido;
    }
}
