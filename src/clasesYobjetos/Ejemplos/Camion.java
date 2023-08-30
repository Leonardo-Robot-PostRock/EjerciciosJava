package clasesYobjetos.Ejemplos;

public class Camion {

    /* Atributos */
    public final String marca;
    private double carga;
    private String propietario;

    /* Métodos o comportamientos*/

//    public Camion() {
//    }

    public Camion(String marca, double carga, String propietario) {
        this.marca = marca;
        this.carga = carga;
        this.propietario = propietario;
    }

    public void setCarga(double kg) {
        if (kg > 0) {
            this.carga = kg;
        }
    }

    public double getCarga() {
        return this.carga;
    }

    public void setProp(String prop) {
        this.propietario = propietario;
    }

    public String getPropietario() {
        return this.propietario;
    }

    public void arrancar() {
        System.out.printf("arranca camión" + marca);
    }

    public void parar() {
        System.out.println("detiene camión");
    }

    public void cargaCombustible() {
        System.out.println("carga combustible");
    }

    public void registrarPropietario(String propietario) {
        propietario = propietario;
        System.out.println("registrar propietario" + propietario);
    }
}
