package Proyecto3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    //Atributo Biblioteca
    private List<Libro> LibrosBiblioteca;

    //Constructor parametrizado
    public Biblioteca() {
        LibrosBiblioteca = new ArrayList<>();
    }

    //Función que devuelve el número de libros
    public int NumeroLibros() {
        return LibrosBiblioteca.size();
    }

    //Método para añadir libros
    public void AddLibro(Libro libro) {
        LibrosBiblioteca.add(libro);
    }

    //Eliminar libro por el título
    public void BorraLibro(String titulo) {
        Boolean encontrado = false;
        int posicionABorrar = -1;
        for (Libro libro: LibrosBiblioteca) {
            posicionABorrar++;
            if (libro.GetTitulo().equals(titulo)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            LibrosBiblioteca.remove(posicionABorrar);
            System.out.println("Libro borrado correctamente");
        }else {
            System.out.println("Libro no encontrado");
        }
    }
    //Mostrar los libros de la Biblioteca
    public void MostrarBiblioteca(){
        System.out.println("***** BIBLIOTECA *****");
        for (Libro libro : LibrosBiblioteca) {
            libro.MostrarLibro();
            System.out.println("**********************");
        }
    }
}
