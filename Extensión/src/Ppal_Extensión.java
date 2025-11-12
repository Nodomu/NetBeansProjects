import java.util.Scanner;
public class Ppal_Extensión
{
  public static void main(String[] args)
  { Extensión Obj = new Extensión();
    Scanner leer = new Scanner(System.in);
    System.out.println("programa para calcular el terreno");
    
    System.out.println("digite su acres");
    Obj.setac(Integer.parseInt(leer.nextLine()));
    
    System.out.println("asi que");
    System.out.println(Obj.calch_C());
    leer.nextLine();
}
      
}
