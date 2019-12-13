/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.Controller;

/**
 *
 * @author krmtt
 */
public class AltPanelMethods { // All methods should be static!!
    private AltPanelMethods(){
        
    }
    public static void kartliparayatir(){
        
        ModeliSetle.setKullaniciHesapTL5Banknot(ModeldanCek.getKullaniciHesapTL5Banknot() + ModeldanCek.getKullaniciElTL5Banknot());
        ModeliSetle.setKullaniciHesapTL10Banknot(ModeldanCek.getKullaniciHesapTL10Banknot() + ModeldanCek.getKullaniciElTL10Banknot());
        ModeliSetle.setKullaniciHesapTL20Banknot(ModeldanCek.getKullaniciHesapTL20Banknot() + ModeldanCek.getKullaniciElTL20Banknot());
        ModeliSetle.setKullaniciHesapTL50Banknot(ModeldanCek.getKullaniciHesapTL50Banknot() + ModeldanCek.getKullaniciElTL50Banknot());
        ModeliSetle.setKullaniciHesapTL100Banknot(ModeldanCek.getKullaniciHesapTL100Banknot() + ModeldanCek.getKullaniciElTL100Banknot());
        ModeliSetle.setKullaniciHesapTL200Banknot(ModeldanCek.getKullaniciHesapTL200Banknot() + ModeldanCek.getKullaniciElTL200Banknot());
        
        ModeliSetle.setKullaniciHesapEuro5Banknot(ModeldanCek.getKullaniciHesapEuro5Banknot() + ModeldanCek.getKullaniciElEuro5Banknot());
        ModeliSetle.setKullaniciHesapEuro10Banknot(ModeldanCek.getKullaniciHesapEuro10Banknot() + ModeldanCek.getKullaniciElEuro10Banknot());
        ModeliSetle.setKullaniciHesapEuro20Banknot(ModeldanCek.getKullaniciHesapEuro20Banknot() + ModeldanCek.getKullaniciElEuro20Banknot());
        ModeliSetle.setKullaniciHesapEuro50Banknot(ModeldanCek.getKullaniciHesapEuro50Banknot() + ModeldanCek.getKullaniciElEuro50Banknot());
        ModeliSetle.setKullaniciHesapEuro100Banknot(ModeldanCek.getKullaniciHesapEuro100Banknot() + ModeldanCek.getKullaniciElEuro100Banknot());
        ModeliSetle.setKullaniciHesapEuro200Banknot(ModeldanCek.getKullaniciHesapEuro200Banknot() + ModeldanCek.getKullaniciElEuro200Banknot());
        
        
        ModeliSetle.setKullaniciElTL5Banknot(0);
        ModeliSetle.setKullaniciElTL10Banknot(0);
        ModeliSetle.setKullaniciElTL20Banknot(0);
        ModeliSetle.setKullaniciElTL50Banknot(0);
        ModeliSetle.setKullaniciElTL100Banknot(0);
        ModeliSetle.setKullaniciElTL200Banknot(0);
        
        ModeliSetle.setKullaniciElEuro5Banknot(0);
        ModeliSetle.setKullaniciElEuro10Banknot(0);
        ModeliSetle.setKullaniciElEuro20Banknot(0);
        ModeliSetle.setKullaniciElEuro50Banknot(0);
        ModeliSetle.setKullaniciElEuro100Banknot(0);
        ModeliSetle.setKullaniciElEuro200Banknot(0);
        
        ModeliSetle.setKullaniciElEuro200Banknot(0);
        
        RePaint.repaint();
    }
    public static void EldekiTLyiCebeAt(){
        
        ModeliSetle.setKullaniciCepTL5Banknot(ModeldanCek.getKullaniciCepTL5Banknot() + ModeldanCek.getKullaniciElTL5Banknot());
        ModeliSetle.setKullaniciCepTL10Banknot(ModeldanCek.getKullaniciCepTL10Banknot() + ModeldanCek.getKullaniciElTL10Banknot());
        ModeliSetle.setKullaniciCepTL20Banknot(ModeldanCek.getKullaniciCepTL20Banknot() + ModeldanCek.getKullaniciElTL20Banknot());
        ModeliSetle.setKullaniciCepTL50Banknot(ModeldanCek.getKullaniciCepTL50Banknot() + ModeldanCek.getKullaniciElTL50Banknot());
        ModeliSetle.setKullaniciCepTL100Banknot(ModeldanCek.getKullaniciCepTL100Banknot() + ModeldanCek.getKullaniciElTL100Banknot());
        ModeliSetle.setKullaniciCepTL200Banknot(ModeldanCek.getKullaniciCepTL200Banknot() + ModeldanCek.getKullaniciElTL200Banknot());
        
        RePaint.repaint();
        
        ModeliSetle.setKullaniciElTL5Banknot(0);
        ModeliSetle.setKullaniciElTL10Banknot(0);
        ModeliSetle.setKullaniciElTL20Banknot(0);
        ModeliSetle.setKullaniciElTL50Banknot(0);
        ModeliSetle.setKullaniciElTL100Banknot(0);
        ModeliSetle.setKullaniciElTL200Banknot(0);
        ModeliSetle.setKullaniciElTL200Banknot(0);// nedenini anlamadığım basit bir hatayı çözüyor.
        
        RePaint.repaint();
    }
    public static void EldekiEuroyuCebeAt(){
        ModeliSetle.setKullaniciCepEuro5Banknot(ModeldanCek.getKullaniciCepEuro5Banknot() + ModeldanCek.getKullaniciElEuro5Banknot());
        ModeliSetle.setKullaniciCepEuro10Banknot(ModeldanCek.getKullaniciCepEuro10Banknot() + ModeldanCek.getKullaniciElEuro10Banknot());
        ModeliSetle.setKullaniciCepEuro20Banknot(ModeldanCek.getKullaniciCepEuro20Banknot() + ModeldanCek.getKullaniciElEuro20Banknot());
        ModeliSetle.setKullaniciCepEuro50Banknot(ModeldanCek.getKullaniciCepEuro50Banknot() + ModeldanCek.getKullaniciElEuro50Banknot());
        ModeliSetle.setKullaniciCepEuro100Banknot(ModeldanCek.getKullaniciCepEuro100Banknot() + ModeldanCek.getKullaniciElEuro100Banknot());
        ModeliSetle.setKullaniciCepEuro200Banknot(ModeldanCek.getKullaniciCepEuro200Banknot() + ModeldanCek.getKullaniciElEuro200Banknot());
        
        RePaint.repaint();
        
        ModeliSetle.setKullaniciElEuro5Banknot(0);
        ModeliSetle.setKullaniciElEuro10Banknot(0);
        ModeliSetle.setKullaniciElEuro20Banknot(0);
        ModeliSetle.setKullaniciElEuro50Banknot(0);
        ModeliSetle.setKullaniciElEuro100Banknot(0);
        ModeliSetle.setKullaniciElEuro200Banknot(0);
        ModeliSetle.setKullaniciElEuro200Banknot(0);// nedenini anlamadığım basit bir hatayı çözüyor.
        
        RePaint.repaint();
    }
}
