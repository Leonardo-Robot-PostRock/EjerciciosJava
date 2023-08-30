package clasesYobjetos.Composicion;

public class Main {
    public static void main(String[] args) {
        //Creo un objeto de tipo persona y utilizo un constructor sobrecargado,
        //automáticamente se creó un objeto del tipo domicilio.
        Persona per1 = new Persona("Pepe", "Honguito", "Suipacha", 139);

        //La NAVEGABILIDAD se realiza de la siguiente forma
        //per1.getDomicilio() esto significa que puedo llegar a la variable referenciada
        //La variable de tipo Persona ya tiene todos los datos almacenados
        //Una vez cargados los contenidos podemos imprimir por consola.

        System.out.println("La siguiente persona " + per1.getNombre() + " " + per1.getApellido() + " vive en " + per1.getDomicilio().getNombreCalle() + " " + per1.getDomicilio().getNumero());

        //NAVEGABILIDAD LA REALIZAMOS DE LA SIGUIENTE FORMA
        //per1.getDomicilio() esto significa que puedo llegar a la variable referenciada y una vez
        //ahí con per1.getDomicilio().getNombreCalle() obtengo la calle de la variable per1.
    }
}
