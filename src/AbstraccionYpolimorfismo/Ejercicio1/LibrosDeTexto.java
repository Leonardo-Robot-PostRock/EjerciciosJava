package AbstraccionYpolimorfismo.Ejercicio1;

public class LibrosDeTexto extends Libro {
    private String facultad;
    private String curso;
    private Novela novela;

    public LibrosDeTexto(String titulo, String autor, double precio, String facultad, String curso, String genero) {
        super(titulo, autor, precio);
        this.facultad = facultad;
        this.curso = curso;
        this.novela = new Novela(genero);
    }

    @Override
    public void imprimir() {
        System.out.println("El título es: " + this.getTitulo());
        System.out.println("El autor es: " + this.getAutor());
        System.out.println("El precio del libro es: " + this.getPrecio());
        System.out.println("Impreso en: " + this.facultad);
        System.out.println("Curso al que pertenece: " + this.curso);
        System.out.println("Género literario: " + this.novela.getGenero());
    }
}
