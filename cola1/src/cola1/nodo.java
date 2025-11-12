/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola1;

/**
 *
 * @author HP-FLIABC
 */
public class nodo {
    
    int idReceta;
    String nombreReceta;
    float costoReceta;
    nodo sig;
    nodo ant;

    public nodo(int idReceta, String nombreReceta, float costoReceta) {
        this.idReceta = idReceta;
        this.nombreReceta = nombreReceta;
        this.costoReceta = costoReceta;
    }
    
    
    
}
