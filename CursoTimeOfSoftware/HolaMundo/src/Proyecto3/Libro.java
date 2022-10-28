package Proyecto3;

import java.util.Map;

public class Libro {
    //Atributos Libro
    private String Titulo;
    private String ISBN;
    private Autor AutorLibro;

    //Constructor parametrizado
    public Libro (String titulo, String isbn){
        Titulo = titulo;
        ISBN = isbn;

    }
    //Método AñadirAutor
    public void AddAutor(Autor autor){
        AutorLibro = autor;
    }
    //Método ObtenerTitulo
    public String GetTitulo(){
        return Titulo;
    }
    //Método MostrarLibro
    public void MostrarLibro(){
        System.out.println("--- Libro ---");
        System.out.println("Título: " + Titulo);
        System.out.println("ISBN: " + ISBN);
        AutorLibro.MostrarAutor();
        System.out.println("-------------");
    }
}
