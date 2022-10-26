package Objetivo7;

import java.util.ArrayList;
import java.util.List;

public class O7_Ej1 {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int i = 0;
        boolean recorrido = false;

        while (!recorrido) {
            System.out.println(valores.get(i) + " ");
            i++;
            if (i == valores.size()) {
                recorrido = true;
            }
        }
        System.out.println();
    }
}
