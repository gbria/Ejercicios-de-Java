package Objetivo7;

import java.util.ArrayList;
import java.util.List;

public class O7_Ej3 {
    public static void main(String[] args) {
        List<String> valores = new ArrayList<>(List.of("Perro", "Gato", "Pájaro", "Caballo"));
        for (int i = 0; i < valores.size(); i++) {
            System.out.println(valores.get(i));
        }
    }
}
