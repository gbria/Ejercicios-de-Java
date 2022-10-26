package Objetivo6;

public class O6_Ej3 {
    public static void main(String[] args) {
        System.out.println("Introduzca un número entero: ");
        int numero1 = Integer.parseInt(System.console().readLine());

        System.out.println("Introduzca un número entero: ");
        int numero2 = Integer.parseInt(System.console().readLine());

        if (numero1 > numero2){
            System.out.println("El primer número es mayor al segundo");
        }else {
            if (numero2 > numero1){
                System.out.println("El segundo número es mayor al primero");
            }else {
                System.out.println("Los números son iguales");
            }
        }
    }
}
