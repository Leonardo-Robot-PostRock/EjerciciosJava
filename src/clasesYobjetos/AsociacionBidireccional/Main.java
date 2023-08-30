package clasesYobjetos.AsociacionBidireccional;

public class Main {
    public static void main(String[] args) {
        //Una persona quiere abrir una cuenta en un banco (Se creará su legajo y su cuenta simultáneamente).
        //Deberá proveer toda su información personal y el tipo de cuenta y el saldo inicial
        Persona per1 = new Persona(17456879, "Juan", "Perez");
        Cuenta cue1 = new Cuenta(2345, "CA", 3456);

        per1.setCuenta(cue1); //asocio la cuenta a la persona;
        cue1.setPersona(per1); //asocio la persona a la cuenta;

        System.out.println("Cliente: " + per1.getApellido() + " DNI: " + per1.getDni());

        System.out.println("Nro de Cuenta: " + per1.getCuenta().getId() + " Balance: " + per1.getCuenta().getBalance());

        System.out.println("-----------------------------------");

        System.out.println("Cuenta: " + cue1.getId() + "Tipo: " + cue1.getTipo());
        System.out.println("Pertenece a: " + cue1.getPersona().getApellido());
    }
}
