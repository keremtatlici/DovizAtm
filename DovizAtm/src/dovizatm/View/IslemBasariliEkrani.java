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
 * @author krmtt
 */
public class IslemBasariliEkrani extends JPanel{
    private static IslemBasariliEkrani islembasariliekrani = new IslemBasariliEkrani();
    public JButton Btn_anasayfayadon = new JButton("Ana Sayfaya Dön");
    private JTextField bildiri = new JTextField("İşlem Başarılı");
    
    private IslemBasariliEkrani(){
       ustPanelMethods.tasarla(this);
    }

    public static IslemBasariliEkrani getIslembasariliekrani() {
        return islembasariliekrani;
    }
    
}
