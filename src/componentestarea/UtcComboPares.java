/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentestarea;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author DELL
 */
public class UtcComboPares extends JComboBox {

    DefaultComboBoxModel pairsModel = new DefaultComboBoxModel();

    public UtcComboPares() {
        super();
        this.setModel(pairsModel);

    }

    public void setModelPair(Integer[] datos) {
        pairsModel.removeAllElements();
        if (datos != null) {
            for (Integer dato : datos) {
                if (dato % 2 == 0) {
                    pairsModel.addElement(dato);
                }
            }
        }
    }
    
    public Integer getSelectedNumber() {
        return (Integer) this.getSelectedItem();
    }
}
