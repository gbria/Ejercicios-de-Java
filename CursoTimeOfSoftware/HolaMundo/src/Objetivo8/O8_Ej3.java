package Objetivo8;

public class O8_Ej3 {
    public static void main(String[] args) {
        System.out.print("Introduzca sumando: ");
        int num1 = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca sumando: ");
        int num2 = Integer.parseInt(System.console().readLine());

        int resultado = SumarDosNumeros(num1, num2);
        System.out.println("El resultado es: " + resultado);
    }

    static int SumarDosNumeros(int numero1, int numero2){
        return numero1 + numero2;
    }
}
