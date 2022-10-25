package project.hospital.controller;

import project.hospital.model.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Controller {
    public static ArrayList getPerson(String nombre) {
        if (nombre.equals("pacient")) {
            ArrayList<Patient> patients = new ArrayList<>();
            patients = PatientDAO.getHospitalPatients();
            return patients;
        } else if (nombre.equals("metge")) {
            ArrayList<Doctor> doctors = new ArrayList<>();
            doctors = DoctorDAO.getHospitalDoctors();
        } else {
            ArrayList<Nurse> nurses = new ArrayList<>();
            nurses = NurseDAO.getHospitalNurse();
        }
        return null;
    }

    public static boolean deletePerson(String nombre, String dni) {
        boolean check = false;
        if (nombre.equals("pacient")) {
            //check=deletePacient(nif);
        } else if (nombre.equals("infermer")) {
            //check=deleteInfermer(nif);
        } else {
            //check=deleteInfermer(nif);
        }
        return true;

    }

    public static boolean addPatient(Patient patient) {
        boolean check = false;
        check = PatientDAO.addPacient(patient);
        return check;
    }

    public static boolean addDoctor(Doctor doctor) {
        boolean check = false;
        check = DoctorDAO.addDoctor(doctor);
        return check;

    }

    public static boolean addNurse(Nurse nurse) {
        boolean check = false;
        check = NurseDAO.addNurse(nurse);
        return check;
    }

    public static ArrayList<Patient> consultaOpera() {
        ArrayList<Patient> patients = new ArrayList<>();
        patients = PatientDAO.getSurgicalOperation();
        return patients;
    }


    public static String querySpeciality() {
        String speAux;
        String consultaEsp = "";
        String name, surname, speciality;
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors = DoctorDAO.getMedicalSpeciality();

        Iterator<Doctor> it = doctors.iterator();

        while (it.hasNext()) {
            Doctor doctor = new Doctor();
            doctor = it.next();
            name = doctor.getName();
            surname = doctor.getSurname();
            speAux = doctor.getSpeciality();
            //HACER QUE PASE TODOS LOS MÉDICOS DE UNA ESPECIALIDAD ANTES DE PASAR AL SIGUIENTE

            speciality = doctor.getSpeciality();
            consultaEsp += name + " " + surname + "\n";

        }
        return consultaEsp;
    }

    public static String getDoctorBySpeciality() {
        String infoSpeciality = "";
        String name, surname, speciality;
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors = DoctorDAO.getMedicalSpeciality();

        Iterator<Doctor> it = doctors.iterator();

        while (it.hasNext()) {
            Doctor doctor = new Doctor();
            doctor = it.next();
            surname = doctor.getSurname();
            name = doctor.getName();
            speciality = doctor.getSpeciality();
            infoSpeciality += name + " " + surname + ": " + speciality + "\n";

        }
        return infoSpeciality;
    }

    public static ArrayList<Consulta> getHospitalConsultaBySpeciality(String speciality){
        ArrayList<Consulta> consultas = new ArrayList<>();
        consultas = ConsultaDAO.getHospitalConsultaBySpeciality(speciality);
        return consultas;
    }

        public static ArrayList<Consulta> getHospitalConsultaByMetge(String nif){
        ArrayList<Consulta> consultas = new ArrayList<>();
        consultas = ConsultaDAO.getHospitalConsultaBySpeciality(nif);
        return consultas;
    }

}


