package ActividadER.Diapositiva28;

import ActividadER.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CestaContieneLibrosDAO {
	// CREATE
	public static void insertar(int idCesta, int idLibro, int cantidad) {
		String sql = "INSERT INTO cesta_contiene_libros VALUES (?, ?, ?)";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, idCesta);
			ps.setInt(2, idLibro);
			ps.setInt(3, cantidad);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// READ
	public static void listar() {
		String sql = "SELECT * FROM cesta_contiene_libros";
		try (Connection conn = Conexion.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				System.out.println("cesta: " + rs.getInt("id_cesta") + " - libro: " + rs.getInt("id_libro") + " - cantidad: " + rs.getInt("cantidad"));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// UPDATE (actualizar cantidad)
	public static void actualizar(int idCesta, int idLibro, int nuevaCantidad) {
		String sql = "UPDATE cesta_contiene_libros SET cantidad=? WHERE id_cesta=? AND id_libro=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, nuevaCantidad);
			ps.setInt(2, idCesta);
			ps.setInt(3, idLibro);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// DELETE
	public static void borrar(int idCesta, int idLibro) {
		String sql = "DELETE FROM cesta_contiene_libros WHERE id_cesta=? AND id_libro=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, idCesta);
			ps.setInt(2, idLibro);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
