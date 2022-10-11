package org.example;

public class EmpleadoApp {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("German","Bria", 41,1000);
        Empleado empleado2 = new Empleado();

        System.out.println(empleado1.toString());
        System.out.println(empleado2);

        System.out.println(empleado1.plus(30));
        System.out.println(empleado1.plus(30, 0.15));
    }
}