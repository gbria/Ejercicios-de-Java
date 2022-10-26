package Objetivo5;

import java.lang.reflect.Array;

public class O5_Ej1 {
    public static void main(String[] args) {
        String cadenaEspacios = "En un lugar de la mancha";
        System.out.println("Cadena original: " + cadenaEspacios);
        System.out.println();

        //split separa por el regex que le indiques, en este caso por " "
        String arrayCadenas[] = cadenaEspacios.split(" ");

        System.out.println("StringArray split con \" \" : ");
        for (int i = 0; i < arrayCadenas.length; i++) {
            System.out.println(arrayCadenas[i]);
        }

        String cadenaSeparadores = "Casa,Perro,Gato,Pájaro,Balón";
        System.out.println("Cadena original: " + cadenaSeparadores);
        System.out.println();

        //split separa por el regex que le indiques, en este caso por ","
        arrayCadenas = cadenaSeparadores.split(",");

        System.out.println("StringArray split con \",\": ");
        for (int i = 0; i < arrayCadenas.length; i++) {
            System.out.println(arrayCadenas[i]);
        }
    }
}
