package ProyectoFinal;

public class Contacto {
    private Persona persona;
    private Telefono telefono;
    private Direccion direccion;
    private String email;

    public Contacto() {
        persona = new Persona();
        direccion = new Direccion();
        telefono = new Telefono();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void SetNombre(String nombre) {
        persona.setNombre(nombre);
    }

    public void SetApellidos(String apellidos) {
        persona.setApellidos(apellidos);
    }

    public void SetFechaNacimiento(String fechanacimiento) {
        persona.setFechaNacimiento(fechanacimiento);
    }

    public String GetNombre() {
        return persona.getNombre();
    }

    public String GetApellidos() {
        return persona.getApellidos();
    }

    public String GetFechaNacimiento() {
        return persona.getFechaNacimiento();
    }

    public void SetTelefonoMovil(String movil) {
        telefono.setTelefonoMovil(movil);
    }

    public void SetTelefonoFijo(String fijo) {
        telefono.setTelefonoFijo(fijo);
    }

    public void SetTelefonoTrabajo(String trabajo) {
        telefono.setTelefonoTrabajo(trabajo);
    }

    public String GetTelefonoMovil() {
        return telefono.getTelefonoMovil();
    }

    public String GetTelefonoFijo() {
        return telefono.getTelefonoFijo();
    }

    public String GetTelefonoTrabajo() {
        return telefono.getTelefonoTrabajo();
    }

    public void SetCalle(String calle) {
        direccion.setCalle(calle);
    }

    public void SetPiso(String piso) {
        direccion.setPiso(piso);
    }

    public void SetCiudad(String ciudad) {
        direccion.setCiudad(ciudad);
    }

    public void SetCodigoPostal(String codigopostal) {
        direccion.setCodigoPostal(codigopostal);
    }

    public String GetCalle() {
        return direccion.getCalle();
    }

    public String GetPiso() {
        return direccion.getPiso();
    }

    public String GetCiudad() {
        return direccion.getCiudad();
    }

    public String GetCodigoPostal() {
        return direccion.getCodigoPostal();
    }

    public void mostrarContacto(){
        System.out.println("----- Contacto -----");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellidos: " + persona.getApellidos());
        System.out.println("Fecha de nacimiento:" + persona.getFechaNacimiento());
        System.out.println("Teléfono móvil: " + telefono.getTelefonoMovil());
        System.out.println("Teléfono fijo: " + telefono.getTelefonoFijo());
        System.out.println("Teléfono trabajo: " + telefono.getTelefonoTrabajo());
        System.out.println("Calle: " + direccion.getCalle());
        System.out.println("Piso: " + direccion.getPiso());
        System.out.println("Ciudad: " + direccion.getCiudad());
        System.out.println("Código postal: " + direccion.getCodigoPostal());
        System.out.println("Email: " + email);
        System.out.println("--------------------");
    }
}