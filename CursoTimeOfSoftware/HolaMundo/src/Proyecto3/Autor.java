package Proyecto3;

public class Autor {
    //Atributos Autor
    private String Nombre;
    private String Apellidos;
    //Constructor parametrizado
    public Autor(String nombre, String apellidos){
        Nombre = nombre;
        Apellidos = apellidos;
    }
    //Método MostrarAutor
    public void MostrarAutor(){
        System.out.println(String.format("Autor: %s %s ",Nombre,Apellidos));
    }
}
