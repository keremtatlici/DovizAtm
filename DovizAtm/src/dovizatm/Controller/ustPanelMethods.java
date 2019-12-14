package dovizatm.Controller;

import java.awt.Color;
import javax.swing.JPanel;

public class ustPanelMethods {
    private static int adet,adet2,b;
            
    
    private ustPanelMethods(){}
    
    public static void tasarla(JPanel p){
        p.setLayout(null);
        p.setBounds(0, 0, 766, 500);
        p.setBackground(Color.LIGHT_GRAY);
    }
    
    public static void ParaYolla(int a){
        if(SystemVariables.getParametre() == "TL" && ModeldanCek.getKullaniciHesapTLBakiye() >= a){
            
            adet = a/200;
            a = a%200;
            
            ModeliSetle.setKullaniciHesapTL200Banknot(
                    ModeldanCek.getKullaniciHesapTL200Banknot() - adet
            );
            
            adet = a/100;
            a = a%100;
            
            ModeliSetle.setKullaniciHesapTL100Banknot(
                    ModeldanCek.getKullaniciHesapTL100Banknot() - adet
            );
            
            adet = a/50;
            a = a%50;
            
            ModeliSetle.setKullaniciHesapTL50Banknot(
                    ModeldanCek.getKullaniciHesapTL50Banknot() - adet
            );
            
            adet = a/20;
            a = a%20;
            
            ModeliSetle.setKullaniciHesapTL20Banknot(
                    ModeldanCek.getKullaniciHesapTL20Banknot() - adet
            );
            
            adet = a/10;
            a = a%10;
            
            ModeliSetle.setKullaniciHesapTL10Banknot(
                    ModeldanCek.getKullaniciHesapTL10Banknot() - adet
            );
            
            adet = a/5;
            a = a%5;
            
            ModeliSetle.setKullaniciHesapTL5Banknot(
                    ModeldanCek.getKullaniciHesapTL5Banknot() - adet
            );
            
            ModeliSetle.setKullaniciHesapTL5Banknot(
                    ModeldanCek.getKullaniciHesapTL5Banknot()
            );
            
        }else if(SystemVariables.getParametre() == "Euro" && ModeldanCek.getKullaniciHesapEuroBakiye() >= a){
            adet = a/200;
            a = a%200;
            
            
            
            ModeliSetle.setKullaniciHesapEuro200Banknot(
                    ModeldanCek.getKullaniciHesapEuro200Banknot() - adet
            );
            
            adet = a/100;
            a = a%100;
            
            
            ModeliSetle.setKullaniciHesapEuro100Banknot(
                    ModeldanCek.getKullaniciHesapEuro100Banknot() - adet
            );
            
            adet = a/50;
            a = a%50;
            
            
            ModeliSetle.setKullaniciHesapEuro50Banknot(
                    ModeldanCek.getKullaniciHesapEuro50Banknot() - adet
            );
            
            adet = a/20;
            a = a%20;
            
            
            ModeliSetle.setKullaniciHesapEuro20Banknot(
                    ModeldanCek.getKullaniciHesapEuro20Banknot() - adet
            );
            
            adet = a/10;
            a = a%10;
            
            
            ModeliSetle.setKullaniciHesapEuro10Banknot( 
                    ModeldanCek.getKullaniciHesapEuro10Banknot() - adet
            );
            
            adet = a/5;
            a = a%5;
            
            
            ModeliSetle.setKullaniciHesapEuro5Banknot(
                    ModeldanCek.getKullaniciHesapEuro5Banknot() - adet
            );
            ModeliSetle.setKullaniciHesapEuro5Banknot(
                    ModeldanCek.getKullaniciHesapEuro5Banknot()
            );
        }
        RePaint.repaint();
    }
    
    
    public static void ParaCevir(int a){
        if(SystemVariables.getParametre() == "TL" && ModeldanCek.getKullaniciHesapTLBakiye() >= a && a > 25 ){
            
            b = a / ModeldanCek.getBirEuroKacTL();
            
            adet = a/200;
            adet2 =b/200;
            
            
            a = a%200;
            b= b%200;
            
            ModeliSetle.setKullaniciHesapTL200Banknot(
                    ModeldanCek.getKullaniciHesapTL200Banknot() - adet
            );
            
            ModeliSetle.setKullaniciHesapEuro200Banknot(
                    ModeldanCek.getKullaniciHesapEuro200Banknot() + adet2
            );
            
            
            
            adet = a/100;
            adet2 =b/100;
            
            
            a = a%100;
            b= b%100;
            
            ModeliSetle.setKullaniciHesapTL100Banknot(
                    ModeldanCek.getKullaniciHesapTL100Banknot() - adet
            );
            
            ModeliSetle.setKullaniciHesapEuro100Banknot(
                    ModeldanCek.getKullaniciHesapEuro100Banknot() + adet2
            );
            
            
            adet = a/50;
            adet2 =b/50;
            
            
            a = a%50;
            b= b%50;
            
            ModeliSetle.setKullaniciHesapTL50Banknot(
                    ModeldanCek.getKullaniciHesapTL50Banknot() - adet
            );
            
            ModeliSetle.setKullaniciHesapEuro50Banknot(
                    ModeldanCek.getKullaniciHesapEuro50Banknot() + adet2
            );
            
            adet = a/20;
            adet2 =b/20;
            
            
            a = a%20;
            b= b%20;
            
            ModeliSetle.setKullaniciHesapTL20Banknot(
                    ModeldanCek.getKullaniciHesapTL20Banknot() - adet
            );
            
            ModeliSetle.setKullaniciHesapEuro20Banknot(
                    ModeldanCek.getKullaniciHesapEuro20Banknot() + adet2
            );
            
            adet = a/10;
            adet2 =b/10;
            
            
            a = a%10;
            b= b%10;
            
            ModeliSetle.setKullaniciHesapTL10Banknot(
                    ModeldanCek.getKullaniciHesapTL10Banknot() - adet
            );
            
            ModeliSetle.setKullaniciHesapEuro10Banknot(
                    ModeldanCek.getKullaniciHesapEuro10Banknot() + adet2
            );
            
            adet = a/5;
            adet2 =b/5;
            
            
            a = a%5;
            b= b%5;
            
            ModeliSetle.setKullaniciHesapTL5Banknot(
                    ModeldanCek.getKullaniciHesapTL5Banknot() - adet
            );
            
            ModeliSetle.setKullaniciHesapEuro5Banknot(
                    ModeldanCek.getKullaniciHesapEuro5Banknot() + adet2
            );
            
            
            
            ModeliSetle.setKullaniciHesapEuro200Banknot(
                    ModeldanCek.getKullaniciHesapTL200Banknot()
            );
        }else if(SystemVariables.getParametre() == "Euro" && ModeldanCek.getKullaniciHesapEuroBakiye() >= a ){
            b = a * ModeldanCek.getBirEuroKacTL();
            
            adet = a/200;
            adet2 =b/200;
            
            
            a = a%200;
            b= b%200;
            
            ModeliSetle.setKullaniciHesapTL200Banknot(
                    ModeldanCek.getKullaniciHesapTL200Banknot() + adet2
            );
            
            ModeliSetle.setKullaniciHesapEuro200Banknot(
                    ModeldanCek.getKullaniciHesapEuro200Banknot() - adet
            );
            
            adet = a/100;
            adet2 =b/100;
            
            
            a = a%100;
            b= b%100;
            
            ModeliSetle.setKullaniciHesapTL100Banknot(
                    ModeldanCek.getKullaniciHesapTL100Banknot() + adet2
            );
            
            ModeliSetle.setKullaniciHesapEuro100Banknot(
                    ModeldanCek.getKullaniciHesapEuro100Banknot() - adet
            );
            
            adet = a/50;
            adet2 =b/50;
            
            
            a = a%50;
            b= b%50;
            
            ModeliSetle.setKullaniciHesapTL50Banknot(
                    ModeldanCek.getKullaniciHesapTL50Banknot() + adet2
            );
            
            ModeliSetle.setKullaniciHesapEuro50Banknot(
                    ModeldanCek.getKullaniciHesapEuro50Banknot() - adet
            );
            
            adet = a/20;
            adet2 =b/20;
            
            
            a = a%20;
            b= b%20;
            
            ModeliSetle.setKullaniciHesapTL20Banknot(
                    ModeldanCek.getKullaniciHesapTL20Banknot() + adet2
            );
            
            ModeliSetle.setKullaniciHesapEuro20Banknot(
                    ModeldanCek.getKullaniciHesapEuro20Banknot() - adet
            );
            
            adet = a/10;
            adet2 =b/10;
            
            
            a = a%10;
            b= b%10;
            
            ModeliSetle.setKullaniciHesapTL10Banknot(
                    ModeldanCek.getKullaniciHesapTL10Banknot() + adet2
            );
            
            ModeliSetle.setKullaniciHesapEuro10Banknot(
                    ModeldanCek.getKullaniciHesapEuro10Banknot() - adet
            );
            
            adet = a/5;
            adet2 =b/5;
            
            
            a = a%5;
            b= b%5;
            
            ModeliSetle.setKullaniciHesapTL5Banknot(
                    ModeldanCek.getKullaniciHesapTL5Banknot() + adet2
            );
            
            ModeliSetle.setKullaniciHesapEuro5Banknot(
                    ModeldanCek.getKullaniciHesapEuro5Banknot() - adet
            );
        }
        
        
        RePaint.repaint();
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
        }
        RePaint.repaint();
    }
}
