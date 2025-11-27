package Rol;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Batalla {
    ArrayList<Personaje> heroe = new ArrayList<>();
    ArrayList<Personaje> orco = new ArrayList<>();
    Random aleatorio;
    
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
                        persona = new  Personaje();
                        AñadirPersonaje(persona, PersonajeTipo.Orco); //Crear orco
                        break;

                    case 2:
                        persona = new Personaje();
                        AñadirPersonaje(persona, PersonajeTipo.Mago); //Crear mago
                        break;

                    case 3:
                        persona = new Personaje();
                        AñadirPersonaje(persona, PersonajeTipo.Cabellero); //Crear caballero
                        break;
                    case 4:

                }
            }

        } while (opcion != -1);

    }
    public void AñadirPersonaje(Personaje persona, PersonajeTipo tipo){
        Scanner teclado = new Scanner(System.in);
        if(tipo.equals(PersonajeTipo.Orco)){
            orco.add(persona);
        }else{
            heroe.add(persona);
        }
        
        System.out.println("Intoduce el nombre del personaje");
        String nombre = teclado.nextLine();
        System.out.println("Introduce su vida");
        int vida = teclado.nextInt();
        System.out.println("Introduce el ataque");
        int ataque = teclado.nextInt();
        System.out.println("Introduce la Defensa");
        int defensa = teclado.nextInt();
        Personaje persona = new Personaje(ataque, defensa, nombre, tipo, vida);
        
    }

    public void EmpezarBatalla(){
        if(heroe.isEmpty() || orco.isEmpty()){
            System.out.println("No hay nadie para darse para el pelo");
            
        }

        System.out.println("Hacerse Polvo");

        Personaje heroe = heroe.get(aleatorio);
        Personaje orco = orco.get(aleatorio);

        System.out.println("La batllas es entre" + heroe.nombre + "contra" + orco.nombre);
        heroe.atacar(orco);
        orco.atacar(heroe);
        
    }
}
