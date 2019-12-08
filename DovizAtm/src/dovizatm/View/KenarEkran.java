package dovizatm.View;

import javax.swing.JPanel;

public class KenarEkran extends JPanel{
    
    private static KenarEkran kenarekran = new KenarEkran();
    
    private KenarEkran(){
        this.setLayout(null);
        
        this.add(ustPanel.getUstpanel());
        this.add(solPanel.getSolpanel());
        this.add(sagPanel.getSagpanel());
        this.add(altPanel.getAltpanel());
       
    }

    public static KenarEkran getKenarekran() {
        return kenarekran;
    }
}
