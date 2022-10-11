public class Ejercicio1 {
    /**
     * Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación,
     * división y módulo (resto de la división).
     */
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " : " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));

    }
}