package project.hospital.model;

public class Doctor extends Person {
    private String timetable;
    private String speciality;
    private int extraHour;

    public Doctor() {
        super();
        this.timetable = "";
        this.speciality = "";
        this.extraHour = 0;
    }

    public Doctor(String dni, String firstName, String lastName, String email, int phone, String timetable, String speciality, int extraHour) {
        super(dni, firstName, lastName, email, phone);
        this.timetable = timetable;
        this.speciality = speciality;
        this.extraHour = extraHour;
    }

    public String getTimetable() {
        return timetable;
    }

    public void setTimetable(String timetable) {
        this.timetable = timetable;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getExtraHour() {
        return extraHour;
    }

    public void setExtraHour(int extraHour) {
        this.extraHour = extraHour;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Jornada: " + timetable + ", Especialitat: " + speciality + ", Hores Extres: " + extraHour + "\n";
    }
}
