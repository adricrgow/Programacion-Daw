package Pila;

public class TestPila {
    public static void main(String[] args) {
        Pila<String> pilaTexto = new Pila<>();

        pilaTexto.insertar("Uno");
        pilaTexto.insertar("Dos");
        pilaTexto.insertar("Tres");

        System.out.println(pilaTexto); // Pila: [Uno, Dos, Tres]

        System.out.println("Último: " + pilaTexto.devolver()); // Tres
        System.out.println("Posición de 'Dos': " + pilaTexto.buscar("Dos")); // 1

        pilaTexto.borrar(); // elimina "Tres"
        System.out.println(pilaTexto); // Pila: [Uno, Dos]

        System.out.println("¿Está vacía? " + pilaTexto.estaVacia()); // false
    }
}
