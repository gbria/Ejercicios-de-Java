package Objetivo9.Ej6;

public class O9_Ej6 {
    public static void main(String[] args) {
        Punto p1 = new Punto(3, 4);
        Punto p2 = new Punto(6, 8);
        Punto p3 = new Punto(9,2);
        Triangulo triangulo = new Triangulo(p1, p2, p3);
        triangulo.MostrarTriangulo();
    }
}
