package ejercicio1;

public class CuentaApp {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Paco");
        Cuenta cuenta2 = new Cuenta("Germán", 1200);

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());

        cuenta2.ingresar(12000);
        System.out.println(cuenta2);

        cuenta2.retirar(6000);
        System.out.println(cuenta2);

        cuenta2.retirar(7500);
        System.out.println(cuenta2);




    }
}
