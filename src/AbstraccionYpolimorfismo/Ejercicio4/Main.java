package AbstraccionYpolimorfismo.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        VehiculoTerrestre auto = new VehiculoTerrestre(100, 160, 4, "familiar");

        VehiculoAcuatico autoAcuatico = new VehiculoAcuatico(100, 317, "Superficie", 4);

        System.out.println("Velocidad de Vehículo terrestre");
        auto.acelerar(20);
        System.out.println(auto.velocidadActual);

        System.out.println("Velocidad de Vehículo Acuatico");
        autoAcuatico.acelerar(40);
        System.out.println(autoAcuatico.velocidadActual);
        autoAcuatico.recomendarVelocidad(20);
    }
}
