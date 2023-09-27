package AbstraccionYpolimorfismo.Ejercicio2.TiendaDeMascotas;

public class Perros extends Mascotas {
    private int peso;
    private boolean muerde;

    public Perros(String nombre, int edad, String color, int peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }

    @Override
    public void sonido() {
        System.out.printf("Los perros ladran");
    }
}
