package clasesYobjetos.Composicion;

public class Domicilio {
    //Declaración de atributos

    private String nombreCalle;
    private int numero;

    //Constructor vacío de la clase
    public Domicilio() {}

    //Constructor sobrecargado de la clase
    public Domicilio(String pnombreCalle, int pnumero) {
        this.nombreCalle = pnombreCalle;
        this.numero = pnumero;
    }

    public String getNombreCalle() {
        return this.nombreCalle;
    }

    public void setNombreCalle(String val) {
        this.nombreCalle = val;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int val) {
        this.numero = val;
    }
}
