/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.Controller;

import dovizatm.View.Pencere;

/**
 *
 * @author krmtt
 */
public class SystemMethods {
    private SystemMethods(){
        
    }
    public static void sistemiKur(){
        Pencere.getPencere();
        UstPanelGuiActions.GetNesne();
        KenarEkranGuiActions.getNesne();
    }
}
