package Practica2Relaciones.Ejercicios.Ejercicio3;

public class Llantas {
    private String marca;
    private int diametroPulgadas;

    public Llantas() {
    }

    public Llantas(String marca, int diametroPulgadas) {
        this.marca = marca;
        this.diametroPulgadas = diametroPulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDiametroPulgadas() {
        return diametroPulgadas;
    }

    public void setDiametroPulgadas(int diametroPulgadas) {
        this.diametroPulgadas = diametroPulgadas;
    }
}
