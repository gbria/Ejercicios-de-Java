package com.hospital;

public class Doctor extends Person {
    private String timeTable;
    private String speciality;
    private int extraHour;

    public Doctor() {
        super();
        this.timeTable = "";
        this.speciality = "";
        this.extraHour = 0;
    }

    public Doctor(String dni, String firstName, String lastName, String email, int phone, String timeTable, String speciality, int extraHour) {
        super(dni, firstName, lastName, email, phone);
        this.timeTable = timeTable;
        this.speciality = speciality;
        this.extraHour = extraHour;
    }

    public String getTimetable() {
        return timeTable;
    }

    public void setTimetable(String timeTable) {
        this.timeTable = timeTable;
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
        return super.toString();

    }
}
