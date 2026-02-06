package ActividadER;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EjemplarDAO {
    
    // CREATE
    public static void insertar(int id, Date fecha, int numeroPaginas, int numeroEjemplares, int numeroRegistro) {
        String sql = "INSERT INTO ejemplar VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setDate(2, fecha);
            ps.setInt(3, numeroPaginas);
            ps.setInt(4, numeroEjemplares);
            ps.setInt(5, numeroRegistro);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {
        String sql = "SELECT * FROM ejemplar";
        try (Connection conn = Conexion.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " + rs.getDate("fecha") + " - " +
                    rs.getInt("numero_paginas") + " - " + rs.getInt("numero_ejemplares")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int id, Date fecha, int numeroPaginas, int numeroEjemplares) {
        String sql = "UPDATE ejemplar SET fecha=?, numero_paginas=?, numero_ejemplares=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDate(1, fecha);
            ps.setInt(2, numeroPaginas);
            ps.setInt(3, numeroEjemplares);
            ps.setInt(4, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int id) {
        String sql = "DELETE FROM ejemplar WHERE id=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
