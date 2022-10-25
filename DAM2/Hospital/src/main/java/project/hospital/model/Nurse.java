package project.hospital.model;

public class Nurse extends Person {
    private String timeTable;

    public Nurse() {
        this.timeTable = "";
    }

    public Nurse(String dni, String name, String surname, String email, int phone, String timeTable) {
        super(dni, name, surname, email, phone);
        this.timeTable = timeTable;
    }

    public String getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(String timeTable) {
        this.timeTable = timeTable;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Horari: " + timeTable;
    }
}
