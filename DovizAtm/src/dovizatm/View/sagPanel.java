/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.View;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author krmtt
 */
public class sagPanel extends JPanel{
    
     private JButton Btn_Euro5, Btn_Euro10, Btn_Euro20, Btn_Euro50, Btn_Euro100, Btn_Euro200;
     private int Sayisi_Euro5,Sayisi_Euro10,Sayisi_Euro20,Sayisi_Euro50,Sayisi_Euro100,Sayisi_Euro200;
     private Border blackline = BorderFactory.createLineBorder(Color.black);
    private sagPanel sagPanel;
    public sagPanel(){
        
    }
    public sagPanel(Pencere pencere){
        sagPanel = new sagPanel();
        pencere.getContentPane().add(sagPanel);
        //sagPanel.setBackground(Color.BLUE);
        sagPanel.setBounds(1066, 0, 300, 768);  // Sağ Panel 300x768
        sagPanel.setBorder(blackline);
    }
}
