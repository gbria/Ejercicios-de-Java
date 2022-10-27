package Objetivo9.Ej5;

public class O9_Ej5 {
    public static void main(String[] args) {
        Punto p1 = new Punto();
        p1.MostrarPunto();
        p1.SetX(9);
        p1.SetY(4);
        System.out.println("El valor de X es de: " + p1.GetX());
        System.out.println("El valor de Y es de: " + p1.GetY());
    }
}
