package funcions;

import java.util.Scanner;

/**
 * Creeu un programa que calculi la lletra que correspon a un DNI. Aquesta lletra s’obté calculant el residu
 * de la divisió del número del DNI entre 23 i aplicant la taula següent:
 */
public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos los datos
        System.out.print("Introdueixi el número de dni: ");
        int num = sc.nextInt();

        //Llamada de la funcion que da el residuo del número escaneado
        int mod = calculaNumeroDni(num);

        //Llamada de la función que da la letra del dni
        char character = calculaLetraDni(mod);
        System.out.println("Dni complert: " + (num) + (character));
    }

    private static int calculaNumeroDni(int num) {
        return num % 23;
    }

    private static char calculaLetraDni(int mod) {
        //Switch con los resultados dependiendo del residuo
        char character = 0;
        switch (mod) {
            case 0:
                character = 'T';
                break;
            case 1:
                character = 'R';
                break;
            case 2:
                character = 'W';
                break;
            case 3:
                character = 'A';
                break;
            case 4:
                character = 'G';
                break;
            case 5:
                character = 'M';
                break;
            case 6:
                character = 'Y';
                break;
            case 7:
                character = 'F';
                break;
            case 8:
                character = 'P';
                break;
            case 9:
                character = 'D';
                break;
            case 10:
                character = 'X';
                break;
            case 11:
                character = 'B';
                break;
            case 12:
                character = 'N';
                break;
            case 13:
                character = 'J';
                break;
            case 14:
                character = 'Z';
                break;
            case 15:
                character = 'S';
                break;
            case 16:
                character = 'Q';
                break;
            case 17:
                character = 'V';
                break;
            case 18:
                character = 'H';
                break;
            case 19:
                character = 'L';
                break;
            case 20:
                character = 'C';
                break;
            case 21:
                character = 'K';
                break;
            case 22:
                character = 'E';
                break;
            default:
                System.out.println("Error");
                break;
        }
        return character;
    }

}
