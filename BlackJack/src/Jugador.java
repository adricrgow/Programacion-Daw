import java.util.ArrayList;
import java.util.List;

public class Jugador {
    String nombre;
    int fondos = 100;
    List<Carta> mano = new ArrayList<>();

    public Jugador() {
    }

    
    public Jugador(String nombre) { 
        this.nombre = nombre; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFondos() {
        return fondos;
    }

    public void setFondos(int fondos) {
        this.fondos = fondos;
    }

    public List<Carta> getMano() {
        return mano;
    }

    public void setMano(List<Carta> mano) {
        this.mano = mano;
    }

    public void pedir(Baraja b) { 
        mano.add(b.repartir()); 
    }

    public void limpiarMano() { 
        mano.clear(); 
    }

    
    public int puntos() {
        int total = 0;
        for (Carta c : mano) total += c.getPuntos(total);
        return total;
    }

    @Override
    public String toString() {
        return nombre + " -> " + mano + " (" + puntos() + " puntos)";
    }

    
}

