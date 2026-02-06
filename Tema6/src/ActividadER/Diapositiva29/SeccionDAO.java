package ActividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SeccionDAO {
    
    // CREATE
    public static void insertar(int id, String titulo, int extension, int numeroRegistro) {
        String sql = "INSERT INTO seccion VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, titulo);
            ps.setInt(3, extension);
            ps.setInt(4, numeroRegistro);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {
        String sql = "SELECT * FROM seccion";
        try (Connection conn = Conexion.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " + rs.getString("titulo") + " - " +
                    rs.getInt("extension") + " - " + rs.getInt("numero_registro")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int id, String titulo, int extension, int numeroRegistro) {
        String sql = "UPDATE seccion SET titulo=?, extension=?, numero_registro=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, titulo);
            ps.setInt(2, extension);
            ps.setInt(3, numeroRegistro);
            ps.setInt(4, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int id) {
        String sql = "DELETE FROM seccion WHERE id=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
