package AbstraccionYpolimorfismo.Ejercicio2.TiendaDeMascotas;

public class PerrosMedianos extends Perros{
    private String raza;

    public PerrosMedianos(String nombre, int edad, String color, int peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }
}
