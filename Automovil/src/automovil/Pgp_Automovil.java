
package automovil;

import java.io.*;
public class Pgp_Automovil {
     public static void main(String[] args)
   { Automovil U;
    U = new Automovil();
    int a;
    int b;
    
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   try{
       System.out.println("Ingrese el año de automovil ");
       a = Integer.parseInt(br.readLine());
       U.setA(a);
       
       System.out.println("Ingrese el peso en libra ");
       b = Integer.parseInt(br.readLine());
       U.setP(b);
       
       
   } catch(IOException varerror){ System.out.println("error");}
   
   System.out.println("Banco:");
   U.mostrarResultado();
   }
}
