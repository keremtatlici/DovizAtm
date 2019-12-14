
package dovizatm.View;

import dovizatm.Controller.ustPanelMethods;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ParaCekEkrani extends JPanel{
    public JButton Btn_EuroCek = new JButton("Euro Çek");
    public JButton Btn_TLCek = new JButton("TL Çek");
    public JButton Btn_AnaEkranaDon = new JButton("Ana Ekrana Dön");
    
    private static ParaCekEkrani paracekekrani = new ParaCekEkrani();
    
    private ParaCekEkrani(){
        ustPanelMethods.tasarla(this);
        
        Btn_EuroCek.setBounds(0,0,200,100);
        Btn_TLCek.setBounds(0,110,200,100);
        Btn_AnaEkranaDon.setBounds(0,220,200,100);
        
        this.add(Btn_EuroCek);
        this.add(Btn_TLCek);
        this.add(Btn_AnaEkranaDon);
    }

    public static ParaCekEkrani getParacekekrani() {
        return paracekekrani;
    }
    
}
