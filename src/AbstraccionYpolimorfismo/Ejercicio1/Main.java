package AbstraccionYpolimorfismo.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Novela novela = new Novela("Drama");
        Libro libro = new LibrosDeTexto("Mi planta de Naranja Lima", "Gabriel García Marquez", 5000,"UNCUYO", "Introducción a Lengua y Literatura", novela.getGenero());
        libro.imprimir();
    }
}
