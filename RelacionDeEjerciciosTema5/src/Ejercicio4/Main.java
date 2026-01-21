package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        // Caja para Integer
        Caja<Integer> cajaEntero = new Caja<>(123);
        System.out.println(cajaEntero);

        // Caja para String
        Caja<String> cajaString = new Caja<>("Hola Domingo");
        System.out.println(cajaString);

        // Caja para Persona
        Persona persona = new Persona("Pepe", 30);
        Caja<Persona> cajaPersona = new Caja<>(persona);
        System.out.println(cajaPersona);
    }
}
