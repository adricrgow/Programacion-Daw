public class Operario extends Empleado{

    
    public Operario(String nombre) {
        super(nombre);
        System.out.println("Constructor de Operario");
    }
    public Operario() {
    }
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
}