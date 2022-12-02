package primerPassos;

import java.util.Scanner;

public class CercarTrios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1, c2, c3;

        c1 = (int) (Math.random() * 13 + 1);
        c2 = (int) (Math.random() * 13 + 1);
        c3 = (int) (Math.random() * 13 + 1);

        System.out.println(c1 + " " + c2 + " " + c3);

        if (c1 == c2 && c2 == c3) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
