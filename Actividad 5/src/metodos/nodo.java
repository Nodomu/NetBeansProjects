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
    
    int identificacionpaciente;
    float hora;
    String Tipoid, Nombrepaciente, Nombredoc, fecha, especialista;
    nodo sig, ant;

    public nodo(int identificacionpaciente, float hora, String Tipoid, String Nombrepaciente, String Nombredoc, String fecha, String especialista)
    {
        this.identificacionpaciente = identificacionpaciente;
        this.hora = hora;
        this.Tipoid = Tipoid;
        this.Nombrepaciente = Nombrepaciente;
        this.Nombredoc = Nombredoc;
        this.fecha = fecha;
        this.especialista = especialista;
        sig=ant=null;
    }
    
    
}
