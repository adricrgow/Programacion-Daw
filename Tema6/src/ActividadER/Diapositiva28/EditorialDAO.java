package ActividadER.Diapositiva28;

import ActividadER.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EditorialDAO {
	// CREATE
	public static void insertar(int id, String nombre, String direccion, String telefono, int idLocalidad) {
		String sql = "INSERT INTO editorial VALUES (?, ?, ?, ?, ?)";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.setString(2, nombre);
			ps.setString(3, direccion);
			ps.setString(4, telefono);
			ps.setInt(5, idLocalidad);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// READ
	public static void listar() {
		String sql = "SELECT * FROM editorial";
		try (Connection conn = Conexion.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " - " + rs.getString("nombre") + " - " + rs.getString("direccion") + " - " + rs.getString("telefono") + " - localidad_id: " + rs.getInt("id_localidad"));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// UPDATE
	public static void actualizar(int id, String nuevoNombre, String nuevaDireccion, String nuevoTelefono, int nuevoIdLocalidad) {
		String sql = "UPDATE editorial SET nombre=?, direccion=?, telefono=?, id_localidad=? WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, nuevoNombre);
			ps.setString(2, nuevaDireccion);
			ps.setString(3, nuevoTelefono);
			ps.setInt(4, nuevoIdLocalidad);
			ps.setInt(5, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// DELETE
	public static void borrar(int id) {
		String sql = "DELETE FROM editorial WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
