package project.hospital.model;

public class Infermer extends Persona {
    private String horari;

    public Infermer() {
        this.horari = "";
    }

    public Infermer(String nif, String nom, String cognom, String correu, int telefon, String horari) {
        super(nif, nom, cognom, correu, telefon);
        this.horari = horari;
    }

    public String getHorari() {
        return horari;
    }

    public void setHorari(String horari) {
        this.horari = horari;
    }

    @Override
    public String toString() {
        return super.toString() +
                "horari='" + horari + '\'' +
                '}';
    }
}
