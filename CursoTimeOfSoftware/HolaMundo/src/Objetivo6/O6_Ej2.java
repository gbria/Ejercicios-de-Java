package Objetivo6;

import java.util.ArrayList;
import java.util.List;

public class O6_Ej2 {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>(List.of(2,5,8,9,3));
        System.out.println("¿Qué número desea buscar?: ");
        int valor = Integer.parseInt(System.console().readLine());

        if (valores.contains(valor)){
            System.out.println("¡Valor encontrado en la lista de valores!");
        }else {
            System.out.println("¡Valor no encontrado en la lista de valores!");
        }
    }
}
