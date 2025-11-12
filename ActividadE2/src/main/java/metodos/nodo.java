/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author HP-FLIABC
 */
public class nodo {
    int idCosecha;
    String tipoDecosecha;
    float Nhectareas;
    String ubicación;
    nodo sig;
    nodo ant;

    public nodo(int idCosecha, String tipoDecosecha, float Nhectareas, String ubicación) {
        this.idCosecha = idCosecha;
        this.tipoDecosecha = tipoDecosecha;
        this.Nhectareas = Nhectareas;
        this.ubicación = ubicación;
        sig=null;
        ant=null;
    }    
}
