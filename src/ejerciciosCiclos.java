public class ejerciciosCiclos {
    public static void main(String[] args) {
        int resultado = 0;

        for(int i=0; i<=10; i++){
            System.out.println("Valor de i " + i);
        }
        System.out.println("-------------------");
        for(int i=10; i>=0; i--){
            System.out.println("Valor de i " + i);
        }

        for(int i = 60; i<=100; i+=5) {
            System.out.println("El número actual es " + i);
            resultado = resultado + i;
        }
        System.out.println("La suma total de los números es: "+ resultado);
    }
}
