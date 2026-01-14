package ActividadProducto;

public class ProductoDigital extends Producto {
    private String URL;
    private double MB;
    public ProductoDigital(){}
    public ProductoDigital(String URL, double MB, String id, String nombre, double precio) {
        super(id, nombre, precio);
        this.URL = URL;
        this.MB = MB;
    }
    public String getURL() {
        return URL;
    }
    public void setURL(String uRL) {
        URL = uRL;
    }
    public double getMB() {
        return MB;
    }
    public void setMB(double mB) {
        MB = mB;
    }
    
}
