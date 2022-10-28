package Objetivo12;

import java.io.*;

public class O12_Ej3 {
    public static void main(String[] args) {
        String ruta = "nuevo.txt";
        String linea = null;
        File fichero = new File(ruta);
        if (fichero.exists()) {
            System.out.println("ERROR: el fichero " + ruta + " ya existe");
        } else {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(ruta));
                for (int i = 0; i < 10; i++) {
                    writer.write("Fila números " + i + "\n");
                }
                writer.close();
                System.out.println("Fichero creado y escritura completada");
                System.out.println("-- Lectura del fichero --");
                BufferedReader reader = null;
                reader = new BufferedReader(new FileReader(ruta))
            } catch (IOException e) {

            }
        }


    }
}
