package ActividadER.Diapositiva28;

import ActividadER.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

public class LibroPapelDAO {
	// CREATE
	public static void insertar(int id, Date fechaImpresion, String lugarImpresion, double precio) {
		String sql = "INSERT INTO libro_papel VALUES (?, ?, ?, ?)";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.setDate(2, fechaImpresion);
			ps.setString(3, lugarImpresion);
			ps.setDouble(4, precio);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// READ
	public static void listar() {
		String sql = "SELECT * FROM libro_papel";
		try (Connection conn = Conexion.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				System.out.println("id: " + rs.getInt("id") + " - fecha: " + rs.getDate("fecha_impresion") + " - lugar: " + rs.getString("lugar_impresion") + " - precio: " + rs.getDouble("precio"));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// UPDATE
	public static void actualizar(int id, Date nuevaFechaImpresion, String nuevoLugarImpresion, double nuevoPrecio) {
		String sql = "UPDATE libro_papel SET fecha_impresion=?, lugar_impresion=?, precio=? WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setDate(1, nuevaFechaImpresion);
			ps.setString(2, nuevoLugarImpresion);
			ps.setDouble(3, nuevoPrecio);
			ps.setInt(4, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// DELETE
	public static void borrar(int id) {
		String sql = "DELETE FROM libro_papel WHERE id=?";
		try (Connection conn = Conexion.getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
