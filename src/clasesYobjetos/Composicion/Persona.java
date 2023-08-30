package clasesYobjetos.Composicion;

public class Persona {
    private String nombre;
    private String apellido;

    //declaración de la variable de referencia del tipo Domicilio gracias a ella podremos navegar hacia la clase Domicilio

    private Domicilio mDomicilio;

    public Persona(String pnombre, String papellido, String calle, int numero) {
        this.nombre = pnombre;
        this.apellido = papellido;
        mDomicilio = new Domicilio(calle, numero);
    }

    //Declaración de los métodos get y set para cada atributo de la clase

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String val) {
        this.apellido = val;
    }

    public Domicilio getDomicilio() {
        return mDomicilio;
    }

    public void setDomicilio(Domicilio val) {
        this.mDomicilio = val;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String val) {
        this.nombre = val;
    }
}
