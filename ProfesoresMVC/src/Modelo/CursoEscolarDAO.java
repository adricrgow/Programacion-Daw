package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoEscolarDAO {

    public List<CursoEscolar> listar() {
        List<CursoEscolar> lista = new ArrayList<>();
        String sql = "SELECT id, año_inicio, año_fin FROM curso_escolar";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(new CursoEscolar(rs.getInt("id"), rs.getInt("año_inicio"), rs.getInt("año_fin")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return lista;
    }

    public void insertar(CursoEscolar c) {
        String sql = "INSERT INTO curso_escolar (id, año_inicio, año_fin) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, c.getId());
            ps.setInt(2, c.getAnoInicio());
            ps.setInt(3, c.getAnoFin());
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void actualizar(CursoEscolar c) {
        String sql = "UPDATE curso_escolar SET año_inicio=?, año_fin=? WHERE id=?";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, c.getAnoInicio());
            ps.setInt(2, c.getAnoFin());
            ps.setInt(3, c.getId());
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM curso_escolar WHERE id=?";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
