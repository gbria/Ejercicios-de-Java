package Objetivo6;

public class O6_Ej5 {
    public static void main(String[] args) {
        System.out.println("Códigos promocionales: ORO, PLATA, BRONCE o PLATINO");
        System.out.print("Introduzca su código promocional para saber su descuento: ");
        String codigo = System.console().readLine();

        if (codigo.equals("ORO")) {
            System.out.println("El descuento es del 25%");
        } else {
            if (codigo.equals("PLATA")) {
                System.out.println("El descuento es del 20%");
            } else {
                if (codigo.equals("BRONCE")) {
                    System.out.println("El descuento es del 15%");
                } else {
                    if (codigo.equals("PLATINO")) {
                        System.out.println("El descuento es del 40%");
                    }
                }
            }
        }
    }
}
