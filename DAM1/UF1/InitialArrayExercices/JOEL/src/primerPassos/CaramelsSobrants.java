package primerPassos;

import java.util.Scanner;

public class CaramelsSobrants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caramels, nebots;
        caramels = sc.nextInt();
        nebots = sc.nextInt();
        System.out.println(caramels%nebots);
    }
}
