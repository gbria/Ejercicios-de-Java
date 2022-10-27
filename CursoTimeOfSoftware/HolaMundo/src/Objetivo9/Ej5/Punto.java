package Objetivo9.Ej5;

import java.util.Random;

public class Punto {
    private int X;
    private int Y;

    public Punto() {
        X = 0;
        Y = 0;
    }

    public Punto(int x, int y){
        X=x;
        Y=y;
    }

    public void SetX(int x){
        X=x;
    }

    public void SetY(int y){
        Y=y;
    }

    public int GetX(){
        return X;
    }

    public int GetY(){
        return Y;
    }

    public void MostrarPunto(){
        System.out.println(String.format("El punto es(%s,%s)",X,Y));
    }
}
