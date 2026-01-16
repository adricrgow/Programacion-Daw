package RPG;

public class Mago extends Personaje {

    public Mago(String nombre, int vida, int ataque, int defensa) {
        super(nombre, vida, ataque, defensa);
    }

    @Override
    public int atacar() {
        int aleatorio= (int) (Math.random() * (15 - 5 + 1) + 5);
        System.out.println("El mago lanza un hechizo con daño de: " + aleatorio);
        return aleatorio;
    }
}
