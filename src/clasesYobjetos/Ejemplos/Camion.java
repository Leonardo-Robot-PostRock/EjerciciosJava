package clasesYobjetos.Ejemplos;

public class Camion {
    public final String marca;
    private int carga;
    private String propietario;

    /* Métodos o comportamientos*/

    public Camion() {
    }

    public Camion(String marca, int carga, String propietario) {
        this.marca = marca;
        this.carga = carga;
        this.propietario = propietario;
    }

    public void setCarga(int kg) {
        if (kg > 0) {
            this.carga = kg;
        }
    }

    public int getCarga() {
        return carga;
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
