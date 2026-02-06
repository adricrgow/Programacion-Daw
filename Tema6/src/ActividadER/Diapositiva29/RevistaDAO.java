package ActividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RevistaDAO {
    
    // CREATE
    public static void insertar(int numeroRegistro, String titulo, String tipo, String periodicidad) {
        String sql = "INSERT INTO revista VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, numeroRegistro);
            ps.setString(2, titulo);
            ps.setString(3, tipo);
            ps.setString(4, periodicidad);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {
        String sql = "SELECT * FROM revista";
        try (Connection conn = Conexion.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                    rs.getInt("numero_registro") + " - " + rs.getString("titulo") + " - " +
                    rs.getString("tipo") + " - " + rs.getString("periodicidad")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int numeroRegistro, String titulo, String tipo, String periodicidad) {
        String sql = "UPDATE revista SET titulo=?, tipo=?, periodicidad=? WHERE numero_registro=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, titulo);
            ps.setString(2, tipo);
            ps.setString(3, periodicidad);
            ps.setInt(4, numeroRegistro);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int numeroRegistro) {
        String sql = "DELETE FROM revista WHERE numero_registro=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, numeroRegistro);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
