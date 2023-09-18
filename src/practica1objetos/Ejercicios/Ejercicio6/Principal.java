package practica1Objetos.Ejercicios.Ejercicio6;

public class Principal {
    public static void main(String[] args) {
        Autor autor = new Autor("Paul", "Auster");
        Libro libro = new Libro("La trilogía de Nueva York", autor);
        System.out.println(libro.getTitulo() + " de " + (libro.getAutor()).toString());

        //Esto imprime:
        //La trilogía de Nueva York de Paul Auster
    }
}
