package AbstraccionYpolimorfismo.Ejercicio3;

public class Main {

    public static void main(String[] args) {
        Fraccion frac1 = new Fraccion(2, 4);
        Fraccion frac2 = new Fraccion(3, 4);

        Numerica frac3 = frac1.sumar(frac2);
        System.out.println(frac3.toString());

//        System.out.println(frac1.sumar(frac2));
//        System.out.println(frac1.restar(frac2));
//        System.out.println(frac1.dividir(frac2));
        System.out.println(frac1.multiplicar(frac2));
        System.out.println(frac1.equals(frac2));

        Fraccion frac4 = new Fraccion(5, 9);


        System.out.println("Resultado");
        double result = (double) frac1.getNumerador() / frac1.getDenominador();
        System.out.println(result);


    }
}
