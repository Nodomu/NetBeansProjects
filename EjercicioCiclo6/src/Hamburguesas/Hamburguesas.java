
package Hamburguesas;

import javax.swing.JOptionPane;


public class Hamburguesas {

private
        int th;
        int T;
        int p;
        
        
public Hamburguesas()
{ 
  th = 0;
  T = 0;
  p = 0;
}

public void setth(int tipoH)
{
    th = tipoH;
}
public int getth()
{ 
    return th;
}
public void setT(int total)
{ 
    T = total;
}
public int getT()
{ 
    return T;
}
public void setp(int pago)
{ 
    p = pago;
}
public int getp()
{ 
    return p;
}

public double precio()
{ 
    double precio= 0;
    float s= 0;
    float d= 0;
    float t= 0;
    double  ds = 0;
    for(int i = 1;(i <= getT());i++)
    { 
     setth(Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que tipo de hamburgesa desea comprar? " 
         +" 1 = sencilla "
         +" 2 = doble " 
         +" 3 = triple ")));  
 
     if (getth() == 1)
      { 
          s++;
        if(getth() == 2)
         { 
             d++;
         if (getth() == 3)
         { 
             t++;
         }       
        }
      }
    }
  setp(Integer.parseInt(JOptionPane.showInputDialog(null, "¿Medio de pago?" +" 1 = tarjeta "+" 2 = efectivo ")));
    if(getp() == 1)
    { 
        ds = ((s * 20) + (d * 25) + (t * 28)) * 0.05;
        precio  = ((s * 20) + (d * 25) + (t * 28)) + ds;
    }
    else 
    { 
        precio  = ((s * 20) + (d * 25) + (t * 28));
    }
    return precio;
}


}
