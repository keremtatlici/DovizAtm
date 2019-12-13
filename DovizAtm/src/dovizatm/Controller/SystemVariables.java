/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.Controller;

/**
 *
 * @author krmtt
 */
public class SystemVariables {

    private static String islem;
    
    private static String parametre;
    
    private SystemVariables(){
        
    }

    public static String getIslem() {
        return islem;
    }

    public static void setIslem(String islem) {
        SystemVariables.islem = islem;
    }

    public static String getParametre() {
        return parametre;
    }

    public static void setParametre(String parametre) {
        SystemVariables.parametre = parametre;
    }
    
    
    
}
