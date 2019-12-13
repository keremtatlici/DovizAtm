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
public class Kur {
    private static Kur kur = new Kur();
    private int BirEuroKacTL = 2;
    
    private Kur(){
        
    }

    public static Kur getKur() {
        return kur;
    }

    public int getBirEuroKacTL() {
        return BirEuroKacTL;
    }
    
}
