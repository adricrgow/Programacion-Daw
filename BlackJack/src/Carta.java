public class Carta {
     String palo;
    String valor;

    public Carta(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

 public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }    

    public int getPuntos(int totalActual) {
        if ("JQK".contains(valor)) return 10;
        if (valor.equals("A")) return (totalActual + 11 <= 21) ? 11 : 1;
        return Integer.parseInt(valor);
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}

