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
public class BaslangicSetIslemleri {
    
    private BaslangicSetIslemleri(){
        
    }
    public static void BaslangicSet(){
        
        ModeliSetle.setAtmTL5Banknot(5);
        ModeliSetle.setAtmTL10Banknot(5);
        ModeliSetle.setAtmTL20Banknot(5);
        ModeliSetle.setAtmTL50Banknot(5);
        ModeliSetle.setAtmTL100Banknot(5);
        ModeliSetle.setAtmTL200Banknot(5);
        
        ModeliSetle.setAtmEuro5Banknot(5);
        ModeliSetle.setAtmEuro10Banknot(5);
        ModeliSetle.setAtmEuro20Banknot(5);
        ModeliSetle.setAtmEuro50Banknot(5);
        ModeliSetle.setAtmEuro100Banknot(5);
        ModeliSetle.setAtmEuro200Banknot(5);
        
        
        ModeliSetle.setKullaniciCepTL5Banknot(3);
        ModeliSetle.setKullaniciCepTL10Banknot(3);
        ModeliSetle.setKullaniciCepTL20Banknot(3);
        ModeliSetle.setKullaniciCepTL50Banknot(3);
        ModeliSetle.setKullaniciCepTL100Banknot(3);
        ModeliSetle.setKullaniciCepTL200Banknot(3);
        
        ModeliSetle.setKullaniciCepEuro5Banknot(3);
        ModeliSetle.setKullaniciCepEuro10Banknot(3);
        ModeliSetle.setKullaniciCepEuro20Banknot(3);
        ModeliSetle.setKullaniciCepEuro50Banknot(3);
        ModeliSetle.setKullaniciCepEuro100Banknot(3);
        ModeliSetle.setKullaniciCepEuro200Banknot(3);
        
        
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
        
        
        BakiyeHesapla.TumBakiyeHesapla();
    }
}
