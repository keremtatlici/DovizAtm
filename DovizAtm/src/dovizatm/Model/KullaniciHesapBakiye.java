/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.Model;

/**
 *
 * @author krmtt
 */
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
