/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6.marcelo;
import java.util.Stack;
import javax.swing.JOptionPane;
/**
 *
 * @author HP-FLIABC
 */
public class Pila {
    Stack<Nodo> tope;
    
    public Pila()
    { tope = new Stack(); }
    
  Nodo getId(int id) 
  {
    Nodo p;
    int i = 0;
    while (i < tope.size())
    {
      p = (Nodo) tope.get(i);
      if (p.getIdPelicula() == id) 
      {
        return p;
      }
        i++;
    }
        p = null;
        return p;
  } 
  
  Nodo CrearNodo() 
  {
    Nodo b, p;
    String nombre;
    float duracion;
    int id = 0;
    do 
    {
      id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id de la pelicula: "));
      p = getId(id);
      if (p != null) 
      {
        JOptionPane.showMessageDialog(null, "¡El id de esta pelicula ya existe!", "¡¡¡ERROR!!! Ingrese nuevamente", JOptionPane.ERROR_MESSAGE);
      }
    } 
    while (p != null);
    nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la pelicula: ");
    duracion = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la duracion de la pelicula: "));
    b = new Nodo(id, nombre, duracion);
    return b;
   }
  
  
  void setPush() 
  {
    Nodo b = CrearNodo();
    int pos = tope.indexOf(b);
    if (pos == -1) 
    {
      tope.push(b);
      JOptionPane.showMessageDialog(null, "¡¡¡Elemento registrado con exito!!!");
    } 
    else 
    {
      JOptionPane.showMessageDialog(null, "Ya se encuentra registrado!");
    }
  }
  
  
 void getMostrar(Nodo b) 
 {       
     String muestra = "";
     if(b!=null){
        muestra = "Datos sbre la pelicula \n";
        muestra += "id de la Pelicula: " + b.getIdPelicula() + "\n";
        muestra += "Nombre pelicula: " + b.getNombrePelicula() + "\n";
        muestra += "Duracion de la pelicula: " + b.getDuracion() + "\n";
        muestra += "Edad: " + b.getEdad() + "\n";
        muestra += "Costo de la boleta: " + b.getValorBoleta() + "\n";
        muestra += "Categoria: " + b.getCategoria() + "\n";
        JOptionPane.showMessageDialog(null, muestra);
     }
    }
 
 void getEstrenosNuevos() 
 {
    if (!tope.empty()) 
    {
      Nodo b;
      int Ne = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos estrenos proximos quiere ver?: "));
      int c = 0;
      int j = tope.size() - 1;
      while (c < Ne) 
      {
        b = (Nodo) tope.get(j);
        getMostrar(b);
        j--;
        c++;
        if (j == -1) 
        {
          break;
        }
      }
        if (c != Ne) 
        {
         JOptionPane.showMessageDialog(null, "Limite de estrenos alcanzado");
        }
    }
    else 
    {
      JOptionPane.showMessageDialog(null,"¡¡¡La pila está vacía!!!");
    }
 }
 
 
 void getEstrenosAntiguos() 
 {
   if (!tope.empty()) 
   {
    Nodo b;
    int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos estrenos antiguos quieres ver?: "));
    int c = 0;
    while (c < n) 
    {
      b = (Nodo) tope.get(c);
      getMostrar(b);
      c++;
      if (c == tope.size()) 
      {
        break;
      }
    }
    if (c != n) 
    {
      JOptionPane.showMessageDialog(null, "Limite de estrenos alcanzado");
    }
   } 
   else 
   {
    JOptionPane.showMessageDialog(null,"¡¡¡Pila vacía!!!");
   }
 }
 
   void getMostrarCategoria() 
   {
    if (!tope.empty()) 
    {
      String cat = "";
      float suma = 0, pro = 0;
      int con = 0;
      String categoria[] = {"Niños", "Adolescentes", "Adultos"};
      cat = (String) JOptionPane.showInputDialog(null, "Seleccione categoria:", "Ingrese categoria", JOptionPane.QUESTION_MESSAGE, null, categoria, categoria[0]);
            Nodo aux;
            int i = 0;
            while (i < tope.size()) {
                aux = (Nodo) tope.get(i);
                if (aux.getCategoria().equals(cat)) {
                    suma += aux.getValorBoleta();
                    con++;
                }
                i++;
            }

            pro = suma / con;
            JOptionPane.showMessageDialog(null, "Para la categoria " + cat + "\n" + "Total Recaudado: " + suma + "\n" + "Promedio: " + pro);
        } else {
            JOptionPane.showMessageDialog(null, "¡La pila está vacía!");
        }
    }
 
 void setPop() 
 {
   if (!tope.empty()) 
   {
     int conte = 0;
     String c = "";
     String categoria[] = {"Niños", "Adolescentes", "Adultos"};
     c = (String) JOptionPane.showInputDialog(null, "Seleccione la categoria:", "Ingrese categoria", JOptionPane.QUESTION_MESSAGE, null, categoria, categoria[0]);
     Nodo b;
     for (int i = 0; i < tope.size(); i++) 
     {
        b = (Nodo) tope.get(i);
        if (b.getCategoria().equals(c)) 
        {
          tope.remove(b);
          i--;
          conte++;
        }
     }
     if (conte == 0) 
     {
        JOptionPane.showMessageDialog(null, "No se encontro ninguna pelicula para esta categoria");
     } 
     else 
     {
        JOptionPane.showMessageDialog(null, "Se eliminaron " + conte + " peliculas para la categoria " + c);
     }
   } 
   else 
   {
    JOptionPane.showMessageDialog(null, "La pila no tiene elementos!");
   }
 }
 
 
}
