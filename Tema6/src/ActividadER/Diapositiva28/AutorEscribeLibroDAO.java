package ActividadER.Diapositiva28;

import ActividadER.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AutorEscribeLibroDAO {
	// CREATE
	public static void insertar(int idAutor, int idLibro) {
		String sql = "INSERT INTO autor_escribe_libro VALUES (?, ?)";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, idAutor);
			ps.setInt(2, idLibro);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// READ
	public static void listar() {
		String sql = "SELECT * FROM autor_escribe_libro";
		try (Connection conn = Conexion.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				System.out.println("autor: " + rs.getInt("id_autor") + " - libro: " + rs.getInt("id_libro"));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// UPDATE (cambiar id_libro para un autor)
	public static void actualizar(int idAutor, int idLibro, int nuevoIdLibro) {
		String sql = "UPDATE autor_escribe_libro SET id_libro=? WHERE id_autor=? AND id_libro=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, nuevoIdLibro);
			ps.setInt(2, idAutor);
			ps.setInt(3, idLibro);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// DELETE
	public static void borrar(int idAutor, int idLibro) {
		String sql = "DELETE FROM autor_escribe_libro WHERE id_autor=? AND id_libro=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, idAutor);
			ps.setInt(2, idLibro);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
