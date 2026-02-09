package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SuministroDAO {
    // CREATE
    public void insertar(int codigo_proveedor, int codigo_pieza, int cantidad, String fecha) {
        String sql = "INSERT INTO suministro VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo_proveedor);
            ps.setInt(2, codigo_pieza);
            ps.setInt(3, cantidad);
            ps.setString(4, fecha);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public List<Suministro> listar() {
        List<Suministro> suministros = new ArrayList<>();
        String sql = "SELECT * FROM suministro";
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                suministros.add(new Suministro(
                    rs.getInt("codigo_proveedor"),
                    rs.getInt("codigo_pieza"),
                    rs.getInt("cantidad"),
                    rs.getString("fecha")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return suministros;
    }

    // UPDATE
    public void actualizar(int codigo, String nuevoNombre) {
        String sql = "UPDATE categoria SET nombre=? WHERE codigo=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevoNombre);
            ps.setInt(2, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public void borrar(int codigo_proveedor, int codigo_pieza) {
        String sql = "DELETE FROM suministro WHERE codigo_proveedor=? AND codigo_pieza=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo_proveedor);
            ps.setInt(2, codigo_pieza);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
