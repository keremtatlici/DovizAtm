
package dovizatm.View;

import dovizatm.Controller.ustPanelMethods;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HavaleYapEkrani extends JPanel{
    public JButton Btn_ParaGonder = new JButton("Parayı Gönder");
    public JButton Btn_AnaEkranaDon = new JButton("Ana Ekrana Dön");
    public JTextField Txtfield_No = new JTextField("");
    public JLabel no = new JLabel("Gönderilecek hesabın numarası : ");
    
    private static HavaleYapEkrani havaleyapekrani = new HavaleYapEkrani();
    
    private HavaleYapEkrani(){
        ustPanelMethods.tasarla(this);
        
        
        no.setBounds(0,0,200,40);
        Txtfield_No.setBounds(200,0,100,40);
        Btn_ParaGonder.setBounds(0,110,200,100);
        Btn_AnaEkranaDon.setBounds(0,330,200,100);
        
        this.add(no);
        this.add(Txtfield_No);
        this.add(Btn_ParaGonder);
        this.add(Btn_AnaEkranaDon);
    }

    public static HavaleYapEkrani getHavaleyapekrani() {
        return havaleyapekrani;
    }
    
}
