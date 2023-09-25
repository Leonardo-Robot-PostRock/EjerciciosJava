package AbstraccionYpolimorfismo.Ejercicio1;

public class LibrosDeTexto extends Libro {
    private String editorial;
    private Novela novela;

    public LibrosDeTexto(String titulo, String autor, double precio, String editorial, String genero) {
        super(titulo, autor, precio);
        this.editorial = editorial;
        this.novela = new Novela(genero);
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Novela getNovela() {
        return novela;
    }

    public void setNovela(Novela novela) {
        this.novela = novela;
    }

    public void imprimir() {
        System.out.println("El título es: " + this.getTitulo());
        System.out.println("El autor es: " + this.getAutor());
        System.out.println("El precio del libro es: " + this.getPrecio());
        System.out.println("Género de la novela: " + this.getNovela().getGenero());

    }
}
