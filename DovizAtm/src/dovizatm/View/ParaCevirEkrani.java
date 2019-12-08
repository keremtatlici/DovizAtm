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
public class ParaCevirEkrani extends JPanel{
    public JButton Btn_TL_EuroCevir = new JButton("TL'ni Euro'ya Çevir");
    public JButton Btn_Euro_TLCevir = new JButton("Euro'nu TL'ye Çevir");
    public JButton Btn_AnaEkranaDon = new JButton("Ana Ekrana Dön");
    
    private static ParaCevirEkrani paracevirekrani = new ParaCevirEkrani();
    
    private ParaCevirEkrani(){
        ustPanelMethods.tasarla(this);
        
        Btn_TL_EuroCevir.setBounds(0,0,200,100);
        Btn_Euro_TLCevir.setBounds(0,110,200,100);
        Btn_AnaEkranaDon.setBounds(0,220,200,100);
        
        this.add(Btn_TL_EuroCevir);
        this.add(Btn_Euro_TLCevir);
        this.add(Btn_AnaEkranaDon);
    }

    public static ParaCevirEkrani getParacevirekrani() {
        return paracevirekrani;
    }
    
}
