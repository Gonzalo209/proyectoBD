package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {


    private static final String URL = "jdbc:mysql://localhost:3306/proyecto_final";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Gonzalo209";
    private Connection connection;
    private static PreparedStatement insertarPaciente;

    public Conexion() {

        try {

            connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);

            insertarPaciente = connection.prepareStatement(
                    "INSERT INTO paciente" +
                            "(id, edad, peso, talla, padecimiento, num_estudios)" +
                            " VALUES (?, ?, ?, ?, ?, ?)");


        } catch (SQLException e) {

            throw new RuntimeException(e);

        }

    }

    public int insrtarPaciente(int id, int edad, float peso, float talla, String padecimiento, int numEstudios) {

        int resultado = 0;

        try {

            insertarPaciente.setInt(1, id);
            insertarPaciente.setInt(2, edad);
            insertarPaciente.setFloat(3, peso);
            insertarPaciente.setFloat(4, talla);
            insertarPaciente.setString(5, padecimiento);
            insertarPaciente.setInt(6, numEstudios);

        } catch (SQLException e) {

        }

        return resultado;

    }

    public void cerrarConexion() {

        try {

            connection.close();

        } catch (SQLException e) {


        }

    }

}