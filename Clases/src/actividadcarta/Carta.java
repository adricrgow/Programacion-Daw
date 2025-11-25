package actividadcarta;

public class Carta {
    int valor;
    String palo;
    
    public Carta(){}

    public Carta(String palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta [valor=" + valor + ", palo=" + palo + "]";
    }


    
}
