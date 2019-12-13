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
            
            SystemVariables.setIslem("ana-kartsiz");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel , "kartsizislemekrani");
            
        }else if(ae.getSource() == anaekran.Btn_KartliIslem){
            
             SystemVariables.setIslem("ana-sifre");
             System.out.println(SystemVariables.getIslem());           
             ustpanel.c1.show(ustpanel, "sifregirmeekrani");
             
        }else if(ae.getSource() == dogalgazodeekrani.Btn_AnaEkranaDon){
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-dogalgaz"){
                
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                SystemVariables.setIslem("ana-sifre-kartli");
                System.out.println(SystemVariables.getIslem());
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura-dogalgaz"){
                
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
                SystemVariables.setIslem("ana-kartsiz");
                System.out.println(SystemVariables.getIslem());
            }
            
        }else if(ae.getSource() == dogalgazodeekrani.Btn_GeriDon){
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-dogalgaz"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "faturaodeekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura-dogalgaz"){
                
                SystemVariables.setIslem("ana-kartsiz-fatura");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "faturaodeekrani");
            }
            
            
        }else if(ae.getSource() == dogalgazodeekrani.Btn_Ode){           
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-dogalgaz"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-dogalgaz-paracinsi");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "paracinsisecmeekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura-dogalgaz"){
                
                SystemVariables.setIslem("ana-kartsiz-fatura-dogalgaz-parayatirma");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "parayatirmabeklemeekrani");
            }
            
        }else if(ae.getSource() == elektrikodeekrani.Btn_AnaEkranaDon){
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-elektrik"){
                
                SystemVariables.setIslem("ana-sifre-kartli");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura-elektrik"){
                
                SystemVariables.setIslem("ana-kartsiz");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
            }
            
        }else if(ae.getSource() == elektrikodeekrani.Btn_GeriDon){
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-elektrik"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "faturaodeekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura-elektrik"){
                
                SystemVariables.setIslem("ana-kartsiz-fatura");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "faturaodeekrani");
                
            }
            
            
            
        }else if(ae.getSource() == elektrikodeekrani.Btn_Ode){
            System.out.println(SystemVariables.getIslem());
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-elektrik"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-elektrik-paracinsi");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "paracinsisecmeekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura-elektrik"){
                
                SystemVariables.setIslem("ana-kartsiz-fatura-elektrik-parayatirma");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "parayatirmabeklemeekrani");
            }
            
        }else if(ae.getSource() == faturaodeekrani.Btn_AnaEkranaDon){
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura"){
                
                SystemVariables.setIslem("ana-sifre-kartli");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura"){
                
                SystemVariables.setIslem("ana-kartsiz");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
            }
            
        }else if(ae.getSource() == faturaodeekrani.Btn_DogalgazOde){
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-dogalgaz");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "dogalgazodeekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura"){
                SystemVariables.setIslem("ana-kartsiz-fatura-dogalgaz");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel,"dogalgazodeekrani");
            }
            
            
        }else if(ae.getSource() == faturaodeekrani.Btn_ElektrikOde){
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-elektrik");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "elektrikodeekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura"){
                
                SystemVariables.setIslem("ana-kartsiz-fatura-elektrik");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel,"elektrikodeekrani");
            }
            
            
        }else if(ae.getSource() == faturaodeekrani.Btn_SuOde){
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-su");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "suodeekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura"){
                
                SystemVariables.setIslem("ana-kartsiz-fatura-su");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel,"suodeekrani");
            }
    
            
        }else if(ae.getSource() == faturaodeekrani.Btn_TelefonOde){
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-telefon");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "telefonodeekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura"){
                
                SystemVariables.setIslem("ana-kartsiz-fatura-telefon");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel,"telefonodeekrani");
            }
            
            
        }else if(ae.getSource() == havaleyapekrani.Btn_AnaEkranaDon){
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-havale"){
                
                SystemVariables.setIslem("ana-sifre-kartli");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-havale"){
                
                SystemVariables.setIslem("ana-kartsiz");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
            }
            
        }else if(ae.getSource() == havaleyapekrani.Btn_ParaGonder){
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-havale"){
                
                SystemVariables.setIslem("ana-sifre-kartli-havale-paracinsi");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "paracinsisecmeekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-havale"){
                
                SystemVariables.setIslem("ana-kartsiz-havale-parayatirma");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "parayatirmabeklemeekrani");
            }
            
        }else if(ae.getSource() == kartliislemekrani.Btn_FaturaOde){
            
            SystemVariables.setIslem("ana-sifre-kartli-fatura");
            System.out.println(SystemVariables.getIslem());
             ustpanel.c1.show(ustpanel, "faturaodeekrani");
            
        }else if(ae.getSource() == kartliislemekrani.Btn_HavaleYap){
            
            SystemVariables.setIslem("ana-sifre-kartli-havale");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "havaleyapekrani");
            
        }else if(ae.getSource() == kartliislemekrani.Btn_KartIade){
            
            SystemVariables.setIslem("ana");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "anaekran");
            
            altpanel.Btn_KartTak.setEnabled(true);
            altpanel.Btn_KartTak.setText("Atm'ye Kartı Tak");
            ustpanel.sifregirmeekrani.Btn_GirisYap.setEnabled(false);
            altpanel.labelbakiyeTL.setVisible(false);
            altpanel.labelbakiyeEuro.setVisible(false);
            
            
        }else if(ae.getSource() == kartliislemekrani.Btn_ParaCek){
            
            SystemVariables.setIslem("ana-sifre-kartli-paracek");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "paracekekrani");
            
        }else if(ae.getSource() == kartliislemekrani.Btn_ParaCevir){
            
            SystemVariables.setIslem("ana-sifre-kartli-paracevir");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "paracevirekrani");
            
        }else if(ae.getSource() == kartliislemekrani.Btn_ParaYatir){
            
            SystemVariables.setIslem("ana-sifre-kartli-parayatirma");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "parayatirmabeklemeekrani");
            
            altpanel.Btn_ParaYatir.setEnabled(true);
            
        }else if(ae.getSource() == kartsizislemekrani.Btn_FaturaOde){
            
            SystemVariables.setIslem("ana-kartsiz-fatura");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "faturaodeekrani");
            
        }else if(ae.getSource() == kartsizislemekrani.Btn_HavaleYap){
            
            SystemVariables.setIslem("ana-kartsiz-havale");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "havaleyapekrani");
            
        }else if(ae.getSource() == kartsizislemekrani.Btn_Iptal){
            
            SystemVariables.setIslem("ana");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "anaekran");
            
        }else if(ae.getSource() == paracekekrani.Btn_AnaEkranaDon){
            
            SystemVariables.setIslem("ana-sifre-kartli");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "kartliislemekrani");
            
        }else if(ae.getSource() == paracekekrani.Btn_EuroCek){
            
            SystemVariables.setIslem("ana-sifre-kartli-paracek-paramiktari");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "paramiktarigirmeekrani");
            
            SystemVariables.setParametre("Euro");
            System.out.println("parametre değeri : " + SystemVariables.getParametre());
            
        }else if(ae.getSource() == paracekekrani.Btn_TLCek){
            
            SystemVariables.setIslem("ana-sifre-kartli-paracek-paramiktari");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "paramiktarigirmeekrani");
            
            SystemVariables.setParametre("TL");
            System.out.println("parametre değeri : " + SystemVariables.getParametre());
            
        }else if(ae.getSource() == paracevirekrani.Btn_AnaEkranaDon){
            
            SystemVariables.setIslem("ana-sifre-kartli");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "kartliislemekrani");
            
        }else if(ae.getSource() == paracevirekrani.Btn_Euro_TLCevir){
            
            SystemVariables.setIslem("ana-sifre-kartli-paracevir-paramiktari");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "paramiktarigirmeekrani");
            
            SystemVariables.setParametre("Euro");
            System.out.println("parametre değeri : " + SystemVariables.getParametre());
            
        }else if(ae.getSource() == paracevirekrani.Btn_TL_EuroCevir){
            
            SystemVariables.setIslem("ana-sifre-kartli-paracevir-paramiktari");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "paramiktarigirmeekrani");
            
            SystemVariables.setParametre("TL");
            System.out.println("parametre değeri : " + SystemVariables.getParametre());
            
        }else if(ae.getSource() == paracinsisecmeekrani.Btn_AnaEkranaDon){
                
            SystemVariables.setIslem("ana-sifre-kartli");
            System.out.println(SystemVariables.getIslem());   
            ustpanel.c1.show(ustpanel, "kartliislemekrani");
            
            
        }else if(ae.getSource() == paracinsisecmeekrani.Btn_Euro){
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-su-paracinsi"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-su-paracinsi-paramiktari");
                
            }else if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-elektrik-paracinsi"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-elektrik-paracinsi-paramiktari");
                
            }else if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-dogalgaz-paracinsi"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-dogalgaz-paracinsi-paramiktari");
                
            }else if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-telefon-paracinsi"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-telefon-paracinsi-paramiktari");
                
            }else if(SystemVariables.getIslem() == "ana-sifre-kartli-havale-paracinsi"){
                
                SystemVariables.setIslem("ana-sifre-kartli-havale-paracinsi-paramiktari");
                
            }
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "paramiktarigirmeekrani");
            
            SystemVariables.setParametre("Euro");
            System.out.println("parametre değeri : " + SystemVariables.getParametre());
            
        }else if(ae.getSource() == paracinsisecmeekrani.Btn_TL){
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-su-paracinsi"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-su-paracinsi-paramiktari");
                
            }else if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-elektrik-paracinsi"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-elektrik-paracinsi-paramiktari");
                
            }else if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-dogalgaz-paracinsi"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-dogalgaz-paracinsi-paramiktari");
                
            }else if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-telefon-paracinsi"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-telefon-paracinsi-paramiktari");
                
            }else if(SystemVariables.getIslem() == "ana-sifre-kartli-havale-paracinsi"){
                
                SystemVariables.setIslem("ana-sifre-kartli-havale-paracinsi-paramiktari");
                
            }
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "paramiktarigirmeekrani");
            
            SystemVariables.setParametre("TL");
            System.out.println("parametre değeri : " + SystemVariables.getParametre());
            
        }else if(ae.getSource() == paramiktarigirmeekrani.Btn_AnaEkranaDon){
            
            SystemVariables.setIslem("ana-sifre-kartli");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "kartliislemekrani");
            
        }else if(ae.getSource() == paramiktarigirmeekrani.Btn_Onayla){
            
            if(SystemVariables.getIslem()== "ana-sifre-kartli-paracek-paramiktari"){
                try{
                    ustPanelMethods.ParaCek(Integer.valueOf(paramiktarigirmeekrani.Txtfield_ParaMiktari.getText()));
                }catch(Exception e){
                    System.out.println("yazılan string inte çevirilemiyor");
                }
         
                
                
            }else if(SystemVariables.getIslem() == "ana-sifre-kartli-paracevir-paramiktari"){
                //Para Kullanıcı bakiyesinde Euro TL olarak dönecek
            }else{
                //Para Boşluğa gider
            }
            
        }else if(ae.getSource() == parayatirmabeklemeekrani.Btn_AnaEkranaDon){
            altpanel.Btn_ParaYatir.setEnabled(false);
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-parayatirma"){
                
                SystemVariables.setIslem("ana-sifre-kartli");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                
            }else{
                
                SystemVariables.setIslem("ana-kartsiz");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
            }
            
        }else if(ae.getSource() == sifregirmeekrani.Btn_GirisYap){
            
            if(ustpanel.sifregirmeekrani.Txtfield_Sifre.getText().equals(ModeldanCek.getKartSifresi()) && !altpanel.Btn_KartTak.isEnabled()){
                
                SystemVariables.setIslem("ana-sifre-kartli");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                
                altpanel.labelbakiyeTL.setVisible(true);
                altpanel.labelbakiyeEuro.setVisible(true);
                
            }
            
            
        }else if(ae.getSource() == sifregirmeekrani.Btn_Iptal){
            
            SystemVariables.setIslem("ana");
            System.out.println(SystemVariables.getIslem());
            ustpanel.c1.show(ustpanel, "anaekran");
            
        }else if(ae.getSource() == suodeekrani.Btn_AnaEkranaDon){
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-su"){
                
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                SystemVariables.setIslem("ana-sifre-kartli");
                System.out.println(SystemVariables.getIslem());
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura-su"){
                
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
                SystemVariables.setIslem("ana-kartsiz");
                System.out.println(SystemVariables.getIslem());
            }
            
        }else if(ae.getSource() == suodeekrani.Btn_GeriDon){
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-su"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "faturaodeekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura-su"){
                
                SystemVariables.setIslem("ana-kartsiz-fatura");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "faturaodeekrani");
            }
            
        }else if(ae.getSource() == suodeekrani.Btn_Ode){
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-su"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-su-paracinsi");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "paracinsisecmeekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura-su"){
                
                SystemVariables.setIslem("ana-kartsiz-fatura-su-parayatirma");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "parayatirmabeklemeekrani");
            }
            
        }else if(ae.getSource() == telefonodeekrani.Btn_AnaEkranaDon){
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-telefon"){
                
                ustpanel.c1.show(ustpanel, "kartliislemekrani");
                SystemVariables.setIslem("ana-sifre-kartli");
                System.out.println(SystemVariables.getIslem());
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura-telefon"){
                
                ustpanel.c1.show(ustpanel, "kartsizislemekrani");
                SystemVariables.setIslem("ana-kartsiz");
                System.out.println(SystemVariables.getIslem());
            }
            
        }else if(ae.getSource() == telefonodeekrani.Btn_GeriDon){
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-telefon"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "faturaodeekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura-telefon"){
                
                SystemVariables.setIslem("ana-kartsiz-fatura");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "faturaodeekrani");
            }
            
        }else if(ae.getSource() == telefonodeekrani.Btn_Ode){
            
            if(SystemVariables.getIslem() == "ana-sifre-kartli-fatura-telefon"){
                
                SystemVariables.setIslem("ana-sifre-kartli-fatura-telefon-paracinsi");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "paracinsisecmeekrani");
                
            }else if(SystemVariables.getIslem() == "ana-kartsiz-fatura-telefon"){
                
                SystemVariables.setIslem("ana-kartsiz-fatura-telefon-parayatirma");
                System.out.println(SystemVariables.getIslem());
                ustpanel.c1.show(ustpanel, "parayatirmabeklemeekrani");
            }
            
        }
        
        
    }
    
}
