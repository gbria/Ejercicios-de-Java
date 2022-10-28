package Proyecto3;

public class Autor {
    private String Nombre;
    private String Apellidos;

    public Autor(String nombre, String apellidos) {
        Nombre = nombre;
        Apellidos = apellidos;
    }

    public void MostrarAutor() {
        System.out.println(String.format("Autor: %s %s", Nombre, Apellidos));
    }
}
