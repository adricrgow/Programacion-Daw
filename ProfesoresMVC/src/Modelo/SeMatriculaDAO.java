package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SeMatriculaDAO {

    public List<SeMatricula> listar() {
        List<SeMatricula> lista = new ArrayList<>();
        String sql = "SELECT numero_matricula, id_curso, codigo_asignatura FROM se_matricula";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(new SeMatricula(rs.getInt("numero_matricula"), rs.getInt("id_curso"), rs.getInt("codigo_asignatura")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return lista;
    }

    public void insertar(SeMatricula s) {
        String sql = "INSERT INTO se_matricula (numero_matricula, id_curso, codigo_asignatura) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, s.getNumeroMatricula());
            ps.setInt(2, s.getIdCurso());
            ps.setInt(3, s.getCodigoAsignatura());
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void actualizar(int numeroMatricula, int idCurso, int codigoAntiguo, int codigoNuevo) {
        String sql = "UPDATE se_matricula SET codigo_asignatura=? WHERE numero_matricula=? AND id_curso=? AND codigo_asignatura=?";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigoNuevo);
            ps.setInt(2, numeroMatricula);
            ps.setInt(3, idCurso);
            ps.setInt(4, codigoAntiguo);
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void eliminar(int numeroMatricula, int idCurso, int codigoAsignatura) {
        String sql = "DELETE FROM se_matricula WHERE numero_matricula=? AND id_curso=? AND codigo_asignatura=?";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, numeroMatricula);
            ps.setInt(2, idCurso);
            ps.setInt(3, codigoAsignatura);
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
