package Objetivo4;

public class O4_Ej6 {
    public static void main(String[] args) {
        String cadena = "1 de Enero, 2 de Febrero...";

        String fecha1 = cadena.substring(0, 10);
        String fecha2 = cadena.substring(12);

        System.out.println(cadena);
        System.out.println(fecha1);
        System.out.println(fecha2);
        System.out.println();

        cadena = "  ¡San Fermín!  ";
        System.out.println(cadena);
        System.out.println(cadena.trim());

    }
}
