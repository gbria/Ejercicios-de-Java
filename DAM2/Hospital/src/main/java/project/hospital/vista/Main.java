package project.hospital.vista;

import project.hospital.controller.Controller;
import project.hospital.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Appointment appointment = new Appointment();

        ArrayList<Doctor> doctors = new ArrayList<>();
        //doctors = DoctorDAO.getHospitalDoctors();
        //System.out.println(doctors.toString());

        doctors = Controller.getHospitalHistorialByDoctors();
        System.out.println(doctors);






        ArrayList<Patient> patients = new ArrayList<>();
        patients = PatientDAO.getHospitalPatients();
        //System.out.println(patients.toString());

        /**Q1. Assignació de consultas de pacients a partir del cuadre mèdic d'aquesta especialitat*/
        //ArrayList<Appointment> appointments = new ArrayList<>();
        //TENGO QUE LLAMAR AL DAO ANTES?!?!?
        //appointments = Controller.getHospitalAppointmentBySpeciality("Intern");
        //System.out.println(appointments);



    }
}
