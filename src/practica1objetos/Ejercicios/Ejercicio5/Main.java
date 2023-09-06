package practica1objetos.Ejercicios.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Harry Potter", "J. K. Rowling", 3);

        System.out.println("Libro: " + libro1.getTitulo());
        System.out.println("El autor es: " + libro1.getAutor());
        System.out.println("Nº de ejemplares: " + libro1.getEjemplaresTotales());

        System.out.println("Se procede a prestar un libro: ");
        libro1.prestar();
        libro1.prestar();
        libro1.prestar();
        libro1.prestar();
        System.out.println("Numero de ejemplares restantes: " + libro1.getEjemplaresDisponibles());


    }
}
