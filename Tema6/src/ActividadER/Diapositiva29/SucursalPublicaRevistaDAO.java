package ActividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SucursalPublicaRevistaDAO {
    
    // CREATE
    public static void insertar(int codigoSucursal, int numeroRegistro) {
        String sql = "INSERT INTO sucursal_publica_revista VALUES (?, ?)";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigoSucursal);
            ps.setInt(2, numeroRegistro);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {
        String sql = "SELECT * FROM sucursal_publica_revista";
        try (Connection conn = Conexion.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                    rs.getInt("codigo_sucursal") + " - " + rs.getInt("numero_registro")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int codigoSucursalBuscado, int numeroRegistroBuscado, int codigoSucursalNuevo, int numeroRegistroNuevo) {
        String sql = "UPDATE sucursal_publica_revista SET codigo_sucursal=?, numero_registro=? WHERE codigo_sucursal=? AND numero_registro=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigoSucursalNuevo);
            ps.setInt(2, numeroRegistroNuevo);
            ps.setInt(3, codigoSucursalBuscado);
            ps.setInt(4, numeroRegistroBuscado);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int codigoSucursal, int numeroRegistro) {
        String sql = "DELETE FROM sucursal_publica_revista WHERE codigo_sucursal=? AND numero_registro=?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigoSucursal);
            ps.setInt(2, numeroRegistro);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
