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
        
        this.add(anaekran , "0");
        this.add(kartsizislemekrani, "1");
        this.add(faturaodeekrani, "3");
        this.add(telefonodeekrani, "31");
        this.add(suodeekrani, "32");
        this.add(elektrikodeekrani,"33");
        this.add(dogalgazodeekrani, "34");
        this.add(havaleyapekrani, "4");
        this.add(sifregirmeekrani, "2");
        this.add(kartliislemekrani,"21");
        this.add(parayatirmabeklemeekrani,"311");
        this.add(paracinsisecmeekrani,"312");
        this.add(paramiktarigirmeekrani,"3121");
        this.add(parayatirmaekrani,"211");
        this.add(paracekekrani , "212");                 
        this.add(paracevirekrani, "213");    
        
        c1.show(this,"0");
        
//----------------------ANAEKRAN 0 ----------------------------------------------------------------------------------------------

       /* anaekran.Btn_KartsizIslem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c1.show(ustPanel.this, "1");
                islem = "kartsız";
                System.out.println(islem);
            }
        });*/
       
//        anaekran.Btn_KartliIslem.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                c1.show(ustPanel.this, "2");
//                islem = "kartlı";
//            }
//        });

//------------------------ŞİFRE GİRME EKRANI 2 --------------------------------------------------------------------------------------------

       /* sifregirmeekrani.Btn_GirisYap.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sifregirmeekrani.Txtfield_Sifre.getText().equals("0000"))// şifreyi controller-> model dan çekicez
                {
                     c1.show(ustPanel.this, "21");
                }else{
                    // Girdiğiniz sifre yanlış yazsını ekrana bastır.
                }
            }
        });*/
       
//        sifregirmeekrani.Btn_Iptal.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                c1.show(ustPanel.this, "0");
//                System.out.println(islem);
//            }
//        }); 

//----------------------KARTSIZ İŞLEM EKRANI 1 ----------------------------------------------------------------------------------------------                       
            
//        kartsizislemekrani.Btn_FaturaOde.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                c1.show(ustPanel.this, "3");
//                System.out.println(islem);
//            }
//        }); 

        kartsizislemekrani.Btn_HavaleYap.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c1.show(ustPanel.this, "4");
            }
        });

        kartsizislemekrani.Btn_Iptal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c1.show(ustPanel.this, "0");
            }
        });
        
//---------------------------KARTLI İŞLEM EKRANI 21-----------------------------------------------------------------------------------------
        kartliislemekrani.Btn_FaturaOde.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    c1.show(ustPanel.this, "3");
                }
            });
        kartliislemekrani.Btn_HavaleYap.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    c1.show(ustPanel.this, "4");
                }
            });
        kartliislemekrani.Btn_KartIade.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    c1.show(ustPanel.this, "0");
                }
            });
        kartliislemekrani.Btn_ParaCek.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    c1.show(ustPanel.this, "212");
                }
            });
        kartliislemekrani.Btn_ParaCevir.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    c1.show(ustPanel.this, "213");
                }
            });
        kartliislemekrani.Btn_ParaYatir.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    c1.show(ustPanel.this, "211");
                }
            });
//---------------------------FATURA ÖDE EKRANI 3 --------------------------------------------------------------------------------------------

        faturaodeekrani.Btn_AnaEkranaDon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(islem == "kartlı"){
                        c1.show(ustPanel.this, "21");
                    }else if(islem == "kartsız"){
                        c1.show(ustPanel.this, "1");
                    }
                }
            });
        faturaodeekrani.Btn_DogalgazOde.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    c1.show(ustPanel.this, "34");
                }
            });
        faturaodeekrani.Btn_ElektrikOde.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    c1.show(ustPanel.this, "33");
                }
            });    
        faturaodeekrani.Btn_SuOde.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    c1.show(ustPanel.this, "32");
                }
            });
        faturaodeekrani.Btn_TelefonOde.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    c1.show(ustPanel.this, "31");
                }
            });
        
//----------------------------TELEFON ÖDE EKRANI 31---------------------------------------------------------------------------
        telefonodeekrani.Btn_AnaEkranaDon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                     if(islem == "kartlı"){
                        c1.show(ustPanel.this, "21");
                    }else if(islem == "kartsız"){
                        c1.show(ustPanel.this, "1");
                    }
                }
            });
        telefonodeekrani.Btn_GeriDon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    c1.show(ustPanel.this, "3");
                }
            });
        telefonodeekrani.Btn_Ode.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                     if(islem == "kartlı"){
                        c1.show(ustPanel.this, "312");
                    }else if(islem == "kartsız"){
                        c1.show(ustPanel.this, "311");
                    }
                }
            });
        
//----------------------------SU ÖDE EKRANI 32-------------------------------------------------------------------------------

                suodeekrani.Btn_AnaEkranaDon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                     if(islem == "kartlı"){
                        c1.show(ustPanel.this, "21");
                    }else if(islem == "kartsız"){
                        c1.show(ustPanel.this, "1");
                    }
                }
            });
        suodeekrani.Btn_GeriDon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    c1.show(ustPanel.this, "3");
                }
            });
        suodeekrani.Btn_Ode.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                     if(islem == "kartlı"){
                        c1.show(ustPanel.this, "312");
                    }else if(islem == "kartsız"){
                        c1.show(ustPanel.this, "311");
                    }
                }
            });

//----------------------------ELEKTRİK ÖDE EKRANI 33-----------------------------------------------------------------------

        elektrikodeekrani.Btn_AnaEkranaDon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                     if(islem == "kartlı"){
                        c1.show(ustPanel.this, "21");
                    }else if(islem == "kartsız"){
                        c1.show(ustPanel.this, "1");
                    }
                }
            });
        elektrikodeekrani.Btn_GeriDon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    c1.show(ustPanel.this, "3");
                }
            });
        elektrikodeekrani.Btn_Ode.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                     if(islem == "kartlı"){
                        c1.show(ustPanel.this, "312");
                    }else if(islem == "kartsız"){
                        c1.show(ustPanel.this, "311");
                    }
                }
            });

//----------------------------DOĞAL GAZ ÖDE EKRANI 34--------------------------------------------------------------------

        dogalgazodeekrani.Btn_AnaEkranaDon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                     if(islem == "kartlı"){
                        c1.show(ustPanel.this, "21");
                    }else if(islem == "kartsız"){
                        c1.show(ustPanel.this, "1");
                    }
                }
            });
        dogalgazodeekrani.Btn_GeriDon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    c1.show(ustPanel.this, "3");
                }
            });
        dogalgazodeekrani.Btn_Ode.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                     if(islem == "kartlı"){
                        c1.show(ustPanel.this, "312");
                    }else if(islem == "kartsız"){
                        c1.show(ustPanel.this, "311");
                    }
                }
            });

//----------------------------PARA YATIRMA BEKLEME EKRANI 311---------------------------------------------------------------

        parayatirmabeklemeekrani.Btn_AnaEkranaDon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                     if(islem == "kartlı"){
                        c1.show(ustPanel.this, "21");
                    }else if(islem == "kartsız"){
                        c1.show(ustPanel.this, "1");
                    }
                }
            });

//----------------------------PARA CİNSİ SEÇME EKRANI 312--------------------------------------------------------------
        paracinsisecmeekrani.Btn_AnaEkranaDon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                     if(islem == "kartlı"){
                        c1.show(ustPanel.this, "21");
                    }else if(islem == "kartsız"){
                        c1.show(ustPanel.this, "1");
                    }
                }
            });
        paracinsisecmeekrani.Btn_Euro.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                        c1.show(ustPanel.this, "3121");
                }
            });
        paracinsisecmeekrani.Btn_TL.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                     c1.show(ustPanel.this, "3121");
                }
            });
//----------------------------PARA MİKTARI GİRME EKRANI 3121 -----------------------------------------------------------

        paramiktarigirmeekrani.Btn_AnaEkranaDon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                     c1.show(ustPanel.this, "21");
                }
            });
        paramiktarigirmeekrani.Btn_GeriDon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                c1.show(ustPanel.this, "312");
            }
        });

//----------------------------HAVALE YAP EKRANI 4 ------------------------------------------------------------------------

        havaleyapekrani.Btn_AnaEkranaDon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                     if(islem == "kartlı"){
                        c1.show(ustPanel.this, "21");
                    }else if(islem == "kartsız"){
                        c1.show(ustPanel.this, "1");
                    }
                }
            });
        
        havaleyapekrani.Btn_ParaGonder.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                     if(islem == "kartlı"){
                        c1.show(ustPanel.this, "312");
                    }else if(islem == "kartsız"){
                        c1.show(ustPanel.this, "311");
                    }
                }
            });


//----------------------------- PARA YATIRMA EKRANI 211---------------------------------------------------------------------

        parayatirmaekrani.Btn_AnaEkranaDon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                     if(islem == "kartlı"){
                        c1.show(ustPanel.this, "21");
                    }else if(islem == "kartsız"){
                        c1.show(ustPanel.this, "1");
                    }
                }
            });
        
        parayatirmaekrani.Btn_Yatir.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                                        
                        c1.show(ustPanel.this, "311");
                    
                }
            });
//----------------------------PARA ÇEK EKRANI 212 --------------------------------------------------------------------------
        paracekekrani.Btn_AnaEkranaDon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                                        
                        c1.show(ustPanel.this, "21");
                    
                }
            });
        paracekekrani.Btn_EuroCek.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                                        
                        c1.show(ustPanel.this, "3121");
                    
                }
            });
        paracekekrani.Btn_TLCek.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                                        
                        c1.show(ustPanel.this, "3121");
                    
                }
            });
        
    }

    public static ustPanel getUstpanel() {
        return ustpanel;
    }

}




             