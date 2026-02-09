package Modelo;

public class Suministro {
    private int codigo_proveedor;
    private int codigo_pieza;
    private int cantidad;
    private String fecha;

    public Suministro(int codigo_proveedor, int codigo_pieza, int cantidad, String fecha) {
        this.codigo_proveedor = codigo_proveedor;
        this.codigo_pieza = codigo_pieza;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public int getCodigo_proveedor() {
        return codigo_proveedor;
    }

    public void setCodigo_proveedor(int codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    public int getCodigo_pieza() {
        return codigo_pieza;
    }

    public void setCodigo_pieza(int codigo_pieza) {
        this.codigo_pieza = codigo_pieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
