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
            
            EldekiEuroyuCebeAt();
            
        }else if(ae.getSource() == altpanel.Btn_ParaYatir){
            
            
            
        }else if(ae.getSource() == altpanel.Btn_TLCebeAt && ModeldanCek.getKullaniciElTLBakiye() != 0){
            EldekiTLyiCebeAt();
            
            
        }
    }
    
    public void EldekiTLyiCebeAt(){
        
        ModeliSetle.setKullaniciCepTL5Banknot(ModeldanCek.getKullaniciCepTL5Banknot() + ModeldanCek.getKullaniciElTL5Banknot());
        ModeliSetle.setKullaniciCepTL10Banknot(ModeldanCek.getKullaniciCepTL10Banknot() + ModeldanCek.getKullaniciElTL10Banknot());
        ModeliSetle.setKullaniciCepTL20Banknot(ModeldanCek.getKullaniciCepTL20Banknot() + ModeldanCek.getKullaniciElTL20Banknot());
        ModeliSetle.setKullaniciCepTL50Banknot(ModeldanCek.getKullaniciCepTL50Banknot() + ModeldanCek.getKullaniciElTL50Banknot());
        ModeliSetle.setKullaniciCepTL100Banknot(ModeldanCek.getKullaniciCepTL100Banknot() + ModeldanCek.getKullaniciElTL100Banknot());
        ModeliSetle.setKullaniciCepTL200Banknot(ModeldanCek.getKullaniciCepTL200Banknot() + ModeldanCek.getKullaniciElTL200Banknot());
        
        RePaint.repaint();
        
        ModeliSetle.setKullaniciElTL5Banknot(0);
        ModeliSetle.setKullaniciElTL10Banknot(0);
        ModeliSetle.setKullaniciElTL20Banknot(0);
        ModeliSetle.setKullaniciElTL50Banknot(0);
        ModeliSetle.setKullaniciElTL100Banknot(0);
        ModeliSetle.setKullaniciElTL200Banknot(0);
        ModeliSetle.setKullaniciElTL200Banknot(0);// nedenini anlamadığım basit bir hatayı çözüyor.
        
        RePaint.repaint();
    }
    public void EldekiEuroyuCebeAt(){
        ModeliSetle.setKullaniciCepEuro5Banknot(ModeldanCek.getKullaniciCepEuro5Banknot() + ModeldanCek.getKullaniciElEuro5Banknot());
        ModeliSetle.setKullaniciCepEuro10Banknot(ModeldanCek.getKullaniciCepEuro10Banknot() + ModeldanCek.getKullaniciElEuro10Banknot());
        ModeliSetle.setKullaniciCepEuro20Banknot(ModeldanCek.getKullaniciCepEuro20Banknot() + ModeldanCek.getKullaniciElEuro20Banknot());
        ModeliSetle.setKullaniciCepEuro50Banknot(ModeldanCek.getKullaniciCepEuro50Banknot() + ModeldanCek.getKullaniciElEuro50Banknot());
        ModeliSetle.setKullaniciCepEuro100Banknot(ModeldanCek.getKullaniciCepEuro100Banknot() + ModeldanCek.getKullaniciElEuro100Banknot());
        ModeliSetle.setKullaniciCepEuro200Banknot(ModeldanCek.getKullaniciCepEuro200Banknot() + ModeldanCek.getKullaniciElEuro200Banknot());
        
        RePaint.repaint();
        
        ModeliSetle.setKullaniciElEuro5Banknot(0);
        ModeliSetle.setKullaniciElEuro10Banknot(0);
        ModeliSetle.setKullaniciElEuro20Banknot(0);
        ModeliSetle.setKullaniciElEuro50Banknot(0);
        ModeliSetle.setKullaniciElEuro100Banknot(0);
        ModeliSetle.setKullaniciElEuro200Banknot(0);
        ModeliSetle.setKullaniciElEuro200Banknot(0);// nedenini anlamadığım basit bir hatayı çözüyor.
        
        RePaint.repaint();
    }
    
}
