package Objetivo7;

public class O7_Ej7 {
    public static void main(String[] args) {
        int i = 0, j = 0;

        while (i < 3) {

            while (j < 5) {
                System.out.println("ItemI: " + i + " ItemJ: " + j);
                j++;
            }
            j = 0;
            i++;
        }
    }
}
