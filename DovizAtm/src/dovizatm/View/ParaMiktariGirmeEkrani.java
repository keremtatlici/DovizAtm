
package dovizatm.View;

import dovizatm.Controller.ustPanelMethods;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ParaMiktariGirmeEkrani extends JPanel{
    public JButton Btn_Onayla = new JButton("Onayla");
    public JButton Btn_AnaEkranaDon = new JButton("Ana Ekrana Dön");
    public JTextField Txtfield_ParaMiktari = new JTextField("");
    private String DurumYazisi;
    
    private static ParaMiktariGirmeEkrani paramiktarigirmeekrani = new ParaMiktariGirmeEkrani();
    
    private ParaMiktariGirmeEkrani(){
        ustPanelMethods.tasarla(this);
        
        Btn_Onayla.setBounds(0,0,200,100);
        Txtfield_ParaMiktari.setBounds(0,110,200,100);
        Btn_AnaEkranaDon.setBounds(0,330,200,100);
       
        
        this.add(Btn_Onayla);
        this.add(Txtfield_ParaMiktari);
        this.add(Btn_AnaEkranaDon);
        
    }

    public static ParaMiktariGirmeEkrani getParamiktarigirmeekrani() {
        return paramiktarigirmeekrani;
    }
    
}
