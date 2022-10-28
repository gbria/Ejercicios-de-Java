package Proyecto3;


public class Main {
    //Método MostrarMenu
    static void MostrarMenu() {
        System.out.println("## MENÚ ##");
        System.out.println("0.- Salir");
        System.out.println("1.- Añadir libro a la biblioteca");
        System.out.println("2.- Mostrar la biblioteca");
        System.out.println("3.- Borrar libro de la biblioteca");
        System.out.println("4.- Mostrar el número de libros de la biblioteca");
        System.out.print("Opción: ");
    }

    static Biblioteca AddLibroBiblioteca(Biblioteca biblioteca) {
        String titulo, isbn, nombreAutor, apellidosAutor;
        System.out.print("Introduzca título del libro: ");
        titulo = System.console().readLine();
        System.out.print("Introduzca ISBN del libro: ");
        isbn = System.console().readLine();
        System.out.print("Introduzca nombre del autor/a: ");
        nombreAutor = System.console().readLine();
        System.out.print("Introduzca apellidos del autor/a: ");
        apellidosAutor = System.console().readLine();

        Autor autor = new Autor(nombreAutor, apellidosAutor);
        Libro libro = new Libro(titulo, isbn);
        libro.AddAutor(autor);
        biblioteca.AddLibroBiblioteca(libro);
        return biblioteca;
    }

    static Biblioteca BorrarLibroBiblioteca(Biblioteca biblioteca) {
        System.out.print("Introduzca el título del libro a borrar: ");
        biblioteca.RemoveLibroBiblioteca(System.console().readLine());
        return biblioteca;
    }

    //main menu
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        int option;
        boolean exit = false;

        while (!exit) {
            MostrarMenu();
            option = Integer.parseInt(System.console().readLine());

            switch (option) {
                case 0:
                    System.out.println("Fin del programa");
                    exit = true;
                    break;
                case 1:
                    AddLibroBiblioteca(biblioteca);
                    break;
                case 2:
                    biblioteca.MostrarBiblioteca();
                    break;
                case 3:
                    BorrarLibroBiblioteca(biblioteca);
                    break;
                case 4:
                    System.out.println("Número de libros: " + biblioteca.NumeroLibrosBiblioteca());
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
}
