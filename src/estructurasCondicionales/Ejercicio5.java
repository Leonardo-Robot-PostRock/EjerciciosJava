package estructurasCondicionales;

public class Ejercicio5 {
    public static void main(String[] args) {
//        Desarrolle un algoritmo que permita identificar que tan bueno fueron los números resultantes de dos dados al ser lanzados. Considerando:
//        Si la suma de ambos es igual a 12 mostrar por pantalla "Excelente Tiro"
//        Si la suma de ambos es igual o mayor a 7 y menor a 12 mostrar por pantalla "Buen Tiro" Si la suma de ambos es menor a 7 mostrar por pantalla "Mala Suerte!"
//        RETO EXTRA: Te animamos a validar también que ambos números ingresados sean correctos, es decir entre 1 y 6 (incluidos)

        int dado1, dado2;
        int max = 6;
        int min = 1;
        int range = max - min + 1;

        System.out.println(range);

        //Se puede mejorar con cálculo de probabilidades
        dado1 = (int) (Math.random() * range) + min;
        dado2 = (int) (Math.random() * range) + min;

        System.out.println(dado1);
        System.out.println(dado2);

        if (dado1 + dado2 == 12) {
            System.out.println("Excelente tiro");
        } else if (dado1 + dado2 >= 7 && dado1 + dado2 < 12) {
            System.out.println("Buen tiro");
        }else {
            System.out.println("Mala suerte");
        }
    }
}
