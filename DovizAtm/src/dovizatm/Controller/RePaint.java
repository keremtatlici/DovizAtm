/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.Controller;

import dovizatm.View.altPanel;
import dovizatm.View.sagPanel;
import dovizatm.View.solPanel;

/**
 *
 * @author krmtt
 */
public class RePaint {
    private RePaint(){
        
    }
    public static void repaint(){
        solPanel.getSolpanel();
        sagPanel.getSagpanel();
        altPanel.getAltpanel();
    }
}
