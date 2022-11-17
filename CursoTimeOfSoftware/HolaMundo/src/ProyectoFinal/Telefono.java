package ProyectoFinal;

public class Telefono extends Persona{
    //Atributos Telefono
    private String TelefonoFijo;
    private String TelefonoMovil;
    private String TelefonoTrabajo;

    public String getTelefonoFijo() {
        return TelefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        TelefonoFijo = telefonoFijo;
    }

    public String getTelefonoMovil() {
        return TelefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        TelefonoMovil = telefonoMovil;
    }

    public String getTelefonoTrabajo() {
        return TelefonoTrabajo;
    }

    public void setTelefonoTrabajo(String telefonoTrabajo) {
        TelefonoTrabajo = telefonoTrabajo;
    }
}
