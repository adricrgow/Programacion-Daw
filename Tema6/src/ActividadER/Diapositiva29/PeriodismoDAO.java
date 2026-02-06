package ActividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PeriodismoDAO {
    
    // CREATE
    public static void insertar(int id, String nombre, String apellido1, String apellido2, String telefono, String especialidad) {
        String sql = "INSERT INTO periodista VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, apellido1);
            ps.setString(4, apellido2);
            ps.setString(5, telefono);
            ps.setString(6, especialidad);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {
        String sql = "SELECT * FROM periodista";
        try (Connection conn = Conexion.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " + rs.getString("nombre") + " - " +
                    rs.getString("apellido1") + " " + rs.getString("apellido2") + " - " +
                    rs.getString("especialidad")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int id, String telefono, String especialidad) {
        String sql = "UPDATE periodista SET telefono=?, especialidad=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, telefono);
            ps.setString(2, especialidad);
            ps.setInt(3, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int id) {
        String sql = "DELETE FROM periodista WHERE id=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
