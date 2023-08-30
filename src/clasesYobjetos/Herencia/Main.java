package clasesYobjetos.Herencia;

public class Main {
    public static void main(String[] args) {
        //Creo un objeto del tipo profesor que hereda de una clase Persona
        //primero se activa el constructor de persona creándome las variables correspondientes a dicha clase.
        //Es por eso que creando un objeto profesor podemos acceder
        //a los atributos y métodos de la clase Persona.

        Profesor profe = new Profesor("Pepe", "Honguito", 25409433, 259);

        //Imprimo
        System.out.println("Profesor: \nApellido: " + profe.getApellido() + " Nombre:" + profe.getNombre() + " DNI: " + profe.getDni() + " LEGAJO" + profe.getLegajo());
    }
}
