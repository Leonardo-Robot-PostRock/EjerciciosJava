package EjemplosExcepciones.Excepciones1;

public class EjemploExcepciones06Throw {
  public static void main(String[] args) {
    System.out.println("Inicio");
    try {
      throw new ArithmeticException("Mensaje de error personalizado");
    } catch (ArithmeticException ae) {
      System.out.println("Se ha producido una excepción: " + ae.getMessage());
    }
  }
}
