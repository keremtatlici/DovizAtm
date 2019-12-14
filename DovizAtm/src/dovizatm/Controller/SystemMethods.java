
package dovizatm.Controller;


import dovizatm.View.Pencere;


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
