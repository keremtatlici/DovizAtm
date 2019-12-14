
package dovizatm.Model;

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
