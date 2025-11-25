package proyectotren;

public class Vagon {
    int numero;
    int cargaMaxima;
    int cargaActual;
    String tipoDeMecancias;

    public Vagon (){}

    public Vagon(int cargaActual, int cargaMaxima, int numero, String tipoDeMecancias) {
        this.cargaActual = cargaActual;
        this.cargaMaxima = cargaMaxima;
        this.numero = numero;
        this.tipoDeMecancias = tipoDeMecancias;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getTipoDeMecancias() {
        return tipoDeMecancias;
    }

    public void setTipoDeMecancias(String tipoDeMecancias) {
        this.tipoDeMecancias = tipoDeMecancias;
    }

    @Override
    public String toString() {
        return "Vagon [numero=" + numero + ", cargaMaxima=" + cargaMaxima + ", cargaActual=" + cargaActual
                + ", tipoDeMecancias=" + tipoDeMecancias + "]";
    }


    
}
