import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
     List<Carta> cartas = new ArrayList<>();

    public Baraja() {
        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        String[] valores = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for (String p : palos) for (String v : valores) cartas.add(new Carta(p,v));
    }
    

    public void barajar() { Collections.shuffle(cartas); }

    public Carta repartir() { return cartas.remove(0); }


    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }
}

