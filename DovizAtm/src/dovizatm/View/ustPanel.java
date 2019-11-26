/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.View;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author krmtt
 */
public class ustPanel extends JPanel{
    private Border blackline = BorderFactory.createLineBorder(Color.black);
    private ustPanel ustPanel;
    public ustPanel(){
       
    }
    public ustPanel(Pencere pencere){
        ustPanel = new ustPanel();
        pencere.getContentPane().add(ustPanel);
        //ustPanel.setBackground(Color.yellow);
        ustPanel.setBounds(300, 0, 766, 500); // Üst Panel  766x500
        ustPanel.setBorder(blackline);
    }
}
