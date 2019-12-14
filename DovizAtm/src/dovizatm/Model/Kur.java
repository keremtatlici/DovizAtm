
package dovizatm.Model;


public class Kur {
    private static Kur kur = new Kur();
    private int BirEuroKacTL = 5;
    
    private Kur(){
        
    }

    public static Kur getKur() {
        return kur;
    }

    public int getBirEuroKacTL() {
        return BirEuroKacTL;
    }
    
}
