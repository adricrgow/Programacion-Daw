package ActividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DiseñaPracticaDAO {
    // CREATE
    public static void insertar(int id_practica, int id_profesor, String fecha) {
    String sql = "INSERT INTO diseña_practica VALUES (?, ?, ?)";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, id_practica);
        ps.setInt(2, id_profesor);
        ps.setString(3, fecha);
        ps.executeUpdate();
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    }
    // READ (SELECT)
    public static void listar() {
    String sql = "SELECT * FROM diseña_practica";
    try (Connection conn = Conexion.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
        System.out.println(
        rs.getInt("id_practica") + " - " + rs.getInt("id_profesor")
        );
    }
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    }
    // UPDATE
    public static void actualizar(int id_practica, int id_profesor, String nuevaFecha) {
    String sql = "UPDATE diseña_practica SET fecha=? WHERE id_practica=? AND id_profesor=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setString(1, nuevaFecha);
    ps.setInt(2, id_practica);
    ps.setInt(3, id_profesor);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
    }
    // DELETE
    public static void borrar(int id_practica, int id_profesor) {
    String sql = "DELETE FROM diseña_practica WHERE id_practica=? AND id_profesor=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setInt(1, id_practica);
    ps.setInt(2, id_profesor);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
}
}
