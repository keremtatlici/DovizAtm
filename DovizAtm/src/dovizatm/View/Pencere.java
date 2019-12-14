
package dovizatm.View;

import javax.swing.JFrame;



public class Pencere extends JFrame{
    
    private static Pencere pencere = new Pencere();
    
    private Pencere(){
        this.setTitle("Döviz Atm");// Pencerenin adını ayarlar
        this.setSize(1366 , 768);//Açılacak pencerenin boyutunu 1366x768 ayarlar
        this.setVisible(true);
        this.setResizable(false);//Ekranı yeniden boyutlandırmayı devre dışı bırakır
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Uygulamayı kapatınca build'u da durdurur.
 
        this.add(KenarEkran.getKenarekran());        
        this.revalidate();// nesnelerin ekrana sadece alt tab yapınca gelme hatasını çözdü.
    }

    public static Pencere getPencere() {
        return pencere;
    }
    
}
