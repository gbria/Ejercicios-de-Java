package project.hospital.controller;

import project.hospital.model.*;

import java.util.ArrayList;

public class Controller {

    /**
     * Q1. Assignació de consultas de pacients a partir del cuadre mèdic d'aquesta especialitat
     */
    public static ArrayList<Appointment> getHospitalAppointmentBySpeciality(String speciality) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        appointments = AppointmentDAO.getHospitalAppointmentBySpeciality(speciality);
        return appointments;
    }


    /**
     * Q2. Assignació d'horaris i poder treure diàriament una llista de les consultes a realitzar pels metges.
     */
    public static ArrayList<Appointment> getHospitalAppointmentByDoctor(String dniDoctor, String date) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        appointments = AppointmentDAO.getHospitalAppointmentByDoctor(dniDoctor, date);
        return appointments;
    }

    /**
     * Q3. De cada consulta programada s'ha de poder fer, altes, baixes, modificacions i consultes
     * <p>
     * Q3.1 Altes
     */
    public static boolean addAppointment(Appointment appointment) {
        return AppointmentDAO.addAppointment(appointment);
    }

    /**
     * Q3.2 Modificacions
     */
    public static boolean updateAppointment(Appointment appointment) {
        return AppointmentDAO.updateAppointment(appointment);
    }

    /**
     * Q3.3 Baixes
     */
    public static boolean deleteAppointment(int id) {
        return AppointmentDAO.deleteAppointment(id);
    }

    /**
     * Q3.4 Consultes
     */
    public static ArrayList<Appointment> getQueryAppointment(int id) {
        return AppointmentDAO.getQueryAppointment(id);
    }

    /**
     * Q4. Consultar l'historial de consultes per metge entre dates amb les dades i estadístiques més importants
     */
    public static ArrayList<Appointment> getHospitalHistorialByMetge(String dniDoctor, String dateStart, String dateEnd) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        appointments = AppointmentDAO.getHospitalHistorialByMetge(dniDoctor, dateStart, dateEnd);
        return appointments;
    }

    /**
     * Q5. Veure l'historial dels pacients en un moment determinar
     */
    public static ArrayList<Appointment> getHospitalHistorialByPacientOfTimeEspecific(String dniPatient, String date) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        appointments = AppointmentDAO.getHospitalHistorialByPacientOfTimeEspecific(dniPatient, date);
        return appointments;
    }

    /**
     * Q6 Consultar dades de pacients i els metges
     */
    public static ArrayList getPerson(String nombre) {
        if (nombre.equals("pacient")) {
            ArrayList<Patient> patients = new ArrayList<>();
            patients = PatientDAO.getHospitalPatients();
            return patients;
        } else if (nombre.equals("metge")) {
            ArrayList<Doctor> doctors = new ArrayList<>();
            doctors = DoctorDAO.getHospitalDoctors();
            return doctors;
        } else if (nombre.equals("infermer")) {
            ArrayList<Nurse> nurses = new ArrayList<>();
            nurses = NurseDAO.getHospitalNurse();
            return nurses;
        } else {
            return null;
        }
    }

    /**
     * Q7 Afegir/Eliminar els pacients nous i els metges
     * <p>
     * Q7.1 Afegir Pacient
     */
    public static boolean addPatient(Patient patient) {
        boolean check = false;
        check = PatientDAO.addPacient(patient);
        return check;
    }

    /**
     * Q7.2 Afegir Doctor
     */
    public static boolean addDoctor(Doctor doctor) {
        boolean check = false;
        check = DoctorDAO.addDoctor(doctor);
        return check;
    }

    /**
     * Q7.3 Afegir Nurse
     */
    public static boolean addNurse(Nurse nurse) {
        boolean check = false;
        check = NurseDAO.addNurse(nurse);
        return check;
    }

    /**
     * Q7.5 Eliminar persona
     */
    public static String deletePerson(String nombre, String dni) {
        boolean check = false;
        if (nombre.equals("pacient")) {
            check = PatientDAO.deletePatient(dni);
        } else if (nombre.equals("infermer")) {
            check = NurseDAO.deleteNurse(dni);
        } else if (nombre.equals("metge")) {
            check = DoctorDAO.deleteDoctor(dni);
        }

        if (check == false) {
            return "ERROR: El dni no corresponde";
        }
        return "Se ha eliminado correctamente";
    }

    /**
     * Q8. Diàriament, voldrem treure un llistat dels pacients que s'han d'operar
     */
    public static ArrayList<Patient> getSurgicalOperation() {
        ArrayList<Patient> patients = new ArrayList<>();
        patients = PatientDAO.getSurgicalOperation();
        return patients;
    }

    /**
     * Q9. De les especialitats que tenen els metges de l'hospital que estan treballant, ordenants alfabèticament
     */
    public static ArrayList<Doctor> getDoctorsBySpeciality() {
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors = DoctorDAO.getDoctorsBySpeciality();
        return doctors;
    }

    /**
     * Q10 Llista els metges que hi ha en cada especialitat treballant
     */
    public static ArrayList<Doctor> getListBySpeciality() {
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors = DoctorDAO.getListBySpeciality();
        return doctors;
    }

}


