package Proyecto3;

public class Libro {
    private String Titulo;
    private String ISBN;
    private Autor AutorLibro;

    public Libro(String titulo, String isbn) {
        Titulo = titulo;
        ISBN = isbn;
    }

    //Añadir autor del libro
    public void AddAutor(Autor autor) {
        AutorLibro = autor;
    }

    //Mostrar la información del libro
    public void MostrarLibro() {
        System.out.println("## Libro ##");
        System.out.println("Título: " + Titulo);
        System.out.println("ISBN: " + ISBN);
        AutorLibro.MostrarAutor();
        System.out.println("###########");
    }

    //Obtener el título del libro
    public String GetTitulo() {
        return Titulo;
    }

}
