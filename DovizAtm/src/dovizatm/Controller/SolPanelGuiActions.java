
package dovizatm.Controller;

import dovizatm.View.KenarEkran;
import dovizatm.View.altPanel;
import dovizatm.View.sagPanel;
import dovizatm.View.solPanel;
import dovizatm.View.ustPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SolPanelGuiActions implements ActionListener{
    private static SolPanelGuiActions solpanelguiactions = new SolPanelGuiActions();
    private KenarEkran kenarekran = KenarEkran.getKenarekran();
    
    private ustPanel ustpanel =  ustPanel.getUstpanel();
    private solPanel solpanel =  solPanel.getSolpanel();
    private sagPanel sagpanel =  sagPanel.getSagpanel();
    private altPanel altpanel =  altPanel.getAltpanel();
    
    private SolPanelGuiActions(){
        solpanel.Btn_TL5.addActionListener(this);
        solpanel.Btn_TL10.addActionListener(this);
        solpanel.Btn_TL20.addActionListener(this);
        solpanel.Btn_TL50.addActionListener(this);
        solpanel.Btn_TL100.addActionListener(this);
        solpanel.Btn_TL200.addActionListener(this);
    }
    public static SolPanelGuiActions getNesne(){
        return solpanelguiactions;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == solpanel.Btn_TL5 && ModeldanCek.getKullaniciCepTL5Banknot() != 0){
           
                ModeliSetle.setKullaniciElTL5Banknot(ModeldanCek.getKullaniciElTL5Banknot() +1);
                ModeliSetle.setKullaniciCepTL5Banknot(ModeldanCek.getKullaniciCepTL5Banknot() -1); 
                RePaint.repaint();
                
        }else if(ae.getSource() == solpanel.Btn_TL10 && ModeldanCek.getKullaniciCepTL10Banknot() != 0){
            
            ModeliSetle.setKullaniciElTL10Banknot(ModeldanCek.getKullaniciElTL10Banknot() +1);
            ModeliSetle.setKullaniciCepTL10Banknot(ModeldanCek.getKullaniciCepTL10Banknot() -1);
                
            RePaint.repaint();
            
        }else if(ae.getSource() == solpanel.Btn_TL20 && ModeldanCek.getKullaniciCepTL20Banknot() != 0){
            ModeliSetle.setKullaniciElTL20Banknot(ModeldanCek.getKullaniciElTL20Banknot() +1);
            ModeliSetle.setKullaniciCepTL20Banknot(ModeldanCek.getKullaniciCepTL20Banknot() -1);
                
            RePaint.repaint();
            
        }else if(ae.getSource() == solpanel.Btn_TL50 && ModeldanCek.getKullaniciCepTL50Banknot() != 0){
            ModeliSetle.setKullaniciElTL50Banknot(ModeldanCek.getKullaniciElTL50Banknot() +1);
            ModeliSetle.setKullaniciCepTL50Banknot(ModeldanCek.getKullaniciCepTL50Banknot() -1);
                
            RePaint.repaint();
            
        }else if(ae.getSource() == solpanel.Btn_TL100 && ModeldanCek.getKullaniciCepTL100Banknot() != 0){
            ModeliSetle.setKullaniciElTL100Banknot(ModeldanCek.getKullaniciElTL100Banknot() +1);
            ModeliSetle.setKullaniciCepTL100Banknot(ModeldanCek.getKullaniciCepTL100Banknot() -1);
                
            RePaint.repaint();
            
        }else if(ae.getSource() == solpanel.Btn_TL200 && ModeldanCek.getKullaniciCepTL200Banknot() != 0){
            ModeliSetle.setKullaniciElTL200Banknot(ModeldanCek.getKullaniciElTL200Banknot() +1);
            ModeliSetle.setKullaniciCepTL200Banknot(ModeldanCek.getKullaniciCepTL200Banknot() -1);
                
            RePaint.repaint();
            
        }
    }
}
