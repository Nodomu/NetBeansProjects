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
    int idRepresentante,idNiño,edadNiño;
    float tallaNiño,pesoNiño;
    String nombreRepresentante,nombreNiño,parentesco,tipoID,municipio;
    nodo sig, ant;

    public nodo(int idRepresentante, int idNiño, int edadNiño, float tallaNiño, float pesoNiño, String nombreRepresentante, String nombreNiño, String parentesco, String tipoID, String municipio) {
        this.idRepresentante = idRepresentante;
        this.idNiño = idNiño;
        this.edadNiño = edadNiño;
        this.tallaNiño = tallaNiño;
        this.pesoNiño = pesoNiño;
        this.nombreRepresentante = nombreRepresentante;
        this.nombreNiño = nombreNiño;
        this.parentesco = parentesco;
        this.tipoID = tipoID;
        this.municipio = municipio;
        this.sig = ant = null;
    }



}