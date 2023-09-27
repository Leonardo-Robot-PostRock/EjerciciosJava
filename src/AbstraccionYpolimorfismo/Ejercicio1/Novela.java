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
        System.out.println("El título es: " + this.getTitulo());
        System.out.println("El autor es: " + this.getAutor());
        System.out.println("Genero de novela: " + this.genero);
        System.out.println("El precio del libro es: " + this.getPrecio());
    }
}
