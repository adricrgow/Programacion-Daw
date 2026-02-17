package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PracticaDAO {
	// CREATE
	public static void insertar(Practica p) {
	String sql = "INSERT INTO practica VALUES (?, ?, ?)";
	try (Connection conn = Conexion.getConnection();
	PreparedStatement ps = conn.prepareStatement(sql)) {
		ps.setInt(1, p.getId());
		ps.setString(2, p.getTitulo());
		ps.setString(3, p.getDificultad());
		ps.executeUpdate();
	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
	}
	// READ (SELECT)
	public static ArrayList<Practica> listar() {
	ArrayList<Practica> practicas = new ArrayList<>();
	String sql = "SELECT * FROM practica";
	try (Connection conn = Conexion.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql)) {
		while (rs.next()) {
		Practica practica = new Practica(
			rs.getInt("id"),
			rs.getString("titulo"),
			rs.getString("dificultad")
		);
		practicas.add(practica);
		}
	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
	return practicas;
	}
	// UPDATE
	public static void actualizar(Practica p) {
	String sql = "UPDATE practica SET titulo=?, dificultad=? WHERE id=?";
	try (Connection conn = Conexion.getConnection();
	PreparedStatement ps = conn.prepareStatement(sql)) {
	ps.setString(1, p.getTitulo());
	ps.setString(2, p.getDificultad());
	ps.setInt(3, p.getId());
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
