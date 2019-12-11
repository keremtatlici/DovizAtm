package dovizatm.View;

import dovizatm.Controller.ModeldanCek;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class sagPanel extends JPanel{
    
    public JButton Btn_Euro5 = new JButton();
    public JButton Btn_Euro10 = new JButton();
    public JButton Btn_Euro20 = new JButton();
    public JButton Btn_Euro50 = new JButton();
    public JButton Btn_Euro100 = new JButton();
    public JButton Btn_Euro200 = new JButton();
    
    public JLabel label_Euro5 = new JLabel();
    public JLabel label_Euro10 = new JLabel();
    public JLabel label_Euro20 = new JLabel();
    public JLabel label_Euro50 = new JLabel();
    public JLabel label_Euro100 = new JLabel();
    public JLabel label_Euro200 = new JLabel();
    
    public Border blackline = BorderFactory.createLineBorder(Color.black);
    public sagPanel sagPanel;
    
    private static sagPanel sagpanel = new sagPanel();
    
    private sagPanel(){

        this.setBounds(1066, 0, 300, 768);  // Sağ Panel 300x768
        this.setBorder(blackline);
        this.setLayout(null);     
       
       Btn_Euro5.setIcon(new ImageIcon("img\\Euro5.jpg"));
       Btn_Euro10.setIcon(new ImageIcon("img\\Euro10.jpg"));
       Btn_Euro20.setIcon(new ImageIcon("img\\Euro20.jpg"));
       Btn_Euro50.setIcon(new ImageIcon("img\\Euro50.jpg"));
       Btn_Euro100.setIcon(new ImageIcon("img\\Euro100.jpg"));
       Btn_Euro200.setIcon(new ImageIcon("img\\Euro200.jpg"));
       
       Btn_Euro5.setBounds(0,0,200,100);
       Btn_Euro10.setBounds(0,110,200,100);
       Btn_Euro20.setBounds(0,220,200,100);
       Btn_Euro50.setBounds(0,330,200,100);
       Btn_Euro100.setBounds(0,440,200,100);
       Btn_Euro200.setBounds(0,550,200,100);
       
       label_Euro5.setBounds(220,0,50,100);
       label_Euro10.setBounds(220,110,50,100);
       label_Euro20.setBounds(220,220,50,100);
       label_Euro50.setBounds(220,330,50,100);
       label_Euro100.setBounds(220,440,50,100);
       label_Euro200.setBounds(220,550,50,100);
       
       this.add(Btn_Euro5);
       this.add(Btn_Euro10);
       this.add(Btn_Euro20);
       this.add(Btn_Euro50);
       this.add(Btn_Euro100);
       this.add(Btn_Euro200);
       
       this.add(label_Euro5);
       this.add(label_Euro10);
       this.add(label_Euro20);
       this.add(label_Euro50);
       this.add(label_Euro100);
       this.add(label_Euro200);
       
    }

    public static sagPanel getSagpanel() {
        update();
        return sagpanel;
    }
    public static void update(){
        sagpanel.label_Euro5.setText(Integer.toString(ModeldanCek.getKullaniciCepEuro5Banknot()));
        sagpanel.label_Euro10.setText(Integer.toString(ModeldanCek.getKullaniciCepEuro10Banknot()));
        sagpanel.label_Euro20.setText(Integer.toString(ModeldanCek.getKullaniciCepEuro20Banknot()));
        sagpanel.label_Euro50.setText(Integer.toString(ModeldanCek.getKullaniciCepEuro50Banknot()));
        sagpanel.label_Euro100.setText(Integer.toString(ModeldanCek.getKullaniciCepEuro100Banknot()));
        sagpanel.label_Euro200.setText(Integer.toString(ModeldanCek.getKullaniciCepEuro200Banknot()));
    }
}
