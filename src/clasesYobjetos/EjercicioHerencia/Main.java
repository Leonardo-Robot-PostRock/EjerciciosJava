package clasesYobjetos.EjercicioHerencia;

public class Main {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Pepe", "Honguito", 16, 1234);

        Profesor p1 = new Profesor("Tito", "Perez", 40, "Profesor");

        System.out.println("El alumno " + a1.getNombre());
        a1.andar();

        System.out.println("El profesor " + p1.getNombre());
        p1.andar();
    }
}
