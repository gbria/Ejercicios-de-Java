package Objetivo5;

import java.util.ArrayList;
import java.util.List;

public class O5_Ej5 {
    public static void main(String[] args) {
        List<Integer> numero = new ArrayList<>(List.of(1,2,3));
        System.out.println("Tamaño de la lista: " + numero.size());
        System.out.println("Lista original: " + numero.get(0) + ", " + numero.get(1) + ", " + numero.get(2));
        numero.add(4);
        numero.add(5);
        System.out.println("Tamaño de la lista: " + numero.size());
        System.out.print("Lista modificada: ");
        for (int i = 0; i < numero.size(); i++){
            System.out.print(numero.get(i) + " ");
        }
        numero.add(0,0);
        numero.add(3,999);
        System.out.println();
        System.out.println("Tamaño de la lista: " + numero.size());
        System.out.print("Lista modificada: ");
        for (int i = 0; i < numero.size(); i++){
            System.out.print(numero.get(i) + " ");
        }





    }
}
