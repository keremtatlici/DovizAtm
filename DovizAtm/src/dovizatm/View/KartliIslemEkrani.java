
package dovizatm.View;

import dovizatm.Controller.ustPanelMethods;
import javax.swing.JButton;
import javax.swing.JPanel;


public class KartliIslemEkrani extends JPanel{
   
    public JButton Btn_FaturaOde = new JButton("Fatura Öde");
    public JButton Btn_HavaleYap = new JButton("Havale Yap");
    public JButton Btn_ParaCek = new JButton("Hesaptan Para Çek");
    public JButton Btn_ParaYatir = new JButton("Hesaba Para Yatır");
    public JButton Btn_ParaCevir = new JButton("Hesaptaki Parayı Çevir");
    public JButton Btn_KartIade = new JButton("Kart İade");
    public String Kur;
    public int BakiyeEuro,BakiyeTL;
    

    
    private static KartliIslemEkrani kartliislemekrani = new KartliIslemEkrani();
    
    private KartliIslemEkrani(){
        ustPanelMethods.tasarla(this);
        
        Btn_FaturaOde.setBounds(0,0,200,100);     

        Btn_HavaleYap.setBounds(0,110,200,100);
        Btn_ParaCek.setBounds(0,220,200,100);
        Btn_ParaYatir.setBounds(0,330,200,100);
        Btn_ParaCevir.setBounds(566,0,200,100);
        Btn_KartIade.setBounds(566,110,200,100);
        
        this.add(Btn_FaturaOde);
        this.add(Btn_HavaleYap);
        this.add(Btn_ParaCek);
        this.add(Btn_ParaYatir);
        this.add(Btn_ParaCevir);
        this.add(Btn_KartIade);
    }

    public static KartliIslemEkrani getKartliislemekrani() {
        return kartliislemekrani;
    }
    
}
