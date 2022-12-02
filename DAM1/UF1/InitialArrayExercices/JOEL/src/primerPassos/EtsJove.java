package primerPassos;

import java.util.Scanner;

public class EtsJove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edat = sc.nextInt();

        if (edat < 32 && edat >= 0) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }
}
