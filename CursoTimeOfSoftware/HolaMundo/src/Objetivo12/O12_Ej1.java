package Objetivo12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class O12_Ej1 {
    public static void main(String[] args) {
        String ruta = "./prueba.txt";
        String linea;
        BufferedReader reader = null;
        try {
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
