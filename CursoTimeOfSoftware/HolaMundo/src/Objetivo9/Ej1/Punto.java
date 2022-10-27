package Objetivo9.Ej1;

public class Punto {
    //Atributos
    int X;
    int Y;

    //Constructor parametrizado
    public Punto(int x, int y){
        X=x;
        Y=y;
    }

    //Método para mostrar la ubicación
    public void MostrarPunto(){
        System.out.println(String.format("El punto es(%s,%s)",X,Y));
    }
}
