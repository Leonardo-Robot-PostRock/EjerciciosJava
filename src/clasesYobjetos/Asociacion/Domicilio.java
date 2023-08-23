package clasesYobjetos.Asociacion;

public class Domicilio {
    //declaración de los atributos

    private String calle;

    private int numero;

    //Constructor vacío de la clase
    public Domicilio() {
    }

    //Constructor sobrecargado de la clase
    public Domicilio(String pnombreCalle, int pnumero) {
        calle = pnombreCalle;
        numero = pnumero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String val) {
        this.calle = val;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int val) {
        this.numero = val;
    }
}
