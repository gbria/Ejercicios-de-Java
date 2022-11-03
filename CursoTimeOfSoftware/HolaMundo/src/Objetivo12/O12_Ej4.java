package Objetivo12;

import java.io.*;

public class O12_Ej4 {
    public static void main(String[] args) {
        String ruta = "nuevo.txt";
        String linea = null;
        //Creamos el fichero en la ruta
        File fichero = new File(ruta);
        if (!fichero.exists()) {
            System.out.println("ERROR: El fichero " + ruta + "no existe");
        } else {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(ruta, true));
                for (int i = 10; i < 13; i++) {
                    writer.write("Fila número" + i + "\n");
                }
                writer.close();
                System.out.println("INFO: Fichero actualizado");

                //Inicio de la lectura del fichero actualizado
                System.out.println("-- Lectura del fichero --");
                BufferedReader reader = null;
                reader = new BufferedReader(new FileReader(ruta));
                linea = reader.readLine();
                while (linea != null) {
                    System.out.println(linea);
                    linea = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}
