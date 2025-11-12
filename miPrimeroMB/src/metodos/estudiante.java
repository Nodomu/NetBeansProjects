/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Ruben
 */
public class estudiante {
    private int idEst;
    private String nomEst;
    private String promaEst;
    public ArrayList <asignatura> cursos;
    
    public estudiante(int idEstudiante, String nomEst, String promaEst) {
        idEst = idEstudiante;
        this.nomEst = nomEst;
        this.promaEst = promaEst;
        cursos = new ArrayList();
    }
    
    public estudiante(){
        idEst=-1;
        nomEst="";
        promaEst="";
        cursos = new ArrayList();
    }
    
    public int getPosAsignatura(int id){
        asignatura aux=null;
        int i;
        
        for(i=0; i<cursos.size(); i++){
            aux = (asignatura) cursos.get(i);
            if(aux.idAsig==id)
                return i;
        }  
        return -1;
    }

    public int getIdEst() {
        return idEst;
    }
    
    public String getNomEst() {
        return nomEst;
    }

    public String getPromaEst() {
        return promaEst;
    }

    public void setIdEst(int idEst) {
        this.idEst = idEst;
    }

    public void setNomEst(String nomEst) {
        this.nomEst = nomEst;
    }

    public void setPromaEst(String promaEst) {
        this.promaEst = promaEst;
    } 
    
    public int buscarCurso(int idcurso){
        int i;
        asignatura aux=null;
        for(i=0; i<cursos.size(); i++){
            aux = (asignatura) cursos.get(i);
            if(aux.idAsig==idcurso)
                return i;
        }
        return -1;
    }
    
    public void addCurso(int idCurso, String nomC, int ncred){
        int pos = buscarCurso(idCurso);
        asignatura aux=null;
        if(pos>=0){
            JOptionPane.showMessageDialog(null, "El id del Curso ya esta registrado!");
        }else{
            aux = new asignatura(idCurso, nomC, ncred);
            cursos.add(aux);
            JOptionPane.showMessageDialog(null, "Nuevo curso registrado!");
        }       
    }
    
    public void delCurso(int idCurso){
        int pos = buscarCurso(idCurso);
        if(pos==-1){
            JOptionPane.showMessageDialog(null, "El idCurso no existe!!");
        }else{
            cursos.remove(pos);
            JOptionPane.showMessageDialog(null, "Curso eliminado!");
        }
    }
}
