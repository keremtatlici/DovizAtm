
package dovizatm.Model;

public class KullaniciElBakiye extends Bakiye{
    private static KullaniciElBakiye kullanicielbakiye = new KullaniciElBakiye();
    
    private KullaniciElBakiye(){
        
    }

    public static KullaniciElBakiye getKullanicielbakiye() {
        return kullanicielbakiye;
    }

    public int getTLSayisi() {
        return TLSayisi;
    }

    public void setTLSayisi(int TLSayisi) {
        this.TLSayisi = TLSayisi;
    }

    public int getEuroSayisi() {
        return EuroSayisi;
    }

    public void setEuroSayisi(int EuroSayisi) {
        this.EuroSayisi = EuroSayisi;
    }
    
    
}
