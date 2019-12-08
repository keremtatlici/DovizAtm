package dovizatm.View;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class sagPanel extends JPanel{
    
     public JButton Btn_Euro5, Btn_Euro10, Btn_Euro20, Btn_Euro50, Btn_Euro100, Btn_Euro200;
     
     public int Sayisi_Euro5,Sayisi_Euro10,Sayisi_Euro20,Sayisi_Euro50,Sayisi_Euro100,Sayisi_Euro200 = 0;
     
     public JLabel label_Euro5, label_Euro10, label_Euro20, label_Euro50, label_Euro100, label_Euro200;
      
    public Border blackline = BorderFactory.createLineBorder(Color.black);
    public sagPanel sagPanel;
    
    private static sagPanel sagpanel = new sagPanel();
    
    private sagPanel(){

        this.setBounds(1066, 0, 300, 768);  // Sağ Panel 300x768
        this.setBorder(blackline);
        this.setLayout(null);
      
        
       Btn_Euro5 = new JButton();
       Btn_Euro10 = new JButton();
       Btn_Euro20 = new JButton();
       Btn_Euro50 = new JButton();
       Btn_Euro100 = new JButton();
       Btn_Euro200 = new JButton();
       
       label_Euro5 = new JLabel(Integer.toString(Sayisi_Euro5));
       label_Euro10 = new JLabel(Integer.toString(Sayisi_Euro10));
       label_Euro20 = new JLabel(Integer.toString(Sayisi_Euro20));
       label_Euro50 = new JLabel(Integer.toString(Sayisi_Euro50));
       label_Euro100 = new JLabel(Integer.toString(Sayisi_Euro100));
       label_Euro200 = new JLabel(Integer.toString(Sayisi_Euro200));
       
       
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
        return sagpanel;
    }

}
