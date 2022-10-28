package Proyecto3;

public class Proyecto3 {
    static void MostrarMenu(){
        System.out.println("* Menú *");
        System.out.println("1.- Añadir libro a la biblioteca");
        System.out.println("2.- Mostrar biblioteca");
        System.out.println("3.- Borrar libro");
        System.out.println("4.- ¿Número de libros?");
        System.out.println("5.- Salir");
        System.out.print("Opción: ");
    }
    static Biblioteca AñadirLibroBiblioteca(Biblioteca biblioteca){
        String titulo, isbn, autorNombre, autoApellidos;
        System.out.println("Introduzca el título del libro: ");
        titulo = System.console().readLine();
        System.out.println("Introduzca el ISBN del libro: ");
        isbn = System.console().readLine();
        System.out.println("Introduzca el nombre del autor del libro: ");
        autorNombre = System.console().readLine();
        System.out.println("Introduzca los apellidos del autor del libro: ");
        autoApellidos = System.console().readLine();

        Autor autor = new Autor(autorNombre, autoApellidos);
        Libro libro = new Libro(titulo, isbn);
        libro.AddAutor(autor);
        biblioteca.AddLibro(libro);
        return biblioteca;

    }
}
