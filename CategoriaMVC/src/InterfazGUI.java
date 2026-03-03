
import controlador.CategoriaControlador;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import vista.CategoriaView;

public class InterfazGUI {
    public static void main(String[] args){
        JFrame frame = new JFrame("MVC + GUI");
       // crea el JTTabedPane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50,50,300,200);
        CategoriaView categoriaView = new CategoriaView();
    //    PiezaView piezaView = new PiezaView();
    //    ProveedorView proveedorView = new ProveedorView();
    //    SuministroView suministroView = new SuministroView();
       // Añadir los paneles como pestañas
        tabbedPane.add("Categorías", categoriaView);
        // tabbedPane.addTab("Piezas", piezaView);
        // tabbedPane.addTab("Proveedores", proveedorView);
        // tabbedPane.addTab("Suministros", suministroView);
        //Definir el controlador asociado a cada vista
        CategoriaControlador categoriaController = new CategoriaControlador(categoriaView);
        // PiezaController piezaController = new PiezaController(piezaView);
        // ProveedorController proveedorController = new ProveedorController(proveedorView);
        // SuministroController suministroController = new SuministroController(suministroView);
        //Asociar el TabbedPane
        frame.setContentPane(tabbedPane);
        // TAmaño y visibilidad
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
