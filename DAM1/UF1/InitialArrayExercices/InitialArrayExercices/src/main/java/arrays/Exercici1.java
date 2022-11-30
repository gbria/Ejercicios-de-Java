package arrays;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Exercici1 {
    /**
     * Creeu un array d’enters d’N posicions i inicialitzeu-lo amb nombres aleatoris entre l’1 i el 100. Un cop fet
     * això, demaneu a l’usuari un número de l’1 al 100 i busqueu-lo dins de l’array. Si hi apareix, mostreu per
     * pantalla el nombre de vegades que l’heu trobat.
     * <p>
     * La capacitat de l’array, el nombre N, també el demanareu a l’usuari i, a més a més, heu de gestionar-ne
     * l’error, ja que només pot ser un valor positiu major a 0.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables para comprobar capacidad
        int cap = 0;
        boolean checkNum = false;

        //Variables búsqueda de número
        int fNum, count = 0;

        //Comprobamos si la capacidad es positiva mayor a 0
        while (checkNum == false) {
            System.out.print("Introduzca capacidad del array: ");
            cap = sc.nextInt();
            if (cap > 0) {
                checkNum = true;
            }
        }

        //Array de números con capacidad determinada
        int[] nums = new int[cap];

        //Genera números aleatorios en un foreach
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 101 + 1);
            System.out.print(nums[i] + " ");
        }

        //Indica qué número buscar
        System.out.println("Indicar número a encontrar: ");
        fNum = sc.nextInt();

        //Búsqueda del número mediante for y count
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == fNum){
                count++;

            }
        }

        //Resultado de la búsqueda
        if (count > 0){
            System.out.println("El número " + fNum + " se ha encontrado " + count + " veces.");
        }else {
            System.out.println("El número " + fNum + " no se ha encontrado.");
        }
    }
}
