package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DiseñaPracticaDAO {
    // CREATE
    public static void insertar(DiseñaPractica dp) {
    String sql = "INSERT INTO diseña_practica VALUES (?, ?, ?)";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, dp.getIdPractica());
        ps.setInt(2, dp.getIdProfesor());
        ps.setString(3, dp.getFecha());
        ps.executeUpdate();
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    }
    // READ (SELECT)
    public static ArrayList<DiseñaPractica> listar() {
    ArrayList<DiseñaPractica> practicas = new ArrayList<>();
    String sql = "SELECT * FROM diseña_practica";
    try (Connection conn = Conexion.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
        DiseñaPractica practica = new DiseñaPractica(
            rs.getInt("id_practica"),
            rs.getInt("id_profesor"),
            rs.getString("fecha")
        );
        practicas.add(practica);
        }
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    return practicas;
    }
    // UPDATE
    public static void actualizar(DiseñaPractica dp) {
    String sql = "UPDATE diseña_practica SET fecha=? WHERE id_practica=? AND id_profesor=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setString(1, dp.getFecha());
    ps.setInt(2, dp.getIdPractica());
    ps.setInt(3, dp.getIdProfesor());
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
