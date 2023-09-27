package AbstraccionYpolimorfismo.Ejercicio1;

public class Novela extends Libro {
    private String genero;

    public Novela(String genero) {
        this.genero = genero;
    }

    public Novela(String titulo, String autor, double precio, String genero) {
        super(titulo, autor, precio);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void imprimir() {
        System.out.println("Genero de novela: " + this.genero);
    }
}
