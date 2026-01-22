package Ejercicio6;

public class PruebaAnimales {
    public static void main(String[] args) {
        
        System.out.println("Vertebrados:");

        Mamiferos perro = new Mamiferos("Perro", "Carnívoro", 5, 50, "Corto y suave");
        perro.mostrarDatos();
        
        Mamiferos humano = new Mamiferos("Humano", "Omnívoro", 30, 33, "Largo y fino");
        humano.mostrarDatos();
        
        Aves aguila = new Aves("Águila", "Carnívoro", 10, 50, "Plumas de raptor");
        aguila.mostrarDatos();
        
        Aves loro = new Aves("Loro", "Herbívoro", 8, 50, "Plumas coloridas");
        loro.mostrarDatos();
        

        Peces tiburon = new Peces("Tiburón", "Carnívoro", 20, 200, "Escamas de tiburón");
        tiburon.mostrarDatos();
        

        Peces dorado = new Peces("Dorado", "Omnívoro", 2, 100, "Escamas doradas");
        dorado.mostrarDatos();
        

        Reptiles cocodrilo = new Reptiles("Cocodrilo", "Carnívoro", 40, 80, "Escamas ásperas");
        cocodrilo.mostrarDatos();
        
        
        Reptiles serpiente = new Reptiles("Serpiente", "Carnívoro", 15, 200, "Escamas lisas");
        serpiente.mostrarDatos();
        
        Anfibios rana = new Anfibios("Rana", "Insectívoro", 5, 30, "Piel húmeda");
        rana.mostrarDatos();
        

        Anfibios salamandra = new Anfibios("Salamandra", "Insectívoro", 8, 35, "Piel suave");
        salamandra.mostrarDatos();
        
        Anelidos lombriz = new Anelidos("Lombriz", "Detritívoro", 2, "Quitina", "Segmentados");
        lombriz.mostrarDatos();
        

        Anelidos poliqueto = new Anelidos("Poliqueto", "Omnívoro", 3, "Quitina", "100+ segmentos");
        poliqueto.mostrarDatos();

        System.out.println("Invertebrados: ");

        Artropodos arana = new Artropodos(8, "Araña", "Carnívoro", 2, "Quitina");
        arana.mostrarDatos();
        
        Artropodos hormigas = new Artropodos(6, "Hormiga", "Omnívora", 1, "Quitina");
        hormigas.mostrarDatos();
        

        Cnidarios medusa = new Cnidarios("Medusa", "Carnívoro", 1, "Calcárea", "Nematocistos");
        medusa.mostrarDatos();
        
        Cnidarios anemonaMariva = new Cnidarios("Anemona", "Carnívoro", 5, "Calcárea", "Espinas venenosas");
        anemonaMariva.mostrarDatos();
        
        Equinodermos estrella = new Equinodermos("Estrella de mar", "Carnívoro", 10, "Calcárea", "Radial");
        estrella.mostrarDatos();
        
        Equinodermos erizo = new Equinodermos("Erizo de mar", "Herbívoro", 8, "Calcárea", "Radial");
        erizo.mostrarDatos();
        
        Moluscos calamar = new Moluscos("Calamar", "Carnívoro", 4, "Quitina", "Sin concha");
        calamar.mostrarDatos();
        
        Moluscos caracol = new Moluscos("Caracol", "Herbívoro", 5, "Quitina", "Concha espiral");
        caracol.mostrarDatos();
    }
}
