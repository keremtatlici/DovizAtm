
package dovizatm.Controller;

import dovizatm.View.altPanel;
import dovizatm.View.sagPanel;
import dovizatm.View.solPanel;

public class RePaint {
    private RePaint(){
        
    }
    public static void repaint(){
        solPanel.getSolpanel();
        sagPanel.getSagpanel();
        altPanel.getAltpanel();
    }
}
