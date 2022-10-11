import java.util.Scanner;

public class Ejercicio17 {
    /**
     * Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no.
     * Usa un switch para ello.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Días de la semana laborables");
        System.out.println("Introduzca el número de la semana a consultar");
        System.out.println("\t1- Lunes");
        System.out.println("\t2- Martes");
        System.out.println("\t3- Miércoles");
        System.out.println("\t4- Jueves");
        System.out.println("\t5- Viernes");
        System.out.println("\t6- Sábado");
        System.out.println("\t7- Domingo");
        System.out.print("Número: ");
        int dia = sc.nextInt();


        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Día Laboral");
                break;
            case 6:
            case 7:
                System.out.println("Día no laboral");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
