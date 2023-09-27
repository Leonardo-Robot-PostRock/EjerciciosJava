package AbstraccionYpolimorfismo.Ejercicio2.TiendaDeMascotas;

public class Gatos extends Mascotas{
    private double alturaDesalto;
    private double longitudDeSalto;

    public Gatos(String nombre, int edad, String color, double alturaDesalto, double longitudDeSalto) {
        super(nombre, edad, color);
        this.alturaDesalto = alturaDesalto;
        this.longitudDeSalto = longitudDeSalto;
    }

    public double getAlturaDesalto() {
        return alturaDesalto;
    }

    public void setAlturaDesalto(double alturaDesalto) {
        this.alturaDesalto = alturaDesalto;
    }

    public double getLongitudDeSalto() {
        return longitudDeSalto;
    }

    public void setLongitudDeSalto(double longitudDeSalto) {
        this.longitudDeSalto = longitudDeSalto;
    }

    @Override
    public void sonido() {
        System.out.println("Los gatos maúllan");
    }
}
