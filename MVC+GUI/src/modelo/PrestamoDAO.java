package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PrestamoDAO {
    // READ
    public ArrayList<Prestamo> listar() {
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        String sql = "SELECT id_prestamo, codigo_libro, dni_usuario FROM prestamo";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                prestamos.add(new Prestamo(
                        rs.getInt("id_prestamo"),
                        rs.getInt("codigo_libro"),
                        rs.getString("dni_usuario")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prestamos;
    }

    // CREATE
    public void insertar(Prestamo p) {
        String sql = "INSERT INTO prestamo (id_prestamo, codigo_libro, dni_usuario) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, p.getIdPrestamo());
            ps.setInt(2, p.getCodigoLibro());
            ps.setString(3, p.getDniUsuario());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void actualizar(Prestamo p) {
        String sql = "UPDATE prestamo SET codigo_libro=?, dni_usuario=? WHERE id_prestamo=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, p.getCodigoLibro());
            ps.setString(2, p.getDniUsuario());
            ps.setInt(3, p.getIdPrestamo());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(int idPrestamo) {
        String sql = "DELETE FROM prestamo WHERE id_prestamo=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idPrestamo);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}