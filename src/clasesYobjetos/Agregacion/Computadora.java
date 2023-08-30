package clasesYobjetos.Agregacion;

public class Computadora {
    //Declaración de atributos
    private String modelo;
    private String tipo;
    //declaración de la variable que relaciona a la clase modem
    private Modem modem;

    //Constructor vacío
    public Computadora() {}

    public Computadora (String modelo, String tipo) {
        this.modelo = modelo;
        this.tipo = tipo;
    }

    //Método que pasa como parámetro un objeto modem cuando se lo quiere agregar.

    public void AgregarModemAlaComputadora (Modem modem){
        this.modem = modem;
    }

    //Declaración de los métodos set y get de los atributos.

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Modem getModem() {
        return modem;
    }

    public void setModem(Modem modem) {
        this.modem = modem;
    }
}
