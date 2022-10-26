package Objetivo7;

public class O7_Ej2 {
    public static void main(String[] args) {
        int value = 0;
        boolean check = false;

        while (!check) {
            System.out.print("Introduzca un número mayor de 100: ");
            value = Integer.parseInt(System.console().readLine());

            if (value > 100) {
                System.out.println("El número introducido es mayor de 100");
                check = true;
            } else {
                System.out.println("El número introducido no es mayor de 100");
            }

        }

    }
}
