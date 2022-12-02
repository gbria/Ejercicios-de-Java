package funcions;

import java.util.Scanner;

public class Ex7 {
    /**
     * Escriu un programa que comprovi si un número és un Nombre Armstrong. Els nombres Armstrong són
     * aquells nombres tals que el seu valor és igual a la suma de cadascuna de les seves xifres elevada al nombre
     * total de xifres. Per exemple, el 153 és un nombre Armstrong perquè
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean checkNumber = false;

        //Introducir número y comprobar si es positivo
        while (checkNumber == false) {
            System.out.println("Introduzca un número: ");
            num = sc.nextInt();

            if (num > 0) {
                checkNumber = true;
            }
        }

        //Método Armstrong
        if (checkArmstrong(num)){
            System.out.println("Es número narcisista");
        } else {
            System.out.println("No es un número narcisista");
        }
    }

    private static boolean checkArmstrong(int num) {
        //VARIABLES
        int total = 0;

        //PEQUEÑA TRIQUIÑUELA

        //Pasamos a String para usar Split, (Easy peasy)
        String numberSt = String.valueOf(num);
        String[] digitSt = numberSt.split("");

        //Creamos el array de tipo int e introducimos el contenido del array de tipo String
        int[] digitsInt = new int[digitSt.length];

        for (int i = 0; i < digitSt.length; i++) {
            digitsInt[i] = Integer.parseInt(digitSt[i]);
        }

        //Calculamos la suma de sus dígitos elevados a la potencia de la cantidad de sus cifras
        for (int i = 0; i < digitsInt.length; i++) {
            total += Math.pow(digitsInt[i], digitsInt.length);
        }

        //Comparamos original con total
        if (total == num) {
            return true;
        }

        return false;
    }
}
