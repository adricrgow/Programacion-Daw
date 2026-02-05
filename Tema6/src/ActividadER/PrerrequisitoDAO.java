package ActividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrerrequisitoDAO {
	// CREATE
	public static void insertar(int idCurso, int idCursoRequerido) {
		String sql = "INSERT INTO prerrequisito VALUES (?, ?)";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, idCurso);
			ps.setInt(2, idCursoRequerido);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// READ
	public static void listar() {
		String sql = "SELECT * FROM prerrequisito";
		try (Connection conn = Conexion.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				System.out.println("curso: " + rs.getInt("id_curso") + " <- prereq: " + rs.getInt("id_curso_requerido"));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// UPDATE (cambiar id_curso_requerido para una pareja)
	public static void actualizar(int idCurso, int idCursoRequerido, int nuevoIdCursoRequerido) {
		String sql = "UPDATE prerrequisito SET id_curso_requerido=? WHERE id_curso=? AND id_curso_requerido=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, nuevoIdCursoRequerido);
			ps.setInt(2, idCurso);
			ps.setInt(3, idCursoRequerido);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// DELETE (por pareja clave compuesta)
	public static void borrar(int idCurso, int idCursoRequerido) {
		String sql = "DELETE FROM prerrequisito WHERE id_curso=? AND id_curso_requerido=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, idCurso);
			ps.setInt(2, idCursoRequerido);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
