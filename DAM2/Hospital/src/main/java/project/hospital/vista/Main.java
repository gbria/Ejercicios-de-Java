package project.hospital.vista;

import org.checkerframework.checker.units.qual.A;
import project.hospital.controller.Controller;
import project.hospital.model.*;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Appointment> appointments = new ArrayList<>();
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Nurse> nurses = new ArrayList<>();
        ArrayList<Person> persons = new ArrayList<>();


        /**Q1. Assignació de consultas de pacients a partir del cuadre mèdic d'aquesta especialitat*/

        appointments = Controller.getHospitalAppointmentBySpeciality("Intern");
        //System.out.println(appointments.toString());

        /**Q2. Assignació d'horaris i poder treure diàriament una llista de les consultes a realitzar pels metges.*/
        appointments = Controller.getHospitalAppointmentByDoctor("47901072F", "2022-09-30");
        //System.out.println(appointments.toString());

        /**Q3. De cada consulta programada s'ha de poder fer, altes, baixes, modificacions i consultes **/
        //  Q3.1 Alta
        Appointment appointmentInsert = new Appointment();
        appointmentInsert.setDate("2022-11-17");
        appointmentInsert.setTime("19:00");
        appointmentInsert.setDocOffice(2);
        appointmentInsert.getDoctor().setDni("47901072F");
        appointmentInsert.getPatient().setDni("47889072T");
        appointmentInsert.getNurse().setDni("41551072F");
        //Controller.addAppointment(appointmentInsert);

        //Q3.2 Modifica
        Appointment appointmentUpdate = new Appointment();
        appointmentUpdate.setId(6);
        appointmentUpdate.setDate("2022-11-20");
        appointmentUpdate.setTime("08:00");
        appointmentUpdate.setDocOffice(6);
        appointmentUpdate.getDoctor().setDni("47901072F");
        appointmentUpdate.getPatient().setDni("47889072T");
        appointmentUpdate.getNurse().setDni("41551072F");
        //Controller.updateAppointment(appointmentUpdate);

        //Q3.3 Baixa
        //Controller.deleteAppointment(7);

        //Q3.4 Consulta
        appointments = Controller.getQueryAppointment(6);
        //System.out.println(appointments);

        /**Q4. Consultar l'historial de consultes per metge entre dates amb les dades i estadístiques més importants*/
        appointments = Controller.getHospitalHistorialByMetge("47901072F", "2022-09-30", "2022-11-19");
        //System.out.println(appointments.toString());

        /**Q5. Veure l'historial dels pacients en un moment determinar*/
        appointments = Controller.getHospitalHistorialByPacientOfTimeEspecific("47901072R", "2022-09-30");
        //System.out.println(appointments);

        /**Q6 Consultar dades de pacients i els metges*/
        /*System.out.print("Qué vol consultar (metge, pacient, infermer): ");
        String nombre = sc.nextLine();

        if (nombre.equals("metge")){
            doctors = Controller.getPerson("metge");
            System.out.println(doctors);
        } else if (nombre.equals("pacient")) {
            patients = Controller.getPerson("pacient");
            System.out.println(patients);
        } else if (nombre.equals("infermer")){
            nurses = Controller.getPerson("infermer");
            System.out.println(nurses);
        }*/

        /**
         * Q7 Afegir/Eliminar els pacients nous i els metges
         * <p>
         * Q7.1 Afegir Pacient
         */
        Patient patientInsert = new Patient();
        patientInsert.setDni("1234678X");
        patientInsert.setFirstName("Margarita");
        patientInsert.setLastName("Seis Dedos");
        patientInsert.setDateBirth("1950-02-12");
        patientInsert.setGender("Dona");
        patientInsert.setBloodType("B+");
        patientInsert.setPhone(625144875);
        patientInsert.setEmail("Mar6Fingers@gmail.com");
        patientInsert.setAllergy("no");
        patientInsert.setMedicalIllness("Apendicitis");
        patientInsert.setMedicalTest("Revisió");
        patientInsert.setPrescription("Ibuprofeno");
        patientInsert.setSurgicalOp("Si");
        //Controller.addPatient(patientInsert);
        /**
         * Q7.2 Afegir Doctor
         */
        Doctor doctorInsert = new Doctor();
        doctorInsert.setDni("45781245E");
        doctorInsert.setFirstName("Joan");
        doctorInsert.setLastName("Caparrós");
        doctorInsert.setSpeciality("Intern");
        doctorInsert.setEmail("JCaparrros@gmail.com");
        doctorInsert.setTimetable("Tarde");
        doctorInsert.setExtraHour(10);
        doctorInsert.setPhone(664891278);
        //Controller.addDoctor(doctorInsert);
        /**
         * Q7.3 Afegir Nurse
         */
        Nurse nurseInsert = new Nurse();
        nurseInsert.setDni("89562355T");
        nurseInsert.setFirstName("Indiana");
        nurseInsert.setLastName("Bria");
        nurseInsert.setEmail("IBria@gmail.com");
        nurseInsert.setTimeTable("Tarde");
        nurseInsert.setPhone(784558844);
        //Controller.addNurse(nurseInsert);
        /**
         * Q7.5 Eliminar persona
         */
        //Controller.deletePerson("pacient", "1234678X");

        /**
         * Q8. Diàriament, voldrem treure un llistat dels pacients que s'han d'operar
         */
        patients = Controller.getSurgicalOperation();
        //System.out.println(patients);

        /**
         * Q9. De les especialitats que tenen els metges de l'hospital que estan treballant, ordenants alfabèticament
         */
        doctors = Controller.getDoctorsBySpeciality();
        //System.out.println(doctors);

        /**
         * Q10 Llista els metges que hi ha en cada especialitat treballant
         */
        doctors = Controller.getListBySpeciality();
        //System.out.println(doctors);

    }

}
