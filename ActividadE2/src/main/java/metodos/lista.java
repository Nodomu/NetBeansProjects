package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author HP-FLIABC
 */
public class lista {
    nodo cab;
    
    public lista()
    {
        cab=null;
    }
    
    public int getLongitudLista()
    {
        int c = 0;
        nodo q = null;
        
        if(cab==null)
        {
            return 0;
        }
        else
        {
            q=cab;
            while(q!=null)
            {
                c++;
                q=q.sig;
            }
            return c;
        }
    }
    
    public boolean getVacia()
    {
        if(cab==null)
            return true;
        else
            return false;
    }
    
    public nodo getBuscarNodo(int id)
    {
        nodo q=null;
        if(cab==null)
            return null;
        else
        {
            q=cab;
            while(q!=null)
            {
                if(q.idCosecha==id)
                    return q;
                else
                    q=q.sig;
            }
            return null;
        }
    }
    
  public nodo crearNodo()
  {
      int id;
      String tipo, lugar;
      float hectareas;
      nodo q=null;
      do{
          id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la cosecha: "));
          q=getBuscarNodo(id);
          if(q!=null)
              JOptionPane.showMessageDialog(null, "Ya existe, intente nuevamente!");         
      }while(q!=null);
      tipo=JOptionPane.showInputDialog("Igrese el tipo de cosecha: ");
      lugar=JOptionPane.showInputDialog("Ingrese el lugar de la cosecha: ");
      hectareas=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de hectareas del cultivo :"));
      q=new nodo(id, tipo, hectareas, lugar);
      return q;
  }
  
  public void setAgginicio()
  {
      nodo info=crearNodo();
      if(cab==null)
      {
          cab=info;
          JOptionPane.showMessageDialog(null, "Elemento agregado!! La lista ya no está vacia!!!");
      }
      else
      {
          info.sig=cab;
          cab.ant = info;
          cab=info;
          JOptionPane.showMessageDialog(null, "Elemento agregado al inicio");
      }
  }
  
  public void getMOSTRAR()
  {
        nodo q = null;
        if (cab == null) {
            JOptionPane.showMessageDialog(null, "Lista vacía!");
        } else {
            q = cab;
            String aux = "";
            int cont = 0;
            while (q != null) {
               aux += "El id de la cosecha es: " +q.idCosecha +"\n";
               aux += "El tipo de cosecha es: " +q.tipoDecosecha +"\n";
               aux += "El lugar de ubicación de la cosecha es: " +q.ubicación +"\n";
               aux += "La cantidad de hectareas que ocupa la cosecha es: " +q.Nhectareas +"\n";
                JOptionPane.showMessageDialog(null, aux);
                cont++;
                aux = "";
                q = q.sig;
            }
        }  
  }
  
  public void setEliminarNodo(){
      nodo q=null, p=null;
      
      if(cab==null)
          JOptionPane.showMessageDialog(null, "La lista está vacía");
      else
      {
          q=cab;
          p=cab;
          do
          {
              if((!q.tipoDecosecha.equals(q.tipoDecosecha)) && (!p.ubicación.equals(p.ubicación)))
              {
                  q = q.sig;
              }
              else
              {
                  while(q.sig!=p)
                  
                  p=p.sig;
                  p.sig=q.sig;
                  q.sig=null;
              }
          }
          while(q.sig!=null);
      }
    }
}
