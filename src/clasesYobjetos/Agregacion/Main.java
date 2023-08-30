package clasesYobjetos.Agregacion;

public class Main {
    public static void main(String[] args) {
        //Crear un objeto independiente del tipo Modem llamado modem1.
        Modem modem1 = new Modem("Motorola");

        //Crear un objeto independiente del Tipo Computadora llamado computadora1
        Computadora computadora1 = new Computadora("HP TX1030LA", "Notebook");

        //Hasta ahora los objetos no se conocen entre sí.

        //Le paso como parámetros el objeto modem1 al método correspondiente al método de la clase Computadora.
        computadora1.AgregarModemAlaComputadora(modem1); //Aquí se plantea la asociación.

        //Accedo a mostrar los datos de la variable computadora1 a través de los métodos
        //puedo llegar a conocer la marca del modem porque lo agregué pasándolo como parámetro.
        System.out.println("Computadora: " + computadora1.getModelo() + "TIPO: " + computadora1.getTipo());
        //vemos como se puede acceder a conocer la marca del modem de la computadora porque se planteó la asociación previamente.
        System.out.println("MODEM: " + computadora1.getModem().getMarca());

        //Si destruimos la variable computadora perdemos la referencia a la marca
        //del modem que tiene esta computadora, pero el modem sigue existiendo en forma independiente.
        computadora1 = null;
        //observemos como accedemos a la variable de tipo modem a través de su propia variable.
        System.out.println("La computadora no existe más, sólo existen los modem " + modem1.getMarca());
    }
}
