/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodo;

import javax.swing.JOptionPane;

/**
 *
 * @author HP-FLIABC
 */
public class lista {
    nodo cab;
    
    lista()
    {
        cab=null;
    }
    
    int getLongLista()
    {
        int cont = 0;
        nodo q=null;
        if(cab==null)
            return 0;
        else
        {
            q=cab;
            while(q!=null)
            {
                cont++;
                q=q.sig;
            }
            return cont;
        }
    }
    
    
    boolean getEsvacea()
    {
        return cab==null?true:false;
    }
    
    nodo getBuscar(int cod)
    {
        nodo q = null;
        if(getEsvacea())
            return null;
        else
        {
            q = cab;
            while(q!=null)
            {
                if(q.codP==cod)
                    return q;
                q=q.sig;
            }
            return null;
        }
    }
    
    nodo getCrearnodo()
    {
        nodo q=null;
        int cod, pos;
        String nom;
        float valor;
        do{
            cod=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto; "));
            q=getBuscar(cod);
            if(q!=null)
                JOptionPane.showMessageDialog(null, "El codigo ya existe!!!. Vuelve a intentar");
        }while(q!=null);
        nom=JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
        valor=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del producto: "));
        q= new nodo(cod, nom, valor);
        return q;
    }
    
    void setAddinicio()
    {
        nodo info=getCrearnodo();
        if(cab==null)
        {
            cab=info;
            JOptionPane.showMessageDialog(null, "Elemento agregado, lista era vacía!");
        }else
        {
            info.sig=cab;
            cab=info;
            JOptionPane.showMessageDialog(null, "Elemento agregado al inicio!");
        }
    }
    
    
    void setAddfinal()
    {
        nodo info=getCrearnodo();
        if(cab==null)
        {
            cab=info;
            JOptionPane.showMessageDialog(null, "Elemento agregado, lista era vacía!");
        }else
        {
            nodo q=cab;
            while(q.sig!=null)
            {
                q=q.sig;
            }
            q.sig=info;
            JOptionPane.showMessageDialog(null, "Elemento agregado al final!");
        }
    }
    
    void setEliminarN(int cod)
    {
        nodo q = getBuscar(cod);
        nodo p = null;
        
        if(cab == null)
        {
            JOptionPane.showMessageDialog(null, "Lista vacía!!  Elemento elíminado");
        }
       else
        {
            if (q == null)
            {
                JOptionPane.showMessageDialog(null, "Lista vacía");
            }
        }

    }
    
    void setEliminar()
    {
        nodo q=null, p=null, aux=null;
        if(getEsvacea())
        {
            JOptionPane.showMessageDialog(null, "Lista vacía!!!");
        }
           else
            {
              p=cab;
              while(p.sig!=null)
                    {
                        if(p.nomP.equals(p.nomP))
                    {
                        if(q.sig==null)
                        {
                            aux=cab;
                            while(aux.sig!=q)
                                aux=aux.sig;
                    }
                    }
            }
        }
    }
}
