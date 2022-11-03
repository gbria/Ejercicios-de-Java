package iterativeExercices;

import java.util.Scanner;

/**
 * Escriu un programa que, donat un nombre octal, el transformi a decimal.
 */
public class Exercici12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int octal, decimal = 0, tmpdiv, div, cont = 0, tmp; //tmpdec = 0

        System.out.print("Introduzca el octal: ");
        octal = sc.nextInt();

        //conocer el número de dígitos
        tmpdiv = octal;
        while (tmpdiv > 10) {
            tmpdiv /= 10;
            cont++;
            //System.out.println("tmpdiv: " + tmpdiv);
        }

        //System.out.println("Digitos: " + cont);


        tmp = octal;
        //dividir numero y multiplicar por 8 con su respectiva potencia
        for (int i = 0; i <= cont; i++) {

            if (tmp > 9) {
                //Si el número es mayor a 2 digitos
                tmp %= 10;
                //Acumulamos los resultados
                decimal += (int) (tmp * (Math.pow(8, i)));

            } else {
                //Si el número ya solo tiene un dígito le sumamos el último resultado
                decimal += (int) (tmp * (Math.pow(8, i)));
            }
            //Swaping
            div = octal / 10;
            tmp = div;
            octal = div;
        }

        System.out.println("Resultado decimal: " + decimal);
    }

}

/**
 * MURO DE LAS LAMENTACIONES
 * <p>
 * tmp = octal;
 * dividir numero y multiplicar por 8 con su respectiva potencia
 * for (int i = 0; i <= cont; i++) {
 * if (tmp > 9) {
 * tmp %= 10;
 * tmp = octal % 10;
 * System.out.println("tmp: " + tmp);
 * decimal += (int) (tmp * (Math.pow(8, i)));
 * <p>
 * double tmpPrueba = decimal;
 * System.out.println("Prueba: " + tmpPrueba);
 * <p>
 * tmpdec = (int) (tmp * Math.pow(8, i));
 * System.out.println("tmpdec: " + tmpdec);
 * decimal += tmpdec;
 * System.out.println("decimal: " + decimal);
 * <p>
 * <p>
 * } else {
 * decimal += (int) (tmp * (Math.pow(8, i)));
 * <p>
 * tmpdec = (int) (tmp * Math.pow(8, i));
 * System.out.println("tmpdec: " + tmpdec);
 * decimal += tmpdec;
 * System.out.println("decimal: " + decimal);
 * }
 * <p>
 * div = octal / 10;
 * System.out.println("div: " + div);
 * tmp = div;
 * octal = div;
 * System.out.println("decimal: " + decimal);
 */

