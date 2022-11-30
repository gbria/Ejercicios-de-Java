package arrays;

import java.util.Scanner;

public class Exercici5 {
    /**
     * Creeu un programa que llegeixi l’altura d’N persones (expressada en metres) i en calculi la mitjana. Un
     * cop fet això, el programa també calcularà quantes persones són més altes que la mitjana i quantes en són
     * més baixes, mostrant tota aquesta informació per pantalla.
     * <p>
     * La capacitat de l’array, el nombre N, el demanareu a l’usuari i, a més a més, en gestionareu, ja que només
     * pot ser un valor positiu major a 0.
     */
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        int capacity = 0;
        double altura = 0, avg = 0;
        boolean checkCapacity = false;

        //Cantidad de personas y comprobación mediante bool
        while (checkCapacity == false) {
            System.out.print("Introduzca número de personas: ");
            capacity = sc.nextInt();
            if (capacity > 0) {
                checkCapacity = true;
            }
        }

        //Introducción de la capacidad en el array
        double[] persons = new double[capacity];

        //Introducción de las alturas de las personas en double
        for (int i = 0; i < capacity; i++) {
            System.out.print("Introduzca altura de la persona " + i + ": ");
            altura = sc.nextDouble();
            persons[i] = altura;
            avg += persons[i];
        }
        System.out.println("media: " + avg / capacity);


        //Mostramos las alturas mediante for each
        for (int i = 0; i < capacity; i++) {
            if (persons[i] < avg / capacity) {
                System.out.println("Bajos: " + persons[i]);
            }
        }

        for (int i = 0; i < capacity; i++) {
            if (persons[i] > avg / capacity) {
                System.out.println("Altos: " + persons[i]);
            }
        }


    }
}
