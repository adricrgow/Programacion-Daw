package ActividadER.Diapositiva28;

import ActividadER.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LibroDAO {
	// CREATE
	public static void insertar(int id, String isbn, String titulo, int anioPublicacion, String descripcion, String tipo) {
		String sql = "INSERT INTO libro VALUES (?, ?, ?, ?, ?, ?)";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.setString(2, isbn);
			ps.setString(3, titulo);
			ps.setInt(4, anioPublicacion);
			ps.setString(5, descripcion);
			ps.setString(6, tipo);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// READ
	public static void listar() {
		String sql = "SELECT * FROM libro";
		try (Connection conn = Conexion.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " - " + rs.getString("isbn") + " - " + rs.getString("titulo") + " - " + rs.getInt("año_publicacion") + " - " + rs.getString("descripcion") + " - " + rs.getString("tipo"));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// UPDATE
	public static void actualizar(int id, String nuevoIsbn, String nuevoTitulo, int nuevoAnioPublicacion, String nuevaDescripcion, String nuevoTipo) {
		String sql = "UPDATE libro SET isbn=?, titulo=?, año_publicacion=?, descripcion=?, tipo=? WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, nuevoIsbn);
			ps.setString(2, nuevoTitulo);
			ps.setInt(3, nuevoAnioPublicacion);
			ps.setString(4, nuevaDescripcion);
			ps.setString(5, nuevoTipo);
			ps.setInt(6, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// DELETE
	public static void borrar(int id) {
		String sql = "DELETE FROM libro WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
