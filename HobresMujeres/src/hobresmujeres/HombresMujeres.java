/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hobresmujeres;

/**
 *
 * @author HP-FLIABC
 */
public class HombresMujeres {
    private
            int cantidadEstudiantes;
            int canMujeres;
            int canHombres;
    
            public HombresMujeres()
            {
                cantidadEstudiantes = 0;
                canMujeres = 0;
                canHombres = 0;
            }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public int getCanMujeres() {
        return canMujeres;
    }

    public void setCanMujeres(int canMujeres) {
        this.canMujeres = canMujeres;
    }

    public int getCanHombres() {
        return canHombres;
    }

    public void setCanHombres(int canHombres) {
        this.canHombres = canHombres;
    }
            
    
    public double porMujeres()
    {
        double pm = 0;
        pm = (getCanMujeres() * 100)/getCantidadEstudiantes();
        return pm;
    }
    public double porHombres()
    {
        double ph = 0;
        ph = (getCanHombres()*100)/getCantidadEstudiantes();
        return ph;
    }
}
