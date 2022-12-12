package com.hospital;

public class Patient extends Person {
    private String dateBirth;
    private String gender;
    private String bloodType;
    private String allergy;
    private String medicalIllness;
    private String medicalTest;
    private String prescription;
    private String surgicalOp;

    public Patient() {
        this.dateBirth = null;
        this.gender = "";
        this.bloodType = "";
        this.allergy = "";
        this.medicalIllness = "";
        this.medicalTest = "";
        this.prescription = "";
        this.surgicalOp = "";
    }

    public Patient(String dni, String firstName, String lastName, String email, int phone, String dateBirth, String gender, String bloodType, String allergy, String medicalIllness, String medicalTest, String prescription, String surgicalOp) {
        super(dni, firstName, lastName, email, phone);
        this.dateBirth = dateBirth;
        this.gender = gender;
        this.bloodType = bloodType;
        this.allergy = allergy;
        this.medicalIllness = medicalIllness;
        this.medicalTest = medicalTest;
        this.prescription = prescription;
        this.surgicalOp = surgicalOp;
    }


    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getMedicalIllness() {
        return medicalIllness;
    }

    public void setMedicalIllness(String medicalIllness) {
        this.medicalIllness = medicalIllness;
    }

    public String getMedicalTest() {
        return medicalTest;
    }

    public void setMedicalTest(String medicalTest) {
        this.medicalTest = medicalTest;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getSurgicalOp() {
        return surgicalOp;
    }

    public void setSurgicalOp(String surgicalOp) {
        this.surgicalOp = surgicalOp;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}