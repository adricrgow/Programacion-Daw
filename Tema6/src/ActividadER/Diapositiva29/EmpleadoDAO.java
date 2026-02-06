package ActividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpleadoDAO {
    
    // CREATE
    public static void insertar(int id, String nif, String nombre, String apellido1, String apellido2, String telefono, int codigoSucursal) {
        String sql = "INSERT INTO empleado VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, nif);
            ps.setString(3, nombre);
            ps.setString(4, apellido1);
            ps.setString(5, apellido2);
            ps.setString(6, telefono);
            ps.setInt(7, codigoSucursal);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {
        String sql = "SELECT * FROM empleado";
        try (Connection conn = Conexion.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " + rs.getString("nif") + " - " + rs.getString("nombre") + " - " +
                    rs.getString("apellido1") + " " + rs.getString("apellido2")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int id, String telefono, int codigoSucursal) {
        String sql = "UPDATE empleado SET telefono=?, codigo_sucursal=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, telefono);
            ps.setInt(2, codigoSucursal);
            ps.setInt(3, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int id) {
        String sql = "DELETE FROM empleado WHERE id=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
