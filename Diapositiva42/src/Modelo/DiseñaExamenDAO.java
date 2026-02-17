package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DiseñaExamenDAO {
    // CREATE
    public static void insertar(DiseñaExamen d) {
    String sql = "INSERT INTO diseña_examen VALUES (?, ?, ?)";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, d.getIdExamen());
        ps.setInt(2, d.getIdProfesor());
        ps.setString(3, d.getFecha());
        ps.executeUpdate();
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    }
    // READ (SELECT)
    public static ArrayList<DiseñaExamen> listar() {
    ArrayList<DiseñaExamen> examenes = new ArrayList<>();
    String sql = "SELECT * FROM diseña_examen";
    try (Connection conn = Conexion.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
        DiseñaExamen examen = new DiseñaExamen(
            rs.getInt("id_examen"),
            rs.getInt("id_profesor"),
            rs.getString("fecha")
        );
        examenes.add(examen);
        }
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    return examenes;

    }
    // UPDATE
    public static void actualizar(DiseñaExamen d) {
    String sql = "UPDATE diseña_examen SET fecha=? WHERE id_examen=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setString(1, d.getFecha());
    ps.setInt(2, d.getIdExamen());
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
