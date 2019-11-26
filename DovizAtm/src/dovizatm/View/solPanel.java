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
public class solPanel extends JPanel{
    private JButton Btn_TL5, Btn_TL10, Btn_TL20, Btn_TL50, Btn_TL100, Btn_TL200;
    private int Sayisi_TL5,Sayisi_TL10,Sayisi_TL20,Sayisi_TL50,Sayisi_TL100,Sayisi_TL200;
    private solPanel solPanel;
    private Border blackline = BorderFactory.createLineBorder(Color.black);//Border tipi ayarlar
    public solPanel(){
        
    }
    public solPanel(Pencere pencere){
        
        solPanel = new solPanel();
        pencere.getContentPane().add(solPanel);
        //solPanel.setBackground(Color.BLUE);
        solPanel.setBounds(0, 0, 300, 768); // Sol Panel  300x768
        solPanel.setBorder(blackline);//Border ekler
    }
}
