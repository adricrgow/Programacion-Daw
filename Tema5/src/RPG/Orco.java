package RPG;

public class Orco extends Personaje {

    public Orco(String nombre, int vida, int ataque, int defensa) {
        super(nombre, vida, ataque, defensa);
    }
    
    @Override
    public int atacar() {
        int aleatorio= (int) (Math.random() * (25 - 15 + 1) + 15);
        System.out.println("El orco ataca con un hacha con daño de: " + aleatorio);
        return aleatorio;
    }
    
}
