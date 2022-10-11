package project.hospital.model;

import java.sql.*;
import java.util.ArrayList;

public class InfermerDAO {
    private static final String DB_URL = "jdbc:postgres://tyke.db.elephantsql.com/irmktuvg";

    private static final String DB_USER = "irmktuvg";

    private static final String DB_PASSWD = "iiXhfkefM1ki9GBoR1EcU0HFdzQVaweJ";

    public static ArrayList<Infermer> getHospitalInfermers() {
        ArrayList<Infermer> infermers = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT * FROM Infermer";
            result = statement.executeQuery(sql);

            while (result.next()) {
                Infermer infermer = new Infermer();
                infermer.setNif(result.getString("nif"));
                infermer.setNom(result.getString("nom"));
                infermer.setCognom(result.getString("cognom"));
                infermer.setTelefon(result.getInt("telefon"));
                infermer.setHorari(result.getString("horari"));

                infermers.add(infermer);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return infermers;
    }

    public static boolean addInfermer(Infermer infermer) {

        boolean check = false;
        Connection dbconnection = null;
        Statement statement = null;
        String sql;
        int nrows = 0;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "INSERT INTO Infermer (Nif, Nom, Cognom, Correu, Telefon, Horari)" +
                    " VALUES ('" + infermer.getNif().replaceAll("'", "@") + "'," +
                    "'" + infermer.getNom().replaceAll("'", "@") + "'," +
                    "'" + infermer.getCognom().replaceAll("'", "@") + "'," +
                    "'" + infermer.getCorreu().replaceAll("'", "@") + "'," +
                    "'" + infermer.getTelefon() + "'," +
                    "'" + infermer.getHorari().replaceAll("'", "@") + "'," + ");";
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

    public static boolean deleteInfermer(String nif) {
        Connection dbconection = null;
        Statement statement = null;
        String sql;
        int nrows = 0;
        try {
            dbconection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconection.createStatement();
            sql = "delete from Infermer where nif=" + nif + ";";
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

}
