package project.hospital.controller;

import project.hospital.model.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static project.hospital.model.PatientDAO.deletePatient;

public class Controller {

    /**Q1. Assignació de consultas de pacients a partir del cuadre mèdic d'aquesta especialitat*/
    public static ArrayList<Appointment> getHospitalAppointmentBySpeciality(String speciality) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        appointments = AppointmentDAO.getHospitalAppointmentBySpeciality(speciality);
        return appointments;
    }


    /**Q2. Assignació d'horaris i poder treure diàriament una llista de les consultes a realitzar pels metges.*/
    public static ArrayList<Appointment> getHospitalAppointmentByMetge(String nif) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        appointments = AppointmentDAO.getHospitalAppointmentByMetge(nif);
        return appointments;
    }

    /**Q3. De cada consulta programada s'ha de poder fer, altes, baixes, modificacions i consultes


    /**Q4. Consultar l'historial de consultes per metge entre dates amb les dades i estadístiques més importants*/
    public static ArrayList<Appointment> getHospitalHistorialByMetge(String dniDoctor, String dateStart, String dateEnd) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        appointments = AppointmentDAO.getHospitalHistorialByMetge(dniDoctor, dateStart, dateEnd);
        return appointments;
    }

    /**Q5. Veure l'historial dels pacients en un moment determinar*/
    public static ArrayList<String> getHospitalHistorialByPacientOfTimeEspecific(String dniPatient, String date) {
        //Esta funcion no se devuelve en el mismo formato. (Simplemente es una presentación)

        //Devolvemos una ArrayList de String de dos ArrayList
        //Variables para los pacientes
        String infoPatient = "";
        String medicalIllness, medicalTest, prescription;

        //Variables para las consultas
        String infoAppointment = "";
        String firstName, lastName, data;

        //Creamos dos ArraysList. Una para cada función
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Appointment> appointments = new ArrayList<>();

        //Asignamos los datos de las funciones dentro de las ArrayList
        appointments = AppointmentDAO.getHospitalHistorialByPacientOfTimeEspecificP1(date);
        patients = PatientDAO.getHospitalHistorialByPacientOfTimeEspecificP2(date);

        //Iteramos para ir almacenando todos los datos de los pacientes dentro de la ArrayList patients
        Iterator<Patient> it = patients.iterator();

        while (it.hasNext()) {
            Patient patient = new Patient();
            patient = it.next();
            medicalIllness = patient.getMedicalIllness();
            medicalTest = patient.getMedicalTest();
            prescription = patient.getPrescription();
            infoPatient += medicalIllness + " " + medicalTest + " " + prescription + ";";
        }

        //Iteramos para ir almacenando todos los datos de las consultas dentro de la ArrayList appointments
        Iterator<Appointment> i = appointments.iterator();

        while (i.hasNext()) {
            Appointment appointment = new Appointment();
            appointment = i.next();
            firstName = appointment.getFirstName();
            lastName = appointment.getLastName();
            data = appointment.getDate();
            infoAppointment += firstName + " " + lastName + " " + data + ";";
        }

        //Creamos dos Arrays
        String p1[], p2[];

        //Guardamos los datos de las diferentes arrays SPLIT(separados por el punto y coma)
        p1 = infoPatient.split(";");
        p2 = infoAppointment.split(";");

        //Creamos dos variables auxiliares para recorrer los arrays y almacenar la información
        ArrayList<String> totalString = new ArrayList<>();
        String text;

        for (int j = 0; j < p1.length; j++) {
            text = p1[j] + " " + p2[j];
            totalString.add(text);
        }

        return totalString;
    }

    /**Q6 Consultar dades de pacients i els metges*/
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

    /**Q7 Afegir/Eliminar els pacients nous i els metges*/
    /**Q7.1 Afegir Pacient*/
    public static boolean addPatient(Patient patient) {
        boolean check = false;
        check = PatientDAO.addPacient(patient);
        return check;
    }
    /**Q7.2 Afegir Doctor*/
    public static boolean addDoctor(Doctor doctor) {
        boolean check = false;
        check = DoctorDAO.addDoctor(doctor);
        return check;

    }
    /**Q7.3 Afegir Nurse*/
    public static boolean addNurse(Nurse nurse) {
        boolean check = false;
        check = NurseDAO.addNurse(nurse);
        return check;
    }

    /**Q7.3 Eliminar Nurse*/
    public static String deletePerson(String nombre, String dni) {
        boolean check = false;
        if (nombre.equals("pacient")) {
            check = PatientDAO.deletePatient(dni);
        } else if (nombre.equals("infermer")) {
            check = NurseDAO.deleteNurse(dni);
        } else if (nombre.equals("doctor")){
            check = DoctorDAO.deleteDoctor(dni);
        }

        if (check == false){
            return "ERROR: El dni no corresponde";
        }
        return "Se ha eliminado correctamente";
    }

    /**Q8. Diàriament, voldrem treure un llistat dels pacients que s'han d'operar*/
    public static ArrayList<Patient> consultaOpera() {
        ArrayList<Patient> patients = new ArrayList<>();
        patients = PatientDAO.getSurgicalOperation();
        return patients;
    }

    /**Q9. De les especialitats que tenen els metges de l'hospital que estan treballant, ordenants alfabèticament*/
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
            name = doctor.getFirstName();
            surname = doctor.getLastName();
            speAux = doctor.getSpeciality();
            //HACER QUE PASE TODOS LOS MÉDICOS DE UNA ESPECIALIDAD ANTES DE PASAR AL SIGUIENTE

            speciality = doctor.getSpeciality();
            consultaEsp += name + " " + surname + "\n";

        }
        return consultaEsp;
    }

    /**Q10 Llista els metges que hi ha en cada especialitat treballant*/
    public static String getDoctorBySpeciality() {

        String infoSpeciality = "";
        String name, surname, speciality;
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors = DoctorDAO.getMedicalSpeciality();

        Iterator<Doctor> it = doctors.iterator();

        while (it.hasNext()) {
            Doctor doctor = new Doctor();
            doctor = it.next();
            surname = doctor.getLastName();
            name = doctor.getFirstName();
            speciality = doctor.getSpeciality();
            infoSpeciality += name + " " + surname + ": " + speciality + "\n";

        }
        return infoSpeciality;
    }




    public static ArrayList<Doctor> getHospitalHistorialByDoctors() {
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors = DoctorDAO.getHospitalDoctors();
        return doctors;
    }


}


