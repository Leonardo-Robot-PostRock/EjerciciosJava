package AbstraccionYpolimorfismo.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Novela novela = new Novela("Mi planta de Naranja Lima", "Gabriel García Marquez", 5000, "Introducción a Lengua y Literatura");
        Libro libro = new LibrosDeTexto("Learn PHP", "Juan García",6000, "UTN Regional Mendoza", "Curso intensivo de PHP");
        libro.imprimir();
        System.out.println("--------------");
        novela.imprimir();
    }
}
