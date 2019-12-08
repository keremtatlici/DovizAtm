/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.View;

import dovizatm.Controller.ustPanelMethods;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author burak
 */
public class ParaYatirmaBeklemeEkrani extends JPanel{
    public String DurumYazisi;
    public JButton Btn_AnaEkranaDon = new JButton("Ana Ekrana Dön");
    
    private static ParaYatirmaBeklemeEkrani parayatirmabeklemeekrani = new ParaYatirmaBeklemeEkrani();
    
    private ParaYatirmaBeklemeEkrani(){
        ustPanelMethods.tasarla(this);
        
        Btn_AnaEkranaDon.setBounds(0,0,200,100);
       
        
        
        this.add(Btn_AnaEkranaDon);

        
    }

    public static ParaYatirmaBeklemeEkrani getParayatirmabeklemeekrani() {
        return parayatirmabeklemeekrani;
    }
    
}
