package Collecciones;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private ArrayList<Domicilio> domicilios = new ArrayList<Domicilio>();

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarDomicilio(Domicilio domi) {
        domicilios.add(domi);
    }

    public void quitarDomicilio(Domicilio domi) {
        domicilios.remove(domi);
    }

    public void mostrar() {
        for (Domicilio domi : domicilios) {
            System.out.println(domi.getCalle() + " " + domi.getNumero());
        }
    }
}
