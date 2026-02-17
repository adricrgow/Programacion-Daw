package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ExamenTeoricoDAO {
    // CREATE
    public static void insertar(ExamenTeorico e) {
    String sql = "INSERT INTO examen_teorico VALUES (?, ?, ?, ?)";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, e.getId());
        ps.setString(2, e.getTitulo());
        ps.setInt(3, e.getNumeroPreguntas());
        ps.setString(4, e.getFecha());
        ps.executeUpdate();
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
    }
    // READ (SELECT)
    public static ArrayList<ExamenTeorico> listar() {
    ArrayList<ExamenTeorico> examenes = new ArrayList<>();
    String sql = "SELECT * FROM examen_teorico";
    try (Connection conn = Conexion.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
        ExamenTeorico examen = new ExamenTeorico(
            rs.getInt("id"),
            rs.getString("titulo"),
            rs.getInt("numero_preguntas"),
            rs.getString("fecha")
        );
        examenes.add(examen);
        }
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
    return examenes;
    }
    // UPDATE
    public static void actualizar(ExamenTeorico e) {
    String sql = "UPDATE examen_teorico SET titulo=?, numero_preguntas=?, fecha=? WHERE id=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setString(1, e.getTitulo());
    ps.setInt(2, e.getNumeroPreguntas());
    ps.setString(3, e.getFecha());
    ps.setInt(4, e.getId());
    ps.executeUpdate();
    } catch (SQLException ex) {
    System.err.println(ex.getMessage());
    }
    }
    // DELETE
    public static void borrar(int id) {
    String sql = "DELETE FROM examen_teorico WHERE id=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setInt(1, id);
    ps.executeUpdate();
    } catch (SQLException ex) {
    System.err.println(ex.getMessage());
    }
}
}
