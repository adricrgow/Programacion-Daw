import java.util.*;

public class Partida {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Baraja baraja = new Baraja();

        System.out.print("Nombre jugador: ");
        Jugador jugador = new Jugador(teclado.nextLine());
        Jugador crupier = new Jugador("Crupier");

        while (jugador.fondos > 0) {
            jugador.limpiarMano();
            crupier.limpiarMano();
            baraja.barajar();

            jugador.pedir(baraja); jugador.pedir(baraja);
            crupier.pedir(baraja); crupier.pedir(baraja);

            System.out.println("Tu mano: " + jugador.mano + " -> " + jugador.puntos());

            System.out.print("Apuesta (tienes " + jugador.fondos + ", escribe -1 para salir): ");
            int apuesta = teclado.nextInt(); teclado.nextLine();

            // Si el jugador escribe -1, salir del bucle
            if (apuesta == -1) {
                System.out.println("Has decidido salir del juego.");
                break;
            }

            jugador.fondos -= apuesta;

            // Turno jugador
            while (jugador.puntos() < 21) {
                System.out.print("¿Pedir carta? (s/n): ");
                if (teclado.nextLine().equalsIgnoreCase("s")) jugador.pedir(baraja);
                else break;
                System.out.println("Tu mano: " + jugador.mano + " -> " + jugador.puntos());
            }

            // Turno crupier (simple: pide hasta 17)
            while (crupier.puntos() < 17) crupier.pedir(baraja);
            System.out.println("Crupier: " + crupier.mano + " -> " + crupier.puntos());

            // Resultado
            if (jugador.puntos() > 21) {
                System.out.println("Te pasaste. Pierdes.");
            } else if (crupier.puntos() > 21 || jugador.puntos() > crupier.puntos()) {
                System.out.println("¡Ganaste!");
                jugador.fondos += apuesta * 2;
            } else if (jugador.puntos() == crupier.puntos()) {
                System.out.println("Empate.");
                jugador.fondos += apuesta;
            } else {
                System.out.println("Pierdes.");
            }

            System.out.println("Fondos actuales: " + jugador.fondos);
        }
        System.out.println("Fin del juego.");
    }
}
