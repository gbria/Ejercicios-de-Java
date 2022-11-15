package funcions;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "";
        boolean exit = false;
        int option;

        while (exit == false) {
            System.out.println("~~~~ MENÚ ~~~~");
            System.out.println("0. Sortir");
            System.out.println("1. Introduir una cadena de caràcters");
            System.out.println("2. Comptar majúscules");
            System.out.println("3. Comptar minúscules");

            System.out.print("Opció: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 0:
                    System.out.println("Sortint del programa");
                    exit = true;
                    break;

                case 1:
                    //Introducir una cadena de texto
                    System.out.print("Introdueixi una cadena de text: ");
                    text = sc.nextLine();

                    //Tratamos el texto para eliminar espacios mediante función
                    //Lo convertimos a código ASCII mediante función
                    //converterAscii(makeText(text));
                    break;

                case 2:
                    //Contar las mayúsculas mediante función
                    int numMaj = countMay(converterAscii(makeText(text)));
                    System.out.println("Quantitat de majúscules: " + numMaj);
                    break;

                case 3:
                    //Contar las minúsculas mediante función
                    int numMin = countMin(converterAscii(makeText(text)));
                    System.out.println("Quantitat de minúscules: " + numMin);
                    break;

                default:
                    System.out.println("Error: No existeix la opció.");
                    break;
            }
        }
    }

    private static int countMay(int[] ascii) {
        int countMaj = 0;

        for (int num : ascii) {
            if (num >= 65 && num <= 90) {
                countMaj++;
            }
        }
        return countMaj;
    }

    private static int countMin(int[] ascii) {
        int countMaj = 0;

        for (int num : ascii) {
            if (num >= 97 && num <= 122) {
                countMaj++;
            }
        }
        return countMaj;
    }

    private static int[] converterAscii(String auxText) {
        //Casteamos y pasamos a código ASCII
        int numbers[] = new int[auxText.length()];

        for (int i = 0; i < auxText.length(); i++) {
            numbers[i] = (int) auxText.charAt(i);
            //System.out.println(numbers[i]);
        }
        return numbers;
    }

    private static String makeText(String text) {
        //Eliminamos espacios
        return text.replace(" ", "").trim();
    }
}
