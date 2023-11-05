package EjemplosExcepciones.Excepciones1;

class DivisionPorCeroException extends ArithmeticException {
    public DivisionPorCeroException(String mensaje) {
        super(mensaje);
    }
}