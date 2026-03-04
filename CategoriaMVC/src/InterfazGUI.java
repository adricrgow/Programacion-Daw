
import controlador.CategoriaControlador;
import controlador.PiezaControlador;
import controlador.ProveedorControlador;
import controlador.SuministroControlador;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import vista.CategoriaView;
import vista.PiezaView;
import vista.ProveedorView;
import vista.SuministroView;

public class InterfazGUI {
    public static void main(String[] args){
        JFrame frame = new JFrame("Gestión de Suministros");
       // crea el JTTabedPane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50,50,300,200);
        CategoriaView categoriaView = new CategoriaView();
        PiezaView piezaView = new PiezaView();
        ProveedorView proveedorView = new ProveedorView();
        SuministroView suministroView = new SuministroView();
       // Añadir los paneles como pestañas
        tabbedPane.add("Categorías", categoriaView);
        tabbedPane.addTab("Piezas", piezaView);
        tabbedPane.addTab("Proveedores", proveedorView);
        tabbedPane.addTab("Suministros", suministroView);
        //Definir el controlador asociado a cada vista
        CategoriaControlador categoriaController = new CategoriaControlador(categoriaView);
        PiezaControlador piezaController = new PiezaControlador(piezaView);
        ProveedorControlador proveedorController = new ProveedorControlador(proveedorView);
        SuministroControlador suministroController = new SuministroControlador(suministroView);
        //Asociar el TabbedPane
        frame.setContentPane(tabbedPane);
        // TAmaño y visibilidad
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
