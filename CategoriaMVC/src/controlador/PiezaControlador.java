package controlador;

import java.util.List;
import javax.swing.*;
import modelo.Pieza;
import modelo.PiezaDAO;
import vista.PiezaView;

public class PiezaControlador {
    private PiezaView view;
    private PiezaDAO dao = new PiezaDAO();

    public PiezaControlador(PiezaView view) {
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
            String nombre = view.txtNombre.getText();
            String color = view.txtColor.getText();
            double precio = Double.parseDouble(view.txtPrecio.getText());
            int codCategoria = Integer.parseInt(view.txtCodCategoria.getText());
            dao.insertar(codigo, nombre, color, precio, codCategoria);
            cargarTabla();
            limpiar();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Datos numéricos inválidos");
        }
    }

    private void actualizar() {
        int fila = view.tabla.getSelectedRow();
        if (fila == -1)
            return;
        try {
            int codigo = Integer.parseInt(view.txtCodigo.getText());
            double precio = Double.parseDouble(view.txtPrecio.getText());
            String color = String.valueOf(view.txtColor.getText());
            int codCategoria = Integer.parseInt(view.txtCodCategoria.getText());
            dao.actualizar(codigo, precio,color, codCategoria);
            cargarTabla();
            limpiar();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Precio o código inválido");
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
        view.txtNombre.setText(view.tabla.getValueAt(fila, 1).toString());
        view.txtColor.setText(view.tabla.getValueAt(fila, 2).toString());
        view.txtPrecio.setText(view.tabla.getValueAt(fila, 3).toString());
        view.txtCodCategoria.setText(view.tabla.getValueAt(fila, 4).toString());
    }

    private void cargarTabla() {
        view.modeloTabla.setRowCount(0);
        List<Pieza> lista = dao.listar();
        for (Pieza p : lista) {
            view.modeloTabla.addRow(new Object[] { p.getCodigo(), p.getNombre(), p.getColor(), p.getPrecio(), p.getCodCategoria() });
        }
    }

    private void limpiar() {
        view.txtCodigo.setText("");
        view.txtNombre.setText("");
        view.txtColor.setText("");
        view.txtPrecio.setText("");
        view.txtCodCategoria.setText("");
        view.tabla.clearSelection();
    }
}
