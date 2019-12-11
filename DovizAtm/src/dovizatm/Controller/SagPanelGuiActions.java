/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.Controller;

import dovizatm.View.KenarEkran;
import dovizatm.View.altPanel;
import dovizatm.View.sagPanel;
import dovizatm.View.solPanel;
import dovizatm.View.ustPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author krmtt
 */
public class SagPanelGuiActions implements ActionListener{
    private static SagPanelGuiActions sagpanelguiactions = new SagPanelGuiActions();
    private KenarEkran kenarekran = KenarEkran.getKenarekran();
    
    private ustPanel ustpanel =  ustPanel.getUstpanel();
    private solPanel solpanel =  solPanel.getSolpanel();
    private sagPanel sagpanel =  sagPanel.getSagpanel();
    private altPanel altpanel =  altPanel.getAltpanel();
    
    private SagPanelGuiActions(){
        sagpanel.Btn_Euro5.addActionListener(this);
        sagpanel.Btn_Euro10.addActionListener(this);
        sagpanel.Btn_Euro20.addActionListener(this);
        sagpanel.Btn_Euro50.addActionListener(this);
        sagpanel.Btn_Euro100.addActionListener(this);
        sagpanel.Btn_Euro200.addActionListener(this);
    }

    public static SagPanelGuiActions getNesne() {
        return sagpanelguiactions;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == sagpanel.Btn_Euro5 && ModeldanCek.getKullaniciCepEuro5Banknot() != 0){
           
                ModeliSetle.setKullaniciElEuro5Banknot(ModeldanCek.getKullaniciElEuro5Banknot() +1);
                ModeliSetle.setKullaniciCepEuro5Banknot(ModeldanCek.getKullaniciCepEuro5Banknot() -1); 
                RePaint.repaint();
                
        }else if(ae.getSource() == sagpanel.Btn_Euro10 && ModeldanCek.getKullaniciCepEuro10Banknot() != 0){
            
            ModeliSetle.setKullaniciElEuro10Banknot(ModeldanCek.getKullaniciElEuro10Banknot() +1);
            ModeliSetle.setKullaniciCepEuro10Banknot(ModeldanCek.getKullaniciCepEuro10Banknot() -1);
                
            RePaint.repaint();
            
        }else if(ae.getSource() == sagpanel.Btn_Euro20 && ModeldanCek.getKullaniciCepEuro20Banknot() != 0){
            ModeliSetle.setKullaniciElEuro20Banknot(ModeldanCek.getKullaniciElEuro20Banknot() +1);
            ModeliSetle.setKullaniciCepEuro20Banknot(ModeldanCek.getKullaniciCepEuro20Banknot() -1);
                
            RePaint.repaint();
            
        }else if(ae.getSource() == sagpanel.Btn_Euro50 && ModeldanCek.getKullaniciCepEuro50Banknot() != 0){
            ModeliSetle.setKullaniciElEuro50Banknot(ModeldanCek.getKullaniciElEuro50Banknot() +1);
            ModeliSetle.setKullaniciCepEuro50Banknot(ModeldanCek.getKullaniciCepEuro50Banknot() -1);
                
            RePaint.repaint();
            
        }else if(ae.getSource() == sagpanel.Btn_Euro100 && ModeldanCek.getKullaniciCepEuro100Banknot() != 0){
            ModeliSetle.setKullaniciElEuro100Banknot(ModeldanCek.getKullaniciElEuro100Banknot() +1);
            ModeliSetle.setKullaniciCepEuro100Banknot(ModeldanCek.getKullaniciCepEuro100Banknot() -1);
                
            RePaint.repaint();
            
        }else if(ae.getSource() == sagpanel.Btn_Euro200 && ModeldanCek.getKullaniciCepEuro200Banknot() != 0){
            ModeliSetle.setKullaniciElEuro200Banknot(ModeldanCek.getKullaniciElEuro200Banknot() +1);
            ModeliSetle.setKullaniciCepEuro200Banknot(ModeldanCek.getKullaniciCepEuro200Banknot() -1);
                
            RePaint.repaint();
            
        }
    }
    
}
