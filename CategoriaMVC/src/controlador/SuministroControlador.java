package controlador;

import java.sql.Date;
import java.util.List;
import javax.swing.*;
import modelo.Suministro;
import modelo.SuministroDAO;
import vista.SuministroView;

public class SuministroControlador {
    private SuministroView view;
    private SuministroDAO dao = new SuministroDAO();

    public SuministroControlador(SuministroView view) {
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
            int codProv = Integer.parseInt(view.txtCodProveedor.getText());
            int codPieza = Integer.parseInt(view.txtCodPieza.getText());
            int cantidad = Integer.parseInt(view.txtCantidad.getText());
            Date fecha = Date.valueOf(view.txtFecha.getText()); // expects yyyy-MM-dd
            dao.insertar(codProv, codPieza, cantidad, fecha);
            cargarTabla();
            limpiar();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(view, "Formato de fecha inválido o número mal formado");
        }
    }

    private void actualizar() {
        int fila = view.tabla.getSelectedRow();
        if (fila == -1)
            return;
        try {
            int codProv = Integer.parseInt(view.txtCodProveedor.getText());
            int codPieza = Integer.parseInt(view.txtCodPieza.getText());
            int cantidad = Integer.parseInt(view.txtCantidad.getText());
            dao.actualizarCantidad(codProv, codPieza, cantidad);
            cargarTabla();
            limpiar();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Datos numéricos inválidos");
        }
    }

    private void eliminar() {
        int fila = view.tabla.getSelectedRow();
        if (fila == -1)
            return;
        int codProv = Integer.parseInt(view.modeloTabla.getValueAt(fila, 0).toString());
        int codPieza = Integer.parseInt(view.modeloTabla.getValueAt(fila, 1).toString());
        dao.borrar(codProv, codPieza);
        cargarTabla();
        limpiar();
    }

    private void seleccionarFila() {
        int fila = view.tabla.getSelectedRow();
        if (fila == -1)
            return;
        view.txtCodProveedor.setText(view.tabla.getValueAt(fila, 0).toString());
        view.txtCodPieza.setText(view.tabla.getValueAt(fila, 1).toString());
        view.txtCantidad.setText(view.tabla.getValueAt(fila, 2).toString());
        view.txtFecha.setText(view.tabla.getValueAt(fila, 3).toString());
    }

    private void cargarTabla() {
        view.modeloTabla.setRowCount(0);
        List<Suministro> lista = dao.listar();
        for (Suministro s : lista) {
            view.modeloTabla.addRow(new Object[] { s.getCodProveedor(), s.getCodPieza(), s.getCantidad(), s.getFecha() });
        }
    }

    private void limpiar() {
        view.txtCodProveedor.setText("");
        view.txtCodPieza.setText("");
        view.txtCantidad.setText("");
        view.txtFecha.setText("");
        view.tabla.clearSelection();
    }
}
