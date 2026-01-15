package RPG;

public class Mago extends Personaje {
    @Override
    public void atacar() {
        int aleatorio= (int) (Math.random() * (15 - 5 + 1) + 5);
        System.out.println("El mago lanza un hechizo con daño de: " + aleatorio);
    }

}


