package project.hospital.model;

import java.sql.*;
import java.util.ArrayList;

public class PacientDAO {


    private static final String DB_URL = "jdbc:postgresql://surus.db.elephantsql.com/kgoicfvc";

    private static final String DB_USER = "kgoicfvc";

    private static final String DB_PASSWD = "X1ljbK7jBcrct6TtLDWiQPmmTg14LjO9";

    /**
     * Consulta datos pacientes
     */
    public static ArrayList<Pacient> getHospitalPacients() {
        ArrayList<Pacient> pacients = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT * FROM Pacient;";
            result = statement.executeQuery(sql);

            while (result.next()) {
                Pacient pacient = new Pacient();
                pacient.setNif(result.getString("nif"));
                pacient.setNom(result.getString("nom"));
                pacient.setCognom(result.getString("cognom"));
                pacient.setEdat(result.getInt("edat"));
                pacient.setSexe(result.getString("sexe"));
                pacient.setTipusSang(result.getString("tipus sang"));
                pacient.setTelefon(result.getInt("telefon"));
                pacient.setCorreu(result.getString("correu"));
                pacient.setAlergia(result.getString("alergia"));
                pacient.setMalaltia(result.getString("malaltia"));
                pacient.setProva(result.getString("prova"));
                pacient.setRecepta(result.getString("recepta"));
                pacient.setRecepta(result.getString("opera"));

                pacients.add(pacient);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return pacients;
    }

    /**
     * Añade paciente
     */
    public static boolean addPacient(Pacient pacient) {
        boolean check = false;
        Connection dbconnection = null;
        Statement statement = null;
        String sql;
        int nrows = 0;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "INSERT INTO Pacient (Nif, Nom, Cognom, Correu, Telefon, Edat, Sexe, TipusSang, Alergia, Malaltia, Prova, Recepta)" +
                    " VALUES ('" + pacient.getNif().replaceAll("'", "@") + "'," +
                    "'" + pacient.getNom().replaceAll("'", "@") + "'," +
                    "'" + pacient.getCognom().replaceAll("'", "@") + "'," +
                    "'" + pacient.getCorreu().replaceAll("'", "@") + "'," +
                    "'" + pacient.getTelefon() + "'," +
                    "'" + pacient.getEdat() + "'," +
                    "'" + pacient.getSexe().replaceAll("'", "@") + "'," +
                    "'" + pacient.getTipusSang().replaceAll("'", "@") + "'," +
                    "'" + pacient.getAlergia().replaceAll("'", "@") + "'," +
                    "'" + pacient.getMalaltia().replaceAll("'", "@") + "'," +
                    "'" + pacient.getProva().replaceAll("'", "@") + "'," +
                    "'" + pacient.getRecepta().replaceAll("'", "@") + "'," + ");";
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
     * Elimina paciente
     */
    public static boolean deletePacient(String nif) {
        Connection dbconection = null;
        Statement statement = null;
        String sql;
        int nrows = 0;
        try {
            dbconection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconection.createStatement();
            sql = "delete from Pacient where nif=" + nif + ";";
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
     * Muestra los pacientes a operar
     */
    public static ArrayList<Pacient> getOpera() {
        ArrayList<Pacient> pacients = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT * FROM Pacient WHERE Opera like 'si';";
            result = statement.executeQuery(sql);

            while (result.next()) {
                Pacient pacient = new Pacient();
                pacient.setNif(result.getString("nif"));
                pacient.setNom(result.getString("nom"));
                pacient.setCognom(result.getString("cognom"));
                pacient.setEdat(result.getInt("edat"));
                pacient.setSexe(result.getString("sexe"));
                pacient.setTipusSang(result.getString("tipus sang"));
                pacient.setTelefon(result.getInt("telefon"));
                pacient.setCorreu(result.getString("correu"));
                pacient.setAlergia(result.getString("alergia"));
                pacient.setMalaltia(result.getString("malaltia"));
                pacient.setProva(result.getString("prova"));
                pacient.setRecepta(result.getString("recepta"));
                pacient.setRecepta(result.getString("opera"));

                pacients.add(pacient);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return pacients;
    }


}
