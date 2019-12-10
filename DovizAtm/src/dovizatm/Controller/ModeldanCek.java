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
    private static Bakiye kullanicicepbakiye = KullaniciCepBakiye.getKullanicicepbakiye();
    private static Bakiye kullanicielbakiye = KullaniciElBakiye.getKullanicielbakiye();
    
    private static BanknotSayisi atmbanknot = AtmBanknot.getAtmbanknot();
    private static BanknotSayisi kullanicicepbanknot = KullaniciCepBanknot.getKullanicicepbanknot();
    private static BanknotSayisi kullanicielbanknot = KullaniciElBanknot.getKullanicielbanknot();
    
    private ModeldanCek(){
        
    }
    public static String getKartSifresi(){
        return kart.getKartSifresi();
    }
    
    public static int getAtmTLSayisi(){
        return atmbakiye.getTLSayisi();
    }
    
    public static int getAtmEuroSayisi(){
        return atmbakiye.getEuroSayisi();
    }
    
    //Buradan devam et atm bakiyenin get işlemleri bitti sıra kullanici cep bakiyede.
}
