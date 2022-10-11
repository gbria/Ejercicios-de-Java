package caesarcipher;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

/**
 * Author
 * Germán Bria Mayorga
 */

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcio, clau, catNum;
        String str1;
        char catChar;

        System.out.println("PROGRAMA CAESARCIPHER\n");

        do {
            System.out.println("MENU");
            System.out.println("0. Sortir");
            System.out.println("1. Xifrar un text");
            System.out.println("2. Desxifrar un text");
            System.out.print("Opció: ");
            opcio = sc.nextInt();

            switch (opcio) {
                case 0:
                    //Tanca'n programa
                    System.out.println("\nTanca'n");
                    break;

                case 1:
                    //Introducció de la clau amb condició
                    do {
                        System.out.println("\nXIFRAR UN TEXT");
                        System.out.print("Introdueixi CLAU: ");
                        clau = sc.nextInt();
                        if (!(clau > 0 && clau <= 25)) {
                            System.out.println("Error. Clau fora del rang de valors");
                        }
                    } while (!(clau > 0 && clau <= 25));

                    //Neteja
                    sc.nextLine();

                    //Introducció del la cadena i modificació
                    System.out.print("Introdueixi cadena de text: ");
                    str1 = sc.nextLine().toUpperCase().replace(" ", "");
                    System.out.println();
                    //System.out.println("Text modificado: " + str1);


                    //Codificació
                    System.out.print("Cadena de text xifrada: ");
                    for (int i = 0; i < str1.length(); i++) {
                        catNum = str1.charAt(i) + clau;
                        //System.out.print(catNum);
                        System.out.print(catChar = (char) catNum);
                    }
                    System.out.println("\nOperació realitzada amb èxit.\n");
                    break;

                case 2:
                    //Introducció de la clau amb condició
                    do {
                        System.out.println("\nDESXIFRAR UN TEXT");
                        System.out.print("Introdueixi CLAU: ");
                        clau = sc.nextInt();
                        if (!(clau > 0 && clau <= 25)) {
                            System.out.println("Error. Clau fora del rang de valors");
                        }
                    } while (!(clau > 0 && clau <= 25));

                    //Neteja
                    sc.nextLine();

                    //Introducció del la cadena i modificació
                    System.out.print("Introdueixi cadena de text: ");
                    str1 = sc.nextLine().toUpperCase().replace(" ", "");
                    System.out.println("");
                    //System.out.println("Texto modificado: " + str1);

                    //Codificació
                    System.out.print("Cadena de text desxifrada: ");
                    for (int i = 0; i < str1.length(); i++) {
                        catNum = str1.charAt(i) - clau;
                        //System.out.print(catNum);
                        System.out.print(catChar = (char) catNum);
                    }
                    System.out.println("\nOperació realitzada amb èxit.\n");
                    break;

                default:
                    System.out.println("\nError. Opció incorrecta\n");
                    break;
            }

        } while (opcio != 0);
    }
}
