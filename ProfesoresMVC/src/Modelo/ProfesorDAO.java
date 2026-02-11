package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfesorDAO {

    public List<Profesor> listar() {
        List<Profesor> lista = new ArrayList<>();
        String sql = "SELECT id, nombre, apellido1, apellido2, especialidad, telefono FROM profesor";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(new Profesor(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido1"),
                        rs.getString("apellido2"), rs.getString("especialidad"), rs.getString("telefono")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void insertar(Profesor p) {
        String sql = "INSERT INTO profesor (id, nombre, apellido1, apellido2, especialidad, telefono) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, p.getId());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getApellido1());
            ps.setString(4, p.getApellido2());
            ps.setString(5, p.getEspecialidad());
            ps.setString(6, p.getTelefono());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizar(Profesor p) {
        String sql = "UPDATE profesor SET nombre=?, apellido1=?, apellido2=?, especialidad=?, telefono=? WHERE id=?";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getApellido1());
            ps.setString(3, p.getApellido2());
            ps.setString(4, p.getEspecialidad());
            ps.setString(5, p.getTelefono());
            ps.setInt(6, p.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM profesor WHERE id=?";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
