package Objetivo12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class O12_Ej2 {
    public static void main(String[] args) {
        String ruta = "prueba.txt";
        String linea;
        BufferedReader reader = null;
        File fichero = new File(ruta);
        if(fichero.exists()){
            try {
                System.out.println("INFO: El fichero existe");
                reader = new BufferedReader(new FileReader(ruta));
                linea = reader.readLine();
                while (linea!=null){
                    System.out.println(linea);
                    linea=reader.readLine();
                }
                reader.close();
            }catch (Exception e){
                System.out.println("ERROR: " + e.getMessage());
            }
        }else {
            System.out.println("ERROR: El fichero no existe en la ruta especificada");
        }
    }
}
