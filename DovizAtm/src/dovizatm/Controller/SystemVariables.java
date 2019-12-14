
package dovizatm.Controller;

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
