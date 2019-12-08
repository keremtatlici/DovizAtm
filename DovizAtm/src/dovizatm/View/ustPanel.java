/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class ustPanel extends JPanel{
    public Border blackline = BorderFactory.createLineBorder(Color.black);
    public String islem;
    
    public AnaEkran anaekran =  AnaEkran.getAnaekran();
    public DogalgazOdeEkrani dogalgazodeekrani = DogalgazOdeEkrani.getDogalgazodeekrani();
    public ElektrikOdeEkrani elektrikodeekrani = ElektrikOdeEkrani.getElektrikodeekrani();
    public FaturaOdeEkrani faturaodeekrani = FaturaOdeEkrani.getFaturaodeekrani();
    public HavaleYapEkrani havaleyapekrani =  HavaleYapEkrani.getHavaleyapekrani();
    public KartliIslemEkrani kartliislemekrani =  KartliIslemEkrani.getKartliislemekrani();
    public KartsizIslemEkrani kartsizislemekrani =  KartsizIslemEkrani.getKartsizislemekrani();
    public ParaCekEkrani paracekekrani =  ParaCekEkrani.getParacekekrani();
    public ParaCevirEkrani paracevirekrani =  ParaCevirEkrani.getParacevirekrani();
    public ParaCinsiSecmeEkrani paracinsisecmeekrani =  ParaCinsiSecmeEkrani.getParacinsisecmeekrani();
    public ParaMiktariGirmeEkrani paramiktarigirmeekrani =  ParaMiktariGirmeEkrani.getParamiktarigirmeekrani();
    public ParaYatirmaBeklemeEkrani parayatirmabeklemeekrani =  ParaYatirmaBeklemeEkrani.getParayatirmabeklemeekrani();
    public ParaYatirmaEkrani parayatirmaekrani =  ParaYatirmaEkrani.getParayatirmaekrani();
    public SifreGirmeEkrani sifregirmeekrani =  SifreGirmeEkrani.getSifregirmeekrani(); 
    public SuOdeEkrani suodeekrani =  SuOdeEkrani.getSuodeekrani();
    public TelefonOdeEkrani telefonodeekrani =  TelefonOdeEkrani.getTelefonodeekrani();
    
    public CardLayout c1 = new CardLayout();
    
    private static ustPanel ustpanel = new ustPanel();
    
    private ustPanel(){
        this.setLayout(c1);
        this.setBounds(300, 0, 766, 500); // Üst Panel  766x500
        this.setBorder(blackline);
        this.setBackground(Color.LIGHT_GRAY);
        
        this.add(anaekran , "anaekran");
        this.add(kartsizislemekrani, "kartsizislemekrani");
        this.add(faturaodeekrani, "faturaodeekrani");
        this.add(telefonodeekrani, "telefonodeekrani");
        this.add(suodeekrani, "suodeekrani");
        this.add(elektrikodeekrani,"elektrikodeekrani");
        this.add(dogalgazodeekrani, "dogalgazodeekrani"); 
        this.add(havaleyapekrani, "havaleyapekrani");
        this.add(sifregirmeekrani, "sifregirmeekrani");
        this.add(kartliislemekrani,"kartliislemekrani");
        this.add(parayatirmabeklemeekrani,"parayatirmabeklemeekrani");
        this.add(paracinsisecmeekrani,"paracinsisecmeekrani");
        this.add(paramiktarigirmeekrani,"paramiktarigirmeekrani");
        this.add(parayatirmaekrani,"parayatirmaekrani");
        this.add(paracekekrani , "paracekekrani");                 
        this.add(paracevirekrani, "paracevirekrani");    
        
        c1.show(this,"anaekran");        
    }

    public static ustPanel getUstpanel() {
        return ustpanel;
    }

}




             