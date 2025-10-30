/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentestarea;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class UtcDecimales extends JTextField {

    public UtcDecimales() {
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNumeroKeyTyped(evt);
            }
        });
    }

    public Double getValorDecimal() {
        try {
            return Double.valueOf(this.getText());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public void setValorDecimal(Double valor) {
        if (valor != null) {
            this.setText(String.format("%.2f", valor));
        }
    }

    private void jtxtNumeroKeyTyped(KeyEvent evt) {
        char c = evt.getKeyChar();
        String texto = this.getText();


        if (c == '.' && texto.contains(".")) {
            evt.consume();
            return;
        }

        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
            return;
        }

        if (texto.contains(".")) {
            int index = texto.indexOf('.');
            String decimals = texto.substring(index + 1);
            if (decimals.length() >= 2) {
                evt.consume();
            }
        }
    }
}
