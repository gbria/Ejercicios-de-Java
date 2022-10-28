package Objetivo10.Ej1;

public class O10_Ej1 {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        lavadora.SetRPM(1200);
        lavadora.SetKilos(7);
        lavadora.SetTension(220);
        lavadora.Encender();
        lavadora.Mostrar();
    }
}
