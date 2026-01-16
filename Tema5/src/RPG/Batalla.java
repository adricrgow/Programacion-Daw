package RPG;

import java.util.ArrayList;

public class Batalla {

    public static void main(String[] args) {

        ArrayList<Personaje> equipo1 = new ArrayList<>();
        ArrayList<Personaje> equipo2 = new ArrayList<>();

        // Equipo 1
        equipo1.add(new Caballero("Heroe", 150, 25, 10));
        equipo1.add(new Mago("Gandalf", 100, 30, 5));

        // Equipo 2
        equipo2.add(new Orco("Feo", 120, 20, 8));
        equipo2.add(new Orco("Grom", 130, 18, 6));

        System.out.println("¡La batalla comienza!\n");

        while (!equipo1.isEmpty() && !equipo2.isEmpty()) {

            Personaje p1 = equipo1.get(0);
            Personaje p2 = equipo2.get(0);

            // Turno del equipo 1
            int daño1 = p1.atacar();
            System.out.println(p1.getNombre() + " ataca a " + p2.getNombre() + " con " + daño1);
            p2.recibirDaño(daño1);

            if (!p2.estaVivo()) {
                System.out.println(p2.getNombre() + " ha muerto!");
                equipo2.remove(0);
                System.out.println("-----------------------------");
                continue;
            }

            // Turno del equipo 2
            int daño2 = p2.atacar();
            System.out.println(p2.getNombre() + " ataca a " + p1.getNombre() + " con " + daño2);
            p1.recibirDaño(daño2);

            if (!p1.estaVivo()) {
                System.out.println(p1.getNombre() + " ha muerto!");
                equipo1.remove(0);
            }

            System.out.println("-----------------------------");
        }

        if (equipo1.isEmpty()) {
            System.out.println("¡El equipo 2 gana la batalla!");
        } else {
            System.out.println("¡El equipo 1 gana la batalla!");
        }
    }
}
