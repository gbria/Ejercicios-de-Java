package ProyectoFinal;

public class Direccion extends Persona{
    //Atributos de Direccion
    private String Calle;
    private String Piso;
    private String Ciudad;
    private int CodigoPostal;

    //Constructor parametrizado
    public Direccion(String calle, String piso, String ciudad, int codigoPostal) {
        super();
        Calle = calle;
        Piso = piso;
        Ciudad = ciudad;
        CodigoPostal = codigoPostal;
    }

    //Método que devuelve la información de la Calle
    public String GetCalle() {
        return Calle;
    }

    //Método que devuelve la información del Piso
    public String GetPiso() {
        return Piso;
    }

    //Método que devuelve la información de la Ciudad
    public String GetCiudad() {
        return Ciudad;
    }

    //Método que devuelve la información CodigoPostal
    public int GetCodigoPostal() {
        return CodigoPostal;
    }

    //Método que modifica el valor del atributo Calle
    public void SetCalle(String calle) {
        Calle = calle;
    }

    //Método que modifica el valor del atributo Piso
    public  void SetPiso(String piso){
        Piso = piso;
    }

    //Método que modifica el valor del atributo Ciudad
    public void SetCiudad(String ciudad){
        Ciudad = ciudad;
    }

    //Método que modifica el valor del atributo CodigoPostal
    public void SetCodigoPostal(int codigoPostal){
        CodigoPostal = codigoPostal;
    }


}
