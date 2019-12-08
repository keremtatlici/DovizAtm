package dovizatm.Controller;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ustPanelMethods {
    
    private ustPanelMethods(){}
    
    public static void tasarla(JPanel p){
        p.setLayout(null);
        p.setBounds(0, 0, 766, 500);
        p.setBackground(Color.LIGHT_GRAY);
    }
}
