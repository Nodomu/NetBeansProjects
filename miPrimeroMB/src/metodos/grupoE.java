/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class grupoE {
    estudiante milista[];
    estudiante es = new estudiante();
    
    grupoE(int tam){
        milista = new estudiante[tam];
        JOptionPane.showMessageDialog(null, 
        "Se ha creado el vector de tamaño: "+tam);
        int i;
        for(i=0; i<milista.length; i++){
            milista[i] = new estudiante(-1, "", "");
        }
    }
    
    int buscarEst(int idEst){
        int i;
        for(i=0; i<milista.length; i++){
            if(milista[i].getIdEst()==idEst)
                return i;
        }
        return -1;
    }
    
    void addEst(){
        int i, idEst=0;
        String noms, prog;
        int pos;
        for(i=0; i<milista.length; i++){
            pos=0;
            while(pos>=0){
                idEst = Integer.parseInt(JOptionPane.showInputDialog(
                "Entre el id del Estudiante para posición "+i+": "));
                pos = buscarEst(idEst);
                if(pos>=0)
                    JOptionPane.showMessageDialog(null, 
                    "El id del Estudiante ya existe!!! por favor intente nuevamente...");
            }    
            noms = JOptionPane.showInputDialog(
            "Entre nombres del estudiante para posición "+i+": ");
            prog = JOptionPane.showInputDialog(
            "Entre programa del estudiante para posición "+i+": ");
            milista[i] = new estudiante(idEst, noms, prog);
            JOptionPane.showMessageDialog(null, 
            "Nuevo estudiante agregado en la posición "+i);
        }
    }
    
    void mostrarEst(){
        int i, j;
        String aux="";
        asignatura curso=null;
        for(i=0; i<milista.length; i++){
            aux += "Los datos del estudiante en la posición "+i+" son: \n";
            aux += "IdEst: "+milista[i].getIdEst()+"\n";
            aux += "Nombres del estudiante: "+milista[i].getNomEst()+"\n";
            aux += "Programa del estudiante: "+milista[i].getPromaEst()+"\n";
            if(milista[i].cursos.size()==0)
            {
                
            }
             else
            {
                aux += "Las asignaturas son: \n";
                for(j=0; j<milista[i].cursos.size(); j++)
                {
                    curso = (asignatura) milista[i].cursos.get(j);
                    aux += "\t"+curso.nomAsig+"\n";
                }
            }
            
            for(j=0; j<milista[i].cursos.size(); j++){   
                curso = (asignatura) milista[i].cursos.get(j);    
                aux += "\t"+curso.nomAsig+"\n";
            }
            JOptionPane.showMessageDialog(null, aux);
            aux="";
        }
    }
    
    void AgregarAsignatura()
    {
       int ag, a = 0;
       int id = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su Id"));
       ag = buscarEst(id);
       if(ag!=-1)
       {
         String Nm = JOptionPane.showInputDialog("Ingrese el nombre de la asignatura a matricular");
         int cd = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la asignatura a matricular"));
         int Ncr = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de creditos de la asignatura"));
         milista[a].addCurso(cd, Nm, Ncr);
       }
         else
         {
            JOptionPane.showMessageDialog(null, "No se logró realizar la matricula!!!");
         } 
    }

    void eliminarAsg()
    {
        int a, idc=0;
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del estudiante"));
        a = buscarEst(id);
        if(a!=-1)
        {
            idc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la asigantura"));
                milista[a].delCurso(idc);
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "¡¡¡El estudiante no está matriculado!!! \n ¡¡¡ERROR!!! \n ¡INTENTE DE NUEVO!");
        }
        
    }
    
    void mostrarIndividual()
    {
        int id, a;
        String m = "";
        id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del estudiante"));
        a = buscarEst(id);
        if(a!=-1)
        {
            for(int i=0; i<milista[a].cursos.size(); i++)
            {
                m+=milista[a].cursos.get(i).nomAsig +"\n";
            }
            JOptionPane.showMessageDialog(null, "id: " +milista[a].getIdEst()
            +"\n Nombre del estudiante: "+milista[a].getNomEst()
            +"\n Prograna del estudiante: "+milista[a].getPromaEst()
            +"\n Asignatura(s) del estudiante: "+m);        
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El estudiante no se encuentra matriculado!!!  ¡¡¡ERROR!!!");
        }
    }
    
}
