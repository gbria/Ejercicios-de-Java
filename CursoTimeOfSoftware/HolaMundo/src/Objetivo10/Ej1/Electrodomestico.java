package Objetivo10.Ej1;

public class Electrodomestico {
    //Atributo
    boolean Encendido;
    int Tension;

    //Constructor por defecto
    public Electrodomestico() {
        Encendido = false;
        Tension = 220;
    }

    public void Encender() {
        Encendido = true;
    }

    public void Apagar() {
        Encendido = false;
    }

    public boolean EstaEncendido() {
        return Encendido;
    }

    public void SetTension(int tension) {
        Tension = tension;
    }

    public int GetTension() {
        return Tension;
    }


}
