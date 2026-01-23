package Ejercicio7y8;

import java.util.ArrayList;

public class PruebaVolador {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Avion("Boeing"));
        vehiculos.add(new Helicoptero("Buzzard"));
        vehiculos.add(new Coche("Toyota GR86", 200));

        for (Vehiculo v : vehiculos) {
            v.arrancar();
            if (v instanceof Volador) {
                ((Volador) v).volar();
            }
            v.mostrarInfo();
            System.out.println("----------------------");
        }
        for (Vehiculo v : vehiculos) {
            v.frenar();
        }
    }
}

        
