package AnimalesPracticaherencia;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Pepe", "Omnívoro", 5, 63, "Labrador");
        Gato gato = new Gato("Pepa", "Carnívoro", 3, 65, "Siamés");
        Caballo caballo = new Caballo("Rocinante", "Hervívoro", 7, 340, "Pasto", 2);
        Mamifero mamifero = new Mamifero("MamíferoGenérico", "Omnívoro", 4, 120);
        Animal animal = new Animal("AnimalGenérico", "Herbívoro", 2);

        System.out.println("Datos del Animal:");
        animal.mostrarDatos();


        System.out.println("Datos del Mamífero:");
        mamifero.mostrarDatos();

        System.out.println("Datos del Perro:");
        perro.mostrarDatos();

        System.out.println("Datos del Gato:");
        gato.mostrarDatos();

        System.out.println("Datos del Caballo:");
        caballo.mostrarDatos();


    }
    
}
