package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HaceDAO {
    // CREATE
    public static void insertar(int id_alumno, int id_examen, double nota) {
    String sql = "INSERT INTO hace VALUES (?, ?, ?)";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, id_alumno);
        ps.setInt(2, id_examen);
        ps.setDouble(3, nota);
        ps.executeUpdate();
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    }
    // READ (SELECT)
    public static void listar() {
    String sql = "SELECT * FROM hace";
    try (Connection conn = Conexion.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
        System.out.println(
        rs.getInt("id_alumno") + " - " + rs.getInt("id_examen")
        );
    }
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    }
    // UPDATE
    public static void actualizar(int id_alumno, int id_examen, double nuevaNota) {
    String sql = "UPDATE hace SET nota=? WHERE id_alumno=? AND id_examen=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setDouble(1, nuevaNota);
    ps.setInt(2, id_alumno);
    ps.setInt(3, id_examen);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
    }
    // DELETE
    public static void borrar(int id_alumno, int id_examen) {
    String sql = "DELETE FROM hace WHERE id_alumno=? AND id_examen=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setInt(1, id_alumno);
    ps.setInt(2, id_examen);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
}
}
