package ActividadER.Diapositiva28;

import ActividadER.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EditorialPublicaLibroDAO {
    // CREATE
    public static void insertar(int idEditorial, int idLibro) {
        String sql = "INSERT INTO editorial_publica_libro VALUES (?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idEditorial);
            ps.setInt(2, idLibro);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {
        String sql = "SELECT * FROM editorial_publica_libro";
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("editorial: " + rs.getInt("id_editorial") + " - libro: " + rs.getInt("id_libro"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int idEditorial, int idLibro, int nuevoIdLibro) {
        String sql = "UPDATE editorial_publica_libro SET id_libro=? WHERE id_editorial=? AND id_libro=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, nuevoIdLibro);
            ps.setInt(2, idEditorial);
            ps.setInt(3, idLibro);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int idEditorial, int idLibro) {
        String sql = "DELETE FROM editorial_publica_libro WHERE id_editorial=? AND id_libro=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idEditorial);
            ps.setInt(2, idLibro);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

}
