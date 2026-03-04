package controlador;

import java.util.List;
import javax.swing.*;
import modelo.Proveedor;
import modelo.ProveedorDAO;
import vista.ProveedorView;

public class ProveedorControlador {
    private ProveedorView view;
    private ProveedorDAO dao = new ProveedorDAO();

    public ProveedorControlador(ProveedorView view) {
        this.view = view;
        initController();
        cargarTabla();
    }

    private void initController() {
        view.btnInsertar.addActionListener(e -> insertar());
        view.btnActualizar.addActionListener(e -> actualizar());
        view.btnEliminar.addActionListener(e -> eliminar());
        view.btnLimpiar.addActionListener(e -> limpiar());
        cargarTabla();

        view.tabla.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                seleccionarFila();
            }
        });
    }

    private void insertar() {
        try {
            int codigo = Integer.parseInt(view.txtCodigo.getText());
            String direccion = view.txtDireccion.getText();
            String ciudad = view.txtCiudad.getText();
            String provincia = view.txtProvincia.getText();
            dao.insertar(codigo, direccion, ciudad, provincia);
            cargarTabla();
            limpiar();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Código inválido");
        }
    }

    private void actualizar() {
        int fila = view.tabla.getSelectedRow();
        if (fila == -1)
            return;
        try {
            int codigo = Integer.parseInt(view.txtCodigo.getText());
            String direccion = view.txtDireccion.getText();
            String ciudad = view.txtCiudad.getText();
            String provincia = view.txtProvincia.getText();
            dao.actualizar(codigo, direccion,ciudad, provincia);
            cargarTabla();
            limpiar();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Código inválido");
        }
    }

    private void eliminar() {
        int fila = view.tabla.getSelectedRow();
        if (fila == -1)
            return;
        int codigo = Integer.parseInt(view.modeloTabla.getValueAt(fila, 0).toString());
        dao.borrar(codigo);
        cargarTabla();
        limpiar();
    }

    private void seleccionarFila() {
        int fila = view.tabla.getSelectedRow();
        if (fila == -1)
            return;
        view.txtCodigo.setText(view.tabla.getValueAt(fila, 0).toString());
        view.txtDireccion.setText(view.tabla.getValueAt(fila, 1).toString());
        view.txtCiudad.setText(view.tabla.getValueAt(fila, 2).toString());
        view.txtProvincia.setText(view.tabla.getValueAt(fila, 3).toString());
    }

    private void cargarTabla() {
        view.modeloTabla.setRowCount(0);
        List<Proveedor> lista = dao.listar();
        for (Proveedor p : lista) {
            view.modeloTabla.addRow(new Object[] { p.getCodigo(), p.getDireccion(), p.getCiudad(), p.getProvincia() });
        }
    }

    private void limpiar() {
        view.txtCodigo.setText("");
        view.txtDireccion.setText("");
        view.txtCiudad.setText("");
        view.txtProvincia.setText("");
        view.tabla.clearSelection();
    }
}
