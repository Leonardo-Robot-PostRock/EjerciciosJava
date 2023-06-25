package cicloFor;

public class ejercicio4 {
    public static void main(String[] args) {
//        4) Realizar un algoritmo que muestre un cronómetro, imprimiendo de uno en uno por consola las horas, los minutos y los segundos (entre las 10:00:00 am y las 10:59:59 am), en el formato hh:mm:ss.

        int horas, minutos, segundos;

        for (horas = 10; horas <= 10; horas++) {
            for (minutos = 0; minutos <= 59; minutos++) {
                for (segundos = 0; segundos <= 59; segundos++) {
                    if (minutos < 10 && segundos < 10) {
                        System.out.println(horas + ":0" + minutos + ":0" + segundos + " am");
                    } else if (minutos < 10 && segundos >= 10) {
                        System.out.println(horas + ":0" + minutos + ":" + segundos + "am");
                    } else if (minutos > 10 && segundos < 10) {
                        System.out.println(horas + ":" + minutos + ":0" + segundos + " am");
                    } else {
                        System.out.println(horas + ":" + minutos + ":" + segundos + " am");
                    }

                }
            }
        }
    }
}
