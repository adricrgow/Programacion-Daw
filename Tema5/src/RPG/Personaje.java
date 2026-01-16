package RPG;

public abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected int ataque;
    protected int defensa;

    public Personaje(){}

    public Personaje(String nombre, int vida, int ataque, int defensa){
        this.nombre=nombre;
        this.vida=vida;
        this.ataque=ataque;
        this.defensa=defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public  boolean estaVivo() {
        return this.vida > 0;
    }

    public void  recibirDaño(int daño){
        vida = vida - daño;
        if (vida <= 0) {
            System.out.println("Te Ha matado");
        }
    }

    public abstract int atacar();

}
