package project.hospital.model;

public class Appointment extends Person{
    private int id;
    private String date;
    private String time;
    private int docOffice;

    public Appointment() {
        this.date = "";
        this.time = "";
        this.docOffice = 0;
    }

    public Appointment(String date, String time, int docOffice) {
        this.date = date;
        this.time = time;
        this.docOffice = docOffice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getDocOffice() {
        return docOffice;
    }

    public void setDocOffice(int docOffice) {
        this.docOffice = docOffice;
    }


}
