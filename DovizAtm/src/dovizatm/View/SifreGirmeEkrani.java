
package dovizatm.View;

import dovizatm.Controller.ustPanelMethods;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class SifreGirmeEkrani extends JPanel{
    public JPasswordField Txtfield_Sifre = new JPasswordField("0000");
    public JButton Btn_GirisYap = new JButton("Giriş Yap");
    public JButton Btn_Iptal= new JButton("İptal");
    public JLabel uyari = new JLabel("Lütfen Bankamatiğe Kartınızı Takınız");
    public JLabel bildiri = new JLabel("Şifrenizi Giriniz: ");
    
    private static SifreGirmeEkrani sifregirmeekrani = new SifreGirmeEkrani();
    
    private SifreGirmeEkrani(){
        
        ustPanelMethods.tasarla(this);
        
        Btn_GirisYap.setEnabled(false);
        
        bildiri.setBounds(0,0,200,40);
        Txtfield_Sifre.setBounds(200,0,100,40);
        Btn_GirisYap.setBounds(0,220,200,100);
        Btn_Iptal.setBounds(0,330,200,100);
       
        
        this.add(bildiri);
        this.add(Txtfield_Sifre);
        this.add(Btn_GirisYap);
        this.add(Btn_Iptal);

    }

    public static SifreGirmeEkrani getSifregirmeekrani() {
        return sifregirmeekrani;
    }
    
}
