package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {

    public List<Alumno> listar() {
        List<Alumno> lista = new ArrayList<>();
        String sql = "SELECT numero_matricula, nombre, apellido1, apellido2, fecha_nacimiento, telefono FROM alumno";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                LocalDate fecha = rs.getDate("fecha_nacimiento") != null ? rs.getDate("fecha_nacimiento").toLocalDate() : null;
                lista.add(new Alumno(rs.getInt("numero_matricula"), rs.getString("nombre"), rs.getString("apellido1"), rs.getString("apellido2"), fecha, rs.getString("telefono")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return lista;
    }

    public void insertar(Alumno a) {
        String sql = "INSERT INTO alumno (numero_matricula, nombre, apellido1, apellido2, fecha_nacimiento, telefono) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, a.getNumeroMatricula());
            ps.setString(2, a.getNombre());
            ps.setString(3, a.getApellido1());
            ps.setString(4, a.getApellido2());
            ps.setDate(5, a.getFechaNacimiento() != null ? java.sql.Date.valueOf(a.getFechaNacimiento()) : null);
            ps.setString(6, a.getTelefono());
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void actualizar(Alumno a) {
        String sql = "UPDATE alumno SET nombre=?, apellido1=?, apellido2=?, fecha_nacimiento=?, telefono=? WHERE numero_matricula=?";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getApellido1());
            ps.setString(3, a.getApellido2());
            ps.setDate(4, a.getFechaNacimiento() != null ? java.sql.Date.valueOf(a.getFechaNacimiento()) : null);
            ps.setString(5, a.getTelefono());
            ps.setInt(6, a.getNumeroMatricula());
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void eliminar(int numeroMatricula) {
        String sql = "DELETE FROM alumno WHERE numero_matricula=?";
        try (Connection conn = Conexion.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, numeroMatricula);
            ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
