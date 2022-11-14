package funcions;

import java.util.Scanner;
/**Creeu un programa que comprovi si una terna de valors enters (3 valors) compleix l’equació de Pitàgores:*/
public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Introducción de los datos
        System.out.print("Introdueixi el primer catet: ");
        int a = sc.nextInt();
        System.out.print("Introdueixi el segon catet: ");
        int b = sc.nextInt();
        System.out.print("Introdueixi hipotenusa: ");
        int h = sc.nextInt();

        //Llamada de la función que devuelve un boolean
        if (checkPitagoras(a, b, h)) {
            System.out.println("La equació de Pitàgores es correcta");
        } else {
            System.out.println("La equació de Pitàgores es incorrecta");
        }

    }
    private static boolean checkPitagoras(int a, int b, int h) {
        //Función que comprueba si los 3 valores son correctos en el teorema de Pitágoras
        if (Math.pow(a, 2) + Math.pow(b, 2) == (Math.pow(h, 2))) return true;
        return false;
    }
}
