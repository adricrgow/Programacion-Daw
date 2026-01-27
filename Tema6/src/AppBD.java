import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AppBD {
    public static void main(String[] args){
        // String sql ="Create table if not exists persona (id int auto_increment primary key, nombre varchar(100),email varchar (100));";
        // try {
        //     Connection conexion = Conexion.getConnection();
        //     Statement stmt=conexion.createStatement();

        //     stmt.executeUpdate(sql);
        //     System.out.println("Tabla persona creada correctamente");
        
        // } catch (SQLException e) {
        //     System.err.println("Error al crear tabla: " + e.getMessage());
        // }

    // crearPersona("Paco", "paco@gmail.com");
    // System.out.println("Fila insertada correctamente");

    // leer la tabla persona
    // listarPersonas();

    //actualizar el contenido de persona
    // actualizarPersona(2, "aaaa@gmail.com");
    // listarPersonas();

    // borrar registros en personas
    eliminarPersona(3);

    }


public static void crearPersona(String nombre, String email) {
    String sql = "INSERT INTO persona (nombre, email) VALUES (?, ?)";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setString(1, nombre);
    ps.setString(2, email);
    ps.executeUpdate();
    System.out.println("Persona creada.");
    } catch (SQLException e) {
    System.err.println("Error al insertar: " + e.getMessage());
    }
}


public static void listarPersonas() {
 String sql = "SELECT * FROM persona";
    try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
        System.out.println(
        rs.getInt("id") + ": " +
        rs.getString("nombre") + " - " +
        rs.getString("email"));
    }
    } catch (SQLException e) {
    System.err.println("Error al leer: " + e.getMessage());
    }
}

public static void actualizarPersona(int id, String nuevoEmail) {
    String sql = "UPDATE persona SET email = ? WHERE id = ?";
    try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, nuevoEmail);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("Persona actualizada.");
        } catch (SQLException e) {
        System.err.println("Error al actualizar: " + e.getMessage());
        }
}

public static void eliminarPersona(int id) {
String sql = "DELETE FROM persona WHERE id = ?";
    try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Persona eliminada.");
    } catch (SQLException e) {
    System.err.println("Error al borrar: " + e.getMessage());
    }
}

}