package practica1objetos.Ejercicios.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Aylen", 19, 34321323, 66, 1.60);
        Persona persona2 = new Persona("Fernando", 38, 60, 1.70);
        Persona persona3 = new Persona("Ana", 16,  45, 1.45);

        int resultadoIMC = persona1.calcularIMC(persona1.getPeso(), persona1.getAltura());
        int resultadoIMC2 = persona3.calcularIMC(persona3.getPeso(), persona3.getAltura());

        System.out.println(persona1.getNombre() + ":");
        boolean esMayor = persona1.esMayorDeEdad();
        examenIMC(resultadoIMC);
        verificarEdad(esMayor);

        System.out.println(persona3.getNombre() + ":");
        examenIMC(resultadoIMC2);
        boolean esMayor2 = persona3.esMayorDeEdad();
        verificarEdad(esMayor2);


//        persona1.imprimir(); También puede usar el método

        System.out.println("------------------");

        persona2.imprimir();
        System.out.println("Dni: " + persona2.getDni());
        System.out.println("Dni más Letra: " + persona2.getDniCompleto());

    }

    public static void verificarEdad(boolean esMayor) {
        if (esMayor) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
    }

    public static void examenIMC(int resultado) {
        if (resultado == -1) {
            System.out.println("El IMC indica bajo de peso");
        } else if (resultado == 0) {
            System.out.println("El IMC indica peso ideal");
        } else {
            System.out.println("El IMC indica sobrepeso");
        }
    }
}
