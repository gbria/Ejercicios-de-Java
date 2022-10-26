package Objetivo7;

import java.util.ArrayList;
import java.util.List;

public class O7_Ej9 {
    public static void main(String[] args) {
        List<String> cosas = new ArrayList<>(List.of("Casa", "Zapato", "Perro", "Gato", "Pájaro"));

        for (String cosa: cosas) {
            System.out.println("Valores: " + cosa);
        }
    }
}
