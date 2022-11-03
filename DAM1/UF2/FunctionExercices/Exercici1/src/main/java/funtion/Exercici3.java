package funtion;

import java.util.Random;
import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca número de días: ");
        int dias = sc.nextInt();

        System.out.print("Introduzca número de horas: ");
        int horas = sc.nextInt();

        System.out.print("Introduzca número de minutos: ");
        int minutos = sc.nextInt();

        int tiempo = calcularSegundo(dias, horas, minutos);
        System.out.print("Total del segundos: " + tiempo);
    }

    static int calcularSegundo(int dias, int horas, int minutos) {
        int tmpHoras = dias * 24;
        int tmpMinutos = (horas * 60) + (tmpHoras * 60);
        int tmpSegundos = (minutos * 60) + (tmpMinutos * 60);
        return tmpSegundos;

    }

}
