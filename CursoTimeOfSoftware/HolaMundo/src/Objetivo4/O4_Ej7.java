package Objetivo4;

public class O4_Ej7 {
    public static void main(String[] args) {
        String cadena = "En un lugar de la mancha";

        System.out.println("Primer carácter: " + cadena.charAt(0));
        System.out.println("Posición 3: " + cadena.charAt(3));
        System.out.println("Posición 8: " + cadena.charAt(8));

        System.out.println("Último carácter: " + cadena.charAt(cadena.length()-1));

        System.out.println("Contiene \"un\"?: " + cadena.contains("un"));
        System.out.println("Contiene \"casa\"?: " + cadena.contains("casa"));

    }
}
