package ActividadER.Diapositiva28;

import ActividadER.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlmacenAlamacenaLibroDAO {
	// CREATE
	public static void insertar(int idAlmacen, int idLibro, int stock) {
		String sql = "INSERT INTO almacen_almacena_libro VALUES (?, ?, ?)";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, idAlmacen);
			ps.setInt(2, idLibro);
			ps.setInt(3, stock);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// READ
	public static void listar() {
		String sql = "SELECT * FROM almacen_almacena_libro";
		try (Connection conn = Conexion.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				System.out.println("almacen: " + rs.getInt("id_almacen") + " - libro: " + rs.getInt("id_libro") + " - stock: " + rs.getInt("stock"));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// UPDATE (actualizar stock)
	public static void actualizar(int idAlmacen, int idLibro, int nuevoStock) {
		String sql = "UPDATE almacen_almacena_libro SET stock=? WHERE id_almacen=? AND id_libro=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, nuevoStock);
			ps.setInt(2, idAlmacen);
			ps.setInt(3, idLibro);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// DELETE
	public static void borrar(int idAlmacen, int idLibro) {
		String sql = "DELETE FROM almacen_almacena_libro WHERE id_almacen=? AND id_libro=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, idAlmacen);
			ps.setInt(2, idLibro);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
