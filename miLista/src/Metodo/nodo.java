/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodo;

/**
 *
 * @author HP-FLIABC
 */
public class nodo {
   int codP;
   String nomP;
   float precio;
   nodo sig;

    public nodo(int codP, String nomP, float precio) {
        this.codP = codP;
        this.nomP = nomP;
        this.precio = precio;
        sig = null;
    }
   
   
}
