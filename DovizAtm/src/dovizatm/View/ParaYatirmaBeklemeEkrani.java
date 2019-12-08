/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.View;

import dovizatm.Controller.ustPanelMethods;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ParaYatirmaBeklemeEkrani extends JPanel{
    public JButton Btn_AnaEkranaDon = new JButton("Ana Ekrana Dön");
    public JLabel yazi = new JLabel("Lütfen paranızı yatırınız..");
    
    private static ParaYatirmaBeklemeEkrani parayatirmabeklemeekrani = new ParaYatirmaBeklemeEkrani();
    
    private ParaYatirmaBeklemeEkrani(){
        ustPanelMethods.tasarla(this);
        
        yazi.setBounds(0,0,200,40);
        Btn_AnaEkranaDon.setBounds(0,300,200,100);
       
        
        
        this.add(Btn_AnaEkranaDon);
        this.add(yazi);

        
    }

    public static ParaYatirmaBeklemeEkrani getParayatirmabeklemeekrani() {
        return parayatirmabeklemeekrani;
    }
    
}
