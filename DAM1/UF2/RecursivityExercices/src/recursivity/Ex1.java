package recursivity;

import java.io.*;
import java.util.Scanner;

public class Ex1 {

    //Creamos la constante que tiene el path: files\
    //static final String FOLDER_PATH_FILES = "files" + File.separator;
    //static final String FOLDER_PATH_RESULTS = "results" + File.separator;
    static final String FILENAME = "integers.txt";
    static String pathFolderFiles = "files" + File.separator;
    static String pathFolderResults = "results" + File.separator;

    public static void main(String[] args) {
        String pathFolderFiles = "files" + File.separator;
        String pathFolderResults = "results" + File.separator;
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduzca la cantidad de números que de aparecer: ");
        int num = sc.nextInt();

        //Guardamos la secuencia
        int secuencia = numerosRecursivos(num);

        //Guardamos el contenido
        String texto = mostrarNumero(secuencia, num);

        //Escribimos el contenido
        escribirArchivo(texto, pathFolderFiles);

        //Leemos el contenido
        leerArchivo();

        //Sumamos los números
        String suma = sumarNumero(secuencia, num);
        System.out.println(suma);

        //Escribimos la suma en el nuevo archivo
        escribirArchivo(suma, pathFolderResults);


    }

    private static String sumarNumero(int secuencia, int num) {
        int sumaNumero = 0;
        String sumaTexto;

        //Sumamos toda la secuencia de números
        while (secuencia <= num) {
            sumaNumero += secuencia;
            secuencia++;
        }

        sumaTexto = String.valueOf(sumaNumero);

        return sumaTexto;
    }

    private static String mostrarNumero(int secuencia, int num) {
        String str = "";

        while (secuencia <= num) {
            str += secuencia + "\n";
            secuencia++;
        }

        return str;
    }

    private static void escribirArchivo(String texto, String path) {
        File folder = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;


        //Si folder no existe creala
        if (!folder.exists()) {
            folder.mkdirs();
        }

        try {
            fileWriter = new FileWriter(path + FILENAME);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);

            //No hace falta crear un bucle
            printWriter.println(texto);

            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int numerosRecursivos(int num) {
        //caso base si el número es igual a 1
        if (num == 1) {
            //System.out.println(num);
            return 1;
        }
        //Ves restando números de uno en uno
        //System.out.println(num);
        return numerosRecursivos(num - 1);
    }

    private static void leerArchivo() {
        //Variable lectura, buffer y línea
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line;

        try {

            fileReader = new FileReader(pathFolderFiles + FILENAME);
            bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();

            while (line != null) {
                //System.out.println(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            System.err.println("No se ha encontrado el archivo " + e);
        } catch (IOException e) {
            System.err.println("Error de lectura " + e);
        }

    }

    private static void crearArchivo() {
        //Creamos la variable folder e indicamos su ruta;
        File folder = new File(pathFolderFiles);

        //Creamos la variable file e indicamos la ruta
        File file = new File(pathFolderFiles + "integers.txt");

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
