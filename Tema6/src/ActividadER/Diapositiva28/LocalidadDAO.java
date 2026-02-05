package ActividadER.Diapositiva28;

import ActividadER.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LocalidadDAO {
	// CREATE
	public static void insertar(int id, String nombre, int idProvincia) {
		String sql = "INSERT INTO localidad VALUES (?, ?, ?)";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.setString(2, nombre);
			ps.setInt(3, idProvincia);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// READ
	public static void listar() {
		String sql = "SELECT * FROM localidad";
		try (Connection conn = Conexion.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				System.out.println("id: " + rs.getInt("id") + " - " + rs.getString("nombre") + " - provincia_id: " + rs.getInt("id_provincia"));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// UPDATE
	public static void actualizar(int id, String nuevoNombre, int nuevoIdProvincia) {
		String sql = "UPDATE localidad SET nombre=?, id_provincia=? WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, nuevoNombre);
			ps.setInt(2, nuevoIdProvincia);
			ps.setInt(3, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// DELETE
	public static void borrar(int id) {
		String sql = "DELETE FROM localidad WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
