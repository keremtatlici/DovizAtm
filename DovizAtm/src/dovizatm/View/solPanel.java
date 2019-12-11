/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.View;

import dovizatm.Controller.ModeldanCek;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author krmtt
 */
public class solPanel extends JPanel{
    public JButton Btn_TL5 = new JButton();
    public JButton Btn_TL10 = new JButton();
    public JButton Btn_TL20 = new JButton();
    public JButton Btn_TL50 = new JButton();
    public JButton Btn_TL100 = new JButton();
    public JButton Btn_TL200 = new JButton();
    
    public JLabel label_TL5 = new JLabel();
    public JLabel label_TL10 = new JLabel();
    public JLabel label_TL20 = new JLabel();
    public JLabel label_TL50 = new JLabel();
    public JLabel label_TL100 = new JLabel();
    public JLabel label_TL200 = new JLabel();
    
    public solPanel solPanel;
    public Border blackline = BorderFactory.createLineBorder(Color.black);//Border tipi ayarlar
    
    private static solPanel solpanel = new solPanel();
    
    private solPanel(){
       this.setLayout(null);
       this.setBounds(0, 0, 300, 768); // Sol Panel  300x768
       this.setBorder(blackline);//Border ekler    
       
       Btn_TL5.setIcon(new ImageIcon("img\\TL5.jpg"));
       Btn_TL10.setIcon(new ImageIcon("img\\TL10.jpg"));
       Btn_TL20.setIcon(new ImageIcon("img\\TL20.jpg"));
       Btn_TL50.setIcon(new ImageIcon("img\\TL50.jpg"));
       Btn_TL100.setIcon(new ImageIcon("img\\TL100.jpg"));
       Btn_TL200.setIcon(new ImageIcon("img\\TL200.jpg"));
       
       Btn_TL5.setBounds(80,0,200,100);
       Btn_TL10.setBounds(80,110,200,100);
       Btn_TL20.setBounds(80,220,200,100);
       Btn_TL50.setBounds(80,330,200,100);
       Btn_TL100.setBounds(80,440,200,100);
       Btn_TL200.setBounds(80,550,200,100);
       
       label_TL5.setBounds(45,0,50,100);
       label_TL10.setBounds(45,110,50,100);
       label_TL20.setBounds(45,220,50,100);
       label_TL50.setBounds(45,330,50,100);
       label_TL100.setBounds(45,440,50,100);
       label_TL200.setBounds(45,550,50,100);
       
       this.add(Btn_TL5);
       this.add(Btn_TL10);
       this.add(Btn_TL20);
       this.add(Btn_TL50);
       this.add(Btn_TL100);
       this.add(Btn_TL200);
       
       this.add(label_TL5);
       this.add(label_TL10);
       this.add(label_TL20);
       this.add(label_TL50);
       this.add(label_TL100);
       this.add(label_TL200);
       
    }
    public static solPanel getSolpanel() {
        
        update();
        return solpanel;
    }
    public static void update(){
        solpanel.label_TL5.setText(Integer.toString(ModeldanCek.getKullaniciCepTL5Banknot()));
        solpanel.label_TL10.setText(Integer.toString(ModeldanCek.getKullaniciCepTL10Banknot()));
        solpanel.label_TL20.setText(Integer.toString(ModeldanCek.getKullaniciCepTL20Banknot()));
        solpanel.label_TL50.setText(Integer.toString(ModeldanCek.getKullaniciCepTL50Banknot()));
        solpanel.label_TL100.setText(Integer.toString(ModeldanCek.getKullaniciCepTL100Banknot()));
        solpanel.label_TL200.setText(Integer.toString(ModeldanCek.getKullaniciCepTL200Banknot()));
    }
}
