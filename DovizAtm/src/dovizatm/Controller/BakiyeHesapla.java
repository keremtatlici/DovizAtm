
package dovizatm.Controller;

public class BakiyeHesapla {
    private static int a;
    private BakiyeHesapla(){
        
    }
    public static void TumBakiyeHesapla(){
        AtmTLBakiyeHesapla();
        AtmEuroBakiyeHesapla();
        
        KullaniciCepTLBakiyeHesapla();
        KullaniciCepEuroBakiyeHesapla();
        
        KullaniciElTLBakiyeHesapla();
        KullaniciElEuroBakiyeHesapla();
        
        KullaniciHesapTLBakiyeHesapla();
        KullaniciHesapEuroBakiyeHesapla();
    }
    public static void AtmTLBakiyeHesapla(){
        a = 0;
        a = a + ModeldanCek.getAtmTL5Banknot() * 5;
        a = a+ ModeldanCek.getAtmTL10Banknot()*10;
        a = a+ ModeldanCek.getAtmTL20Banknot()*20;
        a = a+ ModeldanCek.getAtmTL50Banknot()*50;
        a = a+ ModeldanCek.getAtmTL100Banknot()*100;
        a = a+ ModeldanCek.getAtmTL200Banknot()*200;
        
        ModeliSetle.setAtmTLBakiye(a);
    }
    public static void AtmEuroBakiyeHesapla(){
        a = 0;
        a = a + ModeldanCek.getAtmEuro5Banknot() * 5;
        a = a+ ModeldanCek.getAtmEuro10Banknot()*10;
        a = a+ ModeldanCek.getAtmEuro20Banknot()*20;
        a = a+ ModeldanCek.getAtmEuro50Banknot()*50;
        a = a+ ModeldanCek.getAtmEuro100Banknot()*100;
        a = a+ ModeldanCek.getAtmEuro200Banknot()*200;
        
        ModeliSetle.setAtmEuroBakiye(a);
    }
    
    public static void KullaniciCepTLBakiyeHesapla(){
        a = 0;
        a = a + ModeldanCek.getKullaniciCepTL5Banknot() * 5;
        a = a+ ModeldanCek.getKullaniciCepTL10Banknot()*10;
        a = a+ ModeldanCek.getKullaniciCepTL20Banknot()*20;
        a = a+ ModeldanCek.getKullaniciCepTL50Banknot()*50;
        a = a+ ModeldanCek.getKullaniciCepTL100Banknot()*100;
        a = a+ ModeldanCek.getKullaniciCepTL200Banknot()*200;
        
        ModeliSetle.setKullaniciCepTLBakiye(a);
    }
    public static void KullaniciCepEuroBakiyeHesapla(){
        a = 0;
        a = a + ModeldanCek.getKullaniciCepEuro5Banknot() * 5;
        a = a+ ModeldanCek.getKullaniciCepEuro10Banknot()*10;
        a = a+ ModeldanCek.getKullaniciCepEuro20Banknot()*20;
        a = a+ ModeldanCek.getKullaniciCepEuro50Banknot()*50;
        a = a+ ModeldanCek.getKullaniciCepEuro100Banknot()*100;
        a = a+ ModeldanCek.getKullaniciCepEuro200Banknot()*200;
        
        ModeliSetle.setKullaniciCepEuroBakiye(a);
    }
    
    public static void KullaniciElTLBakiyeHesapla(){
        a = 0;
        a = a + ModeldanCek.getKullaniciElTL5Banknot() * 5;
        a = a+ ModeldanCek.getKullaniciElTL10Banknot()*10;
        a = a+ ModeldanCek.getKullaniciElTL20Banknot()*20;
        a = a+ ModeldanCek.getKullaniciElTL50Banknot()*50;
        a = a+ ModeldanCek.getKullaniciElTL100Banknot()*100;
        a = a+ ModeldanCek.getKullaniciElTL200Banknot()*200;
        
        ModeliSetle.setKullaniciElTLBakiye(a);
    }
    public static void KullaniciElEuroBakiyeHesapla(){
        a = 0;
        a = a+ ModeldanCek.getKullaniciElEuro5Banknot() * 5;
        a = a+ ModeldanCek.getKullaniciElEuro10Banknot()*10;
        a = a+ ModeldanCek.getKullaniciElEuro20Banknot()*20;
        a = a+ ModeldanCek.getKullaniciElEuro50Banknot()*50;
        a = a+ ModeldanCek.getKullaniciElEuro100Banknot()*100;
        a = a+ ModeldanCek.getKullaniciElEuro200Banknot()*200;
        
        ModeliSetle.setKullaniciElEuroBakiye(a);
    }  
    
     public static void KullaniciHesapTLBakiyeHesapla(){
        a = 0;
        a = a + ModeldanCek.getKullaniciHesapTL5Banknot() * 5;
        a = a+ ModeldanCek.getKullaniciHesapTL10Banknot()*10;
        a = a+ ModeldanCek.getKullaniciHesapTL20Banknot()*20;
        a = a+ ModeldanCek.getKullaniciHesapTL50Banknot()*50;
        a = a+ ModeldanCek.getKullaniciHesapTL100Banknot()*100;
        a = a+ ModeldanCek.getKullaniciHesapTL200Banknot()*200;
        
        ModeliSetle.setKullaniciHesapTLBakiye(a);
    }
    public static void KullaniciHesapEuroBakiyeHesapla(){
        a = 0;
        a = a+ ModeldanCek.getKullaniciHesapEuro5Banknot() * 5;
        a = a+ ModeldanCek.getKullaniciHesapEuro10Banknot()*10;
        a = a+ ModeldanCek.getKullaniciHesapEuro20Banknot()*20;
        a = a+ ModeldanCek.getKullaniciHesapEuro50Banknot()*50;
        a = a+ ModeldanCek.getKullaniciHesapEuro100Banknot()*100;
        a = a+ ModeldanCek.getKullaniciHesapEuro200Banknot()*200;
        
        ModeliSetle.setKullaniciHesapEuroBakiye(a);
    }
    
}
