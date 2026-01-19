package Interfaces.Movibles;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear vehículos
        Coche coche = new Coche();
        Barco barco = new Barco();
        Avion avion = new Avion();

        // Lista de Movible
        ArrayList<Movible> movibles = new ArrayList<>();
        movibles.add(coche);
        movibles.add(barco);
        movibles.add(avion);

        System.out.println("=== Movimiento de vehículos ===");
        for (Movible m : movibles) {
            m.mover();
        }

        // Lista de Sonoro
        ArrayList<Sonoro> sonoros = new ArrayList<>();
        sonoros.add(coche);
        sonoros.add(barco);
        sonoros.add(avion);

        System.out.println("Sonido de vehículos");
        for (Sonoro s : sonoros) {
            s.emitirSonido();
        }
    }
}

