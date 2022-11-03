package ProyectoFinal;

import java.awt.*;
import java.util.Date;

public class Persona {
    //Atributos de Persona
    private String Nombre;
    private String Apellidos;
    private String FechaNacimiento;

    //Constructor parametrizado de Persona
    public Persona(String nombre, String apellidos, String fechaNacimiento) {
        Nombre = nombre;
        Apellidos = apellidos;
        FechaNacimiento = fechaNacimiento;
    }

    public Persona() {

    }

    //Método que devuelve la información del Nombre
    public String GetNombre() {
        return Nombre;
    }

    //Método que devuelve la información de los Apellidos
    public String GetApellidos() {
        return Apellidos;
    }

    //Método que devuelve la información de la FechaNacimiento
    public String GetFechaNacimiento(){
        return FechaNacimiento;
    }

    //Método que modifica el valor del atributo Nombre
    public void SetNombre(String nombre){
        Nombre = nombre;
    }

    //Método que modifica el valor del atributo Apellidos
    public void SetApellidos(String apellidos){
        Apellidos = apellidos;
    }

    //Método que modifica el valor del atributo FechaNacimiento
    public void SetFechaNacimiento(String fechaNacimiento){
        FechaNacimiento = fechaNacimiento;
    }


}
