package ActividadER.Diapositiva28;

import ActividadER.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

public class CestaDAO {
	// CREATE
	public static void insertar(int id, Date fechaCompra, int idCliente) {
		String sql = "INSERT INTO cesta VALUES (?, ?, ?)";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.setDate(2, fechaCompra);
			ps.setInt(3, idCliente);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// READ
	public static void listar() {
		String sql = "SELECT * FROM cesta";
		try (Connection conn = Conexion.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				System.out.println("id: " + rs.getInt("id") + " - fecha: " + rs.getDate("fecha_compra") + " - cliente_id: " + rs.getInt("id_cliente"));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// UPDATE
	public static void actualizar(int id, Date nuevaFechaCompra, int nuevoIdCliente) {
		String sql = "UPDATE cesta SET fecha_compra=?, id_cliente=? WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setDate(1, nuevaFechaCompra);
			ps.setInt(2, nuevoIdCliente);
			ps.setInt(3, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// DELETE
	public static void borrar(int id) {
		String sql = "DELETE FROM cesta WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
