package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HaceDAO {
    // CREATE
    public static void insertar(Hace h) {
    String sql = "INSERT INTO hace VALUES (?, ?, ?)";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, h.getIdAlumno());
        ps.setInt(2, h.getIdExamen());
        ps.setDouble(3, h.getNota());
        ps.executeUpdate();
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    }
    // READ (SELECT)
    public static ArrayList<Hace> listar() {
    ArrayList<Hace> hechos = new ArrayList<>();
    String sql = "SELECT * FROM hace";
    try (Connection conn = Conexion.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
        Hace hecho = new Hace(
            rs.getInt("id_alumno"),
            rs.getInt("id_examen"),
            rs.getDouble("nota")
        );
        hechos.add(hecho);
        }
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    return hechos;
    }
    // UPDATE
    public static void actualizar(Hace h) {
    String sql = "UPDATE hace SET nota=? WHERE id_alumno=? AND id_examen=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setDouble(1, h.getNota());
    ps.setInt(2, h.getIdAlumno());
    ps.setInt(3, h.getIdExamen());
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
