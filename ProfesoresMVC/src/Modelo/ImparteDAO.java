package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImparteDAO {

    public List<Imparte> listar() {
        List<Imparte> lista = new ArrayList<>();
        String sql = "SELECT id_profesor, codigo_asignatura FROM imparte";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(new Imparte(rs.getInt("id_profesor"), rs.getInt("codigo_asignatura")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return lista;
    }

    public void insertar(Imparte i) {
        String sql = "INSERT INTO imparte (id_profesor, codigo_asignatura) VALUES (?, ?)";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, i.getIdProfesor());
            ps.setInt(2, i.getCodigoAsignatura());
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void actualizar(int idProfesor, int codigoAntiguo, int codigoNuevo) {
        String sql = "UPDATE imparte SET codigo_asignatura=? WHERE id_profesor=? AND codigo_asignatura=?";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigoNuevo);
            ps.setInt(2, idProfesor);
            ps.setInt(3, codigoAntiguo);
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void eliminar(int idProfesor, int codigoAsignatura) {
        String sql = "DELETE FROM imparte WHERE id_profesor=? AND codigo_asignatura=?";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idProfesor);
            ps.setInt(2, codigoAsignatura);
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
