package project.hospital.model;

import java.sql.*;
import java.util.ArrayList;

public class MetgeDAO {

    private static final String DB_URL = "jdbc:postgresql://surus.db.elephantsql.com/kgoicfvc";

    private static final String DB_USER = "kgoicfvc";

    private static final String DB_PASSWD = "X1ljbK7jBcrct6TtLDWiQPmmTg14LjO9";

    /**
     * Consulta los datos de los medicos
     */
    public static ArrayList<Metge> getHospitalMetges() {
        ArrayList<Metge> metges = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT * FROM Metge";
            result = statement.executeQuery(sql);

            while (result.next()) {
                Metge metge = new Metge();
                metge.setNif(result.getString("nifmetge"));
                metge.setNom(result.getString("nom"));
                metge.setCognom(result.getString("cognom"));
                metge.setEspecialitat(result.getString("especialitat"));
                metge.setCorreu(result.getString("correu"));
                metge.setHoresExtres(result.getInt("horaextra"));

                metges.add(metge);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return metges;
    }

    /**
     * Añade nuevo medico
     */
    public static boolean addMetge(Metge metge) {
        boolean check = false;
        Connection dbconnection = null;
        Statement statement = null;
        String sql;
        int nrows = 0;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "INSERT INTO Metge (Nif, Nom, Cognom, Correu, Telefon, Horari, Especialitat, HoraExtra)" +
                    " VALUES ('" + metge.getNif().replaceAll("'", "@") + "'," +
                    "'" + metge.getNom().replaceAll("'", "@") + "'," +
                    "'" + metge.getCognom().replaceAll("'", "@") + "'," +
                    "'" + metge.getCorreu().replaceAll("'", "@") + "'," +
                    "'" + metge.getTelefon() + "'," +
                    "'" + metge.getHorari().replaceAll("'", "@") + "'," +
                    "'" + metge.getEspecialitat().replaceAll("'", "@") + "'," +
                    "'" + metge.getHoresExtres() + "'," +
                    "'" + metge.getCorreu().replaceAll("'", "@") + ");";
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
     * Elimina medico
     */
    public static boolean deletePersona(String nif) {
        Connection dbconection = null;
        Statement statement = null;
        String sql;
        int nrows = 0;
        try {
            dbconection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconection.createStatement();
            sql = "delete from Metge where nif=" + nif + ";";
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
     * Consulta los medicos que tengan una especialidad en particular
     */
    public static ArrayList<Metge> getEspecialitatMetges() {
        ArrayList<Metge> metges = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT Nom, Cognom, Especialitat FROM Metge ORDER BY especialitat;";
            result = statement.executeQuery(sql);

            while (result.next()) {
                Metge metge = new Metge();
                metge.setNom(result.getString("nom"));
                metge.setCognom(result.getString("cognom"));
                metge.setEspecialitat(result.getString("especialitat"));
                metges.add(metge);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return metges;
    }

    public static ArrayList<Metge> getEspecialitats() {
        ArrayList<Metge> metges = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT Cognom, Nom, Especialitat FROM Metge ORDER BY Cognom DESC;";
            result = statement.executeQuery(sql);

            while (result.next()) {
                Metge metge = new Metge();
                metge.setCognom(result.getString("cognom"));
                metge.setNom(result.getString("nom"));
                metge.setEspecialitat(result.getString("especialitat"));
                metges.add(metge);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return metges;
    }


}
