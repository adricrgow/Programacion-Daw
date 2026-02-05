package ActividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CursoDAO {
	// CREATE
	public static void insertar(int id, String nombre, String descripcion, int duracion, double coste) {
		String sql = "INSERT INTO curso VALUES (?, ?, ?, ?, ?)";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.setString(2, nombre);
			ps.setString(3, descripcion);
			ps.setInt(4, duracion);
			ps.setDouble(5, coste);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// READ (SELECT)
	public static void listar() {
		String sql = "SELECT * FROM curso";
		try (Connection conn = Conexion.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				System.out.println(
					rs.getInt("id") + " - " + rs.getString("nombre") + " - " + rs.getString("descripcion") + " - " + rs.getInt("duracion") + " - " + rs.getDouble("coste")
				);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// UPDATE
	public static void actualizar(int id, String nuevoNombre, String nuevaDescripcion, int nuevaDuracion, double nuevoCoste) {
		String sql = "UPDATE curso SET nombre=?, descripcion=?, duracion=?, coste=? WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, nuevoNombre);
			ps.setString(2, nuevaDescripcion);
			ps.setInt(3, nuevaDuracion);
			ps.setDouble(4, nuevoCoste);
			ps.setInt(5, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// DELETE
	public static void borrar(int id) {
		String sql = "DELETE FROM curso WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
