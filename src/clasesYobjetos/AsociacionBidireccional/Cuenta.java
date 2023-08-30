package clasesYobjetos.AsociacionBidireccional;

public class Cuenta {
    private int id;
    private String tipo;
    private double balance;

    private Persona persona;
    public Cuenta(){}
    public Cuenta(int id, String tipo, double balance) {
        this.id = id;
        this.tipo = tipo;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
