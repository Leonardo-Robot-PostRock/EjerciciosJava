package practica1Objetos.Ejercicios.Ejercicio5;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplaresTotales;
    private int ejemplaresDisponibles;


    public Libro() {
    }

    public Libro(String titulo, String autor, int ejemplaresTotales) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresTotales = ejemplaresTotales;
        this.ejemplaresDisponibles = ejemplaresTotales;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public int getEjemplaresTotales() {
        return ejemplaresTotales;
    }

    public void setEjemplaresTotales(int ejemplaresTotales) {
        this.ejemplaresTotales = ejemplaresTotales;
    }

    public boolean prestar() {
        if (this.ejemplaresDisponibles > 0) {
            this.ejemplaresDisponibles--;
            return true;
        } else {
            System.out.println("No quedan libros disponibles");
            return false;
        }
    }

    public boolean devolver() {
        if (this.ejemplaresDisponibles < this.ejemplaresTotales) {
            this.ejemplaresDisponibles++;
            return true;
        } else {
            return false;
        }
    }
}
