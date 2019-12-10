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
public class AtmBakiye extends Bakiye{
    private static AtmBakiye atmbakiye = new AtmBakiye();
    
    
    private AtmBakiye(){
        
    }

    public static AtmBakiye getAtmbakiye() {
        return atmbakiye;
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
