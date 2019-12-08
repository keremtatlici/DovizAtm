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
public class ParaCinsiSecmeEkrani extends JPanel{
    public JButton Btn_TL = new JButton("TL");
    public JButton Btn_Euro = new JButton("Euro");
    public JButton Btn_AnaEkranaDon = new JButton("Ana Ekrana Don");
    
    private static ParaCinsiSecmeEkrani paracinsisecmeekrani = new ParaCinsiSecmeEkrani();
    
    private ParaCinsiSecmeEkrani(){
        ustPanelMethods.tasarla(this);
        
        Btn_TL.setBounds(0,0,200,100);
        Btn_Euro.setBounds(0,110,200,100);
        Btn_AnaEkranaDon.setBounds(0,220,200,100);
        
        this.add(Btn_TL);
        this.add(Btn_Euro);
        this.add(Btn_AnaEkranaDon);
    }

    public static ParaCinsiSecmeEkrani getParacinsisecmeekrani() {
        return paracinsisecmeekrani;
    }
    
}
