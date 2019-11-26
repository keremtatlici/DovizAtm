/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.View;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author krmtt
 */
public class KenarEkran extends JPanel{
    
    private solPanel solPanel;
    private ustPanel ustPanel;
    private altPanel altPanel;
    private sagPanel sagPanel;
    
    
    public KenarEkran(Pencere pencere){
        solPanel = new solPanel(pencere);
        ustPanel = new ustPanel(pencere);
        altPanel = new altPanel(pencere);
        sagPanel = new sagPanel(pencere);
    }
}
