package Interfaces;

import java.util.ArrayList;

public class MainFutbol {
    public static void main(String[] args) {
        // Crear instancias
        Futbolista jugador = new Futbolista(1, "Andrés", "Iniesta", 34, 8, "Centrocampista");
        Entrenador tecnico = new Entrenador(2, "Luis", "Enrique", 50, 101);
        Masajista fisio = new Masajista(3, "Juan", "Pérez", 40, "Fisioterapia deportiva", 15);

        // Lista común de integrantes
        ArrayList<SeleccionFutbol> seleccion = new ArrayList<>();
        seleccion.add(jugador);
        seleccion.add(tecnico);
        seleccion.add(fisio);

        // Acciones comunes
        System.out.println("=== Actividades comunes ===");
        for (SeleccionFutbol integrante : seleccion) {
            integrante.concentrarse();
            integrante.viajar();
            integrante.entrenar();
            integrante.jugarPartido();
            System.out.println();
        }

        // Acciones específicas
        System.out.println("=== Actividades específicas ===");
        jugador.entrevista();
        tecnico.planificarEntrenamiento();
        fisio.darMasaje();
    }
}

