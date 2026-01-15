package ClaseAbstractaCoches;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Moto moto1 = new Moto("ABC123", 160);
        Coche coche1 = new Coche("XYZ789", 200);
        Camion camion1 = new Camion("DEF456", 140);

        vehiculos.add(moto1);
        vehiculos.add(coche1);
        vehiculos.add(camion1);

        for(Vehiculo v : vehiculos) {
            v.mostrarInfo();
            System.out.println();
        }

    }
}
