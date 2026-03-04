package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SuministroView extends JPanel {
    // Campos
    public JTextField txtCodProveedor = new JTextField(5);
    public JTextField txtCodPieza = new JTextField(5);
    public JTextField txtCantidad = new JTextField(5);
    public JTextField txtFecha = new JTextField(10);

    // Botones
    public JButton btnInsertar = new JButton("Insertar");
    public JButton btnActualizar = new JButton("Actualizar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnLimpiar = new JButton("Limpiar");

    // Tabla
    public DefaultTableModel modeloTabla = new DefaultTableModel(
            new Object[] {"CodProveedor", "CodPieza", "Cantidad", "Fecha"}, 0);
    public JTable tabla = new JTable(modeloTabla);

    public SuministroView() {
        setLayout(new BorderLayout());
        // === Panel Superior ===
        JPanel panelFormulario = new JPanel(new GridLayout(3, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos Suministro"));

        panelFormulario.add(new JLabel("Proveedor:"));
        panelFormulario.add(txtCodProveedor);

        panelFormulario.add(new JLabel("Pieza:"));
        panelFormulario.add(txtCodPieza);

        panelFormulario.add(new JLabel("Cantidad:"));
        panelFormulario.add(txtCantidad);

        panelFormulario.add(new JLabel("Fecha (YYYY-MM-DD):"));
        panelFormulario.add(txtFecha);

        panelFormulario.add(btnInsertar);
        panelFormulario.add(btnActualizar);
        panelFormulario.add(btnEliminar);
        panelFormulario.add(btnLimpiar);
        // === Panel Inferior ===
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBorder(BorderFactory.createTitledBorder("Lista de Suministros"));

        add(panelFormulario, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }
}
