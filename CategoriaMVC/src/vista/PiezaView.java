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

public class PiezaView extends JPanel {
    // Campos
    public JTextField txtCodigo = new JTextField(5);
    public JTextField txtNombre = new JTextField(15);
    public JTextField txtColor = new JTextField(10);
    public JTextField txtPrecio = new JTextField(10);
    public JTextField txtCodCategoria = new JTextField(5);

    // Botones
    public JButton btnInsertar = new JButton("Insertar");
    public JButton btnActualizar = new JButton("Actualizar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnLimpiar = new JButton("Limpiar");

    // Tabla
    public DefaultTableModel modeloTabla = new DefaultTableModel(
            new Object[] {"Código", "Nombre", "Color", "Precio", "CodCategoria"}, 0);
    public JTable tabla = new JTable(modeloTabla);

    public PiezaView() {
        setLayout(new BorderLayout());
        // === Panel Superior ===
        JPanel panelFormulario = new JPanel(new GridLayout(4, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos Pieza"));

        panelFormulario.add(new JLabel("Código:"));
        panelFormulario.add(txtCodigo);

        panelFormulario.add(new JLabel("Nombre:"));
        panelFormulario.add(txtNombre);

        panelFormulario.add(new JLabel("Color:"));
        panelFormulario.add(txtColor);

        panelFormulario.add(new JLabel("Precio:"));
        panelFormulario.add(txtPrecio);

        panelFormulario.add(new JLabel("Cod Categoria:"));
        panelFormulario.add(txtCodCategoria);

        panelFormulario.add(btnInsertar);
        panelFormulario.add(btnActualizar);
        panelFormulario.add(btnEliminar);
        panelFormulario.add(btnLimpiar);
        // === Panel Inferior ===
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBorder(BorderFactory.createTitledBorder("Lista de Piezas"));

        add(panelFormulario, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }
}
