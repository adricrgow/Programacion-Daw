package ActividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EscribeDAO {
    
    // CREATE
    public static void insertar(int idPeriodista, int numeroRegistro) {
        String sql = "INSERT INTO escribe VALUES (?, ?)";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idPeriodista);
            ps.setInt(2, numeroRegistro);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {
        String sql = "SELECT * FROM escribe";
        try (Connection conn = Conexion.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id_periodista") + " - " + rs.getInt("numero_registro")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int idPeriodistaBuscado, int numeroRegistroBuscado, int idPeriodistaNuevo, int numeroRegistroNuevo) {
        String sql = "UPDATE escribe SET id_periodista=?, numero_registro=? WHERE id_periodista=? AND numero_registro=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idPeriodistaNuevo);
            ps.setInt(2, numeroRegistroNuevo);
            ps.setInt(3, idPeriodistaBuscado);
            ps.setInt(4, numeroRegistroBuscado);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int idPeriodista, int numeroRegistro) {
        String sql = "DELETE FROM escribe WHERE id_periodista=? AND numero_registro=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idPeriodista);
            ps.setInt(2, numeroRegistro);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
