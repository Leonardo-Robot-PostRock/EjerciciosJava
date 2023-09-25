package AbstraccionYpolimorfismo.Ejercicio1;

public class LibrosDeTexto extends Libro {
    private String editorial;
    public LibrosDeTexto(String titulo, String autor,String editorial) {
        super(titulo, autor);
        this.editorial = editorial;
    }
}
