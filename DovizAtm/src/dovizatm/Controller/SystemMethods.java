/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.Controller;

import dovizatm.View.KenarEkran;
import dovizatm.View.Pencere;
import dovizatm.View.solPanel;

/**
 *
 * @author krmtt
 */
public class SystemMethods {
    private SystemMethods(){
        
    }
    public static void sistemiKur(){
        BaslangicSetIslemleri.BaslangicSet();//Başlangıç DB
        
        Pencere.getPencere();//Framne
        
        //Call Gui Actions
        UstPanelGuiActions.GetNesne();
        AltPanelGuiActions.getNesne();
        SolPanelGuiActions.getNesne();
        SagPanelGuiActions.getNesne();
        
        
        
    }
}
