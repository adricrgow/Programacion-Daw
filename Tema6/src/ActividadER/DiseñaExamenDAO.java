package ActividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DiseñaExamenDAO {
    // CREATE
    public static void insertar(int id_examen, int id_profesor, String fecha) {
    String sql = "INSERT INTO diseña_examen VALUES (?, ?, ?)";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, id_examen);
        ps.setInt(2, id_profesor);
        ps.setString(3, fecha);
        ps.executeUpdate();
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    }
    // READ (SELECT)
    public static void listar() {
    String sql = "SELECT * FROM diseña_examen";
    try (Connection conn = Conexion.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
        System.out.println(
        rs.getInt("id_examen") + " - " + rs.getInt("id_profesor")
        );
    }
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    }
    // UPDATE
    public static void actualizar(int id_examen, String nuevaFecha) {
    String sql = "UPDATE diseña_examen SET fecha=? WHERE id_examen=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setString(1, nuevaFecha);
    ps.setInt(2, id_examen);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
    }
    // DELETE
    public static void borrar(int id_examen) {
    String sql = "DELETE FROM diseña_examen WHERE id_examen=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setInt(1, id_examen);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
}
}
