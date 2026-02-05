package ActividadER;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EdicionDAO {
	// CREATE
	public static void insertar(int id, Date fechaInicio, Date fechaFin, String horario, String lugar, int idCurso) {
		String sql = "INSERT INTO edicion VALUES (?, ?, ?, ?, ?, ?)";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.setDate(2, fechaInicio);
			ps.setDate(3, fechaFin);
			ps.setString(4, horario);
			ps.setString(5, lugar);
			ps.setInt(6, idCurso);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// READ (SELECT)
	public static void listar() {
		String sql = "SELECT * FROM edicion";
		try (Connection conn = Conexion.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				System.out.println(
					rs.getInt("id") + " - " + rs.getDate("fecha_inicio") + " - " + rs.getDate("fecha_fin") + " - " + rs.getString("horario") + " - " + rs.getString("lugar") + " - curso_id: " + rs.getInt("id_curso")
				);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// UPDATE
	public static void actualizar(int id, Date nuevaFechaInicio, Date nuevaFechaFin, String nuevoHorario, String nuevoLugar, int nuevoIdCurso) {
		String sql = "UPDATE edicion SET fecha_inicio=?, fecha_fin=?, horario=?, lugar=?, id_curso=? WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setDate(1, nuevaFechaInicio);
			ps.setDate(2, nuevaFechaFin);
			ps.setString(3, nuevoHorario);
			ps.setString(4, nuevoLugar);
			ps.setInt(5, nuevoIdCurso);
			ps.setInt(6, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// DELETE
	public static void borrar(int id) {
		String sql = "DELETE FROM edicion WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
