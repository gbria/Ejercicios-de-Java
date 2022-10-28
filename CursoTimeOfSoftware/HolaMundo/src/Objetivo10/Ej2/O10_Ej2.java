package Objetivo10.Ej2;

import Objetivo10.Ej1.Lavadora;

public class O10_Ej2 {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        lavadora.SetRPM(1200);
        lavadora.SetKilos(7);
        lavadora.SetTension(220);
        lavadora.Encender();

        Microondas microondas = new Microondas();
        microondas.SetGrill(true);
        microondas.SetPotenciaMaxima(800);
        microondas.SetTension(220);
        microondas.Apagar();
        lavadora.Mostrar();
        microondas.Mostrar();
    }
}
