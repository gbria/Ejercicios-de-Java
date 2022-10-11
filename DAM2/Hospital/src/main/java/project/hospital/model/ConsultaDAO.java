package project.hospital.model;

import java.sql.*;
import java.util.ArrayList;

public class ConsultaDAO {
    private static final String DB_URL = "jdbc:postgres://tyke.db.elephantsql.com/irmktuvg";

    private static final String DB_USER = "irmktuvg";

    private static final String DB_PASSWD = "iiXhfkefM1ki9GBoR1EcU0HFdzQVaweJ";

    public static ArrayList<Consulta> getHospitalConsulta() {
        ArrayList<Consulta> consultas = new ArrayList<>();
        Connection dbconnection = null;
        Statement statement = null;
        ResultSet result = null;
        String sql;

        try {
            dbconnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = dbconnection.createStatement();
            sql = "SELECT * FROM Consulta";
            result = statement.executeQuery(sql);

            while(result.next()) {
                Consulta consulta = new Consulta();
                consulta.setData(result.getString("data"));
                consulta.setHora(result.getInt("hora"));
                consulta.setConsulta(result.getInt("consulta"));

                consultas.add(consulta);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }

        return consultas;
    }

}
