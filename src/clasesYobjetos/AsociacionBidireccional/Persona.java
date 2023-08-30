package clasesYobjetos.AsociacionBidireccional;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;

    public Persona() {
    }

    public Persona(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(int dni, String nombre, String apellido, int id, String tipo, double balance) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = new Cuenta(id, tipo, balance);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
