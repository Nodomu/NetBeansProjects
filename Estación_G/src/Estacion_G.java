public class Estacion_G
{
    private int p;
    private int g;

    
    public Estacion_G()
    {
        p = 0;
        g = 0;
    }

    public void setg(int galon)
    {
        g = galon;
    }
    
    public int getg()
    { return g;
    }
    
    public void setp(int precio)
    {
        p = precio;
    }
    
    public int getp()
    { return p;
    }
    
    public double calcg_L()
    { double g_L = 0;
      g_L = getg() * 3.785;
      return g_L;
    }
    
    public double calcp_Litro()
    { double p_Litro = 0;
      p_Litro = getp() * calcg_L();
      return p_Litro;
    }
    
    public void mostrar_resultado()
    { System.out.println("la cantidad de gasolina en litros es:" +calcg_L());
      System.out.println("su precio es:" +calcp_Litro());
    }
    
    
        
    
   
}
