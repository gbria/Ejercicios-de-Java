package project.hospital.model;

import java.util.Date;

public class Patient extends Person{
    private Date dateBirth;
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

    public Patient(String dni, String name, String surname, String email, int phone, Date dateBirth, String gender, String bloodType, String allergy, String medicalIllness, String medicalTest, String prescription, String surgicalOp) {
        super(dni, name, surname, email, phone);
        this.dateBirth = dateBirth;
        this.gender = gender;
        this.bloodType = bloodType;
        this.allergy = allergy;
        this.medicalIllness = medicalIllness;
        this.medicalTest = medicalTest;
        this.prescription = prescription;
        this.surgicalOp = surgicalOp;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
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
        return super.toString() +
                "Data Naixement: " + dateBirth + "\n" +
                "Sexe: " + gender + "\n" +
                "Grup Sanguini: " + bloodType + "\n" +
                "Alergia: " + allergy + "\n" +
                "Malaltia: " + medicalIllness + "\n" +
                "Prova Medica: " + medicalTest + "\n" +
                "Prescripció: " + prescription + "\n" +
                "Cirurgia: " + surgicalOp;
    }
}
