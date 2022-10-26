package Objetivo5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class O5_Ej3 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4));

        Iterator it = numeros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }

        List<String> listaCadenas = new ArrayList<>();
        System.out.println();

        //Añade datos mediante el método add
        listaCadenas.add("Hola");
        listaCadenas.add("¿Qué tal?");
        listaCadenas.add("Estoy aprendiendo Java");

        //Imprime contenido mediante un for y el método get
        for (int i = 0; i < listaCadenas.size(); i++) {
            System.out.println(listaCadenas.get(i));
        }

        //Para saber el tamaño no se usa length, sino size
        System.out.println("Número de elementos: " + listaCadenas.size());

        System.out.println();
        it = listaCadenas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }
}
