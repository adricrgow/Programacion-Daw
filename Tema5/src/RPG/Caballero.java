package RPG;

public class Caballero extends Personaje {

    public Caballero(String nombre, int vida, int ataque, int defensa) {
        super(nombre, vida, ataque, defensa);
    }
    @Override
    public int atacar() {
        int aleatorio= (int) (Math.random() * (20 - 10 + 1) + 10);
        System.out.println("El caballero ataca con una espada con daño de: " + aleatorio);
        return aleatorio;
    }
    
}
