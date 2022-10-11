package project.hospital.model;

public class Pacient extends Persona {
    private int edat;
    private String sexe;
    private String tipusSang;
    private String alergia;
    private String malaltia;
    private String prova;
    private String recepta;
    private String opera;

    public Pacient() {
        this.edat = 0;
        this.sexe = "";
        this.tipusSang = "";
        this.alergia = "";
        this.malaltia = "";
        this.prova = "";
        this.recepta = "";
        this.opera = "";

    }

    public Pacient(String nif, String nom, String cognom, String correu, int telefon, int edat,
                   String sexe, String tipusSang, String alergia, String malaltia, String prova, String recepta, String opera) {
        super(nif, nom, cognom, correu, telefon);
        this.edat = edat;
        this.sexe = sexe;
        this.tipusSang = tipusSang;
        this.alergia = alergia;
        this.malaltia = malaltia;
        this.prova = prova;
        this.recepta = recepta;
        this.opera = opera;

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

    public String getMalaltia() {
        return malaltia;
    }

    public void setMalaltia(String malaltia) {
        this.malaltia = malaltia;
    }

    public String getProva() {
        return prova;
    }

    public void setProva(String prova) {
        this.prova = prova;
    }

    public String getRecepta() {
        return recepta;
    }

    public void setRecepta(String recepta) {
        this.recepta = recepta;
    }

    public String getOpera() {
        return opera;
    }

    public void setOpera(String opera) {
        this.opera = opera;
    }

    @Override
    public String toString() {
        return super.toString() +
                "edat=" + edat +
                ", sexe='" + sexe + '\'' +
                ", tipusSang='" + tipusSang + '\'' +
                ", alergia='" + alergia + '\'' +
                ", malaltia='" + malaltia + '\'' +
                ", prova='" + prova + '\'' +
                ", recepta='" + recepta + '\'' +
                '}';
    }
}
