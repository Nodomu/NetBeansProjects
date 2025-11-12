/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP-FLIABC
 */
public class Ejercicio8 {
    double longitud;
    
    Ejercicio8()
    {
        longitud = 0;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    public double calcAreaCuadrado()
    {
        double a = 0;
        double l = getLongitud();
        
        a = Math.pow(l, 2);
        
        return a;
    }
    
    public double calcPcuadrado()
    {
        double p = 0;
        double l = getLongitud();
        
        p = Math.pow(l, 4);
        
        return p;
    }
    
    public double calcAreaC()
    {
        double a = 0;
        double r = getLongitud();
        double Pi = 3.14;
        
        a = Pi*Math.pow(r, 2);
        
        return a;
    }
    
    public double calcPerimetroC()
    {
        double p = 0;
        double r = getLongitud();
        double Pi = 3.14;
        
        p = (2*3.14)*r;
        
        return p;
    }
}


