package Rol;

public class Personaje {
    int ataque;
    int vida;
    int defensa;
    String nombre;
    PersonajeTipo tipo;


    public Personaje(){}

    public Personaje(int ataque, int defensa, String nombre, PersonajeTipo tipo, int vida) {
        this.ataque = ataque;
        this.defensa = defensa;
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PersonajeTipo getTipo() {
        return tipo;
    }

    public void setTipo(PersonajeTipo tipo) {
        this.tipo = tipo;
    }

    public void atacar(Personaje enemigo){
        int daño = this.ataque - enemigo.defensa;
        enemigo.recibirDaño(daño);
        System.out.println(this.nombre + " ataca a " + enemigo.nombre + " le hace daño " + daño + " puntos de daño" );
    }

    public void  recibirDaño(int daño){
        vida = vida - daño;
        if (vida <= 0) {
            System.out.println("Te Ha matado");
        }
    }

    public boolean EstaVivo(){
        return vida>0;
    }

    

    @Override
    public String toString() {
        return "Personaje [ataque=" + ataque + ", vida=" + vida + ", defensa=" + defensa + ", nombre=" + nombre
                + ", tipo=" + tipo + "]";
    }

    
}
