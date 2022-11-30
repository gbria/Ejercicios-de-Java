package arrays;

import java.util.Scanner;

public class Exercici2 {
    /**
     * Copieu l’exercici anterior i modifiqueu tot allò que cregueu necessari perquè el programa mostri, per
     * pantalla, el nombre de vegades que s’ha trobat el número demanat per l’usuari i, també, la posició dins de
     * l’array de totes aquestes instàncies.
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
        System.out.println("");
        System.out.println("Indicar número a encontrar: ");
        fNum = sc.nextInt();

        //Búsqueda del número mediante for y count
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == fNum) {
                count++;
                System.out.println("Número encontrado en la posición " + i);
            }
        }

        //Resultado de la búsqueda
        if (count > 0) {
            System.out.println("El número " + fNum + " se ha encontrado " + count + " veces.");
        } else {
            System.out.println("El número " + fNum + " no se ha encontrado.");
        }
    }
}
