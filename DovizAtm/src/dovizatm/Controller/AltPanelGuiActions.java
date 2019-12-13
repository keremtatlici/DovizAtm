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
public class AltPanelGuiActions implements ActionListener{
    private static AltPanelGuiActions guiactions = new AltPanelGuiActions();
    private KenarEkran kenarekran = KenarEkran.getKenarekran();
    
    private ustPanel ustpanel =  ustPanel.getUstpanel();
    private solPanel solpanel =  solPanel.getSolpanel();
    private sagPanel sagpanel =  sagPanel.getSagpanel();
    private altPanel altpanel =  altPanel.getAltpanel();
    
    private AltPanelGuiActions(){
        altpanel.Btn_KartTak.addActionListener(this);
        altpanel.Btn_EuroCebeAt.addActionListener(this);       
        altpanel.Btn_ParaYatir.addActionListener(this);
        altpanel.Btn_TLCebeAt.addActionListener(this);
    }
    public static AltPanelGuiActions getNesne() {
        return guiactions;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == altpanel.Btn_KartTak){
            
            altpanel.Btn_KartTak.setEnabled(false);
            altpanel.Btn_KartTak.setText("Kart Takılı");
            ustpanel.sifregirmeekrani.Btn_GirisYap.setEnabled(true);
            System.out.println("sisteme kart takıldı ve giriş yap butonu aktif edildi");
            
        }else if(ae.getSource() == altpanel.Btn_EuroCebeAt && ModeldanCek.getKullaniciElEuroBakiye() != 0){
            
            AltPanelMethods.EldekiEuroyuCebeAt();
            
        }else if(ae.getSource() == altpanel.Btn_ParaYatir){
            if(SystemVariables.getIslem() == "ana-sifre-kartli-parayatirma"){
                AltPanelMethods.kartliparayatir();
            }
            
            
        }else if(ae.getSource() == altpanel.Btn_TLCebeAt && ModeldanCek.getKullaniciElTLBakiye() != 0){
            AltPanelMethods.EldekiTLyiCebeAt();
            
        }
    }
    
    
}
