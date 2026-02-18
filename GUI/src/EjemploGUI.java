
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JWindow;

// 1) Creamos la clase ventana
public class EjemploGUI extends JWindow implements ActionListener {

    private JPanel panelDeContenido;
    private JLabel etiqueta1;
    private JTextField campoDeTexto;
    private JButton boton;
    private int numClicks = 0;
    private JButton sumar;
    private JButton restar;
    private JLabel etiqueta2;
    private JTextField campoDeTexto2;
    private JLabel etiqueta3;
    private JTextField campoDeTexto3;

    public EjemploGUI(String title) {
        initComponents(title);
    }

    private void initComponents(String title) {
        // Configuramos los parámetros de la ventana
        // setTitle(title);
        setLocation(200, 500); //setLocationRelativeTo(null);
        setSize(300, 200);
        // setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // 2) Crear los componentes
        etiqueta1 = new JLabel("Número de clicks:");
        campoDeTexto = new JTextField("0", 10);
        boton = new JButton("Haz click aquí");
        boton.addActionListener(this);

        etiqueta2 = new JLabel("Numero1:");
        campoDeTexto2 = new JTextField(10);
        etiqueta3 = new JLabel("Numero2:");
        campoDeTexto3 = new JTextField(10);
        sumar = new JButton("Sumar");
        restar = new JButton("Restar");
        sumar.addActionListener(this);
        restar.addActionListener(this);
        
        // 3) Crear un contenedor
        panelDeContenido = new JPanel();
        // 4) Asociar los componentes al contenedor
        panelDeContenido.add(etiqueta1);
        panelDeContenido.add(campoDeTexto);
        panelDeContenido.add(etiqueta2);
        panelDeContenido.add(campoDeTexto2);
        panelDeContenido.add(etiqueta3);
        panelDeContenido.add(campoDeTexto3);
        panelDeContenido.add(sumar);
        panelDeContenido.add(restar);
        panelDeContenido.add(boton);
        
        // 5) Asociar el contenedor a la ventana
        setContentPane(panelDeContenido);
        // 6) Hacer visible la ventana
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        numClicks++;
        campoDeTexto.setText(String.valueOf(numClicks));
    }

    public static void main(String[] args) {
        EjemploGUI ejemplo = new EjemploGUI("Ventana principal");
    }
}
