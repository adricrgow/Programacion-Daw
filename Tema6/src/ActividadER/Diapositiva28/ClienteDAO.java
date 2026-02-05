package ActividadER.Diapositiva28;

import ActividadER.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteDAO {
	// CREATE
	public static void insertar(int id, String nombre, String apellido1, String apellido2, String direccion, String email, String telefono, int idLocalidad) {
		String sql = "INSERT INTO cliente VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.setString(2, nombre);
			ps.setString(3, apellido1);
			ps.setString(4, apellido2);
			ps.setString(5, direccion);
			ps.setString(6, email);
			ps.setString(7, telefono);
			ps.setInt(8, idLocalidad);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// READ
	public static void listar() {
		String sql = "SELECT * FROM cliente";
		try (Connection conn = Conexion.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " - " + rs.getString("nombre") + " " + rs.getString("apellido1") + " " + rs.getString("apellido2") + " - " + rs.getString("direccion") + " - " + rs.getString("email") + " - " + rs.getString("telefono") + " - localidad_id: " + rs.getInt("id_localidad"));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// UPDATE
	public static void actualizar(int id, String nuevoNombre, String nuevoApellido1, String nuevoApellido2, String nuevaDireccion, String nuevoEmail, String nuevoTelefono, int nuevoIdLocalidad) {
		String sql = "UPDATE cliente SET nombre=?, apellido1=?, apellido2=?, direccion=?, email=?, telefono=?, id_localidad=? WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, nuevoNombre);
			ps.setString(2, nuevoApellido1);
			ps.setString(3, nuevoApellido2);
			ps.setString(4, nuevaDireccion);
			ps.setString(5, nuevoEmail);
			ps.setString(6, nuevoTelefono);
			ps.setInt(7, nuevoIdLocalidad);
			ps.setInt(8, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// DELETE
	public static void borrar(int id) {
		String sql = "DELETE FROM cliente WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
