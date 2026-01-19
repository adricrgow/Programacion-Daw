package Interfaces.Movibles;

public class Avion implements Movible, Sonoro {
    @Override
    public void mover() {
        System.out.println("El avión está volando por el cielo.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("El avión emite un sonido de motor 'Vroooom'.");
    }
    
}
