/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author unicordoba
 */
public class pila {
    nodo tope;
    
    pila(){ tope = null; }
    
    nodo getBuscarE(int id){
        if(tope==null) return null;
        else{
            nodo p=tope;
            do{
                if(p.idPasaje == id)
                    return p;
                p=p.sig;
            }while(p!=tope);
            return null;
        }
    }
    
    int getLongPila(){
        nodo p=tope;
        if(tope==null)
            return 0;
        else{
            int conte=0;
            do{
                conte++;
                p=p.sig;
            }while(p!=tope);
            return conte;
        }
    }
    
    String getMostrarN(int id){
        nodo info = getBuscarE(id);
        if(info==null)
            return "Pila vacía o el elemento no existe!";
        else{
            String aux="La información del nodo de la pila es: \n";
            aux += "IdPasaje: "+info.idPasaje+"\n";
            aux += "Nombre ruta: "+info.nomRuta+"\n";
            aux += "Costo ruta: "+info.costo+"\n";
            return aux;
        }
    }
    
    void getMostrarT(){
        if(tope==null)
            JOptionPane.showMessageDialog(null, "La pila esta vacía!");
        else{
            nodo p=tope;
            String info="";
            do{
                info=getMostrarN(p.idPasaje);
                p=p.sig;
            }while(p!=tope);    
        }
    }
    
    nodo getUltimo(){
        if(tope==null)
            return null;
        else{
            nodo p=tope;
            while(p.sig!=tope)
                p=p.sig;
            return p;
        }
    }
    
    nodo getCrearNodo(){
        nodo aux=null, p=null;
        int id;
        String nomr;
        float valor;
        do{
            id=Integer.parseInt(JOptionPane.showInputDialog
            ("Entre el idPasaje a registrar: "));
            p=getBuscarE(id);
            if(p!=null)
                JOptionPane.showMessageDialog(null, "El idPasaje ya existe!!! Intente nuevamente.");
        }while(p!=null);
        nomr=JOptionPane.showInputDialog("Entre nombre de ruta: ");
        valor=Float.parseFloat(JOptionPane.showInputDialog("Entre valor ruta: "));
        aux = new nodo(id, nomr, valor);
        return aux;
    }
    
    void setPush(){
        nodo info = getCrearNodo();
        if(tope==null){
            tope=info;
            tope.sig = tope;
        }else{
            nodo ultimo=getUltimo();
            info.sig = tope;
            tope = info;
            ultimo.sig = tope;
            JOptionPane.showMessageDialog(null, "Nuevo elemento agregado a la pila!");
        }
    }
    
    void setPop(){
        if(tope==null)
            JOptionPane.showMessageDialog(null, "Pila vacía!!");
        else{
            if(tope.sig==tope){
                tope=null;
                JOptionPane.showMessageDialog(null, "Elemento atendido, la pila esta vacía!");
            }else{
                nodo ultimo=getUltimo();
                nodo p = tope;
                tope = tope.sig;
                ultimo.sig = tope;
                p.sig = null;
                p=null;
                JOptionPane.showMessageDialog(null, "Elemento atendido!");
            }
        }
    }
    
    nodo getClonar(nodo info){
        nodo p = new nodo(info.idPasaje, info.nomRuta, info.costo);
        return p;
    }
    
    void setPushAux(nodo info){
        if(tope==null){
            tope=info;
            tope.sig = tope;
        }else{
            nodo ultimo=getUltimo();
            info.sig = tope;
            tope = info;
            ultimo.sig = tope;
        }
    }
    
    pila getDesapilar(int id){
        pila Pilaux=new pila();
        nodo p=tope;
        if(tope==null)
            return Pilaux;
        else{
            nodo info=getBuscarE(id);
            if(info==null)
                return Pilaux;
            else{
                nodo clon=null;
                while(p!=info){
                    clon=getClonar(p);
                    Pilaux.setPushAux(clon);
                    p=p.sig;
                    setPop();   
                }
                setPop();
                JOptionPane.showMessageDialog(null, "Elementos desapilados!!");
                return Pilaux;
            }
        }
    }
    
    void setApilar(pila miPila){
        if(miPila==null){
            JOptionPane.showMessageDialog(null, "No existe información para Apilar!");
        }else{
            nodo clon=null;
            nodo p=miPila.tope;
            do{
                clon=getClonar(p);
                setPushAux(clon);
                p=p.sig;
            }while(p!=miPila.tope);
            miPila=null;
            JOptionPane.showMessageDialog(null, "Se apiló los elementos satisfactoriamente!");
        }
    }
    
}
