package viaje;

public class Toma {
    Vuelo nVuelo= null;
    Turista turista = null;
    Sucursal sucursal = null;
    String clase;

    public Toma(){}

    public Toma(String clase) {
        this.clase = clase;
    }

    public Vuelo getnVuelo() {
        return nVuelo;
    }

    public void setnVuelo(Vuelo nVuelo) {
        this.nVuelo = nVuelo;
    }

    public Turista getTurista() {
        return turista;
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Toma{");
        sb.append("nVuelo=").append(nVuelo);
        sb.append(", turista=").append(turista);
        sb.append(", sucursal=").append(sucursal);
        sb.append(", clase=").append(clase);
        sb.append('}');
        return sb.toString();
    }


}