package dovizatm.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class KenarEkran extends JPanel{
    
    public solPanel solPanel;
    public ustPanel ustPanel;
    public altPanel altPanel;
    public sagPanel sagPanel;
    
    private static KenarEkran kenarekran = new KenarEkran();
    
    private KenarEkran(){
        this.setLayout(null);
        ustPanel =  ustPanel.getUstpanel();
        solPanel =  solPanel.getSolpanel();
        sagPanel =  sagPanel.getSagpanel();
        altPanel =  altPanel.getAltpanel();
        
        altPanel.Btn_KartTak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                altPanel.Btn_KartTak.setEnabled(false);
                altPanel.Btn_KartTak.setText("Kart Takılı");
                ustPanel.sifregirmeekrani.Btn_GirisYap.setEnabled(true);
                
                System.out.println(altPanel.Btn_KartTak.getText());
            }
        });
        ustPanel.kartliislemekrani.Btn_KartIade.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    altPanel.Btn_KartTak.setEnabled(true);
                    altPanel.Btn_KartTak.setText("Atm'ye Kartı Tak");
                    ustPanel.sifregirmeekrani.Btn_GirisYap.setEnabled(false);
                }
            });
        
        ustPanel.sifregirmeekrani.Btn_GirisYap.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ustPanel.sifregirmeekrani.Txtfield_Sifre.getText().equals("0000") && !altPanel.Btn_KartTak.isEnabled())// şifreyi controller-> model dan çekicez
                {
                     ustPanel.c1.show(ustPanel, "21");
                }else if(altPanel.Btn_KartTak.isEnabled()){
                    //Kartı takın uyarsı.
                }
                else{
                    // Girdiğiniz sifre yanlış yazsını ekrana bastır.
                }
            }
        });
        
        this.add(ustPanel);
        this.add(solPanel);
        this.add(sagPanel);
        this.add(altPanel);
       
    }

    public static KenarEkran getKenarekran() {
        return kenarekran;
    }
    
}
