package ejercicio2;

import org.example.Empleado;

public class Persona {

    private final static char SEXO_DEFAULT = 'H';

    private final static int INFRAPESO = -1;
    private final static int PESOIDEAL = 0;
    private final static int SOBREPESO = 1;

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;


    protected Persona(String dni) {
        this.nombre = "";
        this.edad = 0;
        this.sexo = SEXO_DEFAULT;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;

        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        comprobarSexo();
    }

    public int calcularIMC(double peso, double altura) {
        double pesoIdeal = peso / (Math.pow(altura, 2));

        if (pesoIdeal < 20) {
            return INFRAPESO;
        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            return PESOIDEAL;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad(int edad) {
        if (edad < 18) {
            return false;
        }
        return true;
    }

    private void comprobarSexo() {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEFAULT;
        }
    }
}
