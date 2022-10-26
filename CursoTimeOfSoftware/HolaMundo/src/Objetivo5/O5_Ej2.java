package Objetivo5;

import java.util.Arrays;

public class O5_Ej2 {
    public static void main(String[] args) {
        Integer arrayEnteros[] = {5,10,15,20,25,30};

        System.out.println();
        System.out.print("Array Original: ");
        for (int i = 0; i < arrayEnteros.length; i++){
            System.out.print(arrayEnteros[i] + " ");
        }

        arrayEnteros[1] = 43;
        arrayEnteros[4] = arrayEnteros[0] - 3;

        System.out.print("\nNúmero de elementos: " + arrayEnteros.length);
        System.out.println();

        System.out.print("\nArray Modificado: ");
        for (int i = 0; i < arrayEnteros.length; i++){
            System.out.print(arrayEnteros[i] + " ");
        }

        Arrays.sort(arrayEnteros);
        System.out.print("\nArray Ordenador: ");
        for (int i = 0; i < arrayEnteros.length; i++){
            System.out.print(arrayEnteros[i] + " ");
        }

        System.out.println("\n");
        System.out.println("¿Posición del valor 90?: " + Arrays.asList(arrayEnteros).indexOf(90));
        System.out.println("¿Posición del valor 15?: " + Arrays.asList(arrayEnteros).indexOf(15));
    }
}
