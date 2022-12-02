package primerPassos;

import java.util.Scanner;

public class NumerosContinguts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 + 1 == num2 ||num2 + 1 == num1){
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }

    }
}
