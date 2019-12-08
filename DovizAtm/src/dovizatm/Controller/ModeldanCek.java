/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.Controller;

import dovizatm.Model.Kart;


public class ModeldanCek {
    private static Kart kart = Kart.getKart();
    
    private ModeldanCek(){
        
    }
    public static String getKartSifresi(){
        return kart.getKartSifresi();
    }
}
