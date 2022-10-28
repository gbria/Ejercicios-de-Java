package Objetivo10.Ej1;

public class Lavadora extends Electrodomestico {
    int RPM;
    int Kilos;

    public Lavadora() {
        RPM = 0;
        Kilos = 0;
    }

    public void SetRPM(int rmp) {
        RPM = rmp;
    }

    public int GetRPM() {
        return RPM;
    }

    public void SetKilos(int kilos) {
        Kilos = kilos;
    }

    public int GetKilos() {
        return Kilos;
    }

    public void Mostrar() {
        System.out.println("--- Lavadora ---");
        System.out.println("RPM: " + RPM);
        System.out.println("Kilos: " + Kilos);
        System.out.println("Tensión: " + GetTension());
        if (EstaEncendido()) {
            System.out.println("¡La lavadora está encendida!");
        } else {
            System.out.println("¡La lavadora está apagada!");
        }
        System.out.println("-----------------");
    }
}
