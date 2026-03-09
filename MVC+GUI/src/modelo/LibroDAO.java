package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LibroDAO {
    // READ
    public ArrayList<Libro> listar() {
        ArrayList<Libro> libros = new ArrayList<>();
        String sql = "SELECT titulo, codigo_libro, editorial, genero, precio, codigo_compra, autor FROM libro";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                libros.add(new Libro(
                        rs.getString("titulo"),
                        rs.getInt("codigo_libro"),
                        rs.getString("editorial"),
                        rs.getString("genero"),
                        rs.getDouble("precio"),
                        rs.getInt("codigo_compra"),
                        rs.getString("autor")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }

    // CREATE
    public void insertar(Libro l) {
        String sql = "INSERT INTO libro (titulo, codigo_libro, editorial, genero, precio, codigo_compra, autor) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, l.getTitulo());
            ps.setInt(2, l.getCodigoLibro());
            ps.setString(3, l.getEditorial());
            ps.setString(4, l.getGenero());
            ps.setDouble(5, l.getPrecio());
            ps.setInt(6, l.getCodigoCompra());
            ps.setString(7, l.getAutor());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void actualizar(Libro l) {
        String sql = "UPDATE libro SET titulo=?, editorial=?, genero=?, precio=?, codigo_compra=?, autor=? WHERE codigo_libro=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, l.getTitulo());
            ps.setString(2, l.getEditorial());
            ps.setString(3, l.getGenero());
            ps.setDouble(4, l.getPrecio());
            ps.setInt(5, l.getCodigoCompra());
            ps.setString(6, l.getAutor());
            ps.setInt(7, l.getCodigoLibro());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(int codigoLibro) {
        String sql = "DELETE FROM libro WHERE codigo_libro=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigoLibro);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}