public class Pais {
    String nombre;
    double poblacion;
    double PIB;


    public Pais(double PIB, String nombre, double  poblacion) {
        this.PIB = PIB;
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double  getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(double  poblacion) {
        this.poblacion = poblacion;
    }

    public double getPIB() {
        return PIB;
    }

    public void setPIB(double PIB) {
        this.PIB = PIB;
    }

    public double calcularPIB(){
        return (PIB * 100000) / poblacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pais{");
        sb.append("nombre=").append(nombre);
        sb.append(", poblacion=").append(poblacion);
        sb.append(", PIB=").append(PIB);
        sb.append('}');
        return sb.toString();
    }
    


    public static void main(String[] args) {
        Pais espana = new Pais(100000, "España", 49000000); 
        System.out.println("País: " + espana.getNombre());
        System.out.println("PIB per cápita "  + espana.calcularPIB());
    
}

    

    
    
}
