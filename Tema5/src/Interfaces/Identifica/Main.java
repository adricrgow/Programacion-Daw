package Interfaces.Identifica;

public class Main {
    public static void main(String[] args) {
        
        Identificacion persona = new Persona("Juan Perez", "12345678A", "Ninguno");
        Identificacion propietario = new Propietario("Calle Falsa 123", "Ana Gomez", "87654321B", "Ninguno");
        Identificacion vehiculo = new Vehiculo("Toyota", "1234ABC", "Corolla");
        Identificacion moto = new Moto(true, "Yamaha", "5678DEF", "R1");
        System.out.println(persona.identificar());
        System.out.println(propietario.identificar());
        System.out.println(vehiculo.identificar());
        System.out.println(moto.identificar());
    }
}
