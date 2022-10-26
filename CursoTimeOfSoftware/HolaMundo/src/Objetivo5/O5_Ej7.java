package Objetivo5;

import java.util.HashMap;

public class O5_Ej7 {
    public static void main(String[] args) {
        HashMap<Integer, String> diasSemana = new HashMap<>();

        diasSemana.put(1,"Lunes");
        diasSemana.put(2, "Martes");
        diasSemana.put(3, "Miércoles");
        diasSemana.put(4, "Jueves");
        diasSemana.put(5, "Viernes");
        diasSemana.put(6, "Sábado");
        diasSemana.put(7, "Domingo");

        System.out.println("Número de elementos del diccionario: " + diasSemana.size());

        //Mostrar días por la clave
        System.out.println("Martes: " + diasSemana.get(2));
        System.out.println("Sábado: " + diasSemana.get(6));

        System.out.println("¿Está el Viernes?: " + diasSemana.containsKey(5));
        diasSemana.remove(5);
        System.out.println("¿Está el Viernes?: " + diasSemana.containsKey(5));
        System.out.println("¿Está es Domingo?: " + diasSemana.containsValue("Domingo"));
        diasSemana.remove(7);
        System.out.println("¿Está es Domingo?: " + diasSemana.containsValue("Domingo"));

        System.out.println("Número de elementos del diccionario: " + diasSemana.size());
        diasSemana.clear();
        System.out.println("Número de elementos del diccionario: " + diasSemana.size());




    }
}
