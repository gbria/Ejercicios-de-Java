package primerPassos;

import java.util.Scanner;

public class OkBoomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if ((age >= 1 && age <= 2020)) {
            if (age >= 1945 && age <= 1965) {
                System.out.println("ok boomer");
            }else {
                System.out.println("nah");
            }
        }
    }
}
