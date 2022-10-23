package project.hospital.model;

import java.sql.*;
import java.util.ArrayList;

public class ConsultaDAO {
    private static final String DB_URL = "jdbc:postgresql://surus.db.elephantsql.com/kgoicfvc";

    private static final String DB_USER = "kgoicfvc";

    private static final String DB_PASSWD = "X1ljbK7jBcrct6TtLDWiQPmmTg14LjO9";

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

            while (result.next()) {
                Consulta consulta = new Consulta();
                consulta.setData(result.getString("data"));
                consulta.setHora(result.getInt("hora"));
                consulta.setConsulta(result.getInt("consulta"));

                consultas.add(consulta);
            }

            result.close();
            statement.close();
            dbconnection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return consultas;
    }

    /**
     * Consulta 1
     * Asgnación de consultas de pacientes a partir del cuadre medic d'aquesta especialitat
     *
     * SELECT C.nifpacient, C.data, C.hora, C.consulta
     * FROM cita C INNER JOIN metge M ON C.nifmetge=M.nifmetge
     * WHERE UPPER(M.especialitat) LIKE UPPER('Capçalera')
     */

    /**
     *Consulta 2
     *
     * SELECT C.data, C.hora, C.consulta
     * FROM cita C INNER JOIN metge M ON C.nifmetge=M.nifmetge
     * WHERE M.nifmetge = '47901072F'
     * */

    /**
     *Consulta 3
     *
     * SELECT *
     * FROM cita
     * WHERE citaid = 3
     *
     * 4 FUNCIONES
     * ALTAS: INSERT INTO
     * BAJAS: DELETE
     * MODIFICACIONES: UPDATE
     * CONSULTA: SELECT * FROM cita
     * */

    /**
     * Consulta 4
     *
     * SELECT COUNT(*) AS numConslt
     * FROM metge M INNER JOIN cita C ON M.nifmetge=C.nifmetge
     * WHERE C.data BETWEEN '2022-09-30' AND '2022-10-02' AND UPPER(C.nifmetge) = UPPER('47901072F')
     * */

    /**
     * Consulta 5
     *
     * SELECT C.data, P.malaltia, P.prova, P.recepta
     * FROM pacient P INNER JOIN cita C ON P.nifpacient=C.nifpacient
     * WHERE UPPER(P.nifpacient) = UPPER('47901072R')
     * */


}
