package Objetivo9.Ej6;

public class Triangulo {
    //Atributos Triangulo dados de la Clase Punto
    Punto P1;
    Punto P2;
    Punto P3;
    //Constructor parametrizado
    public Triangulo(Punto p1, Punto p2, Punto p3){
        P1 = p1;
        P2 = p2;
        P3 = p3;
    }
    //Método Mostrar Triangulo
    public void MostrarTriangulo(){
        System.out.println("Triangulo compuesto por los siguientes puntos: ");
        P1.MostrarPunto();
        P2.MostrarPunto();
        P3.MostrarPunto();
    }
}
