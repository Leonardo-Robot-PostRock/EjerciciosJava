package clasesYobjetos.Asociacion;

import clasesYobjetos.Asociacion.Domicilio;

public class Persona {
    //declaración de los atributos
    private String nombre;
    private String apellido;
    //declaración de la variable de referencia del tipo Domicilio
    //gracias a ella podremos navegar hacia la clase Domicilio

    private Domicilio mDomicilio;

    //Constructor vacío de la clase
    public Persona() {

    }

    public Persona(String pnombre, String papellido) {
        nombre = pnombre;
        apellido = papellido;
    }

    //Declaración de los métodos get y set para cada atributo de la clase

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String val) {
        this.apellido = val;
    }

    public Domicilio getDomicilio() {
        return mDomicilio;
    }

    public void setDomicilio(Domicilio val){
        this.mDomicilio = val;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String val) {
        this.nombre = val;
    }

}
