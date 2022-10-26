package Objetivo5;

import java.util.ArrayList;
import java.util.List;

public class O5_Ej6 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5));

        System.out.println("Tamaño de la lista: " + numeros.size());

        System.out.print("Lista original: ");
        for (int i = 0; i < numeros.size(); i++){
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();

        System.out.println("¿Contiene el número 3?: " + numeros.contains(3));

        //Borra el valor de la posición 1 y los valores se desplazan en la nueva posición
        numeros.remove(1);

        System.out.println("Tamaño de la lista: " + numeros.size());

        System.out.print("Lista modificada: ");
        for (int i = 0; i < numeros.size(); i++){
            System.out.print(numeros.get(i) + " ");
        }

        numeros.add(3);

        System.out.println();
        System.out.print("Lista modificada: ");
        for (int i = 0; i < numeros.size(); i++){
            System.out.print(numeros.get(i) + " ");
        }

        //Elimina el primer valor que encuentra
        numeros.remove(Integer.valueOf(3));

        System.out.println();
        System.out.print("Lista modificada: ");
        for (int i = 0; i < numeros.size(); i++){
            System.out.print(numeros.get(i) + " ");
        }

        System.out.println();
        numeros.clear();
        System.out.println("Tamaño de la lista: " + numeros.size());
    }
}
