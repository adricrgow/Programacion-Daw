package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AlumnoDAO {
    // CREATE
	public static void insertar(Alumno a) {
	String sql = "INSERT INTO alumno VALUES (?, ?, ?, ?, ?, ?)";
	try (Connection conn = Conexion.getConnection();
	PreparedStatement ps = conn.prepareStatement(sql)) {
		ps.setInt(1, a.getId());
		ps.setString(2, a.getNif());
		ps.setString(3, a.getGrupo());
		ps.setString(4, a.getNombre());
		ps.setString(5, a.getApellido1());
		ps.setString(6, a.getApellido2());
		ps.executeUpdate();
	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
	}

    // READ (SELECT)
	public static ArrayList<Alumno> listar() {
	ArrayList<Alumno> alumnos = new ArrayList<>();
	String sql = "SELECT * FROM alumno";
	try (Connection conn = Conexion.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql)) {
		while (rs.next()) {
		Alumno alumno = new Alumno(
			rs.getInt("id"),
			rs.getString("nif"),
			rs.getString("grupo"),
			rs.getString("nombre"),
			rs.getString("apellido1"),
			rs.getString("apellido2")
		);
		alumnos.add(alumno);
		}
	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
	return alumnos;
	}


    // UPDATE
	public static void actualizar(Alumno a) {
	String sql = "UPDATE alumno SET nombre=?, apellido1=?, apellido2=? WHERE id=?";
	try (Connection conn = Conexion.getConnection();
	PreparedStatement ps = conn.prepareStatement(sql)) {
	ps.setString(1, a.getNombre());
	ps.setString(2, a.getApellido1());
	ps.setString(3, a.getApellido2());
	ps.setInt(4, a.getId());
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
