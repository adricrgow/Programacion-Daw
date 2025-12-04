import Diagrama2.Cliente;
import Diagrama2.CocheNuevo;
import Diagrama2.CocheNuevo_Extras;
import Diagrama2.CocheUsado;
import Diagrama2.Compra;
import Diagrama2.Extra;
import Diagrama2.Marca;
import Diagrama2.Modelo;
import Diagrama2.Vendedor;
import Diagrama2.Version;

public class App {
    public static void main(String[] args) throws Exception {
        Marca marca = new Marca(1, "BMW");
        Modelo modelo = new Modelo(1, "m3",marca);
        Version version = new Version(1, "BMW 3", 500, 90000, "Gasolina", modelo);

       
        Cliente cliente1 = new Cliente(1, "Adrián", "Contreras", "calle1", "38103981");
        Vendedor vendedor = new Vendedor(1, "Antonio", "Lozano", "calle2", "48933749");

        CocheNuevo cocheNuevo = new CocheNuevo(1, "A313A2", version);
        Extra extra1 = new Extra(1, "Pantalla copiloto", "Una pantalla para el copiloto", 4242);
        CocheNuevo_Extras coche = new CocheNuevo_Extras(cocheNuevo, extra1);
        CocheUsado cocheUsado = new CocheUsado("5678XYZ", 8000, "Ford Focus", 2,  cliente1);

        Compra compra = new Compra(cliente1, cocheNuevo, vendedor, "5/12/2025");

        System.out.println("Cliente: " + cliente1.getNombre() + " compró un coche nuevo con matrícula " + cocheNuevo.getMatricula());
        System.out.println("Versión: " + cocheNuevo.getVersion().getNombre() + " (" + cocheNuevo.getVersion().getPotencia() + "CV, " + cocheNuevo.getVersion().getTipoCombustible() + ")");
        System.out.println("Marca: " + cocheNuevo.getVersion().getModelo().getMarca().getNombre() + " Modelo: " + cocheNuevo.getVersion().getModelo().getNombre());
        System.out.println("Vendedor: " + vendedor.getNombre() + " " + vendedor.getApellidos());
        System.out.println("Extra añadido: " + coche.getExtra().getNombre() + " - " + coche.getExtra().getDescripcion() + " (€" + coche.getExtra().getPrecio() + ")");
        System.out.println("Coche usado entregado: " + cocheUsado.getNombre() + " con matrícula " + cocheUsado.getMatricula() + " tasado en €" + cocheUsado.getPrecioTasacion());
        System.out.println("Fecha de compra: " + compra.getFecha());

       
    }
}
