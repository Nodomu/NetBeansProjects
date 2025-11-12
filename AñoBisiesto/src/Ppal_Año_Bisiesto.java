import java.io.*;
import javax.swing.*;
public class Ppal_Año_Bisiesto
{
    public static void main(String[] args)
    {
        int a;
        
        Año_Bisiesto Obj;
        Obj = new Año_Bisiesto();
        a = Integer.parseInt(JOptionPane.showInputDialog(null,"digitar año"));
        Obj.setx(a);
        
        System.out.println("el año");
        System.out.println(Obj.getx());
        System.out.println("es");
        System.out.println(Obj.deta_B());
    }
        
        
   
    
}