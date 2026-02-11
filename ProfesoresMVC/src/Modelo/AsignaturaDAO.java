package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AsignaturaDAO {

    public List<Asignatura> listar() {
        List<Asignatura> lista = new ArrayList<>();
        String sql = "SELECT codigo, nombre, numero_horas FROM asignatura";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(new Asignatura(rs.getInt("codigo"), rs.getString("nombre"), rs.getInt("numero_horas")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return lista;
    }

    public void insertar(Asignatura a) {
        String sql = "INSERT INTO asignatura (codigo, nombre, numero_horas) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, a.getCodigo());
            ps.setString(2, a.getNombre());
            ps.setInt(3, a.getNumeroHoras());
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void actualizar(Asignatura a) {
        String sql = "UPDATE asignatura SET nombre=?, numero_horas=? WHERE codigo=?";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, a.getNombre());
            ps.setInt(2, a.getNumeroHoras());
            ps.setInt(3, a.getCodigo());
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void eliminar(int codigo) {
        String sql = "DELETE FROM asignatura WHERE codigo=?";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
