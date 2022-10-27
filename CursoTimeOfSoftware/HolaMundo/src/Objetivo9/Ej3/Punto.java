package Objetivo9.Ej3;

public class Punto {
    //Atributos encapsulados de forma privada
    private int X;
    private int Y;
    //Constructor por defecto
    public Punto(){
        X=0;
        Y=0;
    }
    //Constructor parametrizado
    public Punto(int x, int y){
        X=x;
        Y=y;
    }
    //Setters para modificar el valor del atributo
    public void SetX(int x){
        X=x;
    }
    public void SetY(int y){
        Y=y;
    }
    //Método para mostrar la x y la y
    public void MostrarPunto(){
        System.out.println(String.format("El punto es(%s,%s)",X,Y));
    }

}
