package project.hospital.model;

public class Metge extends Persona {
    private String horari;
    private String especialitat;
    private int horesExtres;

    public Metge() {
        super();
        this.horari = "";
        this.especialitat = "";
        this.horesExtres = 0;
    }

    public Metge(String nif, String nom, String cognom, String correu, int telefon, String horari, String especialitat, int horesExtres) {
        super(nif, nom, cognom, correu, telefon);
        this.horari = horari;
        this.especialitat = especialitat;
        this.horesExtres = horesExtres;
    }

    public String getHorari() {
        return horari;
    }

    public void setHorari(String horari) {
        this.horari = horari;
    }

    public String getEspecialitat() {
        return especialitat;
    }

    public void setEspecialitat(String especialitat) {
        this.especialitat = especialitat;
    }

    public int getHoresExtres() {
        return horesExtres;
    }

    public void setHoresExtres(int horesExtres) {
        this.horesExtres = horesExtres;
    }

    @Override
    public String toString() {
        return super.toString() +
                "horari='" + horari + '\'' +
                ", especialitat='" + especialitat + '\'' +
                ", horesExtres=" + horesExtres +
                '}';
    }
}
