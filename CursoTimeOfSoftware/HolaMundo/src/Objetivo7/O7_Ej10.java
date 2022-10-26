package Objetivo7;

import java.util.HashMap;
import java.util.Map;

public class O7_Ej10 {
    public static void main(String[] args) {
        Map<Integer, String> numeros = new HashMap<>();

        numeros.put(1, "Uno");
        numeros.put(2, "Dos");
        numeros.put(3, "Tres");
        numeros.put(4, "Cuatro");
        numeros.put(5, "Cinco");

        System.out.println("## Iterando todos los elementos ##");
        for (Map.Entry<Integer, String> valor : numeros.entrySet()) {
            System.out.println("Clave: " + valor.getKey() + ", Valor: " + valor.getValue());
        }

        System.out.println("## Iterando las claves ##");
        for (Integer clave : numeros.keySet()) {
            System.out.println("Clave: " + clave);
        }

        System.out.println("## Iterando los valores ##");
        for (String valor : numeros.values()) {
            System.out.println("Valor: " + valor);
        }
    }
}
