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
public class altPanel extends JPanel{
    
    private JButton Btn_TLCebeAt, Btn_EuroCebeAt, Btn_ParaYatir, Btn_KartTak;
    private int Eldeki_TL,Eldeki_Euro;
    private Border blackline = BorderFactory.createLineBorder(Color.black);
    private altPanel altPanel;
    
    public altPanel(){
        
    }
    public altPanel(Pencere pencere){
        altPanel = new altPanel();
        pencere.getContentPane().add(altPanel);
        //altPanel.setBackground(Color.red);
        altPanel.setBounds(300, 500, 766, 268); // Alt Panel 766x268
        altPanel.setBorder(blackline);
    }
}
