package arrays;

import java.util.ArrayList;

public class Exercici4 {
    /**
     * Creeu un programa que generi 20 nombres enters aleatoris (entre el 0 i el 99) i els emmagatzemi en un array.
     * Fet això, el programa ha de crear un nou array que només contingui els nombres primers que hagi trobat
     * entre dins de l’array inicial de 20 números. Per acabar, mostrarà els dos arrays.
     */
    public static void main(String[] args) {
        //Variables
        int count = 0;
        int[] nums = new int[20];

        //Creo un Array, ya que no conozco la capacidad del array. (Tramposillo...)
        ArrayList<Integer> primos = new ArrayList<>();

        //Muestro el array original
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
            System.out.print(nums[i] + " ");
        }

        //Salto de línea
        System.out.println();

        //Revisión de números primos
        //Recorremos el array
        for (int i = 0; i < nums.length; i++) {
            //Guardamos el número para poder dividirlo entre sí
            int divisor = nums[i];

            //Creamos un bucle que va reduciendo el divisor de cada número
            for (int j = divisor; j > 0; j--) {

                //(CHIVATO) System.out.println(nums[i] + "%" + j + " == " + (nums[i] % j));

                //Si el número y el divisor da como residuo 0 significa que es divisble
                //Entramos el 1 como excepción
                if (nums[i] % j == 0 || nums[i] == 1) {

                    //Controlamos cuantas veces es divisible
                    count++;

                    //(CHIVATO) System.out.println(nums[i] + "=" + ((nums[i] % j) + " count: " + count));

                }
            }
            //Si el número puede dividirse únicamente significa que es primo
            if (count == 2) {

                //Añadimos los números dentro de la List primos
                primos.add(nums[i]);

                //(CHIVATO) System.out.println("Primo: " + nums[i]);
            }
            //Reinicia el count
            count = 0;

            //(CHIVATO) System.out.print (primos[i] + " ");
        }

        //Mostramos el array primos
        for (Integer p: primos) {
            System.out.println(p);
        }
    }
}
