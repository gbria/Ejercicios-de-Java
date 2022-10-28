package Objetivo9.Ej6;

public class Punto {
    //Atributos de Punto
    int X;
    int Y;
    //Constructor parametrizado
    public Punto(int x, int y){
        X=x;
        Y=y;
    }
    //Método MostrarPunto
    public void MostrarPunto(){
        System.out.println(String.format("El punto es (%s,%s)",X,Y));
    }
}
