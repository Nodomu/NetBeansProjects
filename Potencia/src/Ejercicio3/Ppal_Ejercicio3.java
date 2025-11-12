package Ejercicio3;
import javax.swing.*;
public class Ppal_Ejercicio3 {
    public static void main(String[] args) 
    { int a;
      int b;
      Potencia Obj;
      Obj = new Potencia();
      a = Integer.parseInt(JOptionPane.showInputDialog(null, "digitar la base"));
      Obj.setm(a);
      b = Integer.parseInt(JOptionPane.showInputDialog(null, "digite el exponente"));
      Obj.setn(b);
      System.out.println("el resultado de la potencia");
      System.out.println(Obj.calc_m());
      System.out.println("el resultado de la suma es");
      System.out.println(Obj.calc_p());
    
      
    }   
    
}
