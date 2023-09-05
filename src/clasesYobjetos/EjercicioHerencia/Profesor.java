package clasesYobjetos.EjercicioHerencia;

import clasesYobjetos.Herencia.Persona;

public class Profesor extends Persona {
    private String title;

    public Profesor(String title) {
        this.title = title;
    }

    public Profesor(String nombre, String apellido, long dni, String title) {
        super(nombre, apellido, dni);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void andar() {
        System.out.println("Soy un profesor que camina");
    }
}
