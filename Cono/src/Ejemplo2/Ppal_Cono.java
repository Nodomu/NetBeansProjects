package Ejemplo2;
import java.util.Scanner;
public class Ppal_Cono
{ public static void main(String[] args)
   { 
     Cono Obj = new Cono ();
     Scanner leer = new Scanner(System.in);
     
     System.out.println("programa para calcular areas del cono");
     
     System.out.println("digite radio");
     Obj.setr(Integer.parseInt(leer.nextLine ()));
     
     System.out.println("digite altura");
     Obj.seth(Integer.parseInt(leer.nextLine ()));
     
     System.out.println("digite generatriz");
     Obj.setg(Integer.parseInt(leer.nextLine ()));
     
     System.out.println("la base es");
     System.out.println(Obj.calca_B());
     leer.nextLine();
     
     System.out.println("el volumen es");
     System.out.println(Obj.calcv());
     leer.nextLine();
     
     System.out.println("el area lateral es");
     System.out.println(Obj.calca_L());
     leer.nextLine();
     
     System.out.println("el area total es");
     System.out.println(Obj.calca_T());
     leer.nextLine();
    }
     
}

