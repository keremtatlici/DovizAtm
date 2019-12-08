
package dovizatm.View;

import dovizatm.Controller.ustPanelMethods;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;


public class FaturaOdeEkrani extends JPanel{
    public JButton Btn_TelefonOde = new JButton("Telefon Faturası Öde");
    public JButton Btn_SuOde = new JButton("Su Faturası Öde");
    public JButton Btn_ElektrikOde = new JButton("Elektrik Faturası Öde");
    public JButton Btn_DogalgazOde = new JButton("Doğalgaz Faturası Öde");
    public JButton Btn_AnaEkranaDon = new JButton("Ana Ekrana Dön");
    
    private static FaturaOdeEkrani faturaodeekrani = new FaturaOdeEkrani();
    
    private FaturaOdeEkrani(){
        
        ustPanelMethods.tasarla(this);
        
        Btn_TelefonOde.setBounds(0,0,200,100);
        Btn_SuOde.setBounds(0,110,200,100);
        Btn_ElektrikOde.setBounds(0,220,200,100);
        Btn_DogalgazOde.setBounds(0,330,200,100);
        Btn_AnaEkranaDon.setBounds(566,0,200,100);
        
        this.add(Btn_TelefonOde);
        this.add(Btn_SuOde);
        this.add(Btn_ElektrikOde);
        this.add(Btn_DogalgazOde);
        this.add(Btn_AnaEkranaDon);
    }

    public static FaturaOdeEkrani getFaturaodeekrani() {
        return faturaodeekrani;
    }
    
}
