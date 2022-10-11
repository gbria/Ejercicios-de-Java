package project.hospital.model;

public class Historial {
    private String malaltia;
    private String data;
    private String proves;

    public Historial() {
        this.malaltia = "";
        this.data = "";
        this.proves = "";
    }

    public Historial(String malaltia, String data, String proves) {
        this.malaltia = malaltia;
        this.data = data;
        this.proves = proves;
    }

    public String getMalaltia() {
        return malaltia;
    }

    public void setMalaltia(String malaltia) {
        this.malaltia = malaltia;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProves() {
        return proves;
    }

    public void setProves(String proves) {
        this.proves = proves;
    }

    @Override
    public String toString() {
        return "Historial{" +
                "malaltia='" + malaltia + '\'' +
                ", data='" + data + '\'' +
                ", proves='" + proves + '\'' +
                '}';
    }
}
