package primerPassos;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0 && num % 9 == 0){
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }

    }
}
