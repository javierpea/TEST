package componentestarea;

import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DELL
 */
public class UtcTextoMayusculas extends JTextField {

    public UtcTextoMayusculas() {
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtKeyTyped(evt);
            }
        });
    }

    private void jtxtKeyTyped(java.awt.event.KeyEvent evt) {
        char caracter = evt.getKeyChar();
        if (caracter < 'A' || caracter > 'Z') {
            evt.consume();
        }
    }
}
