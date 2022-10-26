package Objetivo4;

public class O4_Ej5 {
    public static void main(String[] args) {
        String cadena = "Hola";
        System.out.println("La cadena es: " + cadena);

        System.out.println("¿Empieza por \"Ho\"?: " + cadena.startsWith("Ho"));
        System.out.println("¿Empieza por \"ho\"?: " + cadena.startsWith("ho"));

        System.out.println("¿Termina por \"la\"?: " + cadena.endsWith("la"));
        System.out.println("¿Termina por \"LA\"?: " + cadena.endsWith("LA"));

        System.out.println("¿Es igual que \"hola\"?: " + cadena.equals("hola"));
        System.out.println("¿Es igual que \"Hola\"?: " + cadena.equals("Hola"));
    }
}
