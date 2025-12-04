package Diagrama2;

public class Compra {
    Cliente cliente;
    CocheNuevo coche;
    Vendedor vendedor;
    String fecha;

    public Compra() {
    }

    public Compra(Cliente cliente, CocheNuevo coche, Vendedor vendedor, String fecha) {
        this.cliente = cliente;
        this.coche = coche;
        this.vendedor = vendedor;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CocheNuevo getCoche() {
        return coche;
    }

    public void setCoche(CocheNuevo coche) {
        this.coche = coche;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Compra [cliente=" + cliente + ", coche=" + coche + ", vendedor=" + vendedor + ", fecha=" + fecha + "]";
    }

    
}
