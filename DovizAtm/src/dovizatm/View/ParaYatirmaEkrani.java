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
import javax.swing.JTextField;

/**
 *
 * @author burak
 */
public class ParaYatirmaEkrani extends JPanel{
    public JButton Btn_Yatir = new JButton("Parayı Yatır");
    public JButton Btn_AnaEkranaDon = new JButton("Ana Ekrana Dön");
    //public JButton Btn_GeriDon = new JButton("Geri Dön");
    public JTextField Txtfield_Miktar= new JTextField("");
    
    
    private static ParaYatirmaEkrani parayatirmaekrani = new ParaYatirmaEkrani();
    
    private ParaYatirmaEkrani(){
        ustPanelMethods.tasarla(this);
        
        Txtfield_Miktar.setBounds(0,0,200,100);
        Btn_Yatir.setBounds(0,110,200,100);
        Btn_AnaEkranaDon.setBounds(0,220,200,100);
        //Btn_GeriDon.setBounds(0,330,200,100);
        
        this.add(Txtfield_Miktar);
        this.add(Btn_Yatir);
        this.add(Btn_AnaEkranaDon);
        //this.add(Btn_GeriDon);
    }

    public static ParaYatirmaEkrani getParayatirmaekrani() {
        return parayatirmaekrani;
    }
    
}
