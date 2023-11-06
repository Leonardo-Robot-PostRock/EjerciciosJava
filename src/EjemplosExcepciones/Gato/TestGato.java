package EjemplosExcepciones.Gato;

public class TestGato {
    public static void main(String[] args) {

        try {
            Gato Garfield = new Gato("macho");
            Gato Tom = new Gato("macho");
            Gato Vanesa = new Gato("hembra");
            Gato Pixy = new Gato("hembra");

            System.out.println(Garfield.apareaCon(Vanesa));
            System.out.println(Garfield.apareaCon(Tom));
            System.out.println(Pixy.apareaCon(Vanesa));
        } catch (ApareamientoNoPosibleException | SexoInvalidoException e) {
            System.err.println(e.getMessage());
        }
    }
}

