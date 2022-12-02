package primerPassos;

import java.util.Scanner;

public class Eleccions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vots1 = sc.nextInt();
        int vots2 = sc.nextInt();
        int vots3 = sc.nextInt();

        if (vots1 > vots2 && vots1 > vots3) {
            System.out.println("Jiden");
        }

        if (vots3 > vots1 && vots3 > vots2) {
            System.out.println("Banders");
        }

        if (vots2 > vots1 && vots3 < vots2){
            System.out.println("Drump");
        }
    }
}
