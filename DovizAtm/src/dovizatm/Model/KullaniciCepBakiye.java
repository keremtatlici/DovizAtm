
package dovizatm.Model;


public class KullaniciCepBakiye extends Bakiye{
    private static KullaniciCepBakiye kullanicicepbakiye = new KullaniciCepBakiye();
    
    private KullaniciCepBakiye(){
        
    }

    public static KullaniciCepBakiye getKullanicicepbakiye() {
        return kullanicicepbakiye;
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
