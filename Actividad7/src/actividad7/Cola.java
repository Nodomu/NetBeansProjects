/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author HP-FLIABC
 */
public class Cola {
    Nodo inicio;
    
    Cola()
    {
        inicio=null;
    }
 
    
public Nodo getCrearNodo()
{
 Nodo b = null;
 int cantidad = (int)(Math.random()*12+1);
 int precioUnidad = (int)(Math.random()*25000+1000);
 String nombreproducto = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
 float total = (cantidad*precioUnidad);
 b = new Nodo(cantidad, precioUnidad, nombreproducto, total);
 return b;
}

 public int getLong()
 {
        int c=0;
        Nodo p=null;
        if(inicio ==null)
        {
            return c;
        }
        else
        {
            p = inicio;
            do
            {
                c++;
                p = p.sig;
            }
            while(p!=inicio);
        }
        return c;
 }  
  
void setIngresar()
{
    Nodo info = getCrearNodo();
    if(inicio==null)
    {
        inicio = info;
        inicio.sig= inicio;
        inicio.ant = inicio;
    JOptionPane.showMessageDialog(null, "¡El elemeto ha sido agregado a la cola!.  \n ¡La cola ya no está vacía!.");
    }
    else
    {
        inicio.ant.sig= info;
        info.sig = inicio;
        info.ant=inicio.ant;
        inicio.ant=info;
     JOptionPane.showMessageDialog(null, "¡El elemento nuevo ha sido agregado a la cola!");

    }
}

void setAggEnd(Nodo info)
{
    if(inicio==null)
    {
        inicio = info;
        inicio.sig= inicio;
        inicio.ant = inicio;
    }
    else
    {
        inicio.ant.sig= info;
        info.sig = inicio;
        info.ant=inicio.ant;
        inicio.ant=info;
    }
}

void MostrarAll()
{
    Nodo b =inicio;
    if(inicio==null)
    {
        JOptionPane.showMessageDialog(null, "¡La cola está vacía!");
    }
    else
    {
      do
      { 
        String muestra="";
        muestra+="Nombre del producto: "+b.getNombreProducto()+"\n";
        muestra+="Precio por unidad: "+b.getPrecioUnidad()+"\n";
        muestra+="Cantidad: "+b.getCantidad()+"\n";
        muestra+="Total: "+"$"+b.getTotal()+"\n";
        JOptionPane.showMessageDialog(null, muestra);
        b = b.sig;
      }
      while(b!=inicio);
                
         }
     }


public void Mostrar()
{
    Nodo b = inicio;
    float Prom=0;
    if(inicio==null)
       JOptionPane.showMessageDialog(null, "¡La cola está vacía!");
       else
       {
        float s = 0;
        do
        {
         s+=b.getTotal();
         b=b.sig;
        }
        while(b!=inicio);
        
        Prom = (s/getLong());
        String muestra="El total recaudado es: "+"$"+s+"\n";
        muestra+="Promedio recaudo: "+Prom;
        JOptionPane.showMessageDialog(null, muestra);
       }
}

public float Promedio()
{
  Nodo b = inicio;
  float P=0;
  if(inicio==null)
    P = 0;
    else
    {
      float s = 0;
      do
      {
        s+=b.getTotal();
        b=b.sig;
      }
      while(b!=inicio);
        P = (s/getLong());        
    }
     return P;
}

void MayorYMenor()
{
  int My = 0, Mn = 99;
  String mayor="", menor="";
  Nodo b= inicio;
  if(inicio==null)
    JOptionPane.showMessageDialog(null, "¡La cola está vacía!");
    else
    {
      do
      {
        if(b.getCantidad()>My)
        {
          My = b.getCantidad();
        }
        if(b.getCantidad()<Mn)
        {
          Mn= b.getCantidad();
        }
                 
        b = b.sig;    
       }
        while(b!=inicio);
        b = inicio;
        mayor="El producto(s) con mayor cantidad es:\n"
              + "Y la cantidad mayor es: "+My+"\n\n";
        menor+="El producto(s) con menor cantidad es:\n"
               + "Y la cantidad menor es: "+Mn+"\n\n";
        do{
            if(b.getCantidad()==My)
            {
              mayor+="Producto: "+b.getNombreProducto()+"\n";
              mayor+="Precio por unidad: "+b.getPrecioUnidad()+"\n";
              mayor+="Cantidad: "+b.getCantidad()+"\n";
              mayor+="Total: $"+b.getTotal()+"\n\n";
            }

            if(b.getCantidad()==Mn)
            {
              menor+="Producto: "+b.getNombreProducto()+"\n";
              menor+="Precio por unidad: "+b.getPrecioUnidad()+"\n";
              menor+="Cantidad: "+b.getCantidad()+"\n";
              menor+="Total: $"+b.getTotal()+"\n\n";
            }
            b = b.sig; 
          }
        while(b!=inicio);
        JOptionPane.showMessageDialog(null, mayor);
        JOptionPane.showMessageDialog(null, menor);
    }
}

public void MostrarCantidad()
{
  float P = Promedio();
  Nodo b = inicio;
  if(inicio==null)
     JOptionPane.showMessageDialog(null, "¡La cola esta vacía!");
     else
     {
       String mayor="Productos con mayor valor total respecto al promedio ( "+P+" )"+"\n",
              menor="Productos con menor valor total respecto al promedio ( "+P+" )"+"\n";
       int My=0, Mn =0;
       do
       {
        if(b.getTotal()>P)
        {
         mayor+="Producto: "+b.getNombreProducto()+"\n";
         mayor+="Precio por unidad: "+b.getPrecioUnidad()+"\n";
         mayor+="Cantidad: "+b.getCantidad()+"\n";
         mayor+="Total: $"+b.getTotal()+"\n";
         mayor+="Estado: Mayor respecto al promedio"+"\n\n";
         My++;
        }
        if(b.getTotal()<P)
        {
         menor+="Producto: "+b.getNombreProducto()+"\n";
         menor+="Precio por unidad: "+b.getPrecioUnidad()+"\n";
         menor+="Cantidad: "+b.getCantidad()+"\n";
         menor+="Total: $"+b.getTotal()+"\n";
         menor+="Estado: Menor al promedio"+"\n\n";
         Mn++;
        }
        b = b.sig;
        }
        while(b!=inicio);
        JOptionPane.showMessageDialog(null, "La cantidad de productos mayores al promedio es : "+My);
        JOptionPane.showMessageDialog(null, mayor);
        JOptionPane.showMessageDialog(null, "La cantidad de productos menores al promedio es : "+Mn);
        JOptionPane.showMessageDialog(null, menor);
        setRegistrarArchivo();
     }
}

void setRegistrarArchivo()
{
  FileWriter fichero = null;
  PrintWriter pw = null;
  
  if(inicio==null)
  {            
    try
    {
     fichero = new FileWriter("c:/Prueba/prueba.txt");
     pw = new PrintWriter(fichero);
     pw.println("Cola vacia!");
     JOptionPane.showMessageDialog(null, "¡Datos guardados al archivo!", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e) 
    {
      JOptionPane.showMessageDialog(null, "Información: \n"+e.getMessage(), "¡¡¡ERROR!!!",JOptionPane.WARNING_MESSAGE);                                
    } 
    finally 
    {
      try 
      {
        if (null != fichero)
            fichero.close();
      } 
      catch (Exception e2) 
      {
        JOptionPane.showMessageDialog(null, "Información: \n"+e2.getMessage(), "¡¡¡ERROR!!!",JOptionPane.WARNING_MESSAGE);
      }
    }
  }
  else
  {
    try
    {
      fichero = new FileWriter("c:/Prueba/prueba.txt");
      pw = new PrintWriter(fichero);
      Nodo p=inicio;
      do{
          pw.println(""+p.getNombreProducto());
          pw.println(""+p.getPrecioUnidad());
          pw.println(""+p.getCantidad());
          pw.println(""+p.getTotal());
          p=p.sig;
        }
      while(p!=inicio);
      JOptionPane.showMessageDialog(null, "Datos guardados al archivo!", "Información",JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e) 
    {
     JOptionPane.showMessageDialog(null, "Información: \n"+e.getMessage(), "¡¡¡ERROR!!!",JOptionPane.WARNING_MESSAGE);                                
    } 
    finally 
    {
      try 
      {
        if (null != fichero)
        fichero.close();
      } 
      catch (Exception e2) 
      {
        JOptionPane.showMessageDialog(null, "Información: \n"+e2.getMessage(), "¡¡¡ERROR!!!",JOptionPane.WARNING_MESSAGE);
      }
    }
  }
}
  
}
