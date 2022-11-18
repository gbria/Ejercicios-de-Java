package project.hospital.model;

public class Appointment {
    private int id;
    private String date;
    private String time;
    private Patient patient;
    private Doctor doctor;
    private Nurse nurse;
    private int docOffice;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Appointment() {
        this.date = "";
        this.time = "";
        this.patient = new Patient();
        this.doctor = new Doctor();
        this.nurse = new Nurse();
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

    @Override
    public String toString() {
        return "id: " + id + ", data:" + date + ", hora: " + time + ", dni pacient: " + patient + ", dni doctor: "
                + doctor + ", dni infermer:" + nurse + ", consulta: " + docOffice;
    }
}
