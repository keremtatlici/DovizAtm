package dovizatm.Controller;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ustPanelMethods {
    private static int mod,adet;
            
    
    private ustPanelMethods(){}
    
    public static void tasarla(JPanel p){
        p.setLayout(null);
        p.setBounds(0, 0, 766, 500);
        p.setBackground(Color.LIGHT_GRAY);
    }
    
    
    public static void ParaCek(int a){
        
        if(ModeldanCek.getKullaniciHesapTLBakiye() >= a && SystemVariables.getParametre() == "TL"){
            adet = a/200;
            a = a%200;
            
            ModeliSetle.setKullaniciCepTL200Banknot(
                    ModeldanCek.getKullaniciCepTL200Banknot() + adet
            );
            
            ModeliSetle.setKullaniciHesapTL200Banknot(
                    ModeldanCek.getKullaniciHesapTL200Banknot() - adet
            );
            
            adet = a/100;
            a = a%100;
            
            ModeliSetle.setKullaniciCepTL100Banknot(
                    ModeldanCek.getKullaniciCepTL100Banknot() + adet
            );
            ModeliSetle.setKullaniciHesapTL100Banknot(
                    ModeldanCek.getKullaniciHesapTL100Banknot() - adet
            );
            
            adet = a/50;
            a = a%50;
            
            ModeliSetle.setKullaniciCepTL50Banknot(
                    ModeldanCek.getKullaniciCepTL50Banknot() + adet
            );
            ModeliSetle.setKullaniciHesapTL50Banknot(
                    ModeldanCek.getKullaniciHesapTL50Banknot() - adet
            );
            
            adet = a/20;
            a = a%20;
            
            ModeliSetle.setKullaniciCepTL20Banknot(
                    ModeldanCek.getKullaniciCepTL20Banknot() + adet
            );
            ModeliSetle.setKullaniciHesapTL20Banknot(
                    ModeldanCek.getKullaniciHesapTL20Banknot() - adet
            );
            
            adet = a/10;
            a = a%10;
            
            ModeliSetle.setKullaniciCepTL10Banknot(
                    ModeldanCek.getKullaniciCepTL10Banknot() + adet
            );
            ModeliSetle.setKullaniciHesapTL10Banknot(
                    ModeldanCek.getKullaniciHesapTL10Banknot() - adet
            );
            
            adet = a/5;
            a = a%5;
            
            ModeliSetle.setKullaniciCepTL5Banknot(
                    ModeldanCek.getKullaniciCepTL5Banknot() + adet
            );
            ModeliSetle.setKullaniciHesapTL5Banknot(
                    ModeldanCek.getKullaniciHesapTL5Banknot() - adet
            );
            
            ModeliSetle.setKullaniciHesapTL5Banknot(
                    ModeldanCek.getKullaniciHesapTL5Banknot()
            );
            System.out.println(ModeldanCek.getKullaniciCepTLBakiye());
        }
        
        
        if(ModeldanCek.getKullaniciHesapEuroBakiye() >= a && SystemVariables.getParametre() == "Euro"){
            adet = a/200;
            a = a%200;
            
            ModeliSetle.setKullaniciCepEuro200Banknot(
                    ModeldanCek.getKullaniciCepEuro200Banknot() + adet
            );
            
            ModeliSetle.setKullaniciHesapEuro200Banknot(
                    ModeldanCek.getKullaniciHesapEuro200Banknot() - adet
            );
            
            adet = a/100;
            a = a%100;
            
            ModeliSetle.setKullaniciCepEuro100Banknot(
                    ModeldanCek.getKullaniciCepEuro100Banknot() + adet
            );
            ModeliSetle.setKullaniciHesapEuro100Banknot(
                    ModeldanCek.getKullaniciHesapEuro100Banknot() - adet
            );
            
            adet = a/50;
            a = a%50;
            
            ModeliSetle.setKullaniciCepEuro50Banknot(
                    ModeldanCek.getKullaniciCepEuro50Banknot() + adet
            );
            ModeliSetle.setKullaniciHesapEuro50Banknot(
                    ModeldanCek.getKullaniciHesapEuro50Banknot() - adet
            );
            
            adet = a/20;
            a = a%20;
            
            ModeliSetle.setKullaniciCepEuro20Banknot(
                    ModeldanCek.getKullaniciCepEuro20Banknot() + adet
            );
            ModeliSetle.setKullaniciHesapEuro20Banknot(
                    ModeldanCek.getKullaniciHesapEuro20Banknot() - adet
            );
            
            adet = a/10;
            a = a%10;
            
            ModeliSetle.setKullaniciCepEuro10Banknot(
                    ModeldanCek.getKullaniciCepEuro10Banknot() + adet
            );
            ModeliSetle.setKullaniciHesapEuro10Banknot( 
                    ModeldanCek.getKullaniciHesapEuro10Banknot() - adet
            );
            
            adet = a/5;
            a = a%5;
            
            ModeliSetle.setKullaniciCepEuro5Banknot(
                    ModeldanCek.getKullaniciCepEuro5Banknot() + adet
            );
            ModeliSetle.setKullaniciHesapEuro5Banknot(
                    ModeldanCek.getKullaniciHesapEuro5Banknot() - adet
            );
            ModeliSetle.setKullaniciHesapEuro5Banknot(
                    ModeldanCek.getKullaniciHesapEuro5Banknot()
            );
            System.out.println(ModeldanCek.getKullaniciCepEuroBakiye());
        }
        
        
        RePaint.repaint();
    }
}
