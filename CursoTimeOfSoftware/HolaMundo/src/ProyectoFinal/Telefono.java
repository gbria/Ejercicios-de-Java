package ProyectoFinal;

public class Telefono extends Persona{
    //Atributos Telefono
    private int TelefonoFijo;
    private int TelefonoMovil;
    private int TelefonoTrabajo;

    public Telefono(String nombre, String apellidos, String fechaNacimiento) {
        super(nombre, apellidos, fechaNacimiento);
    }

    //Método que devuelve la información del TelefonoFijo
    public int GetTelefonoFijo() {
        return TelefonoFijo;
    }

    //Método que devuelve la información del TelefonoMovil
    public int GetTelefonoMovil() {
        return TelefonoMovil;
    }

    //Método que devuelve la información del TelefonoTrabajo
    public int GetTelefonoTrabajo() {
        return TelefonoTrabajo;
    }

    //Método que modifica el valor del atributo TelefonoFijo
    public void SetTelefonoFijo(int telefonoFijo) {
        TelefonoFijo = telefonoFijo;
    }

    //Método que modifica el valor del atributo TelefonoMovil
    public void SetTelefonoMovil(int telefonoMovil){
        TelefonoMovil = telefonoMovil;
    }

    //Metodo que modifica el valor del atributo TelefonoTrabajo
    public void SetTelefonoTrabajo(int telefonoTrabajo){
        TelefonoTrabajo = telefonoTrabajo;
    }



}
