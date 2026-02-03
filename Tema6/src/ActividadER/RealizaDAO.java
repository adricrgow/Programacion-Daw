package ActividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RealizaDAO {
    // CREATE
    public static void insertar(int id_practica, int id_alumno, String fecha, double nota) {
    String sql = "INSERT INTO realiza VALUES (?, ?, ?, ?)";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, id_practica);
        ps.setInt(2, id_alumno);
        ps.setString(3, fecha);
        ps.setDouble(4, nota);
        ps.executeUpdate();
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    }
    // READ (SELECT)
    public static void listar() {
    String sql = "SELECT * FROM realiza";
    try (Connection conn = Conexion.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
        System.out.println(
        rs.getInt("id_practica") + " - " + rs.getInt("id_alumno")
        );
    }
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    }
    // UPDATE
    public static void actualizar(int id_practica, int id_alumno, double nuevaNota) {
    String sql = "UPDATE realiza SET nota=? WHERE id_practica=? AND id_alumno=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setDouble(1, nuevaNota);
    ps.setInt(2, id_practica);
    ps.setInt(3, id_alumno);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
    }
    // DELETE
    public static void borrar(int id_practica, int id_alumno) {
    String sql = "DELETE FROM realiza WHERE id_practica=? AND id_alumno=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setInt(1, id_practica);
    ps.setInt(2, id_alumno);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
}
}
