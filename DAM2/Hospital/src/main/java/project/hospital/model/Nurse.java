package project.hospital.model;

public class Nurse extends Person {
    private String timeTable;

    public Nurse() {
        this.timeTable = "";
    }

    public Nurse(String dni, String firstName, String lastName, String email, int phone, String timeTable) {
        super(dni, firstName, lastName, email, phone);
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
        return "torn: " + timeTable;
    }
}
