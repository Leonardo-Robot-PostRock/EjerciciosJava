package AbstraccionYpolimorfismo.Ejercicio2.TiendaDeMascotas;

public class GatoSinPelo extends Gatos{
    private String raza;

    public GatoSinPelo(String nombre, int edad, String color, double alturaDesalto, double longitudDeSalto, String raza) {
        super(nombre, edad, color, alturaDesalto, longitudDeSalto);
        this.raza = raza;
    }
}
