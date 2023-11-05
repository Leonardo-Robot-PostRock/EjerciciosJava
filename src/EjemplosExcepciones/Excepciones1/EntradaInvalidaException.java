package EjemplosExcepciones.Excepciones1;

class EntradaInvalidaException extends RuntimeException {
    public EntradaInvalidaException(String mensaje) {
        super(mensaje);
    }
}