package primerPassos;
import java.util.Scanner;

public class AnyDeTraspas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 1 && age <= 2200) {
            if (age % 4 == 0) {
                if (age % 100 != 0) {
                    System.out.println("SI");
                } else {
                    if (age % 400 == 0) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
