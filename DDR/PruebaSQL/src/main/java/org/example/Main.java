package org.example;

public class Main {
    private static final String DB_URL = "jdbc:postgres://surus.db.elephantsql.com/npdhgkxj";

    private static final String DB_USER = "npdhgkxj";

    private static final String DB_PASSWD = "KZF4yhbCZGCuKftGpDMQ-niiYKPvA5B6";

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
                metge.setMetgeId(result.getInt("serial"));
                metge.setNif(result.getString("nif"));
                metge.setNom(result.getString("nom"));
                metge.setCognom(result.getString("cognom"));
                metge.setEspecialitat(result.getString("especialitat"));
                metge.setcCorreu(result.getString("correu"));
                metge.setHoraExtra(result.getInt("hora extra"));

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

    public static void main(String[] args) {


    }
}
