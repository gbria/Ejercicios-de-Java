package ejercicio1;

public class Cuenta {
    private String titular;
    private double cantidad;

    //Constructor obligando a indicar titular
    public Cuenta(String titular) {
        this(titular, 0);
    }

    //Constructor parametrizado
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) this.cantidad += cantidad;
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad > 0) this.cantidad -= cantidad;
        else System.out.println("No tienen tanta cantidad");
    }

    @Override
    public String toString() {
        return "La cuenta de " + titular + " contiene un total de " + cantidad + "€ en su cuenta";
    }
}
