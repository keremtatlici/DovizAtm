
package dovizatm.Model;

public class KullaniciHesapBakiye extends Bakiye{
    private static KullaniciHesapBakiye kullanicihesapbakiye = new KullaniciHesapBakiye();
    
    private KullaniciHesapBakiye(){
        
    }

    public static KullaniciHesapBakiye getKullanicihesapbakiye() {
        return kullanicihesapbakiye;
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
