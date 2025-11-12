/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.santiago;


public class Ejercicio10 {
    private 
            int arista;
    
    public Ejercicio10()
    {
        arista = 0;
    }

    public int getArista() {
        return arista;
    }

    public void setArista(int arista) {
        this.arista = arista;
    }
    
    public double caclDiagonal()
    {
        double d = 0;
        int a = getArista();
        
        d = a*Math.sqrt(3);
        
        return d;
    }
    
    public double calcAreaLateral()
    {
        double Al = 0;
        int a = getArista();
        
        Al = 4*Math.pow(a, 2);
        
        return Al;
    }
    
    public double calcAreaTotal()
    {
        double At = 0;
        int a = getArista();
        
        At = 6*Math.pow(a, 2);
        
        return At;
    }
    
    public double calcVolumen()
    {
        double v = 0;
        int a = getArista();
        
        v = Math.pow(a, 3);
        
        return v;
    }
}
