/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallercola;

/**
 *
 * @author Macla
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class programa {
 
     nodo inicio;
    
     programa(){
        inicio = null;
    }
    public int Long(){
        int c = 0;
        nodo q = null;
        if(inicio ==null){
            return c;
        }
        else{
            q = inicio;
           
            do{
                c++;
                q = q.sig;
            }while(q!=inicio);
        }
        return c;
    }
    
      public nodo Crear(){
      nodo q = null;
      int cant = (int)(Math.random()*12+1);
      int pre = (int)(Math.random()*25000+1000);
      String nom = JOptionPane.showInputDialog("Entre nombre nombre del producto: ");
      float total = (cant*pre);
      q = new nodo(nom, cant, pre, total);
      return q;
     }
    
    void setIngresar(){
        nodo info = Crear();
        if(inicio==null){
            inicio = info;
            inicio.sig= inicio;
            inicio.ant = inicio;
    JOptionPane.showMessageDialog(null, "Elemento agregado a la cola.  \n La cola era vacía.");
 }else{
         inicio.ant.sig= info;
         info.sig = inicio;
         info.ant=inicio.ant;
         inicio.ant=info;
     JOptionPane.showMessageDialog(null, "Nuevo elemento agregado a la cola!");

        }
    }
    
        void setAddF(nodo info){
        if(inicio==null){
            inicio = info;
            inicio.sig= inicio;
            inicio.ant = inicio;
        }else{
         inicio.ant.sig= info;
         info.sig = inicio;
         info.ant=inicio.ant;
         inicio.ant=info;
        }
        }
     void MostrarT(){
         nodo q =inicio;
         if(inicio==null){
             JOptionPane.showMessageDialog(null, "¡La cola esta vacía!");
         }else{
            
             do{ 
                 String mostrar="";
                 mostrar+="Nombre del producto: "+q.getNom()+"\n";
                 mostrar+="Cantidad: "+q.getCant()+"\n";
                 mostrar+="Precio unitario: "+q.getPrecio()+"\n";
                 mostrar+="Total: $"+q.getTotal()+"\n";
                 JOptionPane.showMessageDialog(null, mostrar);
                 q = q.sig;
             }while(q!=inicio);
                
         }
     }
     
     public void MostrarEst(){
         nodo q = inicio;
          float Prom=0;
         if(inicio==null)
       JOptionPane.showMessageDialog(null, "¡La cola esta vacía!");
         else{
             float suma = 0;
             do{
                 suma+=q.getTotal();
                 q=q.sig;
             }while(q!=inicio);
            Prom = (suma/Long());
             String mostrar="El total recaudado es: $"+suma+"\n";
                    mostrar+="Promedio recaudo: "+Prom;
                    JOptionPane.showMessageDialog(null, mostrar);
         }
     }
     public float Prom(){
         nodo q = inicio;
          float Prom=0;
         if(inicio==null)
             Prom = 0;
         else{
             float suma = 0;
             do{
                 suma+=q.getTotal();
                 q=q.sig;
             }while(q!=inicio);
            Prom = (suma/Long());
            
         }
         return Prom;
     }
     
     void Mym(){
         int may = 0, men = 99;
         String mayor="", menor="";
         nodo q= inicio;
         if(inicio==null)
     JOptionPane.showMessageDialog(null, "¡La cola esta vacía!");
         else{
             do{
                 if(q.getCant()>may){
                     may = q.getCant();
                 }
                     if(q.getCant()<men){
                         men= q.getCant();
                     }
                 
                 q = q.sig;    
             }while(q!=inicio);
             q = inicio;
              mayor="El producto(s) con mayor cantidad es:\n"
                   + "Donde la cantidad mayor es: "+may+"\n\n";
               menor+="El producto(s) con menor cantidad es:\n"
                   + "Donde la cantidad menor es: "+men+"\n\n";
             do{
                 if(q.getCant()==may){
                
                 mayor+="Nombre del producto: "+q.getNom()+"\n";
                 mayor+="Cantidad: "+q.getCant()+"\n";
                 mayor+="Precio unitario: "+q.getPrecio()+"\n";
                 mayor+="Total: $"+q.getTotal()+"\n\n";
                 }

                     if(q.getCant()==men){
                  
                 menor+="Nombre del producto: "+q.getNom()+"\n";
                 menor+="Cantidad: "+q.getCant()+"\n";
                 menor+="Precio unitario: "+q.getPrecio()+"\n";
                 menor+="Total: $"+q.getTotal()+"\n\n";
                     }
                q = q.sig; 
             }while(q!=inicio);
             JOptionPane.showMessageDialog(null, mayor);
             JOptionPane.showMessageDialog(null, menor);
         }
     }
     
     public void MostrarM(){
         float Prom = Prom();
         nodo q = inicio;
         if(inicio==null)
     JOptionPane.showMessageDialog(null, "¡La cola esta vacía!");
         else{
         String mayor="Productos con mayor valor total del Promedio ( "+Prom+" )"+"\n",
                 menor ="Productos con menor valor total del Promedio ( "+Prom+" )"+"\n";
         int may=0, men =0;
         do{
             if(q.getTotal()>Prom){
                 mayor+="Nombre del producto: "+q.getNom()+"\n";
                 mayor+="Cantidad: "+q.getCant()+"\n";
                 mayor+="Precio unitario: "+q.getPrecio()+"\n";
                 mayor+="Total: $"+q.getTotal()+"\n";
                 mayor+="Estado: Mayor al promedio"+"\n\n";
                 may++;
                 
             }
             if(q.getTotal()<Prom){
                 menor+="Nombre del producto: "+q.getNom()+"\n";
                 menor+="Cantidad: "+q.getCant()+"\n";
                 menor+="Precio unitario: "+q.getPrecio()+"\n";
                 menor+="Total: $"+q.getTotal()+"\n";
                 menor+="Estado: Menor al promedio"+"\n\n";
                 men++;
             }
             q = q.sig;
         }while(q!=inicio);
          JOptionPane.showMessageDialog(null, "La cantidad de productos mayores al promedio es : "+may);
          JOptionPane.showMessageDialog(null, mayor);
          JOptionPane.showMessageDialog(null, "La cantidad de productos menores al promedio es : "+men);
          JOptionPane.showMessageDialog(null, menor);
         setArchivo();
         }
     }
     
     
      void setArchivo(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        if(inicio==null){            
            try{
                fichero = new FileWriter("c:/Prueba/prueba.txt");
                pw = new PrintWriter(fichero);
                pw.println("Cola vacia!");
                JOptionPane.showMessageDialog(
                null, "Datos guardados al archivo!", 
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
            }catch (Exception e) {
                JOptionPane.showMessageDialog(
                null, "Información: \n"+e.getMessage(), 
                "Error!",
                JOptionPane.WARNING_MESSAGE);                                
            } finally {
                try {
                    if (null != fichero)
                        fichero.close();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(
                    null, "Información: \n"+e2.getMessage(), 
                    "Error!",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        }else{
            try{
                fichero = new FileWriter("c:/Prueba/prueba.txt");
                pw = new PrintWriter(fichero);
                nodo p=inicio;
                do{
                    pw.println(""+p.getNom());
                    pw.println(""+p.getCant());
                    pw.println(""+p.getPrecio());
                    pw.println(""+p.getTotal());
                    p=p.sig;
                }while(p!=inicio);
                JOptionPane.showMessageDialog(
                null, "Datos guardados al archivo!", 
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
            }catch (Exception e) {
                JOptionPane.showMessageDialog(
                null, "Información: \n"+e.getMessage(), 
                "Error!",
                JOptionPane.WARNING_MESSAGE);                                
            } finally {
                try {
                    if (null != fichero)
                        fichero.close();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(
                    null, "Información: \n"+e2.getMessage(), 
                    "Error!",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
}
