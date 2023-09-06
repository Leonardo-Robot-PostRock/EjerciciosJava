package practica1objetos.Ejercicios.Ejercicio3;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplaresTotales;
    private int ejemplaresDisponibles;

    public Libro(String titulo, String autor, int ejemplaresTotales, int ejemplaresDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresTotales = ejemplaresTotales;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
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

    public int getEjemplaresTotales() {
        return ejemplaresTotales;
    }

    public void setEjemplaresTotales(int ejemplaresTotales) {
        this.ejemplaresTotales = ejemplaresTotales;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public boolean prestamo() {
        if (ejemplaresDisponibles > 0) {
            ejemplaresDisponibles--;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolucion() {
        if (ejemplaresDisponibles < ejemplaresTotales) {
            ejemplaresDisponibles++;
            return true;
        }else {
            return false;
        }
    }
}
