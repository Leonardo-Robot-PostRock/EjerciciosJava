package AbstraccionYpolimorfismo.Ejercicio2.TiendaDeMascotas;

public class PerrosGrandes extends Perros {
    private String raza;

    public PerrosGrandes(String nombre, int edad, String color, int peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }
}
