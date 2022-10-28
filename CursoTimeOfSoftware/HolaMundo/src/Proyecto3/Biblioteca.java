package Proyecto3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> LibrosBiblioteca;

    public Biblioteca() {
        LibrosBiblioteca = new ArrayList<Libro>();
    }

    //Devuelve el número de libros de la biblioteca
    public int NumeroLibrosBiblioteca() {
        return LibrosBiblioteca.size();
    }

    //Añadir libro en la biblioteca
    public void AddLibroBiblioteca(Libro libro) {
        LibrosBiblioteca.add(libro);
    }

    //Borrar un libro de la biblioteca a partir del título
    public void RemoveLibroBiblioteca(String titulo) {
        boolean encontrado = false;
        int posicioLibro = -1;

        for (Libro libro : LibrosBiblioteca) {
            posicioLibro++;
            if (libro.GetTitulo().equals(titulo)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            LibrosBiblioteca.remove(posicioLibro);
            System.out.println("El libro " + "\"" + titulo + "\"" + " ha sido borrado de la biblioteca");
        } else {
            System.out.println("El libro no se ha encontrado");
        }

    }

    //Mostrar todos los libros de la biblioteca
    public void MostrarBiblioteca() {
        System.out.println("## Biblioteca ##");
        for (Libro libro : LibrosBiblioteca) {
            libro.MostrarLibro();
        }
    }
}
