package project.hospital.model;

import java.sql.*;
import java.util.ArrayList;

public class AppointmentDAO {
    private static final String DB_URL = "jdbc:postgresql://surus.db.elephantsql.com/rslhocxz";

    private static final String DB_USER = "rslhocxz";

    private static final String DB_PASSWD = "zS5Ly1wi24pbfowS0XlbXnQbj744rn9N";

    public static ArrayList<Appointment> getHospitalAppointment() {
        ArrayList<Appointment> appointments = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT * FROM Appointment";
            result = statement.executeQuery(sql);

            while (result.next()) {
                Appointment appointment = new Appointment();
                appointment.setDate(result.getString("Date"));
                appointment.setTime(result.getInt("Time"));
                appointment.setDocOffice(result.getInt("DocOffice"));

                appointments.add(appointment);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return appointments;
    }

    public static ArrayList<Appointment> getHospitalAppointmentBySpeciality(String speciality) {

        /**Q1. Assignació de consultas de pacients a partir del cuadre mèdic d'aquesta especialitat*/

        ArrayList<Appointment> appointments = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT D.FirstName. D.LastName, A.Date, A.Time, A.DocOffice" +
                    "FROM Appointment A INNER JOIN Doctor D ON A.DniDoctor=D.DniDoctor" +
                    "WHERE UPPER(D.Speciality) LIKE UPPER('" + speciality + "');";
            result = statement.executeQuery(sql);
            Appointment appointment = new Appointment();

            while (result.next()) {
                appointment.setFirstName(result.getString("FirstName"));
                appointment.setLastName(result.getString("LastName"));
                appointment.setDate(result.getString("Date"));
                appointment.setTime(result.getInt("Time"));
                appointment.setDocOffice(result.getInt("DocOffice"));

                appointments.add(appointment);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return appointments;
    }


    public static ArrayList<Appointment> getHospitalAppointmentByMetge(String dniDoctor) {

        /**Q2. Assignació d'horaris i poder treure diàriament una llista de les consultes a realitzar pels metges.*/

        ArrayList<Appointment> appointments = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT A.Date, A.Time, A.DocOffice" +
                    "FROM Appointment A INNER JOIN Doctor D ON A.DniDoctor=D.DniDoctor" +
                    "WHERE D.DniDoctor = '" + dniDoctor + "' AND data = CURRENT_DATE"; //Devuelve la fecha actual

            result = statement.executeQuery(sql);

            while (result.next()) {
                Appointment appointment = new Appointment();
                appointment.setDate(result.getString("Date"));
                appointment.setTime(result.getInt("Time"));
                appointment.setDocOffice(result.getInt("DocOffice"));
                appointments.add(appointment);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return appointments;
    }

    /**
     * Appointment 3
     * <p>
     * SELECT *
     * FROM cita
     * WHERE citaid = 3
     * <p>
     * 4 FUNCIONES
     * ALTAS: INSERT INTO
     * BAJAS: DELETE
     * MODIFICACIONES: UPDATE
     * CONSULTA: SELECT * FROM cita
     */

    public static ArrayList<Appointment> getHospitalHistorialByMetge(String dniDoctor, String dateStart, String dateEnd) {

        /**Q4. Consultar l'historial de consultes per metge entre dates amb les dades i estadístiques més importants*/

        ArrayList<Appointment> appointments = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT COUNT(*) AS Count" +
                    "FROM Appointment A INNER JOIN Doctor D ON A.DniDoctor=D.DniDoctor" +
                    "WHERE A.Date BETWEEN '" + dateStart + "' AND '" + dateEnd + "' AND UPPER(A.DniDoctor) = UPPER('" + dniDoctor + "')";

            result = statement.executeQuery(sql);

            while (result.next()) {
                Appointment appointment = new Appointment();
                appointment.setDate(result.getString("Date"));
                appointment.setTime(result.getInt("Time"));
                appointment.setDocOffice(result.getInt("DocOffice"));
                appointments.add(appointment);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return appointments;
    }


    public static ArrayList<Appointment> getHospitalHistorialByPacientOfTimeEspecificP1(String dniPatient, String date) {

        /**Q5. Veure l'historial dels pacients en un moment determinar*/

        ArrayList<Appointment> appointments = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT P.FirstName, P.LastName, A.Date, P.MedicalIllness, P.MedicalTest, P.Prescription" +
                    "FROM Appointment A INNER JOIN Patient P ON A.DniPacient=P.DniPacient" +
                    "WHERE UPPER(P.DniPatient) = UPPER('" + dniPatient + "') AND C.data = '" + date + "'";

            result = statement.executeQuery(sql);

            while (result.next()) {
                Appointment appointment = new Appointment();
                appointment.setFirstName(result.getString("FirstName"));
                appointment.setLastName(result.getString("LastName"));
                appointment.setDate(result.getString("Date"));
                appointments.add(appointment);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return appointments;
    }


}
