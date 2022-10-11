package org.example;

public class Empleado {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    //Constructor por defecto
    public Empleado() {
        //this("","",0,0); Es otra forma de escribirlo
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.salario = 0;
    }

    //Constructor parametrizado
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    /**
     * //Suma un plus al salario si el empleado tiene más de 40 años
     * public boolean plus(double sueldoPlus) {
     * boolean aumento = false;
     * <p>
     * if (edad > 40) {
     * salario += sueldoPlus;
     * aumento = true;
     * }
     * <p>
     * return aumento;
     * }
     */

    //Comprueba que el nombre no este vacío
    private boolean compruebaNombre() {
        if (nombre.equals("")) {
            return false;
        }
        return true;
    }

    public boolean plus(double sueldoPlus) {
        boolean aumento = false;

        if (edad > 40 && compruebaNombre()) {
            salario = salario + sueldoPlus;
            aumento = true;
        }

        return aumento;
    }

    public boolean plus(double sueldoPlus, double retencion){
        boolean aumento = false;

        if(edad>40  && compruebaNombre()){
            salario = salario + sueldoPlus - (sueldoPlus * retencion);
            aumento = true;
        }

        return aumento;
    }


}
