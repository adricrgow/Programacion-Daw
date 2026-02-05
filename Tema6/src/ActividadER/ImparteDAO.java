package ActividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ImparteDAO {
	// CREATE
	public static void insertar(int idEmpleado, int idEdicion) {
		String sql = "INSERT INTO imparte VALUES (?, ?)";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, idEmpleado);
			ps.setInt(2, idEdicion);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// READ
	public static void listar() {
		String sql = "SELECT * FROM imparte";
		try (Connection conn = Conexion.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				System.out.println("empleado: " + rs.getInt("id_empleado") + " - edicion: " + rs.getInt("id_edicion"));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// UPDATE (cambiar id_edicion para un empleado)
	public static void actualizar(int idEmpleado, int idEdicion, int nuevoIdEdicion) {
		String sql = "UPDATE imparte SET id_edicion=? WHERE id_empleado=? AND id_edicion=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, nuevoIdEdicion);
			ps.setInt(2, idEmpleado);
			ps.setInt(3, idEdicion);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// DELETE
	public static void borrar(int idEmpleado, int idEdicion) {
		String sql = "DELETE FROM imparte WHERE id_empleado=? AND id_edicion=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, idEmpleado);
			ps.setInt(2, idEdicion);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
