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
import dovizatm.View.altPanel;
import dovizatm.View.sagPanel;
import dovizatm.View.solPanel;
import dovizatm.View.ustPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UstPanelGuiActions implements ActionListener{
    private static UstPanelGuiActions guiactions = new UstPanelGuiActions();
    
    private ustPanel ustpanel =  ustPanel.getUstpanel();
    private solPanel solpanel =  solPanel.getSolpanel();
    private sagPanel sagpanel =  sagPanel.getSagpanel();
    private altPanel altpanel =  altPanel.getAltpanel();
    
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
    
    private UstPanelGuiActions(){
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
    
    
    public static UstPanelGuiActions GetNesne(){
        return guiactions;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == anaekran.Btn_KartsizIslem){
            
            ustpanel.c1.show(ustpanel , "kartsizislemekrani");
            ustpanel.islem = "kartsız";
            System.out.println("kartsiz işlem ekranı");
            
        }else if(ae.getSource() == anaekran.Btn_KartliIslem){
                        
             ustpanel.c1.show(ustpanel, "sifregirmeekrani");
             ustpanel.islem = "kartlı";
             System.out.println("Kartlı İşlem Ekranı");
             
        }else if(ae.getSource() == dogalgazodeekrani.Btn_AnaEkranaDon){
            
            if(ustpanel.islem == "kartlı"){
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                System.out.println("kartlı işlem ekranı");
            }else if(ustpanel.islem == "kartsız"){
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
                System.out.println("kartsız işlem ekranı");
            }
            
        }else if(ae.getSource() == dogalgazodeekrani.Btn_GeriDon){
            
            ustpanel.c1.show(ustpanel, "faturaodeekrani");
            System.out.println("fatura öde ekranı");
            
        }else if(ae.getSource() == dogalgazodeekrani.Btn_Ode){           
            if(ustpanel.islem == "kartlı"){
                ustpanel.c1.show(ustpanel, "paracinsisecmeekrani");
                System.out.println("paracinsisecmeekranı");
            }else if(ustpanel.islem == "kartsız"){
                ustpanel.c1.show(ustpanel, "parayatirmabeklemeekrani");
                System.out.println("para yatırma bekleme ekranı");
            }
            
        }else if(ae.getSource() == elektrikodeekrani.Btn_AnaEkranaDon){
            
            if(ustpanel.islem == "kartlı"){
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                System.out.println("kartlı işlem ekranı");
            }else if(ustpanel.islem == "kartsız"){
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
                System.out.println("kartsız işlem ekranı");
            }
            
        }else if(ae.getSource() == elektrikodeekrani.Btn_GeriDon){
            
            ustpanel.c1.show(ustpanel, "faturaodeekrani");
            System.out.println("fatura öde ekranı");
            
        }else if(ae.getSource() == elektrikodeekrani.Btn_Ode){
            
            if(ustpanel.islem == "kartlı"){
                ustpanel.c1.show(ustpanel, "paracinsisecmeekrani");
                System.out.println("para cinsi secme ekranı");
            }else if(ustpanel.islem == "kartsız"){
                ustpanel.c1.show(ustpanel, "parayatirmabeklemeekrani");
                System.out.println("para yatırma bekleme ekranı");
            }
            
        }else if(ae.getSource() == faturaodeekrani.Btn_AnaEkranaDon){
            
            if(ustpanel.islem == "kartlı"){
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                System.out.println("kartlı işlem ekranı");
            }else if(ustpanel.islem == "kartsız"){
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
                System.out.println("kartsız işlem ekranı");
            }
            
        }else if(ae.getSource() == faturaodeekrani.Btn_DogalgazOde){
            
            ustpanel.c1.show(ustpanel, "dogalgazodeekrani");
            System.out.println("doğal gaz öde ekranı");
            
        }else if(ae.getSource() == faturaodeekrani.Btn_ElektrikOde){
            
            ustpanel.c1.show(ustpanel, "elektrikodeekrani");
            System.out.println("elektrik öde ekranı");
            
        }else if(ae.getSource() == faturaodeekrani.Btn_SuOde){
            
            ustpanel.c1.show(ustpanel, "suodeekrani");
            System.out.println("su öde ekranı");
            
        }else if(ae.getSource() == faturaodeekrani.Btn_TelefonOde){
            
            ustpanel.c1.show(ustpanel, "telefonodeekrani");
            System.out.println("telefon öde ekranı");
            
        }else if(ae.getSource() == havaleyapekrani.Btn_AnaEkranaDon){
            
            if(ustpanel.islem == "kartlı"){
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                System.out.println("kartlı işlem ekranı");
            }else if(ustpanel.islem == "kartsız"){
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
                System.out.println("kartsız işlem ekranı");
            }
            
        }else if(ae.getSource() == havaleyapekrani.Btn_ParaGonder){
            
            if(ustpanel.islem == "kartlı"){
                ustpanel.c1.show(ustpanel, "paracinsisecmeekrani");
                System.out.println("para cinsi seçme ekranı");
            }else if(ustpanel.islem == "kartsız"){
                ustpanel.c1.show(ustpanel, "parayatirmabeklemeekrani");
                System.out.println("para yatırma bekleme ekranı");
            }
            
        }else if(ae.getSource() == islembasariliekrani.Btn_anasayfayadon){
            
            if(ustpanel.islem == "kartlı"){
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                System.out.println("kartlı işlem ekranı");
            }else if(ustpanel.islem == "kartsız"){
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
                System.out.println("kartsız işlem ekranı");
            }
            
        }else if(ae.getSource() == kartliislemekrani.Btn_FaturaOde){
            
             ustpanel.c1.show(ustpanel, "faturaodeekrani");
             System.out.println("Fatura Öde Ekranı");
            
        }else if(ae.getSource() == kartliislemekrani.Btn_HavaleYap){
            
            ustpanel.c1.show(ustpanel, "havaleyapekrani");
            System.out.println("Havale Yap Ekranı");
            
        }else if(ae.getSource() == kartliislemekrani.Btn_KartIade){
            
            ustpanel.c1.show(ustpanel, "anaekran");
            
            altpanel.Btn_KartTak.setEnabled(true);
            altpanel.Btn_KartTak.setText("Atm'ye Kartı Tak");
            ustpanel.sifregirmeekrani.Btn_GirisYap.setEnabled(false);
            
            System.out.println("Ana Ekran");
            
        }else if(ae.getSource() == kartliislemekrani.Btn_ParaCek){
            
            ustpanel.c1.show(ustpanel, "paracinsisecmeekrani");
            System.out.println("para cinsi secme ekranı");
            
            
        }else if(ae.getSource() == kartliislemekrani.Btn_ParaCevir){
            
            ustpanel.c1.show(ustpanel, "paracevirekrani");
            System.out.println("para cevir ekranı");
            
        }else if(ae.getSource() == kartliislemekrani.Btn_ParaYatir){
            
            ustpanel.c1.show(ustpanel, "parayatirmabeklemeekrani");
            System.out.println("para yatırma bekleme ekranı");
            
        }else if(ae.getSource() == kartsizislemekrani.Btn_FaturaOde){
            
            ustpanel.c1.show(ustpanel, "faturaodeekrani");
            System.out.println("Fatura Öde Ekranı");
            
        }else if(ae.getSource() == kartsizislemekrani.Btn_HavaleYap){
            
            ustpanel.c1.show(ustpanel, "havaleyapekrani");
            System.out.println("Havale Yap Ekranı");
            
        }else if(ae.getSource() == kartsizislemekrani.Btn_Iptal){
            
            ustpanel.c1.show(ustpanel, "anaekran");
            System.out.println("Ana Ekran");
            
        }else if(ae.getSource() == paracekekrani.Btn_AnaEkranaDon){
            
            ustpanel.c1.show(ustpanel, "kartliislemekrani");
            System.out.println("kartlı işlem ekranı");
            
        }else if(ae.getSource() == paracekekrani.Btn_EuroCek){
            
            ustpanel.c1.show(ustpanel, "paramiktarigirmeekrani");
            System.out.println("para miktarı girme ekranı");
            
        }else if(ae.getSource() == paracekekrani.Btn_TLCek){
            
            ustpanel.c1.show(ustpanel, "paramiktarigirmeekrani");
            System.out.println("para miktarı girme ekranı");
            
        }else if(ae.getSource() == paracevirekrani.Btn_AnaEkranaDon){
            
            ustpanel.c1.show(ustpanel, "kartliislemekrani");
            System.out.println("kartlı işlem ekranı");
            
        }else if(ae.getSource() == paracevirekrani.Btn_Euro_TLCevir){
            
            ustpanel.c1.show(ustpanel, "paramiktarigirmeekrani");
            System.out.println("para miktarı girme ekranı");
            
        }else if(ae.getSource() == paracevirekrani.Btn_TL_EuroCevir){
            
            ustpanel.c1.show(ustpanel, "paramiktarigirmeekrani");
            System.out.println("para miktarı girme ekranı");
            
        }else if(ae.getSource() == paracinsisecmeekrani.Btn_AnaEkranaDon){
            
            if(ustpanel.islem == "kartlı"){
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                System.out.println("kartlı işlem ekranı");
            }else if(ustpanel.islem == "kartsız"){
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
                System.out.println("kartsız işlem ekranı");
            }
            
        }else if(ae.getSource() == paracinsisecmeekrani.Btn_Euro){
            
            ustpanel.c1.show(ustpanel, "paramiktarigirmeekrani");
            System.out.println("para miktarı girme ekranı");
            
        }else if(ae.getSource() == paracinsisecmeekrani.Btn_TL){
            
            ustpanel.c1.show(ustpanel, "paramiktarigirmeekrani");
            System.out.println("para miktarı girme ekranı");
            
        }else if(ae.getSource() == paramiktarigirmeekrani.Btn_AnaEkranaDon){
            
            ustpanel.c1.show(ustpanel, "kartliislemekrani");
            System.out.println("kartlı işlem ekranı");
            
        }else if(ae.getSource() == paramiktarigirmeekrani.Btn_GeriDon){
            
            ustpanel.c1.show(ustpanel, "paracinsisecmeekrani");
            System.out.println("para cinsi seçme ekranı");
            
        }else if(ae.getSource() == paramiktarigirmeekrani.Btn_Onayla){
            
            ustpanel.c1.show(ustpanel, "islembasariliekrani");
            System.out.println("işlem başarılı ekranı");
            
        }else if(ae.getSource() == parayatirmabeklemeekrani.Btn_AnaEkranaDon){
            
            if(ustpanel.islem == "kartlı"){
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                System.out.println("kartlı işlem ekranı");
            }else if(ustpanel.islem == "kartsız"){
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
                System.out.println("kartsız işlem ekranı");
            }
            
        }else if(ae.getSource() == parayatirmaekrani.Btn_AnaEkranaDon){
            
            if(ustpanel.islem == "kartlı"){
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                System.out.println("kartlı işlem ekranı");
            }else if(ustpanel.islem == "kartsız"){
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
                System.out.println("kartsız işlem ekranı");
            }
            
        }else if(ae.getSource() == parayatirmaekrani.Btn_Yatir){
            
            ustpanel.c1.show(ustpanel, "parayatirmabeklemeekrani");
            System.out.println("para yatırma bekleme ekranı");
            
        }else if(ae.getSource() == sifregirmeekrani.Btn_GirisYap){
            
            if(ustpanel.sifregirmeekrani.Txtfield_Sifre.getText().equals(ModeldanCek.getKartSifresi()) && !altpanel.Btn_KartTak.isEnabled()){
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                System.out.println("kartlı işlem ekranı");
            }
            
            
        }else if(ae.getSource() == sifregirmeekrani.Btn_Iptal){
            
            ustpanel.c1.show(ustpanel, "anaekran");
            System.out.println("Ana Ekran");
            
        }else if(ae.getSource() == suodeekrani.Btn_AnaEkranaDon){
            
            if(ustpanel.islem == "kartlı"){
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                System.out.println("kartlı işlem ekranı");
            }else if(ustpanel.islem == "kartsız"){
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
                System.out.println("kartsız işlem ekranı");
            }
            
        }else if(ae.getSource() == suodeekrani.Btn_GeriDon){
            
            ustpanel.c1.show(ustpanel, "faturaodeekrani");
            System.out.println("fatura öde ekranı");
            
        }else if(ae.getSource() == suodeekrani.Btn_Ode){
            
            if(ustpanel.islem == "kartlı"){
                ustpanel.c1.show(ustpanel, "paracinsisecmeekrani");
                System.out.println("para cinsi seçme ekranı");
            }else if(ustpanel.islem == "kartsız"){
                ustpanel.c1.show(ustpanel, "parayatirmabeklemeekrani");
                System.out.println("para yatırma bekleme ekranı");
            }
            
        }else if(ae.getSource() == telefonodeekrani.Btn_AnaEkranaDon){
            
            if(ustpanel.islem == "kartlı"){
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                System.out.println("kartlı işlem ekranı");
            }else if(ustpanel.islem == "kartsız"){
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
                System.out.println("kartsız işlem ekranı");
            }
            
        }else if(ae.getSource() == telefonodeekrani.Btn_GeriDon){
            
            ustpanel.c1.show(ustpanel, "faturaodeekrani");
            System.out.println("fatura öde ekranı");
            
        }else if(ae.getSource() == telefonodeekrani.Btn_Ode){
            
            if(ustpanel.islem == "kartlı"){
                ustpanel.c1.show(ustpanel, "paracinsisecmeekrani");
                System.out.println("para cinsi seçme ekranı");
            }else if(ustpanel.islem == "kartsız"){
                ustpanel.c1.show(ustpanel, "parayatirmabeklemeekrani");
                System.out.println("para yatırma bekleme ekranı");
            }
            
        }
        
        
    }
    
}
