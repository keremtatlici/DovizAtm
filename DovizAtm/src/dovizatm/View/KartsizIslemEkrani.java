package dovizatm.View;

import dovizatm.Controller.ustPanelMethods;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;


public class KartsizIslemEkrani extends JPanel{
    public JButton Btn_FaturaOde = new JButton("Fatura Öde");
    public JButton Btn_HavaleYap = new JButton("Havale Yap");
    public JButton Btn_Iptal = new JButton("İptal");
    
    private static KartsizIslemEkrani kartsizislemekrani = new KartsizIslemEkrani();
    
    private KartsizIslemEkrani(){
       
        ustPanelMethods.tasarla(this);
        
        Btn_FaturaOde.setBounds(0,0,200,100);
        Btn_HavaleYap.setBounds(0,110,200,100);
        Btn_Iptal.setBounds(0,220,200,100);
        
        this.add(Btn_FaturaOde);
        this.add(Btn_HavaleYap);
        this.add(Btn_Iptal);
    }

    public static KartsizIslemEkrani getKartsizislemekrani() {
        return kartsizislemekrani;
    }
    
}
