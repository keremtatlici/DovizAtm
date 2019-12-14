
package dovizatm.View;

import dovizatm.Controller.ModeldanCek;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class altPanel extends JPanel{
    
    public JButton Btn_TLCebeAt = new JButton("Eldeki TL'yi Cebe At");;
    public JButton Btn_EuroCebeAt = new JButton("Eldeki Euro'yu Cebe At");;
    public JButton Btn_ParaYatir = new JButton("Elindeki Paraları Yatır");;
    public JButton Btn_KartTak = new JButton("Atm'ye Kartı Tak");;
    public JLabel label_EldekiTL = new JLabel();
    public JLabel label_EldekiEuro = new JLabel();
    public Border blackline = BorderFactory.createLineBorder(Color.black);
    
    public JLabel labelkur = new JLabel();
    public JLabel labelbakiyeTL = new JLabel();
    public JLabel labelbakiyeEuro = new JLabel();
    
    private static altPanel altpanel = new altPanel();
  
    private altPanel(){
        this.setBounds(300, 500, 766, 268); // Alt Panel 766x268
        this.setBorder(blackline);
        this.setLayout(null);
        
        Btn_TLCebeAt.setBounds(0,0,170,40);
        Btn_ParaYatir.setBounds(210,40,170,30);
        Btn_KartTak.setBounds(395,40,170,30);
        Btn_EuroCebeAt.setBounds(596,0,170,40);
        
        
        label_EldekiTL.setBorder(blackline);
        label_EldekiEuro.setBorder(blackline);
        labelkur.setBorder(blackline);
        
        labelbakiyeTL.setBorder(blackline);
        labelbakiyeEuro.setBorder(blackline);
        
        label_EldekiTL.setBounds(0,40,170,100);
        label_EldekiEuro.setBounds(596,40,170,100);
        
        labelkur.setBounds(250,80,300,40);
        labelbakiyeTL.setBounds(250,120,300,40);
        labelbakiyeEuro.setBounds(250,160,300,40);
        
        
        this.add(Btn_TLCebeAt);
        this.add(Btn_EuroCebeAt);
        this.add(Btn_ParaYatir);
        this.add(Btn_KartTak);
        
        this.add(label_EldekiTL);
        this.add(label_EldekiEuro);
        this.add(labelkur);
        this.add(labelbakiyeTL);
        this.add(labelbakiyeEuro);
        labelbakiyeTL.setVisible(false);
        labelbakiyeEuro.setVisible(false);
        Btn_ParaYatir.setEnabled(false);
        
    }

    public static altPanel getAltpanel() {
        update();
        return altpanel;
    }
    public static void update(){
        altpanel.label_EldekiTL.setText("Elindeki TL : "+Integer.toString(ModeldanCek.getKullaniciElTLBakiye()) + " TL");
        altpanel.label_EldekiEuro.setText("Elindeki Euro : "+Integer.toString(ModeldanCek.getKullaniciElEuroBakiye())+ " Euro");
        
        altpanel.labelkur.setText("1 Euro "+ModeldanCek.getBirEuroKacTL() + " TL ediyor.");
        altpanel.labelbakiyeTL.setText("Banka Hesabınızda "+ ModeldanCek.getKullaniciHesapTLBakiye()+ " TL var");
        altpanel.labelbakiyeEuro.setText("Banka Hesabınızda "+ ModeldanCek.getKullaniciHesapEuroBakiye()+ " Euro var");
        
    }
}
