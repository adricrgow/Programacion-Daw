package ActividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PracticaDAO {
	// CREATE
	public static void insertar(int id, String titulo, String dificultad) {
	String sql = "INSERT INTO practica VALUES (?, ?, ?)";
	try (Connection conn = Conexion.getConnection();
	PreparedStatement ps = conn.prepareStatement(sql)) {
		ps.setInt(1, id);
		ps.setString(2, titulo);
		ps.setString(3, dificultad);
		ps.executeUpdate();
	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
	}
	// READ (SELECT)
	public static void listar() {
	String sql = "SELECT * FROM practica";
	try (Connection conn = Conexion.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql)) {
		while (rs.next()) {
		System.out.println(
		rs.getInt("id") + " - " + rs.getString("titulo")
		);
	}
	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
	}
	// UPDATE
	public static void actualizar(int id, String nuevoTitulo) {
	String sql = "UPDATE practica SET titulo=? WHERE id=?";
	try (Connection conn = Conexion.getConnection();
	PreparedStatement ps = conn.prepareStatement(sql)) {
	ps.setString(1, nuevoTitulo);
	ps.setInt(2, id);
	ps.executeUpdate();
	} catch (SQLException e) {
	System.err.println(e.getMessage());
	}
	}
	// DELETE
	public static void borrar(int id) {
	String sql = "DELETE FROM practica WHERE id=?";
	try (Connection conn = Conexion.getConnection();
	PreparedStatement ps = conn.prepareStatement(sql)) {
	ps.setInt(1, id);
	ps.executeUpdate();
	} catch (SQLException e) {
	System.err.println(e.getMessage());
	}
}
}
