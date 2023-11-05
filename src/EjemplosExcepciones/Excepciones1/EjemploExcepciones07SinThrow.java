package EjemplosExcepciones.Excepciones1;

public class EjemploExcepciones07SinThrow {
    public static void main(String[] args) {
        System.out.println("Inicio");
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException ae) {
            System.out.println("Se ha producido un excepción: " + ae.getMessage() + " | no se puede dividir por cero");
        }
    }
}
