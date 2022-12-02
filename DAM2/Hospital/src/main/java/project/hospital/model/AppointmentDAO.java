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
            sql = "SELECT A.Id, D.FirstName, D.LastName, A.Date, A.Time, A.DocOffice " +
                    "FROM Appointment A INNER JOIN Doctor D ON A.DniDoctor=D.DniDoctor " +
                    "WHERE UPPER(D.Speciality) LIKE UPPER('" + speciality + "')";
            result = statement.executeQuery(sql);

            while (result.next()) {
                Appointment appointment = new Appointment();
                appointment.setId(result.getInt("id"));
                appointment.getDoctor().setFirstName(result.getString("FirstName"));
                appointment.getDoctor().setLastName(result.getString("LastName"));
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

    /**
     * Q2. Assignació d'horaris i poder treure diàriament una llista de les consultes a realitzar pels metges.
     */
    public static ArrayList<Appointment> getHospitalAppointmentByDoctor(String dniDoctor, String date) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT A.Id, A.Date, A.Time, A.DocOffice " +
                    "FROM Appointment A INNER JOIN Doctor D ON A.DniDoctor=D.DniDoctor " +
                    "WHERE D.DniDoctor = '" + dniDoctor + "' AND date = '" + date + "'"; //Devuelve la fecha actual

            result = statement.executeQuery(sql);

            while (result.next()) {
                Appointment appointment = new Appointment();
                appointment.setId(result.getInt("id"));
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

    /**
     * Q3. De cada consulta programa s'ha de poder: altes, baixes, modificacions i consultes
     * <p>
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
            sql = "INSERT INTO Appointment (Date, Time, DniPatient, DniDoctor, DniNurse, DocOffice)" +
                    " VALUES ('" + appointment.getDate().replaceAll("'", "@") + "'," +
                    "'" + appointment.getTime() + "'," +
                    //DniPatient
                    "'" + appointment.getPatient().getDni() + "'," +
                    //DniDoctor
                    "'" + appointment.getDoctor().getDni() + "'," +
                    //DniNurse
                    "'" + appointment.getNurse().getDni() + "'," +
                    +appointment.getDocOffice() + ");";

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
     * Q3.2. Modificar
     */
    public static boolean updateAppointment(Appointment appointment) {
        boolean check = false;
        Connection dbconnection = null;
        Statement statement = null;
        String sql;
        int nrows = 0;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "UPDATE Appointment " +
                    " SET date = '" + appointment.getDate() + "', " +
                    "time = '" + appointment.getTime() + "', " +
                    "dnipatient = '" + appointment.getPatient().getDni() + "', " +
                    "dnidoctor = '" + appointment.getDoctor().getDni() + "', " +
                    "dninurse = '" + appointment.getNurse().getDni() + "', " +
                    "docoffice = " + appointment.getDocOffice() +
                    " WHERE id = " + appointment.getId();
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
     * Q3.3. Baixa
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

    /**
     * Q3.4. Consulta
     */

    public static ArrayList<Appointment> getQueryAppointment(int id) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT id, date, time, dnipatient, dnidoctor, dninurse, docOffice " +
                    "FROM Appointment " +
                    "WHERE id = " + id;
            result = statement.executeQuery(sql);

            while (result.next()) {
                Appointment appointment = new Appointment();
                appointment.setId(result.getInt("Id"));
                appointment.setDate(result.getString("Date"));
                appointment.setTime(result.getString("Time"));
                appointment.getPatient().setDni(result.getString("DniPatient"));
                appointment.getDoctor().setDni(result.getString("DniDoctor"));
                appointment.getNurse().setDni(result.getString("DniNurse"));
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
     * Q4. Consultar l'historial de consultes per metge entre dates amb les dades i estadístiques més importants
     */
    public static ArrayList<Appointment> getHospitalHistorialByMetge(String dniDoctor, String dateStart, String dateEnd) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT A.date, A.time, A.docoffice " +
                    "FROM Appointment A " +
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

    /**
     * Q5. Veure l'historial dels pacients en un moment determinar
     */
    public static ArrayList<Appointment> getHospitalHistorialByPacientOfTimeEspecific(String dniPatient, String date) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT P.FirstName, P.LastName, A.Date, P.MedicalIllness, P.MedicalTest, P.Prescription " +
                    "FROM Appointment A INNER JOIN Patient P ON A.DniPatient=P.DniPatient " +
                    "WHERE UPPER(A.Dnipatient) = UPPER('" + dniPatient + "') AND A.date = '" + date + "'";

            result = statement.executeQuery(sql);

            while (result.next()) {
                Appointment appointment = new Appointment();
                appointment.getPatient().setFirstName(result.getString("FirstName"));
                appointment.getPatient().setLastName(result.getString("LastName"));
                appointment.setDate(result.getString("Date"));
                appointment.getPatient().setMedicalIllness(result.getString("MedicalIllness"));
                appointment.getPatient().setMedicalTest(result.getString("MedicalTest"));
                appointment.getPatient().setPrescription(result.getString("Prescription"));
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
