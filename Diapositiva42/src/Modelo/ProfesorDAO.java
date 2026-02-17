package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProfesorDAO {
    // CREATE
    public static void insertar(Profesor2 p) {
    String sql = "INSERT INTO profesor VALUES (?, ?, ?, ?, ?)";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, p.getId());
        ps.setString(2, p.getNif());
        ps.setString(3, p.getNombre());
        ps.setString(4, p.getApellido1());
        ps.setString(5, p.getApellido2());
        ps.executeUpdate();
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    }
    // READ (SELECT)
    public static ArrayList<Profesor2> listar() {
    ArrayList<Profesor2> profesores = new ArrayList<>();
    String sql = "SELECT * FROM profesor";
    try (Connection conn = Conexion.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
        Profesor2 profesor = new Profesor2(
            rs.getInt("id"),
            rs.getString("nif"),
            rs.getString("nombre"),
            rs.getString("apellido1"),
            rs.getString("apellido2")
        );
        profesores.add(profesor);
        }
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    return profesores;
    }
    // UPDATE
    public static void actualizar(Profesor2 p) {
    String sql = "UPDATE profesor SET nombre=?, apellido1=?, apellido2=? WHERE id=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setString(1, p.getNombre());
    ps.setString(2, p.getApellido1());
    ps.setString(3, p.getApellido2());
    ps.setInt(4, p.getId());
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
    }
    // DELETE
    public static void borrar(int id) {
    String sql = "DELETE FROM profesor WHERE id=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setInt(1, id);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
}
    
}
