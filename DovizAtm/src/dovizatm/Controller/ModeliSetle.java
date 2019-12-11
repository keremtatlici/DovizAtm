/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.Controller;

import dovizatm.Model.AtmBakiye;
import dovizatm.Model.AtmBanknot;
import dovizatm.Model.KullaniciCepBakiye;
import dovizatm.Model.KullaniciCepBanknot;
import dovizatm.Model.KullaniciElBakiye;
import dovizatm.Model.KullaniciElBanknot;

/**
 *
 * @author krmtt
 */
public class ModeliSetle {
    private static AtmBakiye atmbakiye = AtmBakiye.getAtmbakiye();
    private static KullaniciCepBakiye kullanicicepbakiye = KullaniciCepBakiye.getKullanicicepbakiye();
    private static KullaniciElBakiye kullanicielbakiye = KullaniciElBakiye.getKullanicielbakiye();
    
    private static AtmBanknot atmbanknot = AtmBanknot.getAtmbanknot();
    private static KullaniciCepBanknot kullanicicepbanknot = KullaniciCepBanknot.getKullanicicepbanknot();
    private static KullaniciElBanknot kullanicielbanknot = KullaniciElBanknot.getKullanicielbanknot();
    
    private ModeliSetle(){
        
    }
    
    //Atm Bakiye
    public static void setAtmTLBakiye(int a){
        atmbakiye.setTLSayisi(a);
    }
    
    public static void setAtmEuroBakiye(int a){
         atmbakiye.setEuroSayisi(a);
    }
    
    //Kullanıcı cep bakiye
    
    public static void setKullaniciCepTLBakiye(int a){
         kullanicicepbakiye.setTLSayisi(a);
    }
    
    public static void setKullaniciCepEuroBakiye(int a){
         kullanicicepbakiye.setEuroSayisi(a);
    }
    //kullanici el bakiye
    public static void setKullaniciElTLBakiye(int a){
         kullanicielbakiye.setTLSayisi(a);
    }
    public static void setKullaniciElEuroBakiye(int a){
         kullanicielbakiye.setEuroSayisi(a);
    }
    
    
    //Atm Banknot Sayisi TL
    
    public static void setAtmTL5Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         atmbanknot.setTL5Sayisi(a);
    }
    public static void setAtmTL10Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         atmbanknot.setTL10Sayisi(a);
    }
    public static void setAtmTL20Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         atmbanknot.setTL20Sayisi(a);
    }
    public static void setAtmTL50Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         atmbanknot.setTL50Sayisi(a);
    }
    public static void setAtmTL100Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         atmbanknot.setTL100Sayisi(a);
    }
    public static void setAtmTL200Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         atmbanknot.setTL200Sayisi(a);
    }
    //Atm Banknot Sayisi Euro
    public static void setAtmEuro5Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         atmbanknot.setEuro5Sayisi(a);
    }
    public static void setAtmEuro10Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         atmbanknot.setEuro10Sayisi(a);
    }
    public static void setAtmEuro20Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         atmbanknot.setEuro20Sayisi(a);
    }
    public static void setAtmEuro50Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         atmbanknot.setEuro50Sayisi(a);
    }
    public static void setAtmEuro100Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         atmbanknot.setEuro100Sayisi(a);
    }
    public static void setAtmEuro200Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         atmbanknot.setEuro200Sayisi(a);
    }
    
    //Kullanici Cep Banknot Sayisi TL
    public static void setKullaniciCepTL5Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicicepbanknot.setTL5Sayisi(a);
    }
    public static void setKullaniciCepTL10Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicicepbanknot.setTL10Sayisi(a);
    }
    public static void setKullaniciCepTL20Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicicepbanknot.setTL20Sayisi(a);
    }
    public static void setKullaniciCepTL50Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicicepbanknot.setTL50Sayisi(a);
    }
    public static void setKullaniciCepTL100Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicicepbanknot.setTL100Sayisi(a);
    }
    public static void setKullaniciCepTL200Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicicepbanknot.setTL200Sayisi(a);
    }
    //Kullanici Cep Banknot Sayisi Euro
    public static void setKullaniciCepEuro5Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicicepbanknot.setEuro5Sayisi(a);
    }
    public static void setKullaniciCepEuro10Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicicepbanknot.setEuro10Sayisi(a);
    }
    public static void setKullaniciCepEuro20Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicicepbanknot.setEuro20Sayisi(a);
    }
    public static void setKullaniciCepEuro50Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicicepbanknot.setEuro50Sayisi(a);
    }
    public static void setKullaniciCepEuro100Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicicepbanknot.setEuro100Sayisi(a);
    }
    public static void setKullaniciCepEuro200Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicicepbanknot.setEuro200Sayisi(a);
    }
    
    //Kullanici El Banknot Sayisi TL
    public static void setKullaniciElTL5Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicielbanknot.setTL5Sayisi(a);
    }
    public static void setKullaniciElTL10Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicielbanknot.setTL10Sayisi(a);
    }
    public static void setKullaniciElTL20Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicielbanknot.setTL20Sayisi(a);
    }
    public static void setKullaniciElTL50Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicielbanknot.setTL50Sayisi(a);
    }
    public static void setKullaniciElTL100Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicielbanknot.setTL100Sayisi(a);
    }
    public static void setKullaniciElTL200Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicielbanknot.setTL200Sayisi(a);
    }
   
    //Kullanici El Banknot Sayisi Euro
    public static void setKullaniciElEuro5Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicielbanknot.setEuro5Sayisi(a);
    }
    public static void setKullaniciElEuro10Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicielbanknot.setEuro10Sayisi(a);
    }
    public static void setKullaniciElEuro20Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicielbanknot.setEuro20Sayisi(a);
    }
    public static void setKullaniciElEuro50Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicielbanknot.setEuro50Sayisi(a);
    }
    public static void setKullaniciElEuro100Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicielbanknot.setEuro100Sayisi(a);
    }
    public static void setKullaniciElEuro200Banknot(int a){
        BakiyeHesapla.TumBakiyeHesapla();
         kullanicielbanknot.setEuro200Sayisi(a);
    }
}
