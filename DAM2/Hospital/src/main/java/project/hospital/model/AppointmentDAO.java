package project.hospital.model;

import java.sql.*;
import java.util.ArrayList;

public class AppointmentDAO {
    private static final String DB_URL = "jdbc:postgresql://surus.db.elephantsql.com/rslhocxz";
    private static final String DB_USER = "rslhocxz";
    private static final String DB_PASSWD = "zS5Ly1wi24pbfowS0XlbXnQbj744rn9N";

    /**
     * Q1. Assignació de consultas de pacients a partir del cuadre mèdic d'aquesta especialitat
     */
    public static ArrayList<Appointment> getHospitalAppointmentBySpeciality(String speciality) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT D.FirstName, D.LastName, A.Time, A.DocOffice" +
                    "FROM Appointment A INNER JOIN Doctor D ON A.DniDoctor=D.DniDoctor" +
                    "WHERE UPPER(D.Speciality) LIKE UPPER('" + speciality + "')";
            result = statement.executeQuery(sql);

            while (result.next()) {
                Appointment appointment = new Appointment();
                appointment.setFirstName(result.getString("FirstName"));
                appointment.setLastName(result.getString("LastName"));
                appointment.setDate(result.getString("Date"));
                appointment.setTime(result.getString("Time"));
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
                appointment.setTime(result.getString("Time"));
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

    /** Q3. De cada consulta programa s'ha de poder: altes, baixes, modificacions i consultes*/
    /**
     * Q3.1. Afegir
     */
    public static boolean addAppointment(Appointment appointment) {
        boolean check = false;
        Connection dbconnection = null;
        Statement statement = null;
        String sql;
        int nrows = 0;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "INSERT INTO Appointment(Date, Time, DniPatient, DniDoctor, DniNurse, DocOffice)" +
                    " VALUES ('" + appointment.getDate().replaceAll("'", "@") + "'," +
                    "'" + appointment.getTime() + "'," +
                    //DniPatient
                    "'" + appointment.getDni() + "'," +
                    //DniDoctor
                    "'" + appointment.getDni() + "'," +
                    //DniNurse
                    "'" + appointment.getDni() + "'," +
                    "'" + appointment.getDocOffice() + ");";

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

    /**
     * Q3.1. Baixa
     */
    public static boolean deleteAppointment(int id) {
        Connection dbconection = null;
        Statement statement = null;
        String sql;
        int nrows = 0;
        try {
            dbconection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconection.createStatement();
            sql = "DELETE FROM Appointment WHERE id=" + id + ";";
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

    /** MODIFICACIONES: UPDATE
     * UPDATE Appointment SET DniPatient = 47901072S WHERE id = 3;
     */


    /**
     * CONSULTA:
     * SELECT * FROM Appointment WHERE id = 3
     */
    public static ArrayList<Appointment> getQueryAppointment() {
        ArrayList<Appointment> appointments = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT * FROM Appointment;";
            result = statement.executeQuery(sql);

            while (result.next()) {
                Appointment appointment = new Appointment();
                appointment.setId(result.getInt("Id"));
                appointment.setDate(result.getString("Date"));
                appointment.setTime(result.getString("Time"));
                //DniPatient
                appointment.setDni(result.getString("DniPatient"));
                //DniDoctor
                appointment.setDni(result.getString("DniDoctor"));
                //DniNurse
                appointment.setDni(result.getString("DniPNurse"));
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
                appointment.setTime(result.getString("Time"));
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


    public static ArrayList<Appointment> getHospitalHistorialByPacientOfTimeEspecificP1(String date) {

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
                    "WHERE C.data = '" + date + "'";

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
