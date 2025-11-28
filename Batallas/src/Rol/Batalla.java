package Rol;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Batalla {
    ArrayList<Personaje> heroe = new ArrayList<>();
    ArrayList<Personaje> orco = new ArrayList<>();
    Random aleatorio;
    boolean juegoTerminado = false; // bandera para cerrar menú
    
    public Batalla(){}

    public void mostrarMenu(){
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu de la batalla");
            System.out.println("1 Añadir Orco");
            System.out.println("2 Añadir Mago");
            System.out.println("3 Añadir Caballero");
            System.out.println("4 Empezar Batalla");
            System.out.println("-1 Salir");
            opcion = teclado.nextInt();
            Personaje persona;
            if (opcion!=-1){
                switch(opcion){
                    case 1:
                        persona = new Personaje();
                        AñadirPersonaje(persona, PersonajeTipo.Orco);
                        break;
                    case 2:
                        persona = new Personaje();
                        AñadirPersonaje(persona, PersonajeTipo.Mago);
                        break;
                    case 3:
                        persona = new Personaje();
                        AñadirPersonaje(persona, PersonajeTipo.Cabellero); // corregido
                        break;
                    case 4:
                        EmpezarBatalla();
                        break;
                    default:
                        System.out.println("Esa opción no se vale");
                }
            }
        } while (opcion != -1 && !juegoTerminado); // se cierra si termina la batalla
    }

    public void AñadirPersonaje(Personaje persona, PersonajeTipo tipo){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre del personaje");
        String nombre = teclado.nextLine();
        System.out.println("Introduce su vida");
        int vida = teclado.nextInt();
        System.out.println("Introduce el ataque");
        int ataque = teclado.nextInt();
        System.out.println("Introduce la defensa");
        int defensa = teclado.nextInt();

        Personaje pj = new Personaje(ataque, defensa, nombre, tipo, vida);

        if(tipo.equals(PersonajeTipo.Orco)){
            orco.add(pj);
        } else {
            heroe.add(pj);
        }
    }

    public void EmpezarBatalla(){
        aleatorio = new Random();
        if(heroe.isEmpty() || orco.isEmpty()){
            System.out.println("No hay nadie para darse para el pelo");
            return;
        }

        System.out.println("¡Comienza la batalla!");

        Personaje heroePersonaje = heroe.get(aleatorio.nextInt(heroe.size()));
        Personaje orcoPersonaje = orco.get(aleatorio.nextInt(orco.size()));

        System.out.println("La batalla es entre " + heroePersonaje.getNombre() + " contra " + orcoPersonaje.getNombre());

        heroePersonaje.atacar(orcoPersonaje);
        orcoPersonaje.atacar(heroePersonaje);

        if (!heroePersonaje.EstaVivo()) {
            System.out.println(heroePersonaje.getNombre() + " ha muerto");
            heroe.remove(heroePersonaje);
        }
        
        if (!orcoPersonaje.EstaVivo()) {
            System.out.println(orcoPersonaje.getNombre() + " ha muerto");
            orco.remove(orcoPersonaje);
        }

        // comprobar ganador y cerrar menú
        if (heroe.isEmpty() && !orco.isEmpty()) {
            System.out.println("Los orcos han ganado la batalla");
            juegoTerminado = true;
        } else if (orco.isEmpty() && !heroe.isEmpty()) {
            System.out.println("Los héroes han ganado la batalla");
            juegoTerminado = true;
        } else if (heroe.isEmpty() && orco.isEmpty()) {
            System.out.println("Ambos bandos han muerto, no hay ganador.");
            juegoTerminado = true;
        }
    }
}
