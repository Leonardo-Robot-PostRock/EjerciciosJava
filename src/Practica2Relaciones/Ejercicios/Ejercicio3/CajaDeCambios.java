package Practica2Relaciones.Ejercicios.Ejercicio3;

public class CajaDeCambios {
    private int numMarchas;
    private String tipo;

    public CajaDeCambios() {
    }

    public CajaDeCambios(int numMarchas, String tipo){
        this.numMarchas = numMarchas;
        this.tipo = tipo;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
