
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ActividadDiapositiva18 {
    public static void main(String[] args) {
        // mostrarJugadoresEspanolesLakers();
        // actualizarJugadores(666, "Spain");
        // crearJugador(669,"AdrianCR", "Spain", "7-0", "190", "C", "Lakers");
        // eliminarJugador(669);
        // equiposConMasDe100Puntos();
        maxPuntosPorTemporada();
    }

    // Mostrar los jugadores españoles que son de los Lakers

    public static void mostrarJugadoresEspanolesLakers() {
        String sql = "SELECT codigo,Nombre,Procedencia,Nombre_equipo FROM jugadores WHERE Procedencia='Spain' AND Nombre_equipo='Lakers'";
        try (Connection conn = Conexion.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.println(
                        rs.getInt("codigo") + ": " +
                        rs.getString("Nombre") + " - " +
                        rs.getString("Procedencia") + " - " +
                        rs.getString("Nombre_equipo"));
                }
        } catch (SQLException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }

    // Modifica el jugador 666 para que ponga bien su Procedencia

    public static void actualizarJugadores(int codigo, String Procedencia) {
    String sql = "UPDATE jugadores SET Procedencia = ? WHERE codigo = ?";
    try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, Procedencia);
        ps.setInt(2, codigo);
        ps.executeUpdate();
        System.out.println("Jugador actualizado.");
        } catch (SQLException e) {
        System.err.println("Error al actualizar: " + e.getMessage());
        }
    }
       // Inserta un registro en jugadores

        public static void crearJugador(int codigo, String Nombre, String Procedencia, String Altura, String Peso, String Posicion, String Nombre_equipo) {
        String sql = "INSERT INTO jugadores (codigo,Nombre, Procedencia,Altura,Peso,Posicion, Nombre_equipo) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, codigo);
        ps.setString(2, Nombre);
        ps.setString(3, Procedencia);
        ps.setString(4, Altura);
        ps.setString(5, Peso);
        ps.setString(6, Posicion);
        ps.setString(7, Nombre_equipo);
        ps.executeUpdate();
        System.out.println("Jugador creado.");
        } catch (SQLException e) {
        System.err.println("Error al insertar: " + e.getMessage());
        }

        }

    // Elimina el jugador que acabas de insertar

    
        public static void eliminarJugador(int id) {
        String sql = "DELETE FROM jugadores WHERE codigo = ?";
            try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("Jugador eliminado.");
            } catch (SQLException e) {
            System.err.println("Error al borrar: " + e.getMessage());
            }
        }

    // select distinct equipo_local from partidos where puntos_local > 100 and puntos_local > puntos_visitante and temporada='02/03'

    public static void equiposConMasDe100Puntos() {
        String sql = "SELECT DISTINCT equipo_local FROM partidos WHERE puntos_local > 100 AND puntos_local > puntos_visitante AND temporada='02/03'";
        try (Connection conn = Conexion.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.println(
                        rs.getString("equipo_local"));
                }
        } catch (SQLException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }

    //     select jugadores.Nombre, estadisticas.temporada,
    // estadisticas.Puntos_por_partido from jugadores,estadisticas where
    // estadisticas.jugador=jugadores.codigo and
    // (temporada,Puntos_por_partido) in (select
    // temporada,max(Puntos_por_partido) from estadisticas group by
    // temporada) order by estadisticas.temporada;

    public static void maxPuntosPorTemporada() {
        String sql = "SELECT jugadores.Nombre, estadisticas.temporada, estadisticas.Puntos_por_partido FROM jugadores, estadisticas WHERE estadisticas.jugador=jugadores.codigo AND (temporada, Puntos_por_partido) IN (SELECT temporada, MAX(Puntos_por_partido) FROM estadisticas GROUP BY temporada) ORDER BY estadisticas.temporada";
        try (Connection conn = Conexion.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.println(
                        rs.getString("Nombre") + " - " +
                        rs.getString("temporada") + " - " +
                        rs.getDouble("Puntos_por_partido"));
                }
        } catch (SQLException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }

}
