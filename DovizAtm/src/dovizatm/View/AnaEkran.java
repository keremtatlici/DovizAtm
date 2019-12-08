
package dovizatm.View;

import dovizatm.Controller.ustPanelMethods;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class AnaEkran extends JPanel{
    public JButton Btn_KartsizIslem;
    public JButton Btn_KartliIslem;
    
    private static AnaEkran anaekran = new AnaEkran();
    
    private AnaEkran(){
        
        ustPanelMethods.tasarla(this);
        
        Btn_KartsizIslem = new JButton("Kartsız İşlem");
        Btn_KartliIslem = new JButton("Kartlı İşlem");
        
        Btn_KartsizIslem.setBounds(0,0,200,100);
        Btn_KartliIslem.setBounds(0,110,200,100);
        
        
        this.add(Btn_KartsizIslem);
        this.add(Btn_KartliIslem);
    }

    public static AnaEkran getAnaekran() {
        return anaekran;
    }

}
