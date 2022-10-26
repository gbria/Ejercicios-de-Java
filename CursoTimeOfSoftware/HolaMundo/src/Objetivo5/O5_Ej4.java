package Objetivo5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class O5_Ej4 {
    public static void main(String[] args) {
        List<Integer> numero = new ArrayList<>();

        numero.add(1);
        numero.add(2);
        numero.add(3);

        numero.set(0 , 10);
        numero.set(1 , 11);
        numero.set(2 , 12);

        Iterator it = numero.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
