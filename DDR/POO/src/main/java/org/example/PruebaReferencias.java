package org.example;

//Referencias en Java
public class PruebaReferencias {
    public static void main(String[] args) {

        //Definimos un array con 10 posiciones
        int array1[] = new int[10];
        array1[0] = 3;

        //El array no está creado, con null indicamos que no apunta nada
        int array2[] = null;


        //Copiamos la referencia, array1 y array2 apuntan al mismo lugar
        array2 = array1;

        /**
         //Creamos una nueva referencia, array apunta a un array diferente, no al que
         hemos creado al principio

         array1 = new int[20];


         //array2 es el único que apunta al primer array creado, podemos acceder a su contenido

         System.out.println("El primer valor del array2 es " + array2[0]);

         //Ahora array1 tiene el valor del nuevo array creado con 20 posiciones

         System.out.println("El primer valor del array1 es " + array1[0]);
         */

        //Comparamos referencias
        if (array1 == array2) {
            System.out.println("Los arrays apuntan en la misma dirección");
        }

        //Creamos un nueva referencia para el array1
        array1 = new int[20];

        if (array1 != array2) {
            System.out.println("Los arrays apuntan en distintas direcciones");
        }


    }
}
