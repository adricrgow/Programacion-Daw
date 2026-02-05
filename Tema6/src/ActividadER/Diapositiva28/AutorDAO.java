package ActividadER.Diapositiva28;

import ActividadER.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AutorDAO {
	// CREATE
	public static void insertar(int id, String nombre, String apellido1, String apellido2, String url, String telefono, String direccion, int idLocalidad) {
		String sql = "INSERT INTO autor VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.setString(2, nombre);
			ps.setString(3, apellido1);
			ps.setString(4, apellido2);
			ps.setString(5, url);
			ps.setString(6, telefono);
			ps.setString(7, direccion);
			ps.setInt(8, idLocalidad);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// READ
	public static void listar() {
		String sql = "SELECT * FROM autor";
		try (Connection conn = Conexion.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " - " + rs.getString("nombre") + " " + rs.getString("apellido1") + " " + rs.getString("apellido2") + " - " + rs.getString("url") + " - " + rs.getString("telefono") + " - " + rs.getString("direccion") + " - localidad_id: " + rs.getInt("id_localidad"));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// UPDATE
	public static void actualizar(int id, String nuevoNombre, String nuevoApellido1, String nuevoApellido2, String nuevaUrl, String nuevoTelefono, String nuevaDireccion, int nuevoIdLocalidad) {
		String sql = "UPDATE autor SET nombre=?, apellido1=?, apellido2=?, url=?, telefono=?, direccion=?, id_localidad=? WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, nuevoNombre);
			ps.setString(2, nuevoApellido1);
			ps.setString(3, nuevoApellido2);
			ps.setString(4, nuevaUrl);
			ps.setString(5, nuevoTelefono);
			ps.setString(6, nuevaDireccion);
			ps.setInt(7, nuevoIdLocalidad);
			ps.setInt(8, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// DELETE
	public static void borrar(int id) {
		String sql = "DELETE FROM autor WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
