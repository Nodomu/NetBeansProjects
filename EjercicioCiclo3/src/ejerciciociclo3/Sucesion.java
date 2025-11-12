/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciociclo3;

/**
 *
 * @author HP-FLIABC
 */
public class Sucesion {
    private 
            //dd = dividendo y ds = divisor
            int dd;
            int ds;
    public Sucesion()
    {
        dd = 0;
        ds = 0;
    }
    void setDividendo(int x)
    {
        dd = x;
    }
    void setDivisor(int y)
    {
        ds = y;
    }
    int getDd()
    {
        return dd;
    }
    int getDs()
    {
        return ds;
    }
    float caclProceso()
    {
        float a;
        float b;
        while(getDd()>=getDs())
        {
            a = getDd() - getDs();
        }
    }
}
