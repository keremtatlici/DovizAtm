/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author burak
 */
public abstract class FaturaveHavale extends JPanel{
    public JButton Btn_Ode = new JButton("Öde");
    public JButton Btn_AnaEkranaDon = new JButton("Ana Ekrana Dön");
    public JButton Btn_GeriDon = new JButton("Geri Dön");
    public JTextField Txtfield_No = new JTextField("");
    public JLabel no;
    
    
}
