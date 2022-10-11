import javax.swing.*;
import java.util.Scanner;

public class Ejercicio4 {
    /**
     * Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
     * (recuerda usar JOptionPane).
     */
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");

        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
    }
}
