/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author HP-FLIABC
 */
public class lista {
   nodo cab;
   
   lista(){
       cab=null;
   }
   
   nodo getBuscar(int id)
   {
     if(cab==null)
         return null;
     else
     {
         nodo q=cab;
         while(q!=null)
         {
             if(q.idMeio == id)
                 return q;
             else
                 q=q.sig;
         }
         return null;
     }
   }
   
   nodo getCrearNodo()
   {
       int id;
       nodo b=null;
       do
       {
           id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del medio: "));
           b=getBuscar(id);
           if(b!=null)
               JOptionPane.showMessageDialog(null, "ID de medio ya registrado, INTENTE NUEVAMENTE");
       }while(b!=null);
       String nomM=JOptionPane.showInputDialog("Ingrese el nombre: ");
       float costo=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del medio: "));
       nodo q = new nodo(id, nomM, costo);
       return q;
   }
   
   void setAddInicio()
   {
       nodo info = getCrearNodo();
       if(cab==null)
       {
           cab=info;
           JOptionPane.showMessageDialog(null, "Elemento agregado, la lista ya no es vacía");
       }
       else
       {
           info.sig = cab;
           cab.ant = info;
           cab = info;
           JOptionPane.showMessageDialog(null, "Agregado al inicio");
       }
   }
   
   void setAddFin()
   {
       nodo info = getCrearNodo();
       if(cab==null)
       {
           cab=info;
           JOptionPane.showMessageDialog(null, "Elemento agregado, la lista ya no es vacía");
       }
       else
       {
           nodo q=cab;
           while(q.sig!=null)
               q=q.sig;
           q.sig=info;
           info.ant=q;
           JOptionPane.showMessageDialog(null, "Agregado al final");
       }
   }
   
   void setEliminarN(int id)
   {
       if(cab==null)
       JOptionPane.showMessageDialog(null, "Lista vacía!!!, ¡¡NO SE PUEDE ELIMINAR!!");
       else
       {
           nodo b=getBuscar(id);
           if(b==null)
               JOptionPane.showMessageDialog(null, "El id a eliminar no existe!!!");
           else
           {
               if((b==cab)&&(cab.sig==null))
               {
                   cab=null;
                   JOptionPane.showMessageDialog(null, "Eliminado, la lista está vacía");
               }
               else
                   if((b==cab)&&(cab.sig!=null))
                   {
                       cab=cab.sig;
                       cab.ant=null;
                       b.sig=null;
                       b=null;
                       JOptionPane.showMessageDialog(null, "Eliminado al inicio");
                   }
               else
                       if(b.sig==null)
                       {
                           b.ant.sig=null;
                           b.ant=null;
                           b=null;
                           JOptionPane.showMessageDialog(null, "Eliminado al final de la lista.");
                       }
               else
                       {
                          b.ant.sig=b.sig;
                          b.sig.ant=b.ant;
                          b.sig = b.ant= null;
                          b=null;
                          JOptionPane.showMessageDialog(null, "Eliminado en medio de dos nodos.");
                       }
           }
       }
   }

   String getMostrar(int id)
   {
       String aux="";
       nodo info=getBuscar(id);
       if(info==null)
           aux="La información del nodo no existe o lista vacía";  
   else
   {
     aux="La información del nodo es: \n";
     aux+="Id del medio: "+info.idMeio+"\n";
     aux+="Nombre del medio: "+info.nomMedio+"\n";
     aux+="Costo del medio: "+info.valor+"\n";
   }
       return aux;
   }

   
   void getMostrarAll()
   {
       if(cab==null)
           JOptionPane.showMessageDialog(null, "Lista vacía!");
       else
       {
           nodo q=cab;
           String info="";
           while(q!=null)
           {
               info=getMostrar(q.idMeio);
               JOptionPane.showMessageDialog(null, info);
               q=q.sig;
           }
       }
   }
}
