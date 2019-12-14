
package dovizatm.View;

import dovizatm.Controller.ustPanelMethods;
import javax.swing.JLabel;

public class ElektrikOdeEkrani extends FaturaAbstract{
    
    private static ElektrikOdeEkrani elektrikodeekrani = new ElektrikOdeEkrani();
    
    private ElektrikOdeEkrani(){
        ustPanelMethods.tasarla(this);
        
        no = new JLabel("Abone Numarası : ");
        
        no.setBounds(0,0,200,40);
        Txtfield_No.setBounds(200,0,100,40);
        Btn_Ode.setBounds(0,110,200,100);
        Btn_GeriDon.setBounds(0,220,200,100);
        Btn_AnaEkranaDon.setBounds(0,330,200,100);
        
        this.add(no);
        this.add(Txtfield_No);
        this.add(Btn_Ode);
        this.add(Btn_GeriDon);
        this.add(Btn_AnaEkranaDon);
    }

    public static ElektrikOdeEkrani getElektrikodeekrani() {
        return elektrikodeekrani;
    }
    
}
