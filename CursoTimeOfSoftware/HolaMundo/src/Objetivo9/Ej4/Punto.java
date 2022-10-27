package Objetivo9.Ej4;

public class Punto {
    //Atributos encapsulados de forma pública
    public int X;
    public int Y;
    //Constructor por defecto
    public Punto(){
        X=0;
        Y=0;
    }
    //Método para mostrar x e y
    public void MostrarPunto(){
        System.out.println(String.format("El punto es(%s,%s)",X,Y));
    }
}
