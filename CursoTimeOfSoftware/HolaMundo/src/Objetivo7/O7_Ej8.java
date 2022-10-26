package Objetivo7;

import java.util.ArrayList;
import java.util.List;

public class O7_Ej8 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));

        for (int it : numeros) {
            System.out.println("Números: " + it);
        }
    }
}
