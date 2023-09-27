package AbstraccionYpolimorfismo.Ejercicio1;

public class LibrosDeTexto extends Libro {
    private String facultad;
    private String curso;

    public LibrosDeTexto(String titulo, String autor, double precio, String facultad, String curso) {
        super(titulo, autor, precio);
        this.facultad = facultad;
        this.curso = curso;
    }

    @Override
    public void imprimir() {
        System.out.println("El título es: " + this.getTitulo());
        System.out.println("El autor es: " + this.getAutor());
        System.out.println("El precio del libro es: " + this.getPrecio());
        System.out.println("Impreso en: " + this.facultad);
        System.out.println("Curso al que pertenece: " + this.curso);
    }
}
