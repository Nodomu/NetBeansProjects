/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.swing.JOptionPane;
/**
 *
 * @author HP-FLIABC
 */
public class lista {
    nodo cab;
    
    lista()
    {
     cab = null;   
    }
    
    boolean getVacia()
    {
        return cab == null? true:false;
    }
    
    nodo getBuscarNiño(int id)
    {
        nodo q = null;
        if (getVacia())
        {
         return null;
        } 
        else 
        {
          q = cab;
          while (q != null) 
          {
            if (q.idNiño == id)
            {
                return q;
            }
                q = q.sig;
          }
            return null;
        } 
    }
   
    nodo getBuscarRepresentante(int id)
    {
        nodo q = null;
        if (getVacia()) 
        {
         return null;
        } 
        else 
        {
          q = cab;
          while (q != null) 
          {
            if (q.idRepresentante == id)
            {
                return q;
            }
                q = q.sig;
          }
         return null;
        } 
    }
    
    int getBuscarrepresentanteRepetido(int id)
    {
        nodo q = null;
        int c=0;
        if (getVacia())
        {
            return c;
        } 
        else
        {
          q = cab;
            while (q != null)
            {
             if (q.idRepresentante == id)
             {
                c++;
             }
                q = q.sig;
            }
            return c;
        }  
    }
  
    nodo getCrearNodo() 
    {
      nodo q = null;
      int idNiño = 0, edad = 0, op, op2;
      String nom, Tipoid = "", mun = "";
      float talla, peso;
      do 
      {
        idNiño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del niño"));
        q = getBuscarNiño(idNiño);
        if (q != null)
        {
            JOptionPane.showMessageDialog(null, "¡¡¡EL ID YA EXISTE!!!  INTENTE NUEVAMENTE.");
        }
      }
      while (q != null);
        
      do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                "TIPO DE IDENTIFICACIÓN \n" 
                +"1. Tarjeta de identidad \n" 
                +"2. Registro Civil \n"
                +"3. NIUD "));
            switch (op)
            {
                case 1:
                        Tipoid = "Tarjeta de identidad";
                break;
                case 2:
                        Tipoid = "Registro Civil";
                break;
                case 3:
                        Tipoid = "NIUD";
                break;
                default:
                        JOptionPane.showMessageDialog(null, "¡POR FAVOR INGRESE UNA OPCIÓN VALIDA!");
                break;
            }
        } while (op >= 4);
        nom = JOptionPane.showInputDialog("Ingrese el nombre del niño");
        do 
        {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del niño"));
            if (edad > 6)
            {
                JOptionPane.showMessageDialog(null, "¡EL NIÑO NO CUMPLE CON LA EDAD ESTABLECIDA!");
            }
        } while (edad > 6);
        talla = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la talla del niño"));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso del niño"));
        do 
        {
            op2 = Integer.parseInt(JOptionPane.showInputDialog(
                "Municipio Al Que Pertenece \n" 
                +"1. Sahagún \n" 
                +"2. Montería  \n"
                +"3. Lorica "));
            switch (op2) 
            {
                case 1:
                    mun = "Sahagún";
                    break;
                case 2:
                    mun = "Montería";
                    break;
                case 3:
                    mun = "Lorica";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "¡POR FAVOR INGRESE UNA OPCIÓN VALIDA!");
                    break;
            }
        } while (op2 >= 4);

        int idR = 0, or = 0, s = 0, m;
        String NomR = "", Parentesco = "";
        do {
            s = -1;
            idR = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id del padre"));
            m = getBuscarrepresentanteRepetido(idR);
            if (m == 0 || m == 1) {
                NomR = JOptionPane.showInputDialog("Ingrese el nombre de representante");
                do {
                    or = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Parentesco \n " 
                    +"1. PADRE \n "
                    +"2. MADRE"));
                    switch (or)
                    {
                        case 1:
                            Parentesco = "PADRE";
                        break;
                        case 2:
                            Parentesco = "MADRE";
                        break;
                        default:
                            JOptionPane.showMessageDialog(null, "¡POR FAVOR INGRESE UNA OPCIÓN VALIDA!");
                            break;
                    }
                } while (or > 2);

            } else 
                if (m == 2) 
                {
                JOptionPane.showMessageDialog(null, "El padre ya exedió el numero de ingresos");
                s = JOptionPane.showConfirmDialog(null, "Desea ingresar nuevamente los datos del padre?");
                }
            
        } while (s == JOptionPane.YES_OPTION);
        if (s == -1) {
            q = new nodo(idR, idNiño, edad, talla, peso, NomR, nom, Parentesco, Tipoid,mun);
        }
     return q;
    }
    
    void aggInicio()
    {
      nodo info = getCrearNodo();
        if (cab == null && info != null) 
        {
            cab = info;
            JOptionPane.showMessageDialog(null,"¡Elemento agregado!, ¡¡La lista ya no está vacía!!.");
        } 
        else
        {
            if (info != null)
            {
                info.sig = cab;
                cab.ant = info;
                cab = info;
                JOptionPane.showMessageDialog(null,"¡Elemento agregado al inicio de la lista!");
            } 
            else
            {
             JOptionPane.showMessageDialog(null, "¡¡¡NO FUE POSIBLE AGREGAR EL NODO!!!");
            }
        }  
    }
    
    void aggMiddle()
    {
        nodo info = getCrearNodo();
        if (cab == null && info != null) {
            cab = info;
            JOptionPane.showMessageDialog(null,"¡Elemento agregado!, ¡¡La lista ya no está vacía!!.");
    }
     else
        {
            if(info!=null)
            {
                nodo q = cab;
                int c = 0;
                int p;
                while(q!=null)
                {
                    q=q.sig;
                    c++;
                }
                p=c/2;
                q = cab;
                while (p == 0)
                {
                    q = q.sig;
                    p--;
                }
                q.sig = info;
                info.ant = q;
                info.sig = q.sig.ant;
                q.ant = info;
                
                JOptionPane.showMessageDialog(null, "¡Agregado al intermedio!");
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el nodo!!!");
            }
        }
    }
    
  void aggEnd()
  {
    nodo info = getCrearNodo();
     if (cab == null && info != null)
     {
        cab = info;
        JOptionPane.showMessageDialog(null,"¡Elemento agregado!, ¡¡La lista ya no está vacía!!.");
     } 
     else 
     {
       if (info != null)
       {
         nodo q = cab;
         while (q.sig != null)
         {
            q = q.sig;
         }
            q.sig = info;
            info.ant = q;
            JOptionPane.showMessageDialog(null, "Agregado al final!");
       } 
        else
        {
            JOptionPane.showMessageDialog(null, "¡¡¡NO FUE POSIBLE AGREGAR EL NODO!!!");
        }
     }  
  }
   
  String getInformacionTyP(int id)
  {
    nodo q = getBuscarNiño(id);
        if (q == null)
        {
          nodo p = getBuscarRepresentante(id);
          if (p == null)
        {
          return "¡NO EXISTE!";
        } 
          else
          {
            String aux = "Información del padre: \n";
            aux += "Nombre: " + p.nombreRepresentante + "\n\n";
            aux += "Información del niño 1: \n";
            aux += "Nombre: " + p.nombreNiño + "\n";
            aux += "Talla: " + p.tallaNiño + "\n";
            aux += "Peso: " + p.pesoNiño + "\n\n";
            p = p.sig;
            while (p != null)
            {
                if (p.idRepresentante == id)
                {
                    aux += "Información del niño 2: \n";
                    aux += "Nombre: " + p.nombreNiño + "\n";
                    aux += "Talla: " + p.tallaNiño + "\n";
                    aux += "Peso: " + p.pesoNiño + "\n\n";
                }
                    p = p.sig;
            }
                return aux;
          }
        }        
            else
            {
              String aux = "Información del niño: \n";
              aux += "Nombre: " + q.nombreNiño + "\n";
              aux += "Talla: " + q.tallaNiño + "\n";
              aux += "Peso: " + q.pesoNiño + "\n";
              return aux;
        }
  }
  
  void setEliminar(int id)
  {
    if (cab == null)
    {
        JOptionPane.showMessageDialog(null, "¡LA LISTA ESTA VACÍA!");
    } 
    else
    {
        nodo q = getBuscarNiño(id);
        if (q == null)
        {
            JOptionPane.showMessageDialog(null, "¡EL ID NO EXISTE!");
        } 
        else 
            if ((q == cab)&&(cab.sig == null))
            {
                cab = null;
                JOptionPane.showMessageDialog(null, "¡ELIMINADO! ¡¡LA LISTA ESTÁ VACÍA!!");
            }
            else 
                if ((q == cab)&&(cab.sig != null))
                {
                  cab = cab.sig;
                  q.sig = null;
                  q = null;
                  JOptionPane.showMessageDialog(null, "¡ELIMINADO AL INICIO!");
                } 
                else
                    if (q.sig == null)
                    {
                     q.ant.sig = null;
                     q.ant = null;
                     q = null;
                     JOptionPane.showMessageDialog(null, "¡ELIMINADO AL FINAL!");
                    } 
                    else
                    {
                     q.ant.sig = q.sig;
                     q.sig.ant = q.ant;
                     q.ant = q.sig = null;
                     q = null;
                     JOptionPane.showMessageDialog(null, "ELIMINADO EN UNA POSICIÓN INTERMEDIA!");
            }
        }  
  }
  
  void getMostrarAll()
  {
    nodo p = null;
    if (cab == null)
    {
        JOptionPane.showMessageDialog(null, "¡LISTA VACÍA!");
    }  
    else 
    {
        p = cab;
        String aux = "";
        int c = 0;
        while (p != null)
        {
            aux = "Informacion del nodo " +c +" es: \n";
            aux += "Nombre del Representante: " +p.nombreRepresentante +"\n";
            aux += "Identificación del Representante: " +p.idRepresentante +"\n";
            aux += "Parentesco: " +p.parentesco +"\n";
            aux += "Nombre del Niño: " +p.nombreNiño +"\n";
            aux += "Identificación del Niño: " +p.idNiño +"\n";
            aux += "Tipo de identificación: " +p.tipoID +"\n";
            aux += "Edad del niño: " +p.edadNiño +"\n";
            aux += "Talla del niño: " +p.tallaNiño +"\n";
            aux += "Peso del niño: " +p.pesoNiño +"\n";
            aux += "Municipio de procedencia: " +p.municipio +"\n";
            JOptionPane.showMessageDialog(null, aux);
            c++;
            aux = "";
            p = p.sig;
        }
    }
  }
  
  void getMostrarN(nodo p)
  {
    String aux = "";
    aux = p.municipio +":  \n";
    aux += "Nombre Del Niño: " +p.nombreNiño +"\n";
    aux += "Identificación del niño: " +p.idNiño +"\n";
    aux += "Tipo de identificación: " +p.tipoID +"\n";
    aux += "Edad del niño: " +p.edadNiño +"\n";
    aux += "Talla del niño: " +p.tallaNiño +"\n";
    aux += "Peso del niño: " +p.pesoNiño +"\n";
    JOptionPane.showMessageDialog(null, aux);  
  }
  
  public void ordenamiento()
  {
      int a = 0, b = 0;
      nodo q = cab;
      while (q != null)
      {
          b++;
          q=q.sig;
      }
     int TidR = 0, TidN = 0, Tedad = 0;
     float Ttalla = 0, Tpeso = 0;
     String TnomR = "", Tparentesco = "", Ttipoid = "", TnombreN = "", Tmun = "";
     do 
     {
        q = cab;
        nodo sig = q.sig;
        while (q.sig != null)
        {
          if (q.idRepresentante > sig.idRepresentante)
            {
                TidR = q.idRepresentante;
                TidN = q.idNiño;
                Tedad = q.edadNiño;
                Tpeso = q.pesoNiño;
                TnomR = q.nombreRepresentante;
                Tparentesco = q.parentesco;
                Ttipoid = q.tipoID;
                TnombreN = q.nombreNiño;
                Tmun = q.municipio;
                Ttalla = q.tallaNiño;

                q.idRepresentante = sig.idRepresentante;
                q.idNiño = sig.idNiño;
                q.edadNiño = sig.edadNiño;
                q.pesoNiño = sig.pesoNiño;
                q.nombreRepresentante = sig.nombreRepresentante;
                q.parentesco = sig.parentesco;
                q.tipoID = sig.tipoID;
                q.nombreNiño = sig.nombreNiño;
                q.municipio = sig.municipio;
                q.tallaNiño = sig.tallaNiño;

                sig.idRepresentante = TidR;
                sig.idNiño = TidN;
                sig.edadNiño = Tedad;
                sig.pesoNiño = Tpeso;
                sig.nombreRepresentante = TnomR;
                sig.parentesco = Tparentesco;
                sig.tipoID = Ttipoid;
                sig.nombreNiño = TnombreN;
                sig.municipio = Tmun;
                sig.tallaNiño = Ttalla;
                    
                q = q.sig;
                sig = sig.sig; 
            }
          else
          {
            q = q.sig;
            sig = sig.sig;  
          }
        }
       a++;
     }while(a<=b);
     getMostrarAll();
  }
  
  void getReporte1()
  {
    nodo q = null;
    int x = 0, y = 0, z = 0;
    if (cab == null)
    {
        JOptionPane.showMessageDialog(null, "¡LISTA VACÍA!");
    }
    else
    {
        q = cab;
        while (q != null)
        {
            if (q.edadNiño >= 4 && q.edadNiño <= 6 && q.municipio.equals("Lorica") && q.tallaNiño < 1)
            {
                x++;
            } 
            else 
                if (q.edadNiño >= 4 && q.edadNiño <= 6 && q.municipio.equals("Montería") && q.tallaNiño < 1)
                {
                    y++;
                } 
                else
                    if (q.edadNiño >= 4 && q.edadNiño <= 6 && q.municipio.equals("Sahagún") && q.tallaNiño < 1)
                    {
                        z++;
                    }
            q = q.sig;
        }
    JOptionPane.showMessageDialog(null, 
        "Cantidad De Niños Bajos De Talla Por Municipio: \n" 
        +"Lorica: " +x 
        +"\n Monteria: " +y 
        +"\n Sahagún: " +z);
    q = cab;
    while (q != null)
    {
        if (q.edadNiño >= 4 && q.edadNiño <= 6 && q.municipio.equals("Lorica") && q.tallaNiño < 1) 
        {
            getMostrarN(q);
        }
            q = q.sig;
    }
        q = cab;
        while (q != null) 
        {
            if (q.edadNiño >= 4 && q.edadNiño <= 6 && q.municipio.equals("Montería") && q.tallaNiño < 1) 
            {
                getMostrarN(q);
            }
                q = q.sig;
        }
            q = cab;
            while (q != null) 
            {
                if (q.edadNiño >= 4 && q.edadNiño <= 6 && q.municipio.equals("Sahagún") && q.tallaNiño < 1) 
                {
                    getMostrarN(q);
                }
                q = q.sig;
            }

        }
  }
  
  void Reporte2()
  {
    nodo q = null;
        int x = 0, y = 0, z = 0;
        if (cab == null) 
        {
          JOptionPane.showMessageDialog(null, "Lista vacía!");
        } 
        else 
        {
            q = cab;
            while (q != null) 
            {
                if (q.edadNiño >= 2 && q.edadNiño <= 3 && q.municipio.equals("Lorica") && q.pesoNiño < 15) 
                {
                    x++;
                } 
                else 
                    if (q.edadNiño >= 2 && q.edadNiño <= 3 && q.municipio.equals("Montería") && q.pesoNiño < 15) 
                    {
                        y++;
                    } 
                    else 
                        if (q.edadNiño >= 2 && q.edadNiño <= 3 && q.municipio.equals("Sahagún") && q.pesoNiño < 15) 
                        {
                            z++;
                        }
                q = q.sig;
            }
            JOptionPane.showMessageDialog(null, 
            "Cantidad De Niños Bajos De Peso Por Municipio: \n" 
            +"Lorica: " +x 
            +"\n Monteria: " +y 
            +"\n Sahagún: " +z);
            q = cab;
            while (q != null) 
            {
                if (q.edadNiño >= 2 && q.edadNiño <= 3 && q.municipio.equals("Lorica") && q.pesoNiño < 15) 
                {
                    getMostrarN(q);
                }
             q = q.sig;
            }
            q = cab;
            while (q != null) 
            {
                if (q.edadNiño >= 2 && q.edadNiño <= 3 && q.municipio.equals("Montería") && q.pesoNiño < 15) 
                {
                    getMostrarN(q);
                }
             q = q.sig;
            }
            q = cab;
            while (q != null) 
            {
                if (q.edadNiño >= 2 && q.edadNiño <= 3 && q.municipio.equals("Sahagún") && q.pesoNiño < 15) 
                {
                    getMostrarN(q);
                }
             q = q.sig;
            }

        }
    }  
}
