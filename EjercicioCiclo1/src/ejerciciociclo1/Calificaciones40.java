/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciociclo1;

import javax.swing.JOptionPane;
/**
 *
 * @author HP-FLIABC
 */
public class Calificaciones40 {
    private
            float media;
            float Nmy;
            float Nmn;
            int Nmayores;
            int Nmenores;
    public Calificaciones40()
    {
        media = 0;
        Nmy = 0;
        Nmn = 5;
        Nmayores = 0;
        Nmenores = 0;
    }
    void setMedia(float a)
    {
        media = a;
    }
    void setMayor(float b)
    {
        Nmy = b;
    }
    void setMenor(float c)
    {
        Nmn = c;
    }
    void setMayores(int d)
    {
        Nmayores = d;
    }
    void setMenores(int e)
    {
        Nmenores = e;
    }
    float getMedia()
    {
        return media;
    }
    float getMayor()
    {
       return Nmy; 
    }
    float getMenor()
    {
       return Nmn; 
    }
    int getMayores()
    {
        return Nmayores;
    }
    int getMenores()
    {
        return Nmenores;
    }
    void calcProceso()
    {
        Nmn = 9999999;
        float s = 0;
        float v = 0;
        for(int i=1; i<=3; i++)
          v = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota N° "+i));
          s=s+v;
          if(v>=3)
          {
              Nmayores ++;
          }
          else
          {
              Nmenores ++;
          }
          if(v>=Nmy)
          {
              Nmy = v;
          }
          if(v<=Nmn)
          {
              Nmn = v;
          }
          media = s/3;
    }


}

    


    