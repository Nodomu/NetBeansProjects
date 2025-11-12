/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciociclo7;

/**
 *
 * @author HP-FLIABC
 */
public class Ahorro {
    private
            int Ndias;
    public Ahorro()
    {
      Ndias = 0;  
    }

    public int getNdias() 
    {
        return Ndias;
    }

    public void setNdias(int a) 
    {
       Ndias = a;
    }

    double calcAhorro()
    {
        double at = 3;
        int d = 1;
        for(int i=1; i<getNdias();i++)
        {
            System.out.println("El ahorro del día" +d +"es" +at);
            at = at*3;
            d = d++;
            System.out.println("El ahorro total es de: " +at);
        }
        return at;
    }
    double caclAhorroPesos()
    {
        double p = 0;
        p = (32.64 * calcAhorro())/1;
        return p;
    }
}