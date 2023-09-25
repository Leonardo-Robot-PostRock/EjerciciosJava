package AbstraccionYpolimorfismo.Ejercicio1;

public class LibrosDeTexto extends Libro {
    private String editorial;
    private Novela novela;
    public LibrosDeTexto(String titulo, String autor,String editorial, String genero) {
        super(titulo, autor);
        this.editorial = editorial;
        Novela novela = new Novela(genero);
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
}
