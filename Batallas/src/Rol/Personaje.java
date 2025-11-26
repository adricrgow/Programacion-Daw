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

    public boolean EstaVivo(){
        return vida>0;
    }

    

    @Override
    public String toString() {
        return "Personaje [ataque=" + ataque + ", vida=" + vida + ", defensa=" + defensa + ", nombre=" + nombre
                + ", tipo=" + tipo + "]";
    }

    
}
