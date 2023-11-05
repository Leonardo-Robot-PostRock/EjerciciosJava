package ExcepcionDivision;

public class DividebyZero {
    int a;
    int b;

    public DividebyZero(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double divide() throws MiExcepcion {
        if (b == 0) {
            throw new MiExcepcion("BOOM!");
        }
        return a / b;
    }
}