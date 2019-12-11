package dovizatm.Controller;

import dovizatm.Model.AtmBakiye;
import dovizatm.Model.AtmBanknot;
import dovizatm.Model.Bakiye;
import dovizatm.Model.BanknotSayisi;
import dovizatm.Model.Kart;
import dovizatm.Model.KullaniciCepBakiye;
import dovizatm.Model.KullaniciCepBanknot;
import dovizatm.Model.KullaniciElBakiye;
import dovizatm.Model.KullaniciElBanknot;


public class ModeldanCek {// tüm methodlar static olacak!!!!!
    private static Kart kart = Kart.getKart();
    
    private static AtmBakiye atmbakiye = AtmBakiye.getAtmbakiye();
    private static KullaniciCepBakiye kullanicicepbakiye = KullaniciCepBakiye.getKullanicicepbakiye();
    private static KullaniciElBakiye kullanicielbakiye = KullaniciElBakiye.getKullanicielbakiye();
    
    private static AtmBanknot atmbanknot = AtmBanknot.getAtmbanknot();
    private static KullaniciCepBanknot kullanicicepbanknot = KullaniciCepBanknot.getKullanicicepbanknot();
    private static KullaniciElBanknot kullanicielbanknot = KullaniciElBanknot.getKullanicielbanknot();
    
    private ModeldanCek(){
        
    }
    public static String getKartSifresi(){
        return kart.getKartSifresi();
    }
    
    //Atm Bakiye
    public static int getAtmTLBakiye(){
        return atmbakiye.getTLSayisi();
    }
    
    public static int getAtmEuroBakiye(){
        return atmbakiye.getEuroSayisi();
    }
    
    //Kullanıcı cep bakiye
    
    public static int getKullaniciCepTLBakiye(){
        return kullanicicepbakiye.getTLSayisi();
    }
    
    public static int getKullaniciCepEuroBakiye(){
        return kullanicicepbakiye.getEuroSayisi();
    }
    //kullanici el bakiye
    public static int getKullaniciElTLBakiye(){
        return kullanicielbakiye.getTLSayisi();
    }
    public static int getKullaniciElEuroBakiye(){
        return kullanicielbakiye.getEuroSayisi();
    }
    
    
    //Atm Banknot Sayisi TL
    
    public static int getAtmTL5Banknot(){
        return atmbanknot.getTL5Sayisi();
    }
    public static int getAtmTL10Banknot(){
        return atmbanknot.getTL10Sayisi();
    }
    public static int getAtmTL20Banknot(){
        return atmbanknot.getTL20Sayisi();
    }
    public static int getAtmTL50Banknot(){
        return atmbanknot.getTL50Sayisi();
    }
    public static int getAtmTL100Banknot(){
        return atmbanknot.getTL100Sayisi();
    }
    public static int getAtmTL200Banknot(){
        return atmbanknot.getTL200Sayisi();
    }
    //Atm Banknot Sayisi Euro
    public static int getAtmEuro5Banknot(){
        return atmbanknot.getEuro5Sayisi();
    }
    public static int getAtmEuro10Banknot(){
        return atmbanknot.getEuro10Sayisi();
    }
    public static int getAtmEuro20Banknot(){
        return atmbanknot.getEuro20Sayisi();
    }
    public static int getAtmEuro50Banknot(){
        return atmbanknot.getEuro50Sayisi();
    }
    public static int getAtmEuro100Banknot(){
        return atmbanknot.getEuro100Sayisi();
    }
    public static int getAtmEuro200Banknot(){
        return atmbanknot.getEuro200Sayisi();
    }
    
    //Kullanici Cep Banknot Sayisi TL
    public static int getKullaniciCepTL5Banknot(){
        return kullanicicepbanknot.getTL5Sayisi();
    }
    public static int getKullaniciCepTL10Banknot(){
        return kullanicicepbanknot.getTL10Sayisi();
    }
    public static int getKullaniciCepTL20Banknot(){
        return kullanicicepbanknot.getTL20Sayisi();
    }
    public static int getKullaniciCepTL50Banknot(){
        return kullanicicepbanknot.getTL50Sayisi();
    }
    public static int getKullaniciCepTL100Banknot(){
        return kullanicicepbanknot.getTL100Sayisi();
    }
    public static int getKullaniciCepTL200Banknot(){
        return kullanicicepbanknot.getTL200Sayisi();
    }
    //Kullanici Cep Banknot Sayisi Euro
    public static int getKullaniciCepEuro5Banknot(){
        return kullanicicepbanknot.getEuro5Sayisi();
    }
    public static int getKullaniciCepEuro10Banknot(){
        return kullanicicepbanknot.getEuro10Sayisi();
    }
    public static int getKullaniciCepEuro20Banknot(){
        return kullanicicepbanknot.getEuro20Sayisi();
    }
    public static int getKullaniciCepEuro50Banknot(){
        return kullanicicepbanknot.getEuro50Sayisi();
    }
    public static int getKullaniciCepEuro100Banknot(){
        return kullanicicepbanknot.getEuro100Sayisi();
    }
    public static int getKullaniciCepEuro200Banknot(){
        return kullanicicepbanknot.getEuro200Sayisi();
    }
    
    //Kullanici El Banknot Sayisi TL
    public static int getKullaniciElTL5Banknot(){
        return kullanicielbanknot.getTL5Sayisi();
    }
    public static int getKullaniciElTL10Banknot(){
        return kullanicielbanknot.getTL10Sayisi();
    }
    public static int getKullaniciElTL20Banknot(){
        return kullanicielbanknot.getTL20Sayisi();
    }
    public static int getKullaniciElTL50Banknot(){
        return kullanicielbanknot.getTL50Sayisi();
    }
    public static int getKullaniciElTL100Banknot(){
        return kullanicielbanknot.getTL100Sayisi();
    }
    public static int getKullaniciElTL200Banknot(){
        return kullanicielbanknot.getTL200Sayisi();
    }
    
    //Kullanici El Banknot Sayisi Euro
    public static int getKullaniciElEuro5Banknot(){
        return kullanicielbanknot.getEuro5Sayisi();
    }
    public static int getKullaniciElEuro10Banknot(){
        return kullanicielbanknot.getEuro10Sayisi();
    }
    public static int getKullaniciElEuro20Banknot(){
        return kullanicielbanknot.getEuro20Sayisi();
    }
    public static int getKullaniciElEuro50Banknot(){
        return kullanicielbanknot.getEuro50Sayisi();
    }
    public static int getKullaniciElEuro100Banknot(){
        return kullanicielbanknot.getEuro100Sayisi();
    }
    public static int getKullaniciElEuro200Banknot(){
        return kullanicielbanknot.getEuro200Sayisi();
    }
}
