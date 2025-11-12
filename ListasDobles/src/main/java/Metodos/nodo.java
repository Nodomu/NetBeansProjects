/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author HP-FLIABC
 */
public class nodo {
    int idMeio;
    String nomMedio;
    float valor;
    nodo sig, ant;

    public nodo(int idMeio, String nomMedio, float valor) {
        this.idMeio = idMeio;
        this.nomMedio = nomMedio;
        this.valor = valor;
        sig=ant=null;
    }
    
}
