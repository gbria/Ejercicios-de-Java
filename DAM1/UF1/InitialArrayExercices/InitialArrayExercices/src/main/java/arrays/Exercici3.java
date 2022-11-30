package arrays;

import java.util.Arrays;

public class Exercici3 {
    /**
     * Creeu un array d’enters de 10 posicions i inicialitzeu-lo amb nombres aleatoris entre el -100 i el 100. Fet
     * això, busqueu el valor més petit i el més gran dels continguts en l’estructura de dades. En acabar, mostreu
     * per pantalla tot l’array, així com el valor màxim i mínim.
     */
    public static void main(String[] args) {
        //Variables
        int[] nums = new int[10];

        //Generamos números aleatorios
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 200) - 100;
            System.out.print(nums[i] + " ");

        }
        //Salto de línea
        System.out.println();

        //Ordenamos l'Array
        Arrays.sort(nums);

        //Resultados de min y max
        System.out.println("Número más pequeño: " + nums[0]);
        System.out.println("Número más grande: " + nums[nums.length - 1]);
    }
}
