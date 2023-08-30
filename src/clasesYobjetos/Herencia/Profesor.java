package clasesYobjetos.Herencia;

public class Profesor extends Persona {
    private int legajo;

    public Profesor(String nombre, String apellido, long dni, int legajo) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
}
