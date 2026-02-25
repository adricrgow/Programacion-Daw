import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 1) Creamos la clase ventana
public class App3 extends WindowAdapter implements ActionListener {
    private JPanel panelDeContenido;
    private JLabel numero1,numero2,resultado;
    private JTextField campoDeTexto1,campoDeTexto2;
    private JButton boton;
    private JFrame ventana;
    private int numClicks;
    public App3() {
        initComponents();
    }
    private void initComponents() {
        ventana = new JFrame();
        // Configuramos los parámetros de la ventana
        ventana.setTitle("Ejemplo de ventana");
        ventana.setLocation(200,500); //setLocationRelativeTo(null); 
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // 2) Crear los componentes
        boton = new JButton("Mostrar ventana");
        boton.addActionListener(this);
// 3) Crear un contenedor
        panelDeContenido = new JPanel();
        // 4) Asociar los componentes al contenedor
        
        panelDeContenido.add(boton);
        
        // 5) Asociar el contenedor a la ventana
        ventana.setContentPane(panelDeContenido);
        ventana.addWindowListener(this);
        // 6) Hacer visible la ventana
        ventana.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            mostrarConfirmacion();
    }
    @Override
    public void windowClosing(WindowEvent e) {
        mostrarConfirmacion();
    }
    private void mostrarConfirmacion() {
    int opcion = JOptionPane.showConfirmDialog(
        ventana, // ventana padre o this si extiendes JFrame
        "¿Seguro que desea salir?", // mensaje
        "Confirmar salida", // título
        JOptionPane.YES_NO_OPTION, // tipo de opciones
        JOptionPane.QUESTION_MESSAGE // icono
    );

    if (opcion == JOptionPane.YES_OPTION) {
        System.exit(0);
    }
    // si es NO, no hace nada y la ventana principal sigue abierta
}
    public static void main(String[] args) {
        App3 ejemplo = new App3();
    }
}