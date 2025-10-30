/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentestarea;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class TablaFiltro extends JTable {

    String[] titulo = {"Datos"};
    DefaultTableModel tablaModelo = new DefaultTableModel(null, titulo);

    public TablaFiltro() {
        super();
        this.setModel(tablaModelo);

        // Configurar el renderizador de las celdas
        this.getColumnModel().getColumn(0).setCellRenderer(new ColorCellRenderer());
    }

    public void agregarDato(String dato) {
        tablaModelo.addRow(new Object[]{dato});
    }

    // Renderizador para colores
    private class ColorCellRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus,
                int row, int column) {
            Component component = super.getTableCellRendererComponent(
                    table, value, isSelected, hasFocus, row, column);

            if (isSelected) {
                return component;
            }

            String dato;
            if (value != null) {
                dato = value.toString();
            } else {
                dato = "";
            }
            try {
                Integer numero = Integer.valueOf(dato);
                if (numero % 2 == 0) {
                    component.setBackground(Color.GREEN);
                    component.setForeground(Color.BLACK);
                } else {
                    component.setBackground(Color.RED);
                    component.setForeground(Color.BLACK);
                }
            } catch (NumberFormatException e) {
                component.setBackground(Color.LIGHT_GRAY);
                component.setForeground(Color.BLACK);
            }
            return component;
        }
    }
}
