
package calificacion_a;

import java.io.*;
import javax.swing.*;
public class Calificacion_A
{

private
    float x; 
    float notaP;
     float notaM;
     float NotaM;
     float notamy;
     float  notamn;
        
 public Calificacion_A()
 { x = 0;
  notaP = 0;
  notaM = 0;
  NotaM = 0;
  notamy = 0;
  notamn = 5;
 }
 
 public void setx(float nota)
 { x = nota;
 }
 public float getx()
 { return x;
 }

public void setnotaP(float promedio)
{ notaP = promedio;
}
public float getNotaP() 
{ return notaP;
}
public void setNotaM(float mayorT)
{ NotaM = mayorT;
}
 public float getNotaM()
 { return notaM;
 }
 public void setnotaM(float menorT)
 { notaM = menorT;
 }
 public float getnotaM() 
 { return notaM;
 }
 public void setnotamy(float mayor)
 { notamy = mayor;
 }
 public float getnotamy()
 { return notamy;
 }
 public void setnotamn(float menor)
 { notamn = menor;
 }
 public float getNotamn() 
 { return notamn;
 }
 
 
   public float promedio()
   { 
     float suma=0;
    notaM = 9999999;
    float x = 0;
        for (int i=1;i<=40;i++)
        {
          
          x =Float.parseFloat(JOptionPane.showInputDialog("Digite nota N° "+i));
          suma+=x;
          if (x>=3){
              notamy++;
          }else{
              notamn++;
          }
          if (x>=notamy){
              notamy = x;
          }
          if (x <= notamn){
              notamn = x;
          }
          
        }
        notaP =suma/40;
        return notaP;
    }

}
