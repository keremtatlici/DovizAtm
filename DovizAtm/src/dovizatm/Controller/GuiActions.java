/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.Controller;

import dovizatm.View.AnaEkran;
import dovizatm.View.DogalgazOdeEkrani;
import dovizatm.View.ElektrikOdeEkrani;
import dovizatm.View.FaturaOdeEkrani;
import dovizatm.View.HavaleYapEkrani;
import dovizatm.View.IslemBasariliEkrani;
import dovizatm.View.KartliIslemEkrani;
import dovizatm.View.KartsizIslemEkrani;
import dovizatm.View.ParaCekEkrani;
import dovizatm.View.ParaCevirEkrani;
import dovizatm.View.ParaCinsiSecmeEkrani;
import dovizatm.View.ParaMiktariGirmeEkrani;
import dovizatm.View.ParaYatirmaBeklemeEkrani;
import dovizatm.View.ParaYatirmaEkrani;
import dovizatm.View.SifreGirmeEkrani;
import dovizatm.View.SuOdeEkrani;
import dovizatm.View.TelefonOdeEkrani;
import dovizatm.View.ustPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GuiActions implements ActionListener{
    private static GuiActions guiactions = new GuiActions();
    
    private AnaEkran anaekran =  AnaEkran.getAnaekran();
    private DogalgazOdeEkrani dogalgazodeekrani = DogalgazOdeEkrani.getDogalgazodeekrani();
    private ElektrikOdeEkrani elektrikodeekrani = ElektrikOdeEkrani.getElektrikodeekrani();
    private FaturaOdeEkrani faturaodeekrani = FaturaOdeEkrani.getFaturaodeekrani();
    private HavaleYapEkrani havaleyapekrani =  HavaleYapEkrani.getHavaleyapekrani();
    private IslemBasariliEkrani islembasariliekrani = IslemBasariliEkrani.getIslembasariliekrani();
    private KartliIslemEkrani kartliislemekrani =  KartliIslemEkrani.getKartliislemekrani();
    private KartsizIslemEkrani kartsizislemekrani =  KartsizIslemEkrani.getKartsizislemekrani();
    private ParaCekEkrani paracekekrani =  ParaCekEkrani.getParacekekrani();
    private ParaCevirEkrani paracevirekrani =  ParaCevirEkrani.getParacevirekrani();
    private ParaCinsiSecmeEkrani paracinsisecmeekrani =  ParaCinsiSecmeEkrani.getParacinsisecmeekrani();
    private ParaMiktariGirmeEkrani paramiktarigirmeekrani =  ParaMiktariGirmeEkrani.getParamiktarigirmeekrani();
    private ParaYatirmaBeklemeEkrani parayatirmabeklemeekrani =  ParaYatirmaBeklemeEkrani.getParayatirmabeklemeekrani();
    private ParaYatirmaEkrani parayatirmaekrani =  ParaYatirmaEkrani.getParayatirmaekrani();
    private SifreGirmeEkrani sifregirmeekrani =  SifreGirmeEkrani.getSifregirmeekrani(); 
    private SuOdeEkrani suodeekrani =  SuOdeEkrani.getSuodeekrani();
    private TelefonOdeEkrani telefonodeekrani =  TelefonOdeEkrani.getTelefonodeekrani();
    
    private ustPanel ustpanel = ustPanel.getUstpanel();
    
    private GuiActions(){
        anaekran.Btn_KartsizIslem.addActionListener(this);
        anaekran.Btn_KartliIslem.addActionListener(this);
        
        dogalgazodeekrani.Btn_AnaEkranaDon.addActionListener(this);
        dogalgazodeekrani.Btn_GeriDon.addActionListener(this);
        dogalgazodeekrani.Btn_Ode.addActionListener(this);
        
        elektrikodeekrani.Btn_AnaEkranaDon.addActionListener(this);
        elektrikodeekrani.Btn_GeriDon.addActionListener(this);
        elektrikodeekrani.Btn_Ode.addActionListener(this);
        
        faturaodeekrani.Btn_AnaEkranaDon.addActionListener(this);
        faturaodeekrani.Btn_DogalgazOde.addActionListener(this);
        faturaodeekrani.Btn_ElektrikOde.addActionListener(this);
        faturaodeekrani.Btn_SuOde.addActionListener(this);
        faturaodeekrani.Btn_TelefonOde.addActionListener(this);
        
        havaleyapekrani.Btn_AnaEkranaDon.addActionListener(this);
        havaleyapekrani.Btn_ParaGonder.addActionListener(this);
        
        islembasariliekrani.Btn_anasayfayadon.addActionListener(this);
        
        kartliislemekrani.Btn_FaturaOde.addActionListener(this);
        kartliislemekrani.Btn_HavaleYap.addActionListener(this);
        kartliislemekrani.Btn_KartIade.addActionListener(this);
        kartliislemekrani.Btn_ParaCek.addActionListener(this);
        kartliislemekrani.Btn_ParaCevir.addActionListener(this);
        kartliislemekrani.Btn_ParaYatir.addActionListener(this);
        
        kartsizislemekrani.Btn_FaturaOde.addActionListener(this);
        kartsizislemekrani.Btn_HavaleYap.addActionListener(this);
        kartsizislemekrani.Btn_Iptal.addActionListener(this);
        
        paracekekrani.Btn_AnaEkranaDon.addActionListener(this);
        paracekekrani.Btn_EuroCek.addActionListener(this);
        paracekekrani.Btn_TLCek.addActionListener(this);
        
        paracevirekrani.Btn_AnaEkranaDon.addActionListener(this);
        paracevirekrani.Btn_Euro_TLCevir.addActionListener(this);
        paracevirekrani.Btn_TL_EuroCevir.addActionListener(this);
        
        paracinsisecmeekrani.Btn_AnaEkranaDon.addActionListener(this);
        paracinsisecmeekrani.Btn_Euro.addActionListener(this);
        paracinsisecmeekrani.Btn_TL.addActionListener(this);
        
        paramiktarigirmeekrani.Btn_AnaEkranaDon.addActionListener(this);
        paramiktarigirmeekrani.Btn_GeriDon.addActionListener(this);
        paramiktarigirmeekrani.Btn_Onayla.addActionListener(this);
        
        parayatirmabeklemeekrani.Btn_AnaEkranaDon.addActionListener(this);
        
        parayatirmaekrani.Btn_AnaEkranaDon.addActionListener(this);
        parayatirmaekrani.Btn_Yatir.addActionListener(this);
        
        sifregirmeekrani.Btn_GirisYap.addActionListener(this);
        sifregirmeekrani.Btn_Iptal.addActionListener(this);
        
        suodeekrani.Btn_AnaEkranaDon.addActionListener(this);
        suodeekrani.Btn_GeriDon.addActionListener(this);
        suodeekrani.Btn_Ode.addActionListener(this);
        
        telefonodeekrani.Btn_AnaEkranaDon.addActionListener(this);
        telefonodeekrani.Btn_GeriDon.addActionListener(this);
        telefonodeekrani.Btn_Ode.addActionListener(this);
    }
    
    
    public static GuiActions GetNesne(){
        return guiactions;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == anaekran.Btn_KartsizIslem){
            System.out.println("kartiz işlem ekranı");
            ustpanel.c1.show(ustpanel , "1");
            ustpanel.islem = "kartsız";
            
        }else if(ae.getSource() == anaekran.Btn_KartliIslem){
            System.out.println("Karlı İşlem Ekranı");
             ustpanel.c1.show(ustpanel, "2");
             ustpanel.islem = "kartlı";
        }else if(ae.getSource() == dogalgazodeekrani.Btn_AnaEkranaDon){
            
        }else if(ae.getSource() == dogalgazodeekrani.Btn_GeriDon){
            
        }else if(ae.getSource() == dogalgazodeekrani.Btn_Ode){
            
        }else if(ae.getSource() == elektrikodeekrani.Btn_AnaEkranaDon){
            
        }else if(ae.getSource() == elektrikodeekrani.Btn_GeriDon){
            
        }else if(ae.getSource() == elektrikodeekrani.Btn_Ode){
            
        }else if(ae.getSource() == faturaodeekrani.Btn_AnaEkranaDon){
            
        }else if(ae.getSource() == faturaodeekrani.Btn_DogalgazOde){
            
        }else if(ae.getSource() == faturaodeekrani.Btn_ElektrikOde){
            
        }else if(ae.getSource() == faturaodeekrani.Btn_SuOde){
            
        }else if(ae.getSource() == faturaodeekrani.Btn_TelefonOde){
            
        }else if(ae.getSource() == havaleyapekrani.Btn_AnaEkranaDon){
            
        }else if(ae.getSource() == havaleyapekrani.Btn_ParaGonder){
            
        }else if(ae.getSource() == islembasariliekrani.Btn_anasayfayadon){
            
        }else if(ae.getSource() == kartliislemekrani.Btn_FaturaOde){
            
        }else if(ae.getSource() == kartliislemekrani.Btn_HavaleYap){
            
        }else if(ae.getSource() == kartliislemekrani.Btn_KartIade){
            
        }else if(ae.getSource() == kartliislemekrani.Btn_ParaCek){
            
        }else if(ae.getSource() == kartliislemekrani.Btn_ParaCevir){
            
        }else if(ae.getSource() == kartliislemekrani.Btn_ParaYatir){
            
        }else if(ae.getSource() == kartsizislemekrani.Btn_FaturaOde){
            ustpanel.c1.show(ustpanel, "3");
            System.out.println("Fatura Öde Ekranı");
        }else if(ae.getSource() == kartsizislemekrani.Btn_HavaleYap){
            
        }else if(ae.getSource() == kartsizislemekrani.Btn_Iptal){
            
        }else if(ae.getSource() == paracekekrani.Btn_AnaEkranaDon){
            
        }else if(ae.getSource() == paracekekrani.Btn_EuroCek){
            
        }else if(ae.getSource() == paracekekrani.Btn_TLCek){
            
        }else if(ae.getSource() == paracevirekrani.Btn_AnaEkranaDon){
            
        }else if(ae.getSource() == paracevirekrani.Btn_Euro_TLCevir){
            
        }else if(ae.getSource() == paracevirekrani.Btn_TL_EuroCevir){
            
        }else if(ae.getSource() == paracinsisecmeekrani.Btn_AnaEkranaDon){
            
        }else if(ae.getSource() == paracinsisecmeekrani.Btn_Euro){
            
        }else if(ae.getSource() == paracinsisecmeekrani.Btn_TL){
            
        }else if(ae.getSource() == paramiktarigirmeekrani.Btn_AnaEkranaDon){
            
        }else if(ae.getSource() == paramiktarigirmeekrani.Btn_GeriDon){
            
        }else if(ae.getSource() == paramiktarigirmeekrani.Btn_Onayla){
            
        }else if(ae.getSource() == parayatirmabeklemeekrani.Btn_AnaEkranaDon){
            
        }else if(ae.getSource() == parayatirmaekrani.Btn_AnaEkranaDon){
            
        }else if(ae.getSource() == parayatirmaekrani.Btn_Yatir){
            
        }else if(ae.getSource() == sifregirmeekrani.Btn_GirisYap){
            
        }else if(ae.getSource() == sifregirmeekrani.Btn_Iptal){
            ustpanel.c1.show(ustpanel, "0");
            System.out.println("Ana Ekran");
        }else if(ae.getSource() == suodeekrani.Btn_AnaEkranaDon){
            
        }else if(ae.getSource() == suodeekrani.Btn_GeriDon){
            
        }else if(ae.getSource() == suodeekrani.Btn_Ode){
            
        }else if(ae.getSource() == telefonodeekrani.Btn_AnaEkranaDon){
            
        }else if(ae.getSource() == telefonodeekrani.Btn_GeriDon){
            
        }else if(ae.getSource() == telefonodeekrani.Btn_Ode){
            
        }
        
        
    }
    
}
