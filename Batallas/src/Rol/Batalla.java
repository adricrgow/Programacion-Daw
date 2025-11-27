package Rol;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Batalla {
    ArrayList<Personaje> heroe = new ArrayList<>();
    ArrayList<Personaje> orco = new ArrayList<>();
    

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
        if(tipo.equals(PersonajeTipo.Orco)){
            orco.add(persona);
        }else{
            heroe.add(persona);
        }

        
        
    }

    public void EmpezarBatalla(){
        if(heroe.isEmpty() || orco.isEmpty()){
            System.out.println("No hay nadie para darse para el pelo");
            
        }
        
        System.out.println("Hacerse Polvo");


    }
}
