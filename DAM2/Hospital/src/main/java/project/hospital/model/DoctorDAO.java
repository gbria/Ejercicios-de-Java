package project.hospital.model;

import java.sql.*;
import java.util.ArrayList;

public class DoctorDAO {
    private static final String DB_URL = "jdbc:postgresql://surus.db.elephantsql.com/rslhocxz";
    private static final String DB_USER = "rslhocxz";
    private static final String DB_PASSWD = "zS5Ly1wi24pbfowS0XlbXnQbj744rn9N";


    //Consultar los datos de los/las doctores/as
    public static ArrayList<Doctor> getHospitalDoctors() {
        ArrayList<Doctor> doctors = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;



        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT * FROM Doctor";
            result = statement.executeQuery(sql);

            while (result.next()) {
                Doctor doctor = new Doctor();
                doctor.setDni(result.getString("DniDoctor"));
                doctor.setFirstName(result.getString("FirstName"));
                doctor.setLastName(result.getString("LastName"));
                doctor.setSpeciality(result.getString("Speciality"));
                doctor.setEmail(result.getString("Email"));
                doctor.setTimetable(result.getString("TimeTable"));
                doctor.setExtraHour(result.getInt("ExtraHour"));
                doctor.setPhone(result.getInt("Phone"));


                doctors.add(doctor);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return doctors;
    }


    //Añadir un nuevo doctor/a
    public static boolean addDoctor(Doctor doctor) {
        boolean check = false;
        Connection dbconnection = null;
        Statement statement = null;
        String sql;
        int nrows = 0;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "INSERT INTO Doctor (DniDoctor, FirstName, LastName, Speciality, Email, Timetable, ExtraHour, Phone)" +
                    " VALUES ('" + doctor.getDni().replaceAll("'", "@") + "'," +
                    "'" + doctor.getFirstName().replaceAll("'", "@") + "'," +
                    "'" + doctor.getLastName().replaceAll("'", "@") + "'," +
                    "'" + doctor.getSpeciality().replaceAll("'", "@") + "'," +
                    "'" + doctor.getEmail().replaceAll("'", "@") + "'," +
                    "'" + doctor.getTimetable().replaceAll("'", "@") + "'," +
                    "'" + doctor.getExtraHour() + "'," +
                    doctor.getPhone() + ");";

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


    //Eliminar un doctor/a
    public static boolean deleteDoctor(String dniDoctor) {
        Connection dbconection = null;
        Statement statement = null;
        String sql;
        int nrows = 0;
        try {
            dbconection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconection.createStatement();
            sql = "DELETE FROM Doctor WHERE DniDoctor='" + dniDoctor + "';";
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
     * Q9. De les especialitats que tenen els metges de l'hospital que estan treballant, ordenants alfabèticament
     */
    public static ArrayList<Doctor> getDoctorsBySpeciality() {
        ArrayList<Doctor> doctors = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT FirstName, LastName, Speciality FROM Doctor ORDER BY lastname;";
            result = statement.executeQuery(sql);

            while (result.next()) {
                Doctor doctor = new Doctor();
                doctor.setLastName(result.getString("LastName"));
                doctor.setFirstName(result.getString("FirstName"));
                doctor.setSpeciality(result.getString("Speciality"));
                doctors.add(doctor);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return doctors;
    }

/**
 *  Q10. Llista amb els metges que hi ha en cada especialitat
 * */
    public static ArrayList<Doctor> getListBySpeciality() {
        ArrayList<Doctor> doctors = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT Speciality, LastName, FirstName " +
                    "FROM Doctor " +
                    "ORDER BY speciality DESC";
            result = statement.executeQuery(sql);

            while (result.next()) {
                Doctor doctor = new Doctor();
                doctor.setSpeciality(result.getString("Speciality"));
                doctor.setLastName(result.getString("LastName"));
                doctor.setFirstName(result.getString("FirstName"));
                doctors.add(doctor);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return doctors;
    }


}
