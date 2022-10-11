package project.hospital.model;

public class Pacient extends Persona {
    private int edat;
    private String sexe;
    private String tipusSang;
    private Historial historial;
    private String alergia;

    public Pacient() {
        this.edat = 0;
        this.sexe = "";
        this.tipusSang = "";
        this.historial = new Historial();
        this.alergia = "";
    }

    public Pacient(String nif, String nom, String cognom, String correu, int telefon, int edat, String sexe, String tipusSang, Historial historial, String alergia) {
        super(nif, nom, cognom, correu, telefon);
        this.edat = edat;
        this.sexe = sexe;
        this.tipusSang = tipusSang;
        this.historial = historial;
        this.alergia = alergia;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getTipusSang() {
        return tipusSang;
    }

    public void setTipusSang(String tipusSang) {
        this.tipusSang = tipusSang;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    @Override
    public String toString() {
        return super.toString() +
                "edat=" + edat +
                ", sexe='" + sexe + '\'' +
                ", tipusSang='" + tipusSang + '\'' +
                ", historial=" + historial +
                ", alergia='" + alergia + '\'' +
                '}';
    }
}
