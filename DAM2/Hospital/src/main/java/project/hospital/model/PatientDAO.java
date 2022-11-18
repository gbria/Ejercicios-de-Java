package project.hospital.model;

import org.checkerframework.checker.units.qual.A;

import java.sql.*;
import java.util.ArrayList;

public class PatientDAO {

    private static final String DB_URL = "jdbc:postgresql://surus.db.elephantsql.com/rslhocxz";

    private static final String DB_USER = "rslhocxz";

    private static final String DB_PASSWD = "zS5Ly1wi24pbfowS0XlbXnQbj744rn9N";


    //Appointment datos pacientes
    public static ArrayList<Patient> getHospitalPatients() {
        ArrayList<Patient> patients = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT * FROM Patient";
            result = statement.executeQuery(sql);

            while (result.next()) {
                Patient patient = new Patient();
                patient.setDni(result.getString("DniPatient"));
                patient.setFirstName(result.getString("FirstName"));
                patient.setLastName(result.getString("LastName"));
                patient.setDateBirth(result.getString("DateBirth"));
                patient.setGender(result.getString("Gender"));
                patient.setBloodType(result.getString("BloodType"));
                patient.setPhone(result.getInt("Phone"));
                patient.setEmail(result.getString("Email"));
                patient.setAllergy(result.getString("Allergy"));
                patient.setMedicalIllness(result.getString("MedicalIllness"));
                patient.setMedicalTest(result.getString("MedicalTest"));
                patient.setPrescription(result.getString("Prescription"));
                patient.setSurgicalOp(result.getString("SurgicalOp"));

                patients.add(patient);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return patients;
    }


    //Añadir paciente
    public static boolean addPacient(Patient patient) {
        boolean check = false;
        Connection dbconnection = null;
        Statement statement = null;
        String sql;
        int nrows = 0;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "INSERT INTO Patient (DniPatient, FirstName, LastName, DateBirth, Gender, BloodType, Phone, Email, Allergy, MedicalIllness, MedicalTest, Prescription, SurgicalOp)" +
                    " VALUES ('" + patient.getDni().replaceAll("'", "@") + "'," +
                    "'" + patient.getFirstName().replaceAll("'", "@") + "'," +
                    "'" + patient.getLastName().replaceAll("'", "@") + "'," +
                    "'" + patient.getDateBirth() + "'," +
                    "'" + patient.getGender().replaceAll("'", "@") + "'," +
                    "'" + patient.getBloodType().replaceAll("'", "@") + "'," +
                    "'" + patient.getPhone() + "'," +
                    "'" + patient.getEmail().replaceAll("'", "@") + "'," +
                    "'" + patient.getAllergy().replaceAll("'", "@") + "'," +
                    "'" + patient.getMedicalIllness().replaceAll("'", "@") + "'," +
                    "'" + patient.getMedicalTest().replaceAll("'", "@") + "'," +
                    "'" + patient.getPrescription().replaceAll("'", "@") + "'," +
                    "'" + patient.getSurgicalOp().replaceAll("'", "@") + "'" + ");";

            System.out.println(sql);

            nrows = statement.executeUpdate(sql);

            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        if (nrows == 1) {
            check = true;
            return check;
        } else {
            return check;
        }
    }


    //Eliminar paciente
    public static boolean deletePatient(String dniPatient) {
        Connection dbconection = null;
        Statement statement = null;
        String sql;
        int nrows = 0;
        try {
            dbconection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconection.createStatement();
            sql = "DELETE FROM Patient WHERE dnipatient='" + dniPatient + "';";
            nrows = statement.executeUpdate(sql);
            statement.close();
            dbconection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        if (nrows > 0) {
            return true;
        } else {
            return false;
        }
    }


    //Lista de pacientes que tienen que una intervención quirúrgica
    public static ArrayList<Patient> getSurgicalOperation() {
        ArrayList<Patient> patients = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT dnipatient, firstname, lastname, medicalillness, surgicalop " +
                    "FROM Patient " +
                    "WHERE upper(SurgicalOp) like UPPER('si')";
            result = statement.executeQuery(sql);

            while (result.next()) {
                Patient patient = new Patient();
                patient.setDni(result.getString("DniPatient"));
                patient.setFirstName(result.getString("FirstName"));
                patient.setLastName(result.getString("LastName"));
                patient.setMedicalIllness(result.getString("MedicalIllness"));
                patient.setSurgicalOp(result.getString("SurgicalOp"));

                patients.add(patient);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return patients;
    }

}
