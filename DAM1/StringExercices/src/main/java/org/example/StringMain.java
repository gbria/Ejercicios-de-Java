package org.example;

import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcio, pos = 0, contador = 0, ini, end;
        String str1 = "", paraula, replace;


        do {
            System.out.println("~~~~ MENÚ ~~~~");
            System.out.println("0. Sortir");
            System.out.println("1. Introduir una cadena de caràcters ( String )");
            System.out.println("2. Indicar la longitud de la cadena de caràcters");
            System.out.println("3. Comptar paraules");
            System.out.println("4. Buscar una paraula (case - sensitive )");
            System.out.println("5. Comptar les vegades que apareix una paraula (non case - sensitive )");
            System.out.println("6. Comparar cadenes (non case - sensitive )");
            System.out.println("7. Capgirar la cadena de caràcters");
            System.out.println("8. Mostrar el codi ASCII del caràcter situat a la posició x");
            System.out.println("9. Mostrar el caràcter situat a la posició x");
            System.out.println("10. Mostrar la posició on apareix, per primer cop, una paraula (case - sensitive )");
            System.out.println("11. Mostrar la posició on apareix, per darrer cop, una paraula (non case - sensitive )");
            System.out.println("12. Substituir una paraula");
            System.out.println("13. Comprovar si la cadena comença per un conjunt de caràcters (case - sensitive )");
            System.out.println("14. Comprovar si la cadena acaba amb un conjunt de caràcters (non case - sensitive )");
            System.out.println("15. Obtenir una subcadena");
            System.out.print("\nOpció: ");
            opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio) {
                case 0:
                    System.out.println("Tanca'n programa");
                    break;

                case 1:
                    System.out.print("Introdueixi una cadena de caràcters: ");
                    str1 = sc.nextLine();

                    if (str1.isEmpty()) {
                        System.out.println("No s'ha introduït cap cadena\n");
                    }
                    break;

                case 2:
                    //¿Muestra un dígito de más? Por el intro.
                    System.out.println("La longitud de la cadena es de: " + (str1.length() - 1) + "\n");
                    break;

                case 3:
                    //split: separa el contenido por regex + length: cuenta los splits
                    System.out.println("El nombre de paraules de la cadenas es: " + str1.split(" ").length);
                    break;

                case 4:
                    System.out.println("Trobar paraula: ");
                    paraula = sc.next();

                    if (str1.contains(paraula)) {
                        System.out.println("La paraula s'ha trobat a la posició " + str1.indexOf(paraula));
                    } else {
                        System.out.println("La paraula no s'ha trobat");
                    }
                    break;

                case 5:
                    System.out.print("Trobar paraula: ");
                    paraula = sc.next().toUpperCase();

                    String strCase5 = str1.toUpperCase();

                    for (int i = 0; i <= strCase5.length(); i++) {
                        if (strCase5.indexOf(paraula, i) != strCase5.indexOf(paraula, i + 1)) {
                            //System.out.println("pos: " + strTmp.indexOf(paraula, i));
                            contador++;
                        }
                    }

                    if (contador == 0) {
                        System.out.println("No s'ha trobat la paraula: " + paraula + "\n");
                    } else if (contador == 1) {
                        System.out.println("La paraula s'ha trobat " + contador + " vegada\n");
                    } else {
                        System.out.println("La paraula s'ha trobat " + contador + " vegades\n");
                    }
                    break;

                case 6:
                    System.out.print("Introdueixi cadena: ");
                    String str2 = sc.nextLine().toUpperCase();

                    String strCase6 = str1.toUpperCase();

                    System.out.println("strTmp: " + strCase6);
                    System.out.println("str2: " + str2);

                    if (strCase6.compareTo(str2) == 0) {
                        System.out.println("Les cadenes son iguals\n");
                    } else if (strCase6.compareTo(str2) < 0) {
                        System.out.println("La primera cadena es lexicogràficament mes petita\n");
                    } else {
                        System.out.println("La segona cadena es lexicogràficament mes petita\n");
                    }
                    break;

                case 7:
                    //Creando un charAt y sumando los caracteres en una nueva variable.
                    char caracter;
                    String invers = "";
                    for (int i = 0; i < str1.length(); i++) {
                        caracter = str1.charAt(i);
                        invers = caracter + invers;

                    }
                    System.out.println("Cadena original: " + str1);
                    System.out.println("Cadena capgirada: " + invers);
                    //Falta l'alternativa
                    break;

                case 8:
                    System.out.print("Introdueixi la posició: ");
                    pos = sc.nextInt();

                    if (pos < 0 || pos >= str1.length()) {
                        System.out.println("Error");
                    } else {
                        pos = str1.charAt(pos);
                        System.out.println("El numero ASCII del caràcter es: " + pos);
                    }
                    break;
                case 9:
                    System.out.print("Introdueixi la posició: ");
                    pos = sc.nextInt();

                    if (pos < 0 || pos >= str1.length()) {
                        System.out.println("Error");
                    } else {
                        caracter = str1.charAt(pos);
                        System.out.println("El caràcter es: " + caracter);
                    }
                    break;

                case 10:
                    System.out.print("Introdueixi la paraula: ");
                    paraula = sc.next();

                    if (str1.indexOf(paraula) < 0) {
                        System.out.println("La paraula no s'ha trobat");
                    } else {
                        System.out.println("La paraula es troba a la posició " + str1.indexOf(paraula));
                    }
                    break;

                case 11:
                    System.out.print("Introdueixi la paraula: ");
                    paraula = sc.next().toUpperCase();

                    if (str1.toUpperCase().lastIndexOf(paraula) < 0) {
                        System.out.println("La paraula no s'ha trobat");
                    } else {
                        System.out.println("La paraula es troba a la posició " + str1.toUpperCase().lastIndexOf(paraula));
                    }
                    break;

                case 12:
                    System.out.print("Para a sustituir: ");
                    paraula = sc.next();
                    System.out.print("Nova paraula: ");
                    replace = sc.next();
                    System.out.println("Cadena: " + str1.replace(paraula, replace));
                    break;

                case 13:
                    System.out.println("Introdueix conjunt de caràcters: ");
                    paraula = sc.nextLine();

                    if (str1.startsWith(paraula)) {
                        System.out.println(str1);
                        System.out.println("La cadena començar amb el text introduït\n");
                    } else {
                        System.out.println(str1);
                        System.out.println("La cadena no començar amb el text introduït\n");

                    }
                    break;
                case 14:
                    System.out.println("Introdueix conjunt de caràcters: ");
                    paraula = sc.nextLine().toUpperCase();

                    if (str1.toUpperCase().endsWith(paraula)) {
                        System.out.println(str1);
                        System.out.println("La cadena acabar amb el text introduït\n");
                    } else {
                        System.out.println(str1);
                        System.out.println("La cadena no acabar amb el text introduït\n");

                    }
                    break;

                case 15:
                    System.out.println("Introduir posició inicial: ");
                    ini = sc.nextInt();
                    if (ini < 0 || ini > str1.length()) {
                        System.out.println("Error");
                    }

                    System.out.println("Introduir posició final: ");
                    end = sc.nextInt();
                    if (end < 0 || ini > end || end > str1.length()) {
                        System.out.println("Error");
                    }

                    System.out.println("Subcadena: " + str1.substring(ini, end));
                    break;

                default:
                    System.out.println("Error\n");
                    break;
            }

        }
        while (opcio != 0);

    }
}