package funtion;

import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de números a mostrar: ");
        int num = sc.nextInt();

        muestraPares(num);
    }

    static void muestraPares(int num) {
        int count = 0, par = -2;
        while (count < num) {
            System.out.print((par += 2) + " ");
            count++;
        }
    }
}
