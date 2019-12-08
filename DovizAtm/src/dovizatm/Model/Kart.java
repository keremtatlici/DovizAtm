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
public class Kart {
    private static Kart kart = new Kart();
    private static String kartSifresi = "0000";
    
    private Kart(){
        
    }

    public static Kart getKart() {
        return kart;
    }

    public static String getKartSifresi() {
        return kartSifresi;
    }
    
}
