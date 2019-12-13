package dovizatm.Controller;

import dovizatm.Model.AtmBakiye;
import dovizatm.Model.AtmBanknot;
import dovizatm.Model.Kart;
import dovizatm.Model.KullaniciCepBakiye;
import dovizatm.Model.KullaniciCepBanknot;
import dovizatm.Model.KullaniciElBakiye;
import dovizatm.Model.KullaniciElBanknot;
import dovizatm.Model.KullaniciHesapBakiye;
import dovizatm.Model.KullaniciHesapBanknot;
import dovizatm.Model.Kur;


public class ModeldanCek {// tüm methodlar static olacak!!!!!
    private static Kart kart = Kart.getKart();
    
    private static AtmBakiye atmbakiye = AtmBakiye.getAtmbakiye();
    private static KullaniciCepBakiye kullanicicepbakiye = KullaniciCepBakiye.getKullanicicepbakiye();
    private static KullaniciElBakiye kullanicielbakiye = KullaniciElBakiye.getKullanicielbakiye();
    private static KullaniciHesapBakiye kullanicihesapbakiye = KullaniciHesapBakiye.getKullanicihesapbakiye();
    
    private static AtmBanknot atmbanknot = AtmBanknot.getAtmbanknot();
    private static KullaniciCepBanknot kullanicicepbanknot = KullaniciCepBanknot.getKullanicicepbanknot();
    private static KullaniciElBanknot kullanicielbanknot = KullaniciElBanknot.getKullanicielbanknot();
    private static KullaniciHesapBanknot kullanicihesapbanknot = KullaniciHesapBanknot.getKullanicihesapbanknot();
    
    
    private static Kur kur = Kur.getKur();
    
    private ModeldanCek(){
        
    }
    
    public static int getBirEuroKacTL(){
        return kur.getBirEuroKacTL();
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
    //kullanıcı hesap bakiye
    public static int getKullaniciHesapTLBakiye(){
        return kullanicihesapbakiye.getTLSayisi();
    }
    public static int getKullaniciHesapEuroBakiye(){
        return kullanicihesapbakiye.getEuroSayisi();
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
    
    
    //Kullanici Hesap Banknot Sayisi TL
    public static int getKullaniciHesapTL5Banknot(){
        return kullanicihesapbanknot.getTL5Sayisi();
    }
    public static int getKullaniciHesapTL10Banknot(){
        return kullanicihesapbanknot.getTL10Sayisi();
    }
    public static int getKullaniciHesapTL20Banknot(){
        return kullanicihesapbanknot.getTL20Sayisi();
    }
    public static int getKullaniciHesapTL50Banknot(){
        return kullanicihesapbanknot.getTL50Sayisi();
    }
    public static int getKullaniciHesapTL100Banknot(){
        return kullanicihesapbanknot.getTL100Sayisi();
    }
    public static int getKullaniciHesapTL200Banknot(){
        return kullanicihesapbanknot.getTL200Sayisi();
    }
    
    //Kullanici Hesap Banknot Sayisi Euro
    public static int getKullaniciHesapEuro5Banknot(){
        return kullanicihesapbanknot.getEuro5Sayisi();
    }
    public static int getKullaniciHesapEuro10Banknot(){
        return kullanicihesapbanknot.getEuro10Sayisi();
    }
    public static int getKullaniciHesapEuro20Banknot(){
        return kullanicihesapbanknot.getEuro20Sayisi();
    }
    public static int getKullaniciHesapEuro50Banknot(){
        return kullanicihesapbanknot.getEuro50Sayisi();
    }
    public static int getKullaniciHesapEuro100Banknot(){
        return kullanicihesapbanknot.getEuro100Sayisi();
    }
    public static int getKullaniciHesapEuro200Banknot(){
        return kullanicihesapbanknot.getEuro200Sayisi();
    }
}
