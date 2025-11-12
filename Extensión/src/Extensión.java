public class Extensión
{
    // instance variables - replace the example below with your own
    private double ac;

 
    public Extensión()
    {
        // initialise instance variables
        ac = 0;
    }

 
    public void setac(double acres)
    {
        // put your code here
       ac = acres;
    }
    
    public double getac()
    { return ac;
    }
    
    public double calch_C()
    { double h_C= 0;
        h_C = getac() * 0.40;
        return h_C;
    }
    
    public void mostrar_resultados()
    { System.out.println(" la extensión en acres es:" +getac());
      System.out.println("la extensión en hectareas es:" +calch_C());
    }
      
    
}
