package practica1objetos.Ejercicios.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Aylen", 19, 34321323, 60, 1.60);
        Persona persona2 = new Persona("Fernando", 38, 60, 1.70);

        System.out.println(persona1.getNombre() + ":");
        int resultadoIMC = persona1.calcularIMC(persona1.getPeso(), persona1.getAltura());

        if (resultadoIMC == 1) {
            System.out.println("El IMC indica bajo de peso");
        } else if (resultadoIMC == 0) {
            System.out.println("El IMC indica peso ideal");
        } else {
            System.out.println("El IMC indica sobrepeso");
        }

        boolean esMayor = persona1.esMayorDeEdad();

        if (esMayor) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

//        persona1.imprimir(); También puede usar el método

        System.out.println("------------------");

        persona2.imprimir();
        System.out.println(persona2.getDni());
        System.out.println(persona2.getDniCompleto());

    }
}
