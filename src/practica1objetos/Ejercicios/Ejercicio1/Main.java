package practica1objetos.Ejercicios.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Cuenta cue1 = new Cuenta("Leolux", 9000);

//        double retirarDinero = cue1.retirar(3000);
        System.out.println(cue1.retirar(3000));
        System.out.println(cue1.ingresar(-2000));
    }
}
