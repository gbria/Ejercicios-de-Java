package project.hospital.vista;

import project.hospital.model.Doctor;
import project.hospital.model.DoctorDAO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        ArrayList<Doctor> doctors = new ArrayList<>();

        doctors = DoctorDAO.getHospitalDoctors();
        System.out.println(doctors);
    }
}
