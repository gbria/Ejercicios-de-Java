package project.hospital.model;

public class Appointment extends Person{
    private String date;
    private int time;
    private Patient patient;
    private int docOffice;

    public Appointment() {
        this.date = "";
        this.time = 0;
        this.patient = new Patient();
        this.docOffice = 0;
    }

    public Appointment(String date, int time, Patient patient, int docOffice) {
        this.date = date;
        this.time = time;
        this.patient = patient;
        this.docOffice = docOffice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDocOffice() {
        return docOffice;
    }

    public void setDocOffice(int docOffice) {
        this.docOffice = docOffice;
    }


}
