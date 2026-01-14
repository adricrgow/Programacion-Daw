package ActividadProducto;

public class Producto {
    protected String id;
    protected String nombre;
    protected double precio;

    public Producto() {
    }

    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public double PrecioFinal(){
        return precio+1.21;
    }
    public void imprimeProducto(){
        System.out.println("ID: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
    }


}
