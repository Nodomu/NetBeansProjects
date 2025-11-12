import java.io.*;
import javax.swing.*;
public class Ppal_Estacion_G
{
    public static void main(String[] args)
    { int d,l;
      Estacion_G Obj;
      Obj = new Estacion_G();
      d = Integer.parseInt(JOptionPane.showInputDialog(null,"digite precio de gasolina"));
      Obj.setp(d);
      l = Integer.parseInt(JOptionPane.showInputDialog(null,"digite la cantidad de gasolina"));
      Obj.setg(l);
      System.out.println("la cantidad de gasolina es");
      System.out.println(Obj.getg());
      System.out.println("el valor a pagar es");
      System.out.println(Obj.calcg_L());
    }
      
  
}
