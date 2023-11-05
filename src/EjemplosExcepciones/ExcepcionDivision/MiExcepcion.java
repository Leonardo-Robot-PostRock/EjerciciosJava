package ExcepcionDivision;

public class MiExcepcion extends Exception {
    String msj;

    public MiExcepcion() {
    } //Excepcion vacia, sin mensaje ni causa

    public MiExcepcion(String msj) {
        this.msj = msj;
    }

    @Override
    public String getMessage() {
        return msj;
    }
}
