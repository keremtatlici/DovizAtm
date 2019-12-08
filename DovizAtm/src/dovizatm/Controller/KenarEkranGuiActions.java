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
public class KenarEkranGuiActions implements ActionListener{
    private static KenarEkranGuiActions guiactions = new KenarEkranGuiActions();
    private KenarEkran kenarekran = KenarEkran.getKenarekran();
    
        private ustPanel ustpanel =  ustPanel.getUstpanel();
        private solPanel solpanel =  solPanel.getSolpanel();
        private sagPanel sagpanel =  sagPanel.getSagpanel();
        private altPanel altpanel =  altPanel.getAltpanel();
    
    private KenarEkranGuiActions(){
        altpanel.Btn_EuroCebeAt.addActionListener(this);
        altpanel.Btn_KartTak.addActionListener(this);
        altpanel.Btn_ParaYatir.addActionListener(this);
        altpanel.Btn_TLCebeAt.addActionListener(this);
        
        solpanel.Btn_TL5.addActionListener(this);
        solpanel.Btn_TL10.addActionListener(this);
        solpanel.Btn_TL20.addActionListener(this);
        solpanel.Btn_TL50.addActionListener(this);
        solpanel.Btn_TL100.addActionListener(this);
        solpanel.Btn_TL200.addActionListener(this);
        
        sagpanel.Btn_Euro5.addActionListener(this);
        sagpanel.Btn_Euro10.addActionListener(this);
        sagpanel.Btn_Euro20.addActionListener(this);
        sagpanel.Btn_Euro50.addActionListener(this);
        sagpanel.Btn_Euro100.addActionListener(this);
        sagpanel.Btn_Euro200.addActionListener(this);
    }
    public static KenarEkranGuiActions getNesne() {
        return guiactions;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == altpanel.Btn_KartTak){
            altpanel.Btn_KartTak.setEnabled(false);
            altpanel.Btn_KartTak.setText("Kart Takılı");
            ustpanel.sifregirmeekrani.Btn_GirisYap.setEnabled(true);
            System.out.println("sisteme kart takıldı ve giriş yap butonu aktif edildi");
        }
    }
    
}
