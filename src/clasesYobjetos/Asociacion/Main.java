package clasesYobjetos;

public class Main {
    public static void main(String[] args) {
        //Creo un objeto de tipo persona y utilizo un constructor sobrecargado
        Persona per1 = new Persona("Pepe", "Honguito");

        //Creo un objeto de tipo domicilio usando el constructor vacío
        Domicilio dom1 = new Domicilio();
        //Asigno los valores del domicilio a la variable creada
        dom1.setNumero(700);
        dom1.setCalle("Suipacha");

        //La variable per1 del tipo Persona y la variable dom1 del tipo Domicilio todavía NO ESTAN RELACIONADAS
        //con datos (Honguito no vive todavía en la calle suipacha). La asignación del domicilio completo a la variable
        //per1 se realiza enviando la variable dom1 como parámetro.

        //RELACIONAMOS la variable dom1 a per1
        per1.setDomicilio(dom1);

        //Una vez cargados los contenidos se puede imprimir por consola

        System.out.println(per1.getNombre() + " " + per1.getApellido() + " vive en " + per1.getDomicilio().getCalle() + " " + per1.getDomicilio().getNumero());

    }
}
