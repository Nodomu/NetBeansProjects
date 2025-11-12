/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author unicordoba
 */
public class nodo {
    int idPasaje;
    String nomRuta;
    float costo;
    nodo sig;
    
    nodo(int id, String nom, float valor){
        idPasaje=id;
        nomRuta=nom;
        costo=valor;
        sig=null;
    }
}
