package ActividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SucursalDAO {
    
    // CREATE
    public static void insertar(int codigo, String telefono, String direccion, String ciudad, String provincia) {
        String sql = "INSERT INTO sucursal VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.setString(2, telefono);
            ps.setString(3, direccion);
            ps.setString(4, ciudad);
            ps.setString(5, provincia);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {
        String sql = "SELECT * FROM sucursal";
        try (Connection conn = Conexion.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                    rs.getInt("codigo") + " - " + rs.getString("telefono") + " - " + 
                    rs.getString("direccion") + " - " + rs.getString("ciudad") + " - " + 
                    rs.getString("provincia")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int codigo, String telefono, String direccion, String ciudad, String provincia) {
        String sql = "UPDATE sucursal SET telefono=?, direccion=?, ciudad=?, provincia=? WHERE codigo=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, telefono);
            ps.setString(2, direccion);
            ps.setString(3, ciudad);
            ps.setString(4, provincia);
            ps.setInt(5, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int codigo) {
        String sql = "DELETE FROM sucursal WHERE codigo=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
