import javax.swing.*;
import java.text.DecimalFormat;

public class Ejercicio5 {
    /**
     * Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
     * (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
     */
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        String datos = JOptionPane.showInputDialog("Calcular el área del una circunferencia \n\nIntroduce el radio");
        double radio = Double.parseDouble(datos);

        double area = Math.PI * (Math.pow(radio, 2));

        JOptionPane.showMessageDialog(null, "El area es " + df.format(area));

    }
}





