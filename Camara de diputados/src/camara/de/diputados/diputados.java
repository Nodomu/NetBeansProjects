
package camara.de.diputados;
import javax.swing.JOptionPane;

public class diputados {
 private 
          int v;
          int sw;
          double Si;
          double No;
          double Blanco;
          int i;
 public diputados()
 {
     v = 0;
     sw = 1;
     Si = 0;
     No = 0;
     Blanco = 0;
     i = 0;
 }

    public int getV() {
        return v;
    }

 
    public void setV(int v) {
        this.v = v;
    }


    public int getSw() {
        return sw;
    }


    public void setSw(int sw) {
        this.sw = sw;
    }


    public double getSi() {
        return Si;
    }

 
    public void setSi(double Si) {
        this.Si = Si;
    }


    public double getNo() {
        return No;
    }


    public void setNo(double No) {
        this.No = No;
    }


    public double getBlanco() {
        return Blanco;
    }


    public void setBlanco(double Blanco) {
        this.Blanco = Blanco;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

 double calcDatos()
 {
     int csi = 0;
     int cno = 0;
     int cbl = 0;
     double T = 0;
     while(sw==1)
     {
     v = (Integer.parseInt(JOptionPane.showInputDialog("Está a favor del Tratado de libre comercio? " +"Si -> (1) " +"No -> (2) " +"Prefiere no votar -> (3) ")));    
     sw = (Integer.parseInt(JOptionPane.showInputDialog("Seguir con la votación: " +"Si -> (1) " +"No -> (0)")));
     if(v==1)
     {
         csi+=1;
     }    
     else
         if(v==2)
         {
             cno+=1;
         }
     else
         if(v==3)
         {
             cbl+=1;
         }
     if(sw==0)
     {
         sw=0;
     }
    i++;
 }   
  Si = (csi*100)/i;
  No = (cno*100)/i;
  Blanco = (cbl*100)/i; 
  return T;
}
}
