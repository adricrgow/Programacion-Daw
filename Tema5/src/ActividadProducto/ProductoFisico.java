package ActividadProducto;

public class ProductoFisico extends Producto {
    private double  peso;
    private double CosteEnvio;

    public ProductoFisico(){}

    public ProductoFisico(double CosteEnvio, double peso, String id, String nombre, double precio) {
        super(id, nombre, precio);
        this.CosteEnvio = CosteEnvio;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosteEnvio() {
        return CosteEnvio;
    }

    public void setCosteEnvio(double CosteEnvio) {
        this.CosteEnvio = CosteEnvio;
    }

    @Override
    public void  imprimeProducto(){
        if(peso>2){
            System.out.println("id: "+id+" Nombre: "+nombre+" Precio: "+precio+" PrecioIva "+PrecioFinal()+CosteEnvio +1.0);
        }
        else{
        System.out.println("id: "+id+" Nombre: "+nombre+" Precio: "+precio+" PrecioIva "+PrecioFinal()+CosteEnvio);
        }
    }
}
