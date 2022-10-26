package Objetivo6;

public class O6_Ej4 {
    public static void main(String[] args) {
        System.out.println("Códigos promocionales: ORO, PLATA, BRONCE, o PLATINO");
        System.out.println("Introduzca su código promocional para saber su descuento: ");
        String codigo = System.console().readLine();

        switch (codigo){
            case "ORO":
                System.out.println("El descuento es del 25%");
                break;
            case "PLATA":
                System.out.println("El descuento es del 15%");
                break;
            case "BRONCE":
                System.out.println("El descuento es del 10%");
                break;
            case "PLATINO":
                System.out.println("El descuento es del 40%");
                break;
            default:
                System.out.println("Código promocional no válido");
                break;
        }
    }
}
