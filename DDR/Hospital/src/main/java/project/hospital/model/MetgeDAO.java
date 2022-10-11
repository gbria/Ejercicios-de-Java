package project.hospital.model;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;


public class MetgeDAO {

    private static final String DB_URL = "jdbc:postgres://tyke.db.elephantsql.com/irmktuvg";

    private static final String DB_USER = "irmktuvg";

    private static final String DB_PASSWD = "iiXhfkefM1ki9GBoR1EcU0HFdzQVaweJ";

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

            while(result.next()) {
                Metge metge = new Metge();
                metge.setNif(result.getString("nif"));
                metge.setNom(result.getString("nom"));
                metge.setCognom(result.getString("cognom"));
                metge.setEspecialitat(result.getString("especialitat"));
                metge.setCorreu(result.getString("correu"));
                metge.setHoresExtres(result.getInt("hora extra"));

                metges.add(metge);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }

        return metges;
    }
}
