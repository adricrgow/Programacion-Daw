package Interfaces.Movibles;

public class Barco implements Movible, Sonoro {
    @Override
    public void mover() {
        System.out.println("El barco navega por el mar.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("El barco emite un sonido de bocina 'buu'.");
    }
    
}
