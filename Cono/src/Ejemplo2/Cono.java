package Ejemplo2;
public class Cono
{
    private double r;
    private double h;
    private double g;
   
    public Cono()
    {
        r = 0;
        h = 0;
        g = 0;
    }
    public void setr(double radio)
    {
        r = radio;
    }
    
    public double getr()
    { return r;
    }
    public void seth(double altura)
    {
        h = altura;
    }
    
    public double geth()
    { return h;
    }
    
    public void setg(double generatriz)
    {
        g = generatriz;
    }
    
    public double getg()
    { return g;
    }
    
    public double calca_B()
    { double a_B;
        a_B = 2 * (3.1416) * getr() * getr();
        return a_B;
    }
    
    public double calcv()
    { double v;
        v = calca_B() * geth() / 3;
        return v;
    }
    
    public double calca_L()
    { double a_L;
        a_L = (3.1416) * getr() * getg();
        return a_L;
    }
    
    public double calca_T()
    { double a_T;
        a_T = calca_L() + calca_B();
        return a_T;
    }
    
    public void mostrar_resultado()
    { System.out.println("el área de la base es:" +calca_B());
      System.out.println("el volumen es:" +calcv());
      System.out.println("el área lateral es:" +calca_L());
      System.out.println("el area total es:" +calca_T());
    }
      
}
