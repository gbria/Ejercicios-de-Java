package Objetivo11;

public class O11_Ej6 {
    public static void main(String[] args) {
        System.out.println("Iniciando programa");
        try {
            int valor1 = 3;
            int valor2 = 0;
            int resultado = valor1 / valor2;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("ERROR: División por cero(" + e.getMessage() + ")");
        } catch (Exception e) {
            System.out.println("ERROR General" + e.getMessage());
        }finally {
            System.out.println("Finalizando programa");
        }
    }
}
