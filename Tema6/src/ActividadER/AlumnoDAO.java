package ActividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlumnoDAO {
    // CREATE
	public static void insertar(int id,String nif,String grupo, String nombre, String apellido1, String apellido2) {
	String sql = "INSERT INTO alumno VALUES (?, ?, ?, ?, ?, ?)";
	try (Connection conn = Conexion.getConnection();
	PreparedStatement ps = conn.prepareStatement(sql)) {
		ps.setInt(1, id);
		ps.setString(2, nif);
		ps.setString(3, grupo);
		ps.setString(4, nombre);
		ps.setString(5, apellido1);
		ps.setString(6, apellido2);
		ps.executeUpdate();
	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
	}

    // READ (SELECT)
	public static void listar() {
	String sql = "SELECT * FROM alumno";
	try (Connection conn = Conexion.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql)) {
		while (rs.next()) {
		System.out.println(
		rs.getInt("id") + " - "+ rs.getString("nif") + "-" + rs.getString("grupo") + " - " + rs.getString("nombre") + " " + rs.getString("apellido1") + " " + rs.getString("apellido2")
		);
	}
	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
	}


    // UPDATE
	public static void actualizar(int id, String nuevoNombre, String nuevoApellido1, String nuevoApellido2) {
	String sql = "UPDATE alumno SET nombre=?, apellido1=?, apellido2=? WHERE id=?";
	try (Connection conn = Conexion.getConnection();
	PreparedStatement ps = conn.prepareStatement(sql)) {
	ps.setString(1, nuevoNombre);
	ps.setString(2, nuevoApellido1);
	ps.setString(3, nuevoApellido2);
	ps.setInt(4, id);
	ps.executeUpdate();
	} catch (SQLException e) {
	System.err.println(e.getMessage());
	}
	}

    // DELETE
	public static void borrar(int id) {
	String sql = "DELETE FROM alumno WHERE id=?";
	try (Connection conn = Conexion.getConnection();
	PreparedStatement ps = conn.prepareStatement(sql)) {
	ps.setInt(1, id);
	ps.executeUpdate();
	} catch (SQLException e) {
	System.err.println(e.getMessage());
	}
}

}
