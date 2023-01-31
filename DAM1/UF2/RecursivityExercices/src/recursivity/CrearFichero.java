package recursivity;

import java.io.File;
import java.io.IOException;

public class CrearFichero {
    //Creamos la constante que tiene el path: files\
    static final String FOLDER_PATH = "files" + File.separator;

    public static void main(String[] args) {

        crearArchivo();


    }

    private static void crearArchivo() {
        //Creamos la variable folder e indicamos su ruta;
        File folder = new File(FOLDER_PATH);

        //Creamos la variable file e indicamos la ruta
        File file = new File(FOLDER_PATH + "integers.txt");

        //Le indicamos a la variable folder que es un directorio y que debe crearse si no existe
        folder.mkdirs();

        //Le indicamos a la variable file que es un archivo
        //Necesita un try/catch por si existen posibles errores
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
